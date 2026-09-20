package com.sunnaicor.client.model;

// Generado originalmente con Blockbench 5.0.4 (exportado para "1.17 o superior con Mojang mappings")
// y adaptado a mano para Minecraft 26.2:
//  - Minecraft 1.21+ cambio EntityModel#renderToBuffer(...) de 4 floats (r,g,b,a) a un solo int "color".
//  - El namespace del ModelLayerLocation se cambio de "modid" a "sunna_icor".
//  - Se renombro la clase para seguir la convencion de nombres de Java.

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import com.sunnaicor.SunnaIcor;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;

public class SunnaIcorLeggingsModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(SunnaIcor.id("sunna_icor_leggings"), "main");
	private final ModelPart root;
	private final ModelPart armor_leggings;
	private final ModelPart leggings;
	private final ModelPart legging_body;
	private final ModelPart legging_body_parts;
	private final ModelPart legging_leftleg;
	private final ModelPart legging_leftleg_parts;
	private final ModelPart legging_leftleg_tasset;
	private final ModelPart legging_leftleg_kneebrace;
	private final ModelPart legging_rightleg;
	private final ModelPart legging_rightleg_parts;
	private final ModelPart legging_rightleg_tasset;
	private final ModelPart legging_rightleg_kneebrace;

	public SunnaIcorLeggingsModel(ModelPart root) {
		this.root = root.getChild("root");
		this.armor_leggings = this.root.getChild("armor_leggings");
		this.leggings = this.armor_leggings.getChild("leggings");
		this.legging_body = this.leggings.getChild("legging_body");
		this.legging_body_parts = this.legging_body.getChild("legging_body_parts");
		this.legging_leftleg = this.leggings.getChild("legging_leftleg");
		this.legging_leftleg_parts = this.legging_leftleg.getChild("legging_leftleg_parts");
		this.legging_leftleg_tasset = this.legging_leftleg_parts.getChild("legging_leftleg_tasset");
		this.legging_leftleg_kneebrace = this.legging_leftleg_parts.getChild("legging_leftleg_kneebrace");
		this.legging_rightleg = this.leggings.getChild("legging_rightleg");
		this.legging_rightleg_parts = this.legging_rightleg.getChild("legging_rightleg_parts");
		this.legging_rightleg_tasset = this.legging_rightleg_parts.getChild("legging_rightleg_tasset");
		this.legging_rightleg_kneebrace = this.legging_rightleg_parts.getChild("legging_rightleg_kneebrace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition armor_leggings = root.addOrReplaceChild("armor_leggings", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition leggings = armor_leggings.addOrReplaceChild("leggings", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition legging_body = leggings.addOrReplaceChild("legging_body", CubeListBuilder.create().texOffs(60, 42).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.255F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition legging_body_parts = legging_body.addOrReplaceChild("legging_body_parts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition legging_leftleg = leggings.addOrReplaceChild("legging_leftleg", CubeListBuilder.create().texOffs(84, 88).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.255F)), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition legging_leftleg_parts = legging_leftleg.addOrReplaceChild("legging_leftleg_parts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition legging_leftleg_tasset = legging_leftleg_parts.addOrReplaceChild("legging_leftleg_tasset", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition legging_leftleg_kneebrace = legging_leftleg_parts.addOrReplaceChild("legging_leftleg_kneebrace", CubeListBuilder.create().texOffs(116, 87).addBox(-2.5F, -2.0F, -0.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, -2.0F));

		PartDefinition legging_rightleg = leggings.addOrReplaceChild("legging_rightleg", CubeListBuilder.create().texOffs(26, 92).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.255F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition legging_rightleg_parts = legging_rightleg.addOrReplaceChild("legging_rightleg_parts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition legging_rightleg_tasset = legging_rightleg_parts.addOrReplaceChild("legging_rightleg_tasset", CubeListBuilder.create(), PartPose.offsetAndRotation(2.25F, -1.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition legging_rightleg_kneebrace = legging_rightleg_parts.addOrReplaceChild("legging_rightleg_kneebrace", CubeListBuilder.create().texOffs(66, 36).addBox(-2.5F, -2.0F, -0.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, -2.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	/**
	 * Copia solo la ROTACION de las piernas del modelo base de la entidad
	 * (ciclo de caminata, agachado, etc.), dejando intacto el
	 * posicionamiento original del modelo de Blockbench.
	 */
	public void copyLegPose(ModelPart contextRightLeg, ModelPart contextLeftLeg) {
		this.legging_rightleg.xRot = contextRightLeg.xRot;
		this.legging_rightleg.yRot = contextRightLeg.yRot;
		this.legging_rightleg.zRot = contextRightLeg.zRot;
		this.legging_leftleg.xRot = contextLeftLeg.xRot;
		this.legging_leftleg.yRot = contextLeftLeg.yRot;
		this.legging_leftleg.zRot = contextLeftLeg.zRot;
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}
}