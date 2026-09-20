package com.sunnaicor.util;

import com.sunnaicor.item.ModItems;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;

public final class SunnaIcorUtil {

	private SunnaIcorUtil() {
	}

	/** True si la entidad lleva puesta al menos el peto de Sunna Icor. */
	public static boolean isWearingChestplate(LivingEntity entity) {
		return entity.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.SUNNA_ICOR_CHESTPLATE);
	}

	/** True si la entidad lleva puesto el set completo (casco, peto, pantalones y botas). */
	public static boolean isWearingFullSet(LivingEntity entity) {
		return entity.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.SUNNA_ICOR_HELMET)
				&& entity.getItemBySlot(EquipmentSlot.CHEST).is(ModItems.SUNNA_ICOR_CHESTPLATE)
				&& entity.getItemBySlot(EquipmentSlot.LEGS).is(ModItems.SUNNA_ICOR_LEGGINGS)
				&& entity.getItemBySlot(EquipmentSlot.FEET).is(ModItems.SUNNA_ICOR_BOOTS);
	}

	/**
	 * Condicion usada para activar las habilidades de la armadura (inmunidad
	 * a fuego/lava y la explosion cada 4 golpes). Por defecto exige el set
	 * completo para que se sienta como una recompensa por conseguir las 4
	 * piezas; cambia esto a {@link #isWearingChestplate} si prefieres que
	 * baste con el peto.
	 */
	public static boolean hasArmorPowers(LivingEntity entity) {
		return isWearingFullSet(entity);
	}
}
