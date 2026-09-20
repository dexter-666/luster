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

public class SunnaIcorChestplateModel extends EntityModel<HumanoidRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(SunnaIcor.id("sunna_icor_chestplate"), "main");
	private final ModelPart root;
	private final ModelPart armor_chestplate;
	private final ModelPart chestplate;
	private final ModelPart chestplate_body;
	private final ModelPart chestplate_body_parts;
	private final ModelPart chestplate_body_plackart;
	private final ModelPart chestplate_body_plackart_front;
	private final ModelPart chestplate_body_plackart_front_center;
	private final ModelPart chestplate_body_plackart_front_center_x;
	private final ModelPart chestplate_body_plackart_back;
	private final ModelPart chestplate_body_plackart_back_center;
	private final ModelPart chestplate_body_plackart_back_center_x;
	private final ModelPart chestplate_body_cape;
	private final ModelPart chestplate_body_cape_x;
	private final ModelPart chestplate_body_cape_left;
	private final ModelPart chestplate_body_cape_right;
	private final ModelPart chestplate_body_ornaments;
	private final ModelPart chestplate_body_ornament_left;
	private final ModelPart chestplate_body_ornament_left_2;
	private final ModelPart chestplate_body_ornament_left_3;
	private final ModelPart chestplate_body_ornament_right;
	private final ModelPart chestplate_body_ornament_right_2;
	private final ModelPart chestplate_body_ornament_right_3;
	private final ModelPart legging_body;
	private final ModelPart legging_body_parts;
	private final ModelPart legging_body_tassets;
	private final ModelPart legging_body_tasset_front;
	private final ModelPart legging_body_tasset_front_x;
	private final ModelPart legging_body_tasset_back;
	private final ModelPart legging_body_tasset_back_x;
	private final ModelPart legging_body_tasset_left;
	private final ModelPart legging_body_tasset_right;
	private final ModelPart legging_body_skirt;
	private final ModelPart legging_body_skirt_front;
	private final ModelPart legging_body_skirt_back;
	private final ModelPart legging_body_skirt_left;
	private final ModelPart legging_body_skirt_right;
	private final ModelPart legging_body_dress;
	private final ModelPart legging_body_dress_front;
	private final ModelPart legging_body_dress_front_left;
	private final ModelPart legging_body_dress_front_right;
	private final ModelPart legging_body_dress_back;
	private final ModelPart legging_body_dress_back_left;
	private final ModelPart legging_body_dress_back_right;
	private final ModelPart chestplate_leftarm;
	private final ModelPart chestplate_leftarm_parts;
	private final ModelPart chestplate_leftarm_shoulderpad;
	private final ModelPart chestplate_leftarm_bracelet;
	private final ModelPart chestplate_leftarm_gaunlet;
	private final ModelPart chestplate_leftarm_gaunlet_ornament;
	private final ModelPart chestplate_rightarm;
	private final ModelPart chestplate_rightarm_parts;
	private final ModelPart chestplate_rightarm_bracelet;
	private final ModelPart chestplate_rightarm_gaunlet;
	private final ModelPart chestplate_rightarm_gaunlet_ornament;
	private final ModelPart chestplate_rightarm_shoulderpad;

	public SunnaIcorChestplateModel(ModelPart root) {
		super(root);
		this.root = root.getChild("root");
		this.armor_chestplate = this.root.getChild("armor_chestplate");
		this.chestplate = this.armor_chestplate.getChild("chestplate");
		this.chestplate_body = this.chestplate.getChild("chestplate_body");
		this.chestplate_body_parts = this.chestplate_body.getChild("chestplate_body_parts");
		this.chestplate_body_plackart = this.chestplate_body_parts.getChild("chestplate_body_plackart");
		this.chestplate_body_plackart_front = this.chestplate_body_plackart.getChild("chestplate_body_plackart_front");
		this.chestplate_body_plackart_front_center = this.chestplate_body_plackart_front.getChild("chestplate_body_plackart_front_center");
		this.chestplate_body_plackart_front_center_x = this.chestplate_body_plackart_front_center.getChild("chestplate_body_plackart_front_center_x");
		this.chestplate_body_plackart_back = this.chestplate_body_plackart.getChild("chestplate_body_plackart_back");
		this.chestplate_body_plackart_back_center = this.chestplate_body_plackart_back.getChild("chestplate_body_plackart_back_center");
		this.chestplate_body_plackart_back_center_x = this.chestplate_body_plackart_back_center.getChild("chestplate_body_plackart_back_center_x");
		this.chestplate_body_cape = this.chestplate_body_parts.getChild("chestplate_body_cape");
		this.chestplate_body_cape_x = this.chestplate_body_cape.getChild("chestplate_body_cape_x");
		this.chestplate_body_cape_left = this.chestplate_body_cape.getChild("chestplate_body_cape_left");
		this.chestplate_body_cape_right = this.chestplate_body_cape.getChild("chestplate_body_cape_right");
		this.chestplate_body_ornaments = this.chestplate_body_parts.getChild("chestplate_body_ornaments");
		this.chestplate_body_ornament_left = this.chestplate_body_ornaments.getChild("chestplate_body_ornament_left");
		this.chestplate_body_ornament_left_2 = this.chestplate_body_ornament_left.getChild("chestplate_body_ornament_left_2");
		this.chestplate_body_ornament_left_3 = this.chestplate_body_ornament_left_2.getChild("chestplate_body_ornament_left_3");
		this.chestplate_body_ornament_right = this.chestplate_body_ornaments.getChild("chestplate_body_ornament_right");
		this.chestplate_body_ornament_right_2 = this.chestplate_body_ornament_right.getChild("chestplate_body_ornament_right_2");
		this.chestplate_body_ornament_right_3 = this.chestplate_body_ornament_right_2.getChild("chestplate_body_ornament_right_3");
		this.legging_body = this.chestplate_body.getChild("legging_body");
		this.legging_body_parts = this.legging_body.getChild("legging_body_parts");
		this.legging_body_tassets = this.legging_body_parts.getChild("legging_body_tassets");
		this.legging_body_tasset_front = this.legging_body_tassets.getChild("legging_body_tasset_front");
		this.legging_body_tasset_front_x = this.legging_body_tasset_front.getChild("legging_body_tasset_front_x");
		this.legging_body_tasset_back = this.legging_body_tassets.getChild("legging_body_tasset_back");
		this.legging_body_tasset_back_x = this.legging_body_tasset_back.getChild("legging_body_tasset_back_x");
		this.legging_body_tasset_left = this.legging_body_tassets.getChild("legging_body_tasset_left");
		this.legging_body_tasset_right = this.legging_body_tassets.getChild("legging_body_tasset_right");
		this.legging_body_skirt = this.legging_body_parts.getChild("legging_body_skirt");
		this.legging_body_skirt_front = this.legging_body_skirt.getChild("legging_body_skirt_front");
		this.legging_body_skirt_back = this.legging_body_skirt.getChild("legging_body_skirt_back");
		this.legging_body_skirt_left = this.legging_body_skirt.getChild("legging_body_skirt_left");
		this.legging_body_skirt_right = this.legging_body_skirt.getChild("legging_body_skirt_right");
		this.legging_body_dress = this.chestplate_body.getChild("legging_body_dress");
		this.legging_body_dress_front = this.legging_body_dress.getChild("legging_body_dress_front");
		this.legging_body_dress_front_left = this.legging_body_dress_front.getChild("legging_body_dress_front_left");
		this.legging_body_dress_front_right = this.legging_body_dress_front.getChild("legging_body_dress_front_right");
		this.legging_body_dress_back = this.legging_body_dress.getChild("legging_body_dress_back");
		this.legging_body_dress_back_left = this.legging_body_dress_back.getChild("legging_body_dress_back_left");
		this.legging_body_dress_back_right = this.legging_body_dress_back.getChild("legging_body_dress_back_right");
		this.chestplate_leftarm = this.chestplate.getChild("chestplate_leftarm");
		this.chestplate_leftarm_parts = this.chestplate_leftarm.getChild("chestplate_leftarm_parts");
		this.chestplate_leftarm_shoulderpad = this.chestplate_leftarm_parts.getChild("chestplate_leftarm_shoulderpad");
		this.chestplate_leftarm_bracelet = this.chestplate_leftarm_parts.getChild("chestplate_leftarm_bracelet");
		this.chestplate_leftarm_gaunlet = this.chestplate_leftarm_parts.getChild("chestplate_leftarm_gaunlet");
		this.chestplate_leftarm_gaunlet_ornament = this.chestplate_leftarm_gaunlet.getChild("chestplate_leftarm_gaunlet_ornament");
		this.chestplate_rightarm = this.chestplate.getChild("chestplate_rightarm");
		this.chestplate_rightarm_parts = this.chestplate_rightarm.getChild("chestplate_rightarm_parts");
		this.chestplate_rightarm_bracelet = this.chestplate_rightarm_parts.getChild("chestplate_rightarm_bracelet");
		this.chestplate_rightarm_gaunlet = this.chestplate_rightarm_parts.getChild("chestplate_rightarm_gaunlet");
		this.chestplate_rightarm_gaunlet_ornament = this.chestplate_rightarm_gaunlet.getChild("chestplate_rightarm_gaunlet_ornament");
		this.chestplate_rightarm_shoulderpad = this.chestplate_rightarm_parts.getChild("chestplate_rightarm_shoulderpad");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition armor_chestplate = root.addOrReplaceChild("armor_chestplate", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition chestplate = armor_chestplate.addOrReplaceChild("chestplate", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body = chestplate.addOrReplaceChild("chestplate_body", CubeListBuilder.create().texOffs(26, 60).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_parts = chestplate_body.addOrReplaceChild("chestplate_body_parts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_plackart = chestplate_body_parts.addOrReplaceChild("chestplate_body_plackart", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_plackart_front = chestplate_body_plackart.addOrReplaceChild("chestplate_body_plackart_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.25F, -6.0F));

		PartDefinition cube_r1 = chestplate_body_plackart_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 76).addBox(-5.0F, -2.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_plackart_front_center = chestplate_body_plackart_front.addOrReplaceChild("chestplate_body_plackart_front_center", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_plackart_front_center_x = chestplate_body_plackart_front_center.addOrReplaceChild("chestplate_body_plackart_front_center_x", CubeListBuilder.create().texOffs(42, 76).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_plackart_back = chestplate_body_plackart.addOrReplaceChild("chestplate_body_plackart_back", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, 5.0F));

		PartDefinition chestplate_body_plackart_back_center = chestplate_body_plackart_back.addOrReplaceChild("chestplate_body_plackart_back_center", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_plackart_back_center_x = chestplate_body_plackart_back_center.addOrReplaceChild("chestplate_body_plackart_back_center_x", CubeListBuilder.create().texOffs(110, 110).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_cape = chestplate_body_parts.addOrReplaceChild("chestplate_body_cape", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 3.5F));

		PartDefinition chestplate_body_cape_x = chestplate_body_cape.addOrReplaceChild("chestplate_body_cape_x", CubeListBuilder.create().texOffs(34, 0).addBox(-5.5F, 0.0F, -4.0F, 11.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_cape_left = chestplate_body_cape.addOrReplaceChild("chestplate_body_cape_left", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -7.0F, 10.0F, 22.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_cape_right = chestplate_body_cape.addOrReplaceChild("chestplate_body_cape_right", CubeListBuilder.create().texOffs(0, 29).addBox(-10.0F, 0.0F, -7.0F, 10.0F, 22.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_ornaments = chestplate_body_parts.addOrReplaceChild("chestplate_body_ornaments", CubeListBuilder.create(), PartPose.offset(0.0F, 0.25F, 0.5F));

		PartDefinition chestplate_body_ornament_left = chestplate_body_ornaments.addOrReplaceChild("chestplate_body_ornament_left", CubeListBuilder.create(), PartPose.offset(-4.5F, 2.75F, -5.0F));

		PartDefinition cube_r2 = chestplate_body_ornament_left.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 102).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(58, 102).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition chestplate_body_ornament_left_2 = chestplate_body_ornament_left.addOrReplaceChild("chestplate_body_ornament_left_2", CubeListBuilder.create().texOffs(34, 110).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_ornament_left_3 = chestplate_body_ornament_left_2.addOrReplaceChild("chestplate_body_ornament_left_3", CubeListBuilder.create().texOffs(16, 93).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_ornament_right = chestplate_body_ornaments.addOrReplaceChild("chestplate_body_ornament_right", CubeListBuilder.create(), PartPose.offset(4.5F, 2.75F, -5.0F));

		PartDefinition cube_r3 = chestplate_body_ornament_right.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 117).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 127).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition chestplate_body_ornament_right_2 = chestplate_body_ornament_right.addOrReplaceChild("chestplate_body_ornament_right_2", CubeListBuilder.create().texOffs(126, 110).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_body_ornament_right_3 = chestplate_body_ornament_right_2.addOrReplaceChild("chestplate_body_ornament_right_3", CubeListBuilder.create().texOffs(58, 93).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition legging_body = chestplate_body.addOrReplaceChild("legging_body", CubeListBuilder.create().texOffs(60, 42).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition legging_body_parts = legging_body.addOrReplaceChild("legging_body_parts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition legging_body_tassets = legging_body_parts.addOrReplaceChild("legging_body_tassets", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, 0.0F));

		PartDefinition legging_body_tasset_front = legging_body_tassets.addOrReplaceChild("legging_body_tasset_front", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition legging_body_tasset_front_x = legging_body_tasset_front.addOrReplaceChild("legging_body_tasset_front_x", CubeListBuilder.create().texOffs(126, 0).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition legging_body_tasset_back = legging_body_tassets.addOrReplaceChild("legging_body_tasset_back", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 3.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition legging_body_tasset_back_x = legging_body_tasset_back.addOrReplaceChild("legging_body_tasset_back_x", CubeListBuilder.create().texOffs(126, 77).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition legging_body_tasset_left = legging_body_tassets.addOrReplaceChild("legging_body_tasset_left", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = legging_body_tasset_left.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(100, 33).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(122, 52).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.8029F, 0.0F, 0.0F));

		PartDefinition legging_body_tasset_right = legging_body_tassets.addOrReplaceChild("legging_body_tasset_right", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = legging_body_tasset_right.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(100, 87).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(60, 122).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.8029F, 0.0F, 0.0F));

		PartDefinition legging_body_skirt = legging_body_parts.addOrReplaceChild("legging_body_skirt", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition legging_body_skirt_front = legging_body_skirt.addOrReplaceChild("legging_body_skirt_front", CubeListBuilder.create().texOffs(76, 111).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = legging_body_skirt_front.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(90, 119).addBox(-2.5F, -2.5F, -1.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition legging_body_skirt_back = legging_body_skirt.addOrReplaceChild("legging_body_skirt_back", CubeListBuilder.create().texOffs(112, 77).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = legging_body_skirt_back.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 120).addBox(-2.5F, -2.5F, -1.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition legging_body_skirt_left = legging_body_skirt.addOrReplaceChild("legging_body_skirt_left", CubeListBuilder.create().texOffs(116, 22).addBox(0.0F, 0.0F, -2.0F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8 = legging_body_skirt_left.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 124).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition legging_body_skirt_right = legging_body_skirt.addOrReplaceChild("legging_body_skirt_right", CubeListBuilder.create().texOffs(116, 32).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r9 = legging_body_skirt_right.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(104, 124).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition legging_body_dress = chestplate_body.addOrReplaceChild("legging_body_dress", CubeListBuilder.create(), PartPose.offset(0.0F, 12.75F, 0.0F));

		PartDefinition cube_r10 = legging_body_dress.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 106).addBox(0.0F, 14.0F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(70, 58).addBox(0.0F, 0.0F, -2.5F, 4.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -3.75F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r11 = legging_body_dress.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(104, 55).addBox(-4.0F, 14.0F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 17).addBox(-4.0F, 0.0F, -2.5F, 4.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -3.75F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition legging_body_dress_front = legging_body_dress.addOrReplaceChild("legging_body_dress_front", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r12 = legging_body_dress_front.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(88, 63).addBox(-4.75F, 14.0F, -4.0F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.075F)).texOffs(34, 42).addBox(-4.75F, 0.0F, -4.0F, 9.0F, 14.0F, 4.0F, new CubeDeformation(0.075F)), PartPose.offsetAndRotation(0.25F, -3.75F, 2.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition legging_body_dress_front_left = legging_body_dress_front.addOrReplaceChild("legging_body_dress_front_left", CubeListBuilder.create().texOffs(84, 9).addBox(-4.0F, 0.0F, -4.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0075F)).texOffs(114, 63).addBox(-4.0F, 14.0F, -4.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0075F)), PartPose.offsetAndRotation(4.25F, -3.75F, 2.25F, 0.3054F, 0.0F, -0.3054F));

		PartDefinition legging_body_dress_front_right = legging_body_dress_front.addOrReplaceChild("legging_body_dress_front_right", CubeListBuilder.create().texOffs(84, 27).addBox(0.0F, 0.0F, -4.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0075F)).texOffs(114, 70).addBox(0.0F, 14.0F, -4.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0075F)), PartPose.offsetAndRotation(-4.25F, -3.75F, 2.25F, 0.3054F, 0.0F, 0.3054F));

		PartDefinition legging_body_dress_back = legging_body_dress.addOrReplaceChild("legging_body_dress_back", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r13 = legging_body_dress_back.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(88, 70).addBox(-4.75F, 14.0F, 0.0F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.075F)).texOffs(0, 58).addBox(-4.75F, 0.0F, 0.0F, 9.0F, 14.0F, 4.0F, new CubeDeformation(0.075F)), PartPose.offsetAndRotation(0.25F, -3.75F, -2.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition legging_body_dress_back_left = legging_body_dress_back.addOrReplaceChild("legging_body_dress_back_left", CubeListBuilder.create().texOffs(88, 45).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0075F)).texOffs(116, 8).addBox(-4.0F, 14.0F, 0.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0075F)), PartPose.offsetAndRotation(4.25F, -3.75F, -2.25F, -0.3054F, 0.0F, -0.3054F));

		PartDefinition legging_body_dress_back_right = legging_body_dress_back.addOrReplaceChild("legging_body_dress_back_right", CubeListBuilder.create().texOffs(68, 88).addBox(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0075F)).texOffs(116, 15).addBox(0.0F, 14.0F, 0.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0075F)), PartPose.offsetAndRotation(-4.25F, -3.75F, -2.25F, -0.3054F, 0.0F, 0.3054F));

		PartDefinition chestplate_leftarm = chestplate.addOrReplaceChild("chestplate_leftarm", CubeListBuilder.create().texOffs(0, 93).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_leftarm_parts = chestplate_leftarm.addOrReplaceChild("chestplate_leftarm_parts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_leftarm_shoulderpad = chestplate_leftarm_parts.addOrReplaceChild("chestplate_leftarm_shoulderpad", CubeListBuilder.create().texOffs(50, 60).addBox(0.0F, -2.0F, -4.25F, 3.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r14 = chestplate_leftarm_shoulderpad.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(96, 109).addBox(-1.0F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.007F)).texOffs(28, 76).addBox(-1.0F, -5.5F, -5.5F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0F, 1.5F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition chestplate_leftarm_bracelet = chestplate_leftarm_parts.addOrReplaceChild("chestplate_leftarm_bracelet", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_leftarm_gaunlet = chestplate_leftarm_parts.addOrReplaceChild("chestplate_leftarm_gaunlet", CubeListBuilder.create().texOffs(100, 99).addBox(-0.5F, -6.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_leftarm_gaunlet_ornament = chestplate_leftarm_gaunlet.addOrReplaceChild("chestplate_leftarm_gaunlet_ornament", CubeListBuilder.create().texOffs(0, 122).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(100, 9).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -1.75F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition chestplate_rightarm = chestplate.addOrReplaceChild("chestplate_rightarm", CubeListBuilder.create().texOffs(42, 93).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_rightarm_parts = chestplate_rightarm.addOrReplaceChild("chestplate_rightarm_parts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_rightarm_bracelet = chestplate_rightarm_parts.addOrReplaceChild("chestplate_rightarm_bracelet", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_rightarm_gaunlet = chestplate_rightarm_parts.addOrReplaceChild("chestplate_rightarm_gaunlet", CubeListBuilder.create().texOffs(104, 45).addBox(-3.5F, -6.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition chestplate_rightarm_gaunlet_ornament = chestplate_rightarm_gaunlet.addOrReplaceChild("chestplate_rightarm_gaunlet_ornament", CubeListBuilder.create().texOffs(100, 21).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 122).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, -1.75F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition chestplate_rightarm_shoulderpad = chestplate_rightarm_parts.addOrReplaceChild("chestplate_rightarm_shoulderpad", CubeListBuilder.create().texOffs(64, 0).addBox(-2.0F, -2.0F, -4.25F, 3.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r15 = chestplate_rightarm_shoulderpad.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(48, 77).addBox(-1.0F, -5.5F, -5.5F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.007F)).texOffs(20, 110).addBox(-1.0F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, 1.5F, 0.0F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	/**
	 * Copia solo la ROTACION del torso del modelo base de la entidad,
	 * dejando intacto el posicionamiento original del modelo de Blockbench.
	 */
	public void copyBodyPose(ModelPart contextBody) {
		this.armor_chestplate.xRot = contextBody.xRot;
		this.armor_chestplate.yRot = contextBody.yRot;
		this.armor_chestplate.zRot = contextBody.zRot;
	}

	@Override
	public void setupAnim(HumanoidRenderState state) {
	}
}

