// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelTyrannosaurusRex extends EntityModel<Entity> {
	private final ModelRenderer Rex_Head;
	private final ModelRenderer Rex_Jaw;
	private final ModelRenderer Rex_Neck;
	private final ModelRenderer Rex_Body;
	private final ModelRenderer Rex_Tail;
	private final ModelRenderer Rex_Tail2;
	private final ModelRenderer Rex_Tail3;
	private final ModelRenderer Rex_Tail4;
	private final ModelRenderer Rex_Left_Arm;
	private final ModelRenderer Rex_Left_Arm2;
	private final ModelRenderer Rex_Right_Arm;
	private final ModelRenderer Rex_Right_Arm2;
	private final ModelRenderer Rex_Left_Leg;
	private final ModelRenderer Rex_Left_Leg2;
	private final ModelRenderer Rex_Left_Leg3;
	private final ModelRenderer Rex_Right_Leg;
	private final ModelRenderer Rex_Right_Leg2;
	private final ModelRenderer Rex_Right_Leg3;

	public ModelTyrannosaurusRex() {
		textureWidth = 256;
		textureHeight = 256;

		Rex_Head = new ModelRenderer(this);
		Rex_Head.setRotationPoint(0.0F, -32.0F, -29.0F);
		Rex_Head.setTextureOffset(194, 226).addBox(-6.0F, -7.0F, -34.0F, 13.0F, 12.0F, 18.0F, 0.0F, false);
		Rex_Head.setTextureOffset(194, 192).addBox(-7.0F, -9.0F, -16.0F, 15.0F, 17.0F, 16.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -32.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -30.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -28.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -26.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -24.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -18.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-4.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -32.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -30.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -28.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -26.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -24.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(5.0F, 5.0F, -18.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(4.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(-2.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(0.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Head.setTextureOffset(0, 0).addBox(2.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Rex_Jaw = new ModelRenderer(this);
		Rex_Jaw.setRotationPoint(0.0F, 6.0F, -16.0F);
		Rex_Head.addChild(Rex_Jaw);
		setRotationAngle(Rex_Jaw, 0.2618F, 0.0F, 0.0F);
		Rex_Jaw.setTextureOffset(198, 168).addBox(-5.0F, -1.0F, -17.0F, 11.0F, 3.0F, 18.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(4.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(4.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(3.0F, -2.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(1.0F, -2.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Rex_Jaw.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Rex_Neck = new ModelRenderer(this);
		Rex_Neck.setRotationPoint(0.0F, -32.0F, -29.0F);
		setRotationAngle(Rex_Neck, -0.5236F, 0.0F, 0.0F);
		Rex_Neck.setTextureOffset(194, 130).addBox(-6.0F, -7.0F, -5.0F, 13.0F, 14.0F, 18.0F, 0.0F, false);

		Rex_Body = new ModelRenderer(this);
		Rex_Body.setRotationPoint(0.0F, -27.0F, -18.0F);
		Rex_Body.setTextureOffset(180, 84).addBox(-8.0F, -8.0F, -4.0F, 17.0F, 22.0F, 21.0F, 0.0F, false);
		Rex_Body.setTextureOffset(160, 28).addBox(-9.0F, -8.0F, 17.0F, 19.0F, 23.0F, 29.0F, 0.0F, false);

		Rex_Tail = new ModelRenderer(this);
		Rex_Tail.setRotationPoint(0.0F, 0.0F, 46.0F);
		Rex_Body.addChild(Rex_Tail);
		setRotationAngle(Rex_Tail, 0.0873F, 0.0F, 0.0F);
		Rex_Tail.setTextureOffset(120, 217).addBox(-7.0F, -6.0F, -1.0F, 15.0F, 18.0F, 21.0F, 0.0F, false);

		Rex_Tail2 = new ModelRenderer(this);
		Rex_Tail2.setRotationPoint(0.0F, 3.0F, 20.0F);
		Rex_Tail.addChild(Rex_Tail2);
		setRotationAngle(Rex_Tail2, 0.0873F, 0.0F, 0.0F);
		Rex_Tail2.setTextureOffset(129, 176).addBox(-5.0F, -7.0F, -1.0F, 11.0F, 15.0F, 21.0F, 0.0F, false);

		Rex_Tail3 = new ModelRenderer(this);
		Rex_Tail3.setRotationPoint(0.0F, 1.0F, 20.0F);
		Rex_Tail2.addChild(Rex_Tail3);
		setRotationAngle(Rex_Tail3, 0.0873F, 0.0F, 0.0F);
		Rex_Tail3.setTextureOffset(132, 136).addBox(-4.0F, -6.0F, -1.0F, 9.0F, 12.0F, 21.0F, 0.0F, false);

		Rex_Tail4 = new ModelRenderer(this);
		Rex_Tail4.setRotationPoint(0.0F, 0.0F, 20.0F);
		Rex_Tail3.addChild(Rex_Tail4);
		setRotationAngle(Rex_Tail4, 0.0873F, 0.0F, 0.0F);
		Rex_Tail4.setTextureOffset(120, 97).addBox(-3.0F, -4.0F, -1.0F, 7.0F, 9.0F, 21.0F, 0.0F, false);

		Rex_Left_Arm = new ModelRenderer(this);
		Rex_Left_Arm.setRotationPoint(0.0F, 24.0F, 0.0F);
		Rex_Left_Arm.setTextureOffset(168, 0).addBox(5.0F, -45.0F, -21.0F, 5.0F, 11.0F, 8.0F, 0.0F, false);

		Rex_Left_Arm2 = new ModelRenderer(this);
		Rex_Left_Arm2.setRotationPoint(8.0F, -34.0F, -17.0F);
		Rex_Left_Arm.addChild(Rex_Left_Arm2);
		setRotationAngle(Rex_Left_Arm2, 0.7854F, 0.0F, 0.0F);
		Rex_Left_Arm2.setTextureOffset(139, 0).addBox(-3.0F, -2.0F, -2.0F, 5.0F, 9.0F, 6.0F, 0.0F, false);
		Rex_Left_Arm2.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Rex_Left_Arm2.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Rex_Right_Arm = new ModelRenderer(this);
		Rex_Right_Arm.setRotationPoint(-14.0F, 24.0F, 0.0F);
		Rex_Right_Arm.setTextureOffset(230, 0).addBox(5.0F, -45.0F, -21.0F, 5.0F, 11.0F, 8.0F, 0.0F, false);

		Rex_Right_Arm2 = new ModelRenderer(this);
		Rex_Right_Arm2.setRotationPoint(8.0F, -34.0F, -17.0F);
		Rex_Right_Arm.addChild(Rex_Right_Arm2);
		setRotationAngle(Rex_Right_Arm2, 0.7854F, 0.0F, 0.0F);
		Rex_Right_Arm2.setTextureOffset(202, 0).addBox(-3.0F, -2.0F, -2.0F, 5.0F, 9.0F, 6.0F, 0.0F, false);
		Rex_Right_Arm2.setTextureOffset(0, 0).addBox(2.0F, 5.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Rex_Right_Arm2.setTextureOffset(0, 0).addBox(2.0F, 5.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Rex_Left_Leg = new ModelRenderer(this);
		Rex_Left_Leg.setRotationPoint(10.0F, -15.0F, 19.0F);
		Rex_Left_Leg.setTextureOffset(0, 164).addBox(-8.0F, -14.0F, -11.0F, 9.0F, 26.0F, 19.0F, 0.0F, false);

		Rex_Left_Leg2 = new ModelRenderer(this);
		Rex_Left_Leg2.setRotationPoint(0.0F, 24.0F, 3.0F);
		Rex_Left_Leg.addChild(Rex_Left_Leg2);
		setRotationAngle(Rex_Left_Leg2, 0.2618F, 0.0F, 0.0F);
		Rex_Left_Leg2.setTextureOffset(0, 120).addBox(-8.0F, -14.0F, -6.0F, 9.0F, 25.0F, 13.0F, 0.0F, false);

		Rex_Left_Leg3 = new ModelRenderer(this);
		Rex_Left_Leg3.setRotationPoint(0.0F, 12.0F, -2.0F);
		Rex_Left_Leg2.addChild(Rex_Left_Leg3);
		setRotationAngle(Rex_Left_Leg3, -0.2618F, 0.0F, 0.0F);
		Rex_Left_Leg3.setTextureOffset(0, 46).addBox(-8.0F, -3.0F, -13.0F, 9.0F, 6.0F, 21.0F, 0.0F, false);
		Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -15.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -15.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-5.0F, 1.0F, -17.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-8.0F, -1.0F, -15.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-8.0F, 1.0F, -17.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-1.0F, 1.0F, -17.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Rex_Right_Leg = new ModelRenderer(this);
		Rex_Right_Leg.setRotationPoint(-2.0F, -15.0F, 19.0F);
		Rex_Right_Leg.setTextureOffset(0, 211).addBox(-8.0F, -14.0F, -11.0F, 9.0F, 26.0F, 19.0F, 0.0F, false);

		Rex_Right_Leg2 = new ModelRenderer(this);
		Rex_Right_Leg2.setRotationPoint(0.0F, 24.0F, 3.0F);
		Rex_Right_Leg.addChild(Rex_Right_Leg2);
		setRotationAngle(Rex_Right_Leg2, 0.2618F, 0.0F, 0.0F);
		Rex_Right_Leg2.setTextureOffset(0, 76).addBox(-8.0F, -14.0F, -6.0F, 9.0F, 25.0F, 13.0F, 0.0F, false);

		Rex_Right_Leg3 = new ModelRenderer(this);
		Rex_Right_Leg3.setRotationPoint(0.0F, 12.0F, -2.0F);
		Rex_Right_Leg2.addChild(Rex_Right_Leg3);
		setRotationAngle(Rex_Right_Leg3, -0.2618F, 0.0F, 0.0F);
		Rex_Right_Leg3.setTextureOffset(0, 17).addBox(-8.0F, -3.0F, -13.0F, 9.0F, 6.0F, 21.0F, 0.0F, false);
		Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -15.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-1.0F, 1.0F, -17.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-8.0F, 1.0F, -17.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-5.0F, 1.0F, -17.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -15.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-8.0F, -1.0F, -15.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Rex_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Rex_Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.Rex_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Rex_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Rex_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Rex_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Rex_Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Rex_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Rex_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Rex_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}