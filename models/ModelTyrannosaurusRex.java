// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelTyrannosaurusRex extends EntityModel<Entity> {
	private final ModelRenderer Rex_Head;
	private final ModelRenderer Rex_Jaw;
	private final ModelRenderer Crest;
	private final ModelRenderer Rex_Neck;
	private final ModelRenderer Rex_Body;
	private final ModelRenderer Rex_Body2;
	private final ModelRenderer Rex_Tail1;
	private final ModelRenderer Rex_Tail2;
	private final ModelRenderer Rex_Tail3;
	private final ModelRenderer Rex_Left_Leg;
	private final ModelRenderer Rex_Left_Leg2;
	private final ModelRenderer Rex_Left_Leg3;
	private final ModelRenderer Rex_Right_Leg;
	private final ModelRenderer Rex_Right_Leg2;
	private final ModelRenderer Rex_Right_Leg3;
	private final ModelRenderer Rex_Left_Arm;
	private final ModelRenderer Rex_Left_Arm2;
	private final ModelRenderer Rex_Left_Arm3;
	private final ModelRenderer Rex_Left_Arm4;

	public ModelTyrannosaurusRex() {
		textureWidth = 256;
		textureHeight = 256;

		Rex_Head = new ModelRenderer(this);
		Rex_Head.setRotationPoint(0.0F, -25.0F, -14.0F);
		Rex_Head.setTextureOffset(216, 234).addBox(-4.0F, -5.0F, -26.0F, 8.0F, 10.0F, 12.0F, 0.0F, false);
		Rex_Head.setTextureOffset(208, 205).addBox(-5.0F, -6.0F, -14.0F, 10.0F, 13.0F, 14.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-4.0F, 5.0F, -16.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-4.0F, 5.0F, -18.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-4.0F, 5.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-4.0F, 5.0F, -26.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-2.0F, 5.0F, -26.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(1.0F, 5.0F, -26.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(3.0F, 5.0F, -26.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(3.0F, 5.0F, -24.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(3.0F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(3.0F, 5.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(3.0F, 5.0F, -18.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(3.0F, 5.0F, -16.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-4.0F, 5.0F, -24.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-4.0F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Rex_Jaw = new ModelRenderer(this);
		Rex_Jaw.setRotationPoint(0.0F, 6.0F, -15.0F);
		Rex_Head.addChild(Rex_Jaw);
		setRotationAngle(Rex_Jaw, 0.3491F, 0.0F, 0.0F);
		Rex_Jaw.setTextureOffset(220, 189).addBox(-3.0F, -1.0F, -10.0F, 6.0F, 2.0F, 12.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(2.0F, -2.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(2.0F, -2.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(2.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(2.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(2.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(2.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(85, 13).addBox(-1.0F, -2.0F, -8.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);

		Crest = new ModelRenderer(this);
		Crest.setRotationPoint(-4.0F, -6.0F, -13.0F);
		Rex_Head.addChild(Crest);
		setRotationAngle(Crest, 0.4363F, 0.0F, 0.0F);
		Crest.setTextureOffset(80, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		Crest.setTextureOffset(104, 0).addBox(8.0F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		Rex_Neck = new ModelRenderer(this);
		Rex_Neck.setRotationPoint(0.0F, -27.0F, -13.0F);
		setRotationAngle(Rex_Neck, -0.6109F, 0.0F, 0.0F);
		Rex_Neck.setTextureOffset(214, 162).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 11.0F, 13.0F, 0.0F, false);
		Rex_Neck.setTextureOffset(218, 142).addBox(-3.0F, 8.0F, -3.0F, 6.0F, 1.0F, 13.0F, 0.0F, false);

		Rex_Body = new ModelRenderer(this);
		Rex_Body.setRotationPoint(0.0F, -20.0F, -6.0F);
		Rex_Body.setTextureOffset(188, 104).addBox(-7.0F, -8.0F, -4.0F, 14.0F, 18.0F, 20.0F, 0.0F, false);

		Rex_Body2 = new ModelRenderer(this);
		Rex_Body2.setRotationPoint(0.0F, 0.0F, 20.0F);
		Rex_Body.addChild(Rex_Body2);
		Rex_Body2.setTextureOffset(200, 67).addBox(-6.0F, -8.0F, -4.0F, 12.0F, 17.0F, 16.0F, 0.0F, false);

		Rex_Tail1 = new ModelRenderer(this);
		Rex_Tail1.setRotationPoint(0.0F, 0.0F, 12.0F);
		Rex_Body2.addChild(Rex_Tail1);
		setRotationAngle(Rex_Tail1, 0.1745F, 0.0F, 0.0F);
		Rex_Tail1.setTextureOffset(196, 27).addBox(-5.0F, -6.0F, -2.0F, 10.0F, 14.0F, 20.0F, 0.0F, false);

		Rex_Tail2 = new ModelRenderer(this);
		Rex_Tail2.setRotationPoint(0.0F, 0.0F, 18.0F);
		Rex_Tail1.addChild(Rex_Tail2);
		setRotationAngle(Rex_Tail2, 0.0873F, 0.0F, 0.0F);
		Rex_Tail2.setTextureOffset(146, 227).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 11.0F, 18.0F, 0.0F, false);

		Rex_Tail3 = new ModelRenderer(this);
		Rex_Tail3.setRotationPoint(0.0F, 0.0F, 17.0F);
		Rex_Tail2.addChild(Rex_Tail3);
		setRotationAngle(Rex_Tail3, 0.0873F, 0.0F, 0.0F);
		Rex_Tail3.setTextureOffset(153, 198).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 8.0F, 18.0F, 0.0F, false);

		Rex_Left_Leg = new ModelRenderer(this);
		Rex_Left_Leg.setRotationPoint(6.0F, -14.0F, 18.0F);
		setRotationAngle(Rex_Left_Leg, 0.3491F, 0.0F, 0.0F);
		Rex_Left_Leg.setTextureOffset(0, 223).addBox(-5.0F, -10.0F, -6.0F, 6.0F, 21.0F, 12.0F, 0.0F, false);

		Rex_Left_Leg2 = new ModelRenderer(this);
		Rex_Left_Leg2.setRotationPoint(0.0F, 19.0F, -6.0F);
		Rex_Left_Leg.addChild(Rex_Left_Leg2);
		setRotationAngle(Rex_Left_Leg2, 0.0873F, 0.0F, 0.0F);
		Rex_Left_Leg2.setTextureOffset(0, 183).addBox(-4.0F, -13.0F, -3.0F, 5.0F, 28.0F, 9.0F, 0.0F, false);

		Rex_Left_Leg3 = new ModelRenderer(this);
		Rex_Left_Leg3.setRotationPoint(0.0F, 15.1736F, 6.0152F);
		Rex_Left_Leg2.addChild(Rex_Left_Leg3);
		setRotationAngle(Rex_Left_Leg3, 0.1745F, 0.0F, 0.0F);
		Rex_Left_Leg3.setTextureOffset(0, 160).addBox(-4.0F, -2.0F, -13.0F, 5.0F, 4.0F, 13.0F, 0.0F, false);
		Rex_Left_Leg3.setTextureOffset(0, 0).addBox(0.0F, 0.0F, -14.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -14.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -14.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Rex_Left_Leg3.setTextureOffset(0, 0).addBox(0.0F, 1.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-2.0F, 1.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-4.0F, 1.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Rex_Right_Leg = new ModelRenderer(this);
		Rex_Right_Leg.setRotationPoint(-2.0F, -14.0F, 18.0F);
		setRotationAngle(Rex_Right_Leg, 0.3491F, 0.0F, 0.0F);
		Rex_Right_Leg.setTextureOffset(0, 123).addBox(-5.0F, -10.0F, -6.0F, 6.0F, 21.0F, 12.0F, 0.0F, false);

		Rex_Right_Leg2 = new ModelRenderer(this);
		Rex_Right_Leg2.setRotationPoint(-1.0F, 19.0F, -6.0F);
		Rex_Right_Leg.addChild(Rex_Right_Leg2);
		setRotationAngle(Rex_Right_Leg2, 0.0873F, 0.0F, 0.0F);
		Rex_Right_Leg2.setTextureOffset(0, 83).addBox(-4.0F, -13.0F, -3.0F, 5.0F, 28.0F, 9.0F, 0.0F, false);

		Rex_Right_Leg3 = new ModelRenderer(this);
		Rex_Right_Leg3.setRotationPoint(0.0F, 15.1736F, 6.0152F);
		Rex_Right_Leg2.addChild(Rex_Right_Leg3);
		setRotationAngle(Rex_Right_Leg3, 0.1745F, 0.0F, 0.0F);
		Rex_Right_Leg3.setTextureOffset(0, 63).addBox(-4.0F, -2.0F, -13.0F, 5.0F, 4.0F, 13.0F, 0.0F, false);
		Rex_Right_Leg3.setTextureOffset(0, 0).addBox(0.0F, 0.0F, -14.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -14.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -14.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Rex_Right_Leg3.setTextureOffset(0, 0).addBox(0.0F, 1.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-2.0F, 1.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-4.0F, 1.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Rex_Left_Arm = new ModelRenderer(this);
		Rex_Left_Arm.setRotationPoint(8.0F, -15.0F, -5.0F);
		Rex_Left_Arm.setTextureOffset(42, 242).addBox(-4.0F, -1.0F, -4.0F, 4.0F, 7.0F, 7.0F, 0.0F, false);

		Rex_Left_Arm2 = new ModelRenderer(this);
		Rex_Left_Arm2.setRotationPoint(0.0F, 7.0F, 0.0F);
		Rex_Left_Arm.addChild(Rex_Left_Arm2);
		setRotationAngle(Rex_Left_Arm2, 0.6109F, 0.0F, 0.0F);
		Rex_Left_Arm2.setTextureOffset(48, 226).addBox(-4.0F, -3.0F, -1.0F, 4.0F, 7.0F, 5.0F, 0.0F, false);
		Rex_Left_Arm2.setTextureOffset(0, 0).addBox(-6.0F, 3.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Left_Arm2.setTextureOffset(0, 0).addBox(-6.0F, 3.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Rex_Left_Arm3 = new ModelRenderer(this);
		Rex_Left_Arm3.setRotationPoint(-4.0F, -15.0F, -5.0F);
		Rex_Left_Arm3.setTextureOffset(50, 208).addBox(-4.0F, -1.0F, -4.0F, 4.0F, 7.0F, 7.0F, 0.0F, false);

		Rex_Left_Arm4 = new ModelRenderer(this);
		Rex_Left_Arm4.setRotationPoint(0.0F, 7.0F, 0.0F);
		Rex_Left_Arm3.addChild(Rex_Left_Arm4);
		setRotationAngle(Rex_Left_Arm4, 0.6109F, 0.0F, 0.0F);
		Rex_Left_Arm4.setTextureOffset(56, 192).addBox(-4.0F, -3.0F, -1.0F, 4.0F, 7.0F, 5.0F, 0.0F, false);
		Rex_Left_Arm4.setTextureOffset(0, 0).addBox(0.0F, 3.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Left_Arm4.setTextureOffset(0, 0).addBox(0.0F, 3.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Rex_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Left_Arm3.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Rex_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Rex_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Rex_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Rex_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Rex_Tail1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Rex_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Rex_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}