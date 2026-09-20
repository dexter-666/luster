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

public class SunnaIcorHelmetModel extends EntityModel<HumanoidRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(SunnaIcor.id("sunna_icor_helmet"), "main");
	private final ModelPart root;
	private final ModelPart armor_helmet;
	private final ModelPart helmet;
	private final ModelPart helmet_parts;
	private final ModelPart helmet_ornaments;
	private final ModelPart helmet_ornament_left;
	private final ModelPart helmet_ornament_right;
	private final ModelPart helmet_visor;
	private final ModelPart helmet_visor_left;
	private final ModelPart helmet_visor_right;

	public SunnaIcorHelmetModel(ModelPart root) {
		super(root);
		this.root = root.getChild("root");
		this.armor_helmet = this.root.getChild("armor_helmet");
		this.helmet = this.armor_helmet.getChild("helmet");
		this.helmet_parts = this.helmet.getChild("helmet_parts");
		this.helmet_ornaments = this.helmet_parts.getChild("helmet_ornaments");
		this.helmet_ornament_left = this.helmet_ornaments.getChild("helmet_ornament_left");
		this.helmet_ornament_right = this.helmet_ornaments.getChild("helmet_ornament_right");
		this.helmet_visor = this.helmet_parts.getChild("helmet_visor");
		this.helmet_visor_left = this.helmet_visor.getChild("helmet_visor_left");
		this.helmet_visor_right = this.helmet_visor.getChild("helmet_visor_right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition armor_helmet = root.addOrReplaceChild("armor_helmet", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition helmet = armor_helmet.addOrReplaceChild("helmet", CubeListBuilder.create().texOffs(34, 26).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.75F))
		.texOffs(68, 77).addBox(-1.0F, -9.75F, -5.25F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(42, 124).addBox(-1.0F, -9.75F, 4.75F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition helmet_parts = helmet.addOrReplaceChild("helmet_parts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition helmet_ornaments = helmet_parts.addOrReplaceChild("helmet_ornaments", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.0F, -7.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r1 = helmet_ornaments.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(92, 77).addBox(-5.5F, -5.5F, -1.0F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.005F))
		.texOffs(116, 93).addBox(-2.5F, -2.5F, -1.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition helmet_ornament_left = helmet_ornaments.addOrReplaceChild("helmet_ornament_left", CubeListBuilder.create().texOffs(122, 60).addBox(-6.0F, -3.0F, 0.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 84).addBox(-12.0F, -7.0F, 0.0F, 12.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.0F, 0.5F, 0.0F, 0.0F, 0.3927F));

		PartDefinition helmet_ornament_right = helmet_ornaments.addOrReplaceChild("helmet_ornament_right", CubeListBuilder.create().texOffs(84, 0).addBox(0.0F, -7.0F, 0.0F, 12.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(126, 83).addBox(0.0F, -3.0F, 0.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.0F, 0.5F, 0.0F, 0.0F, -0.3927F));

		PartDefinition helmet_visor = helmet_parts.addOrReplaceChild("helmet_visor", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5F, -9.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r2 = helmet_visor.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(120, 42).addBox(-1.5F, -0.075F, -1.5F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition helmet_visor_left = helmet_visor.addOrReplaceChild("helmet_visor_left", CubeListBuilder.create().texOffs(76, 106).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(116, 100).addBox(-9.0F, 0.0F, 0.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(88, 126).addBox(-6.0F, 1.0F, 0.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 58).addBox(-3.0F, 3.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(90, 111).addBox(-6.0F, 1.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition helmet_visor_right = helmet_visor.addOrReplaceChild("helmet_visor_right", CubeListBuilder.create().texOffs(126, 107).addBox(0.0F, 1.0F, 0.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 58).addBox(0.0F, 3.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(90, 115).addBox(5.0F, 1.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 109).addBox(0.0F, 0.0F, 0.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(34, 117).addBox(6.0F, 0.0F, 0.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	/**
	 * Copia solo la ROTACION de la cabeza del modelo base de la entidad
	 * (mirada arriba/abajo, giro de cabeza), dejando intacto el
	 * posicionamiento original del modelo hecho en Blockbench.
	 */
	public void copyHeadPose(ModelPart contextHead) {
		this.armor_helmet.xRot = contextHead.xRot;
		this.armor_helmet.yRot = contextHead.yRot;
		this.armor_helmet.zRot = contextHead.zRot;
	}

	@Override
	public void setupAnim(HumanoidRenderState state) {
	}
}

