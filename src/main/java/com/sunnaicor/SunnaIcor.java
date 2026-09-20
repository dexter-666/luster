package com.sunnaicor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sunnaicor.attachment.ModAttachments;
import com.sunnaicor.event.SunnaIcorEvents;
import com.sunnaicor.item.ModItems;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class SunnaIcor implements ModInitializer {

	public static final String MOD_ID = "sunna_icor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	/** Atajo para crear un ResourceLocation en el namespace de este mod. */
	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		LOGGER.info("Inicializando Sunna Icor...");

		ModAttachments.init();
		ModItems.init();
		SunnaIcorEvents.init();
	}
}
