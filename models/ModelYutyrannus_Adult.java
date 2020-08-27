// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelYutyrannus_Adult extends EntityModel<Entity> {
	private final ModelRenderer rex_Head;
	private final ModelRenderer Rex_Jaw;
	private final ModelRenderer Rexbrow1;
	private final ModelRenderer Rexbrow2;
	private final ModelRenderer Rex_Neck;
	private final ModelRenderer Rex_Body1;
	private final ModelRenderer Rex_Tail1;
	private final ModelRenderer Rex_Tail2;
	private final ModelRenderer Rex_Tail3;
	private final ModelRenderer Rex_Tail4;
	private final ModelRenderer Rex_Tail5;
	private final ModelRenderer Rex_Left_Arm1;
	private final ModelRenderer Rex_Left_Arm2;
	private final ModelRenderer Rex_Left_Arm3;
	private final ModelRenderer Rex_Left_Arm4;
	private final ModelRenderer Rex_Right_Arm1;
	private final ModelRenderer Rex_Right_Arm2;
	private final ModelRenderer Rex_Right_Arm3;
	private final ModelRenderer Rex_Right_Arm4;
	private final ModelRenderer Rex_Left_Leg;
	private final ModelRenderer Rex_Left_Leg2;
	private final ModelRenderer Rex_Left_Leg3;
	private final ModelRenderer Rex_Right_Leg;
	private final ModelRenderer Rex_Right_Leg2;
	private final ModelRenderer Rex_Right_Leg3;

	public ModelYutyrannus_Adult() {
		textureWidth = 256;
		textureHeight = 256;

		rex_Head = new ModelRenderer(this);
		rex_Head.setRotationPoint(0.0F, -25.0F, -15.0F);
		setRotationAngle(rex_Head, 0.0873F, 0.0F, 0.0F);
		rex_Head.setTextureOffset(106, 77).addBox(-5.0F, -6.0F, -9.0F, 10.0F, 11.0F, 9.0F, 0.0F, false);
		rex_Head.setTextureOffset(25, 92).addBox(-4.0F, -5.0F, -20.0F, 8.0F, 8.0F, 11.0F, 0.0F, false);
		rex_Head.setTextureOffset(55, 0).addBox(3.0F, 3.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rex_Head.setTextureOffset(12, 55).addBox(3.0F, 3.0F, -18.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rex_Head.setTextureOffset(0, 55).addBox(3.0F, 3.0F, -16.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rex_Head.setTextureOffset(15, 54).addBox(3.0F, 3.0F, -14.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rex_Head.setTextureOffset(12, 53).addBox(3.0F, 3.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rex_Head.setTextureOffset(0, 53).addBox(3.0F, 3.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rex_Head.setTextureOffset(18, 44).addBox(-4.0F, 3.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rex_Head.setTextureOffset(14, 44).addBox(-2.0F, 3.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rex_Head.setTextureOffset(0, 44).addBox(1.0F, 3.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rex_Head.setTextureOffset(18, 42).addBox(-4.0F, 3.0F, -18.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rex_Head.setTextureOffset(14, 42).addBox(-4.0F, 3.0F, -16.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rex_Head.setTextureOffset(0, 42).addBox(-4.0F, 3.0F, -14.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rex_Head.setTextureOffset(18, 40).addBox(-4.0F, 3.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rex_Head.setTextureOffset(14, 40).addBox(-4.0F, 3.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Rex_Jaw = new ModelRenderer(this);
		Rex_Jaw.setRotationPoint(0.0F, 4.0F, -9.0F);
		rex_Head.addChild(Rex_Jaw);
		Rex_Jaw.setTextureOffset(80, 0).addBox(-3.0F, -1.0F, -10.0F, 6.0F, 2.0F, 11.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 40).addBox(2.0F, -2.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(15, 21).addBox(-3.0F, -2.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(19, 20).addBox(-3.0F, -2.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(19, 12).addBox(-3.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(19, 3).addBox(-3.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(19, 1).addBox(-3.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(12, 15).addBox(2.0F, -2.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 15).addBox(2.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(12, 13).addBox(2.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 13).addBox(2.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Rexbrow1 = new ModelRenderer(this);
		Rexbrow1.setRotationPoint(3.0F, -3.0038F, -12.0872F);
		rex_Head.addChild(Rexbrow1);
		setRotationAngle(Rexbrow1, 0.4363F, 0.0F, 0.0436F);
		Rexbrow1.setTextureOffset(82, 53).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);

		Rexbrow2 = new ModelRenderer(this);
		Rexbrow2.setRotationPoint(-3.0F, -3.0038F, -12.0872F);
		rex_Head.addChild(Rexbrow2);
		setRotationAngle(Rexbrow2, 0.4363F, 0.0F, -0.0436F);
		Rexbrow2.setTextureOffset(41, 64).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);

		Rex_Neck = new ModelRenderer(this);
		Rex_Neck.setRotationPoint(0.0F, -25.0F, -15.0F);
		setRotationAngle(Rex_Neck, -0.5236F, 0.0F, 0.0F);
		Rex_Neck.setTextureOffset(48, 95).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 9.0F, 16.0F, 0.0F, false);
		Rex_Neck.setTextureOffset(131, 84).addBox(-3.0F, 5.0F, -1.0F, 6.0F, 1.0F, 13.0F, 0.0F, false);

		Rex_Body1 = new ModelRenderer(this);
		Rex_Body1.setRotationPoint(0.0F, -15.0F, -7.0F);
		setRotationAngle(Rex_Body1, 0.0873F, 0.0F, 0.0F);
		Rex_Body1.setTextureOffset(54, 64).addBox(-6.0F, -11.0F, -1.0F, 12.0F, 16.0F, 13.0F, 0.0F, false);
		Rex_Body1.setTextureOffset(82, 141).addBox(-7.0F, -11.0F, -1.0F, 1.0F, 7.0F, 13.0F, 0.0F, false);
		Rex_Body1.setTextureOffset(67, 128).addBox(6.0F, -11.0F, -1.0F, 1.0F, 7.0F, 13.0F, 0.0F, false);
		Rex_Body1.setTextureOffset(19, 52).addBox(-8.0F, -11.0F, 11.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		Rex_Body1.setTextureOffset(16, 13).addBox(7.0F, -11.0F, 11.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		Rex_Body1.setTextureOffset(102, 25).addBox(-7.0F, -12.0F, -0.9995F, 14.0F, 1.0F, 13.0F, 0.0F, false);
		Rex_Body1.setTextureOffset(0, 0).addBox(-8.0F, -11.0F, 12.0F, 16.0F, 17.0F, 23.0F, 0.0F, false);
		Rex_Body1.setTextureOffset(0, 92).addBox(-9.0F, -11.0F, 12.0F, 1.0F, 7.0F, 23.0F, 0.0F, false);
		Rex_Body1.setTextureOffset(81, 81).addBox(8.0F, -11.0F, 12.0F, 1.0F, 7.0F, 23.0F, 0.0F, false);
		Rex_Body1.setTextureOffset(0, 40).addBox(-9.0F, -12.0F, 12.0006F, 18.0F, 1.0F, 23.0F, 0.0F, false);

		Rex_Tail1 = new ModelRenderer(this);
		Rex_Tail1.setRotationPoint(0.0F, 0.0F, 35.0F);
		Rex_Body1.addChild(Rex_Tail1);
		setRotationAngle(Rex_Tail1, -0.2618F, 0.0F, 0.0F);
		Rex_Tail1.setTextureOffset(0, 64).addBox(-7.0F, -10.0F, -3.0F, 14.0F, 15.0F, 13.0F, 0.0F, false);

		Rex_Tail2 = new ModelRenderer(this);
		Rex_Tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
		Rex_Tail1.addChild(Rex_Tail2);
		setRotationAngle(Rex_Tail2, 0.0873F, 0.0F, 0.0F);
		Rex_Tail2.setTextureOffset(62, 24).addBox(-6.0F, -9.0F, -1.0F, 12.0F, 13.0F, 16.0F, 0.0F, false);

		Rex_Tail3 = new ModelRenderer(this);
		Rex_Tail3.setRotationPoint(0.0F, 0.0F, 15.0F);
		Rex_Tail2.addChild(Rex_Tail3);
		Rex_Tail3.setTextureOffset(102, 0).addBox(-5.0F, -8.0F, 0.0F, 10.0F, 12.0F, 13.0F, 0.0F, false);
		Rex_Tail3.setTextureOffset(15, 142).addBox(5.0F, -3.0F, 0.0F, 3.0F, 2.0F, 13.0F, 0.0F, false);
		Rex_Tail3.setTextureOffset(140, 115).addBox(-8.0F, -3.0F, 0.0F, 3.0F, 2.0F, 13.0F, 0.0F, false);

		Rex_Tail4 = new ModelRenderer(this);
		Rex_Tail4.setRotationPoint(0.0F, 0.0F, 13.0F);
		Rex_Tail3.addChild(Rex_Tail4);
		setRotationAngle(Rex_Tail4, 0.0873F, 0.0F, 0.0F);
		Rex_Tail4.setTextureOffset(91, 53).addBox(-4.0F, -7.0F, -1.0F, 8.0F, 10.0F, 14.0F, 0.0F, false);
		Rex_Tail4.setTextureOffset(139, 139).addBox(4.0F, -3.0F, 0.0F, 4.0F, 2.0F, 13.0F, 0.0F, false);
		Rex_Tail4.setTextureOffset(135, 56).addBox(-8.0F, -3.0F, 0.0F, 4.0F, 2.0F, 13.0F, 0.0F, false);

		Rex_Tail5 = new ModelRenderer(this);
		Rex_Tail5.setRotationPoint(0.0F, 0.0F, 13.0F);
		Rex_Tail4.addChild(Rex_Tail5);
		Rex_Tail5.setTextureOffset(55, 0).addBox(-3.0F, -6.0F, -1.0F, 6.0F, 8.0F, 13.0F, 0.0F, false);
		Rex_Tail5.setTextureOffset(59, 53).addBox(-5.0F, -2.9987F, 12.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
		Rex_Tail5.setTextureOffset(110, 148).addBox(-6.0F, -3.0F, 0.0F, 3.0F, 2.0F, 12.0F, 0.0F, false);
		Rex_Tail5.setTextureOffset(143, 13).addBox(3.0F, -3.0F, 0.0F, 3.0F, 2.0F, 12.0F, 0.0F, false);

		Rex_Left_Arm1 = new ModelRenderer(this);
		Rex_Left_Arm1.setRotationPoint(7.0F, -12.0F, -4.0F);
		setRotationAngle(Rex_Left_Arm1, 0.3491F, 0.0F, 0.0F);
		Rex_Left_Arm1.setTextureOffset(0, 40).addBox(-1.0F, -2.0F, -3.0F, 4.0F, 7.0F, 6.0F, 0.0F, false);

		Rex_Left_Arm2 = new ModelRenderer(this);
		Rex_Left_Arm2.setRotationPoint(0.0F, 7.0F, 0.0F);
		Rex_Left_Arm1.addChild(Rex_Left_Arm2);
		setRotationAngle(Rex_Left_Arm2, 0.4363F, 0.0F, 0.0F);
		Rex_Left_Arm2.setTextureOffset(0, 13).addBox(-1.0F, -3.0F, 0.0F, 4.0F, 5.0F, 4.0F, -0.1F, false);
		Rex_Left_Arm2.setTextureOffset(0, 0).addBox(-2.8F, 1.0F, 1.0F, 2.0F, 1.0F, 1.0F, -0.1F, false);

		Rex_Left_Arm3 = new ModelRenderer(this);
		Rex_Left_Arm3.setRotationPoint(-1.0F, 1.0F, 0.0F);
		Rex_Left_Arm2.addChild(Rex_Left_Arm3);
		setRotationAngle(Rex_Left_Arm3, 0.0F, -0.4363F, -0.1309F);
		Rex_Left_Arm3.setTextureOffset(14, 4).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Rex_Left_Arm4 = new ModelRenderer(this);
		Rex_Left_Arm4.setRotationPoint(-1.0F, 1.0F, 4.0F);
		Rex_Left_Arm2.addChild(Rex_Left_Arm4);
		setRotationAngle(Rex_Left_Arm4, 0.0F, 0.4363F, -0.1745F);
		Rex_Left_Arm4.setTextureOffset(14, 2).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Rex_Right_Arm1 = new ModelRenderer(this);
		Rex_Right_Arm1.setRotationPoint(-9.0F, -12.0F, -4.0F);
		setRotationAngle(Rex_Right_Arm1, 0.3491F, 0.0F, 0.0F);
		Rex_Right_Arm1.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -3.0F, 4.0F, 7.0F, 6.0F, 0.0F, false);

		Rex_Right_Arm2 = new ModelRenderer(this);
		Rex_Right_Arm2.setRotationPoint(0.0F, 7.0F, 0.0F);
		Rex_Right_Arm1.addChild(Rex_Right_Arm2);
		setRotationAngle(Rex_Right_Arm2, 0.4363F, 0.0F, 0.0F);
		Rex_Right_Arm2.setTextureOffset(0, 53).addBox(-1.0F, -2.0F, 0.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
		Rex_Right_Arm2.setTextureOffset(0, 2).addBox(2.8F, 1.0F, 1.0F, 2.0F, 1.0F, 1.0F, -0.1F, false);

		Rex_Right_Arm3 = new ModelRenderer(this);
		Rex_Right_Arm3.setRotationPoint(3.0F, 1.0F, 0.0F);
		Rex_Right_Arm2.addChild(Rex_Right_Arm3);
		setRotationAngle(Rex_Right_Arm3, 0.0F, 0.4363F, 0.1309F);
		Rex_Right_Arm3.setTextureOffset(14, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Rex_Right_Arm4 = new ModelRenderer(this);
		Rex_Right_Arm4.setRotationPoint(3.0F, 1.0F, 4.0F);
		Rex_Right_Arm2.addChild(Rex_Right_Arm4);
		setRotationAngle(Rex_Right_Arm4, 0.0F, -0.4363F, 0.1309F);
		Rex_Right_Arm4.setTextureOffset(0, 4).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Rex_Left_Leg = new ModelRenderer(this);
		Rex_Left_Leg.setRotationPoint(8.0F, -16.0F, 21.0F);
		setRotationAngle(Rex_Left_Leg, 0.0F, 0.0F, 0.0F);
		Rex_Left_Leg.setTextureOffset(118, 118).addBox(0.0F, -4.0F, -6.0F, 5.0F, 18.0F, 12.0F, 0.0F, false);

		Rex_Left_Leg2 = new ModelRenderer(this);
		Rex_Left_Leg2.setRotationPoint(0.0F, 14.0F, 0.0F);
		Rex_Left_Leg.addChild(Rex_Left_Leg2);
		setRotationAngle(Rex_Left_Leg2, 0.0F, 0.0F, 0.0F);
		Rex_Left_Leg2.setTextureOffset(0, 122).addBox(0.0F, -1.0F, -3.0F, 5.0F, 24.0F, 9.0F, -0.1F, false);

		Rex_Left_Leg3 = new ModelRenderer(this);
		Rex_Left_Leg3.setRotationPoint(0.0F, 23.0F, 0.0F);
		Rex_Left_Leg2.addChild(Rex_Left_Leg3);
		Rex_Left_Leg3.setTextureOffset(121, 39).addBox(-1.0F, 0.0F, -7.0F, 7.0F, 4.0F, 13.0F, 0.0F, false);

		Rex_Right_Leg = new ModelRenderer(this);
		Rex_Right_Leg.setRotationPoint(-8.0F, -16.0F, 21.0F);
		Rex_Right_Leg.setTextureOffset(84, 111).addBox(-5.0F, -4.0F, -6.0F, 5.0F, 18.0F, 12.0F, 0.0F, false);

		Rex_Right_Leg2 = new ModelRenderer(this);
		Rex_Right_Leg2.setRotationPoint(-5.0F, 14.0F, 0.0F);
		Rex_Right_Leg.addChild(Rex_Right_Leg2);
		Rex_Right_Leg2.setTextureOffset(39, 120).addBox(0.0F, -1.0F, -3.0F, 5.0F, 24.0F, 9.0F, -0.1F, false);

		Rex_Right_Leg3 = new ModelRenderer(this);
		Rex_Right_Leg3.setRotationPoint(0.0F, 23.0F, 0.0F);
		Rex_Right_Leg2.addChild(Rex_Right_Leg3);
		Rex_Right_Leg3.setTextureOffset(116, 98).addBox(-1.0F, 0.0F, -7.0F, 7.0F, 4.0F, 13.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		rex_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Body1.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Left_Arm1.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Right_Arm1.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Rex_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Rex_Tail1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Rex_Tail5.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Rex_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Rex_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Rex_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.rex_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.rex_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Rex_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}