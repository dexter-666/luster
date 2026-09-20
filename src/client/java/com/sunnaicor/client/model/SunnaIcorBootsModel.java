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

public class SunnaIcorBootsModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(SunnaIcor.id("sunna_icor_boots"), "main");
	private final ModelPart root;
	private final ModelPart armor_boots;
	private final ModelPart boots;
	private final ModelPart boot_leftleg;
	private final ModelPart boot_leftleg_parts;
	private final ModelPart boot_rightleg;
	private final ModelPart boot_rightleg_parts;

	public SunnaIcorBootsModel(ModelPart root) {
		this.root = root.getChild("root");
		this.armor_boots = this.root.getChild("armor_boots");
		this.boots = this.armor_boots.getChild("boots");
		this.boot_leftleg = this.boots.getChild("boot_leftleg");
		this.boot_leftleg_parts = this.boot_leftleg.getChild("boot_leftleg_parts");
		this.boot_rightleg = this.boots.getChild("boot_rightleg");
		this.boot_rightleg_parts = this.boot_rightleg.getChild("boot_rightleg_parts");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition armor_boots = root.addOrReplaceChild("armor_boots", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition boots = armor_boots.addOrReplaceChild("boots", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition boot_leftleg = boots.addOrReplaceChild("boot_leftleg", CubeListBuilder.create().texOffs(0, 114).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.55F)), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition boot_leftleg_parts = boot_leftleg.addOrReplaceChild("boot_leftleg_parts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition boot_rightleg = boots.addOrReplaceChild("boot_rightleg", CubeListBuilder.create().texOffs(58, 114).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.55F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition boot_rightleg_parts = boot_rightleg.addOrReplaceChild("boot_rightleg_parts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	/**
	 * Copia solo la ROTACION de las piernas del modelo base de la entidad,
	 * dejando intacto el posicionamiento original del modelo de Blockbench.
	 */
	public void copyLegPose(ModelPart contextRightLeg, ModelPart contextLeftLeg) {
		this.boot_rightleg.xRot = contextRightLeg.xRot;
		this.boot_rightleg.yRot = contextRightLeg.yRot;
		this.boot_rightleg.zRot = contextRightLeg.zRot;
		this.boot_leftleg.xRot = contextLeftLeg.xRot;
		this.boot_leftleg.yRot = contextLeftLeg.yRot;
		this.boot_leftleg.zRot = contextLeftLeg.zRot;
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}
}