package com.sunnaicor.item;

import java.util.Map;

import com.sunnaicor.SunnaIcor;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ArmorItem.ArmorType;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.resources.ResourceKey;

/**
 * Material de la armadura Sunna Icor.
 * <p>
 * Valores pensados para sentirse "casi indestructible" (durabilidad
 * altisima, defensa y toughness muy por encima de netherite) sin llegar a
 * ser literalmente irrompible: sigue teniendo un numero finito de usos.
 * <p>
 * Si quieres ajustar el balance del set, este es el unico lugar que
 * necesitas tocar.
 */
public final class SunnaIcorArmorMaterial {

	private SunnaIcorArmorMaterial() {
	}

	// Durabilidad base (se multiplica internamente por pieza, ver ArmorType#getDurability).
	// Netherite usa 37 como base; aqui usamos un valor mucho mas alto para
	// lograr esa sensacion de "casi indestructible".
	public static final int BASE_DURABILITY = 900;

	// Clave del "equipment asset" (define donde se buscan las texturas de la
	// armadura puesta). La usamos por compatibilidad con el sistema vanilla,
	// aunque el renderizado real lo hace nuestro ArmorRenderer personalizado.
	public static final ResourceKey<EquipmentAsset> SUNNA_ICOR_MATERIAL_KEY =
			ResourceKey.create(EquipmentAssets.ROOT_ID, SunnaIcor.id("sunna_icor"));

	// Tag de items que pueden reparar esta armadura en el yunque.
	public static final TagKey<Item> REPAIRS_SUNNA_ICOR_ARMOR =
			TagKey.create(BuiltInRegistries.ITEM.key(), SunnaIcor.id("repairs_sunna_icor_armor"));

	public static final ArmorMaterial INSTANCE = new ArmorMaterial(
			BASE_DURABILITY,
			Map.of(
					ArmorType.HELMET, 6,
					ArmorType.CHESTPLATE, 12,
					ArmorType.LEGGINGS, 10,
					ArmorType.BOOTS, 6
			),
			// "enchantability"
			15,
			SoundEvents.ARMOR_EQUIP_NETHERITE,
			// toughness (netherite = 3.0F)
			6.0F,
			// knockback resistance (netherite por pieza sin encantar = 0.0F)
			0.5F,
			REPAIRS_SUNNA_ICOR_ARMOR,
			SUNNA_ICOR_MATERIAL_KEY
	);

	/** Defensa total sumando las 4 piezas (solo informativo / debug). */
	public static int totalDefense() {
		return INSTANCE.defense().values().stream().mapToInt(Integer::intValue).sum();
	}
}
