package com.sunnaicor.client;

import com.mojang.blaze3d.vertex.PoseStack;

import com.sunnaicor.SunnaIcor;
import com.sunnaicor.client.model.SunnaIcorBootsModel;
import com.sunnaicor.client.model.SunnaIcorChestplateModel;
import com.sunnaicor.client.model.SunnaIcorHelmetModel;
import com.sunnaicor.client.model.SunnaIcorLeggingsModel;
import com.sunnaicor.item.ModItems;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class SunnaIcorClient implements ClientModInitializer {

	// Textura unica usada por las 4 piezas (mapa UV exportado desde Blockbench).
	private static final Identifier ARMOR_TEXTURE = SunnaIcor.id("textures/models/armor/sunna_icor_armor.png");

	@Override
	public void onInitializeClient() {
		EntityModelLayerRegistry.registerModelLayer(SunnaIcorHelmetModel.LAYER_LOCATION, SunnaIcorHelmetModel::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(SunnaIcorChestplateModel.LAYER_LOCATION, SunnaIcorChestplateModel::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(SunnaIcorLeggingsModel.LAYER_LOCATION, SunnaIcorLeggingsModel::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(SunnaIcorBootsModel.LAYER_LOCATION, SunnaIcorBootsModel::createBodyLayer);

		ArmorRenderer.register(new SunnaIcorArmorRenderer(),
				ModItems.SUNNA_ICOR_HELMET,
				ModItems.SUNNA_ICOR_CHESTPLATE,
				ModItems.SUNNA_ICOR_LEGGINGS,
				ModItems.SUNNA_ICOR_BOOTS
		);
	}

	/**
	 * Renderiza cada pieza con su modelo personalizado hecho en Blockbench,
	 * en lugar del sistema de texturas planas "humanoid/humanoid_leggings"
	 * que usa la armadura vanilla.
	 */
	private static final class SunnaIcorArmorRenderer implements ArmorRenderer {

		@Override
		public void render(PoseStack poseStack, MultiBufferSource bufferSource, ItemStack stack,
				LivingEntity entity, EquipmentSlot slot, int light, HumanoidModel<LivingEntity> contextModel) {

			var entityModels = Minecraft.getInstance().getEntityModels();

			switch (slot) {
				case HEAD -> {
					SunnaIcorHelmetModel<LivingEntity> model = new SunnaIcorHelmetModel<>(entityModels.bakeLayer(SunnaIcorHelmetModel.LAYER_LOCATION));
					model.copyHeadPose(contextModel.head);
					ArmorRenderer.renderPart(poseStack, bufferSource, light, stack, model, ARMOR_TEXTURE);
				}
				case CHEST -> {
					SunnaIcorChestplateModel<LivingEntity> model = new SunnaIcorChestplateModel<>(entityModels.bakeLayer(SunnaIcorChestplateModel.LAYER_LOCATION));
					model.copyBodyPose(contextModel.body);
					ArmorRenderer.renderPart(poseStack, bufferSource, light, stack, model, ARMOR_TEXTURE);
				}
				case LEGS -> {
					SunnaIcorLeggingsModel<LivingEntity> model = new SunnaIcorLeggingsModel<>(entityModels.bakeLayer(SunnaIcorLeggingsModel.LAYER_LOCATION));
					model.copyLegPose(contextModel.rightLeg, contextModel.leftLeg);
					ArmorRenderer.renderPart(poseStack, bufferSource, light, stack, model, ARMOR_TEXTURE);
				}
				case FEET -> {
					SunnaIcorBootsModel<LivingEntity> model = new SunnaIcorBootsModel<>(entityModels.bakeLayer(SunnaIcorBootsModel.LAYER_LOCATION));
					model.copyLegPose(contextModel.rightLeg, contextModel.leftLeg);
					ArmorRenderer.renderPart(poseStack, bufferSource, light, stack, model, ARMOR_TEXTURE);
				}
				default -> {
					// BODY (para animales/otros contextos): no aplica a esta armadura.
				}
			}
		}
	}
}
