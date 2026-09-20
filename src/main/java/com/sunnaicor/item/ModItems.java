package com.sunnaicor.item;

import java.util.function.Function;

import com.sunnaicor.SunnaIcor;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ArmorItem.ArmorType;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

/**
 * Registro de los items de la armadura Sunna Icor.
 */
public final class ModItems {

	private ModItems() {
	}

	public static final ResourceKey<Item> SUNNA_ICOR_HELMET_KEY = key("sunna_icor_helmet");
	public static final ResourceKey<Item> SUNNA_ICOR_CHESTPLATE_KEY = key("sunna_icor_chestplate");
	public static final ResourceKey<Item> SUNNA_ICOR_LEGGINGS_KEY = key("sunna_icor_leggings");
	public static final ResourceKey<Item> SUNNA_ICOR_BOOTS_KEY = key("sunna_icor_boots");

	public static final Item SUNNA_ICOR_HELMET = register(
			SUNNA_ICOR_HELMET_KEY,
			Item::new,
			new Item.Properties()
					.humanoidArmor(SunnaIcorArmorMaterial.INSTANCE, ArmorType.HELMET)
					.durability(ArmorType.HELMET.getDurability(SunnaIcorArmorMaterial.BASE_DURABILITY))
					.rarity(Rarity.EPIC)
	);

	public static final Item SUNNA_ICOR_CHESTPLATE = register(
			SUNNA_ICOR_CHESTPLATE_KEY,
			Item::new,
			new Item.Properties()
					.humanoidArmor(SunnaIcorArmorMaterial.INSTANCE, ArmorType.CHESTPLATE)
					.durability(ArmorType.CHESTPLATE.getDurability(SunnaIcorArmorMaterial.BASE_DURABILITY))
					.rarity(Rarity.EPIC)
	);

	public static final Item SUNNA_ICOR_LEGGINGS = register(
			SUNNA_ICOR_LEGGINGS_KEY,
			Item::new,
			new Item.Properties()
					.humanoidArmor(SunnaIcorArmorMaterial.INSTANCE, ArmorType.LEGGINGS)
					.durability(ArmorType.LEGGINGS.getDurability(SunnaIcorArmorMaterial.BASE_DURABILITY))
					.rarity(Rarity.EPIC)
	);

	public static final Item SUNNA_ICOR_BOOTS = register(
			SUNNA_ICOR_BOOTS_KEY,
			Item::new,
			new Item.Properties()
					.humanoidArmor(SunnaIcorArmorMaterial.INSTANCE, ArmorType.BOOTS)
					.durability(ArmorType.BOOTS.getDurability(SunnaIcorArmorMaterial.BASE_DURABILITY))
					.rarity(Rarity.EPIC)
	);

	private static ResourceKey<Item> key(String path) {
		return ResourceKey.create(Registries.ITEM, SunnaIcor.id(path));
	}

	private static Item register(ResourceKey<Item> key, Function<Item.Properties, Item> factory, Item.Properties properties) {
		Item item = factory.apply(properties.setId(key));
		return Registry.register(BuiltInRegistries.ITEM, key, item);
	}

	public static void init() {
		// Solo hace falta llamar a esta clase para que el bloque static de arriba
		// registre los items. Tambien los añadimos a la pestaña de combate creativa.
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(output -> {
			output.accept(SUNNA_ICOR_HELMET);
			output.accept(SUNNA_ICOR_CHESTPLATE);
			output.accept(SUNNA_ICOR_LEGGINGS);
			output.accept(SUNNA_ICOR_BOOTS);
		});
	}
}
