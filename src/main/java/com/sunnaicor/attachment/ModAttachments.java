package com.sunnaicor.attachment;

import com.sunnaicor.SunnaIcor;

import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;

/**
 * Guarda, por jugador, cuantos golpes ha recibido mientras lleva puesta la
 * armadura Sunna Icor. Al llegar a 4 se dispara la explosion defensiva y el
 * contador vuelve a 0.
 * <p>
 * No se persiste entre reinicios ni se sincroniza al cliente a proposito:
 * es un dato puramente interno del servidor para decidir cuando explotar.
 */
public final class ModAttachments {

	private ModAttachments() {
	}

	public static final AttachmentType<Integer> HIT_COUNTER = AttachmentRegistry.create(
			SunnaIcor.id("sunna_icor_hit_counter"),
			builder -> builder.initializer(() -> 0)
	);

	public static void init() {
		// Basta con referenciar la clase para que el campo static se registre.
	}
}
