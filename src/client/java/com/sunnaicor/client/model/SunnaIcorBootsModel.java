package com.sunnaicor.client.model;

// Generado originalmente con Blockbench 5.0.4 (exportado para "1.17 o superior con Mojang mappings")
// y adaptado a mano para Minecraft 26.2:
//  - Minecraft 1.21+ cambio EntityModel#renderToBuffer(...) de 4 floats (r,g,b,a) a un solo int "color".
//  - El namespace del ModelLayerLocation se cambio de "modid" a "sunna_icor".
//  - Se renombro la clase para seguir la convencion de nombres de Java.

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
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;

public class SunnaIcorLeggingsModel extends EntityModel<HumanoidRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(SunnaIcor.id("sunna_icor_leggings"), "main");
	private final ModelPart root;
	private final ModelPart armor_leggings;
	private final ModelPart leggings;
	private final ModelPart leggings_leftleg;
	private final ModelPart leggings_leftleg_parts;
	private final ModelPart leggings_rightleg;
	private final ModelPart leggings_rightleg_parts;

	public SunnaIcorLeggingsModel(ModelPart root) {
		super(root);
		this.root = root.getChild("root");
		this.armor_leggings = this.root.getChild("armor_leggings");
		this.leggings = this.armor_leggings.getChild("leggings");
		this.leggings_leftleg = this.leggings.getChild("leggings_leftleg");
		this.leggings_leftleg_parts = this.leggings_leftleg.getChild("leggings_leftleg_parts");
		this.leggings_rightleg = this.leggings.getChild("leggings_rightleg");
		this.leggings_rightleg_parts = this.leggings_rightleg.getChild("leggings_rightleg_parts");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition armor_leggings = root.addOrReplaceChild("armor_leggings", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition leggings = armor_leggings.addOrReplaceChild("leggings", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leggings_leftleg = leggings.addOrReplaceChild("leggings_leftleg", CubeListBuilder.create().texOffs(0, 50).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leggings_leftleg_parts = leggings_leftleg.addOrReplaceChild("leggings_leftleg_parts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leggings_rightleg = leggings.addOrReplaceChild("leggings_rightleg", CubeListBuilder.create().texOffs(24, 50).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.55F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leggings_rightleg_parts = leggings_rightleg.addOrReplaceChild("leggings_rightleg_parts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	/**
	 * Copia solo la ROTACION de las piernas del modelo base de la entidad,
	 * dejando intacto el posicionamiento original del modelo de Blockbench.
	 */
	public void copyLegPose(ModelPart contextRightLeg, ModelPart contextLeftLeg) {
		this.leggings_rightleg.xRot = contextRightLeg.xRot;
		this.leggings_rightleg.yRot = contextRightLeg.yRot;
		this.leggings_rightleg.zRot = contextRightLeg.zRot;
		this.leggings_leftleg.xRot = contextLeftLeg.xRot;
		this.leggings_leftleg.yRot = contextLeftLeg.yRot;
		this.leggings_leftleg.zRot = contextLeftLeg.zRot;
	}

	@Override
	public void setupAnim(HumanoidRenderState state) {
	}
}

