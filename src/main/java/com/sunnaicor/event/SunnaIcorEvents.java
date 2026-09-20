package com.sunnaicor.event;

import com.sunnaicor.attachment.ModAttachments;
import com.sunnaicor.util.SunnaIcorUtil;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

/**
 * Toda la logica "de gameplay" de la armadura Sunna Icor:
 * <ul>
 *   <li>Inmunidad total a fuego y lava mientras se lleva el set completo.</li>
 *   <li>Cada 4 golpes recibidos de otra entidad, provoca una explosion
 *   controlada centrada en quien la golpeo: no daña a quien lleva la
 *   armadura, pero si a quien ataco (jugador o mob).</li>
 * </ul>
 */
public final class SunnaIcorEvents {

	private SunnaIcorEvents() {
	}

	private static final int HITS_TO_TRIGGER = 4;
	private static final double EXPLOSION_RADIUS = 3.5D;
	private static final float EXPLOSION_MAX_DAMAGE = 9.0F;
	private static final double EXPLOSION_KNOCKBACK = 1.35D;

	public static void init() {
		ServerLivingEntityEvents.ALLOW_DAMAGE.register(SunnaIcorEvents::onAllowDamage);
		ServerLivingEntityEvents.AFTER_DAMAGE.register(SunnaIcorEvents::onAfterDamage);
	}

	/**
	 * Cancela por completo el daño de fuego y lava mientras se lleva el set
	 * completo de Sunna Icor. Tambien limpia el fuego para que el jugador
	 * deje de arder visualmente.
	 */
	private static boolean onAllowDamage(LivingEntity entity, DamageSource source, float amount) {
		if (!SunnaIcorUtil.hasArmorPowers(entity)) {
			return true;
		}

		if (source.is(DamageTypeTags.IS_FIRE)) {
			entity.clearFire();
			return false;
		}

		return true;
	}

	private static void onAfterDamage(LivingEntity entity, DamageSource source, float baseDamageTaken, float damageTaken, boolean blocked) {
		if (damageTaken <= 0.0F || blocked) {
			return;
		}

		if (!SunnaIcorUtil.hasArmorPowers(entity)) {
			return;
		}

		if (!(entity.level() instanceof ServerLevel serverLevel)) {
			return;
		}

		// Solo contamos golpes que vengan de otra entidad viva (jugador o mob),
		// no daño ambiental (caida, ahogo, hambre, etc.).
		Entity attackerEntity = source.getEntity();
		if (!(attackerEntity instanceof LivingEntity attacker) || attacker == entity) {
			return;
		}

		int hits = entity.getAttachedOrElse(ModAttachments.HIT_COUNTER, 0) + 1;

		if (hits < HITS_TO_TRIGGER) {
			entity.setAttached(ModAttachments.HIT_COUNTER, hits);
			return;
		}

		// Se alcanzaron los 4 golpes: reiniciamos el contador y disparamos la explosion.
		entity.setAttached(ModAttachments.HIT_COUNTER, 0);
		triggerDefensiveExplosion(serverLevel, entity, attacker);
	}

	/**
	 * Explosion "controlada": no destruye bloques, no daña al portador de la
	 * armadura, pero golpea con fuerza a quien lo ataco y a cualquier otra
	 * entidad viva cercana a el (para que se sienta como una explosion de
	 * verdad y no como un golpe invisible dirigido solo al agresor).
	 */
	private static void triggerDefensiveExplosion(ServerLevel level, LivingEntity wearer, LivingEntity attacker) {
		Vec3 center = attacker.position().add(0, attacker.getBbHeight() * 0.5, 0);

		level.playSound(null, center.x, center.y, center.z, SoundEvents.GENERIC_EXPLODE,
				SoundSource.PLAYERS, 3.0F, 0.9F + level.getRandom().nextFloat() * 0.2F);
		level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, center.x, center.y, center.z, 1, 0.0, 0.0, 0.0, 0.0);
		level.sendParticles(ParticleTypes.LAVA, center.x, center.y, center.z, 12, 0.4, 0.4, 0.4, 0.05);

		AABB blastArea = new AABB(center.x, center.y, center.z, center.x, center.y, center.z).inflate(EXPLOSION_RADIUS);

		for (LivingEntity target : level.getEntitiesOfClass(LivingEntity.class, blastArea,
				livingEntity -> livingEntity != wearer && livingEntity.isAlive())) {

			double distance = target.position().distanceTo(center);
			double falloff = Math.max(0.0, 1.0 - (distance / EXPLOSION_RADIUS));

			if (target != attacker && falloff <= 0.0) {
				continue;
			}

			// Garantizamos que el agresor siempre reciba al menos un buen golpe,
			// aunque el calculo de distancia de por si ya lo deja en falloff = 1.0.
			float damage = (float) (EXPLOSION_MAX_DAMAGE * Math.max(falloff, target == attacker ? 1.0 : 0.0));

			if (damage <= 0.0F) {
				continue;
			}

			DamageSource blastSource = level.damageSources().explosion(null, wearer);
			target.hurtServer(level, blastSource, damage);

			Vec3 delta = target.position().add(0, target.getBbHeight() * 0.5, 0).subtract(center);
			double horizontalDistance = Math.max(delta.horizontalDistance(), 0.1);
			double ratioX = delta.x / horizontalDistance;
			double ratioZ = delta.z / horizontalDistance;
			target.knockback(EXPLOSION_KNOCKBACK * Math.max(falloff, 0.5), -ratioX, -ratioZ, blastSource, damage, true);
			target.setDeltaMovement(target.getDeltaMovement().add(0, 0.35, 0));
		}
	}
}
