// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelCeratosaurusRemodel extends EntityModel<Entity> {
	private final ModelRenderer Cerato_Head;
	private final ModelRenderer Cerato_Jaw;
	private final ModelRenderer Cerato_FrontHorn;
	private final ModelRenderer Cerato_Backhorn1;
	private final ModelRenderer Cerato_Backhorn2;
	private final ModelRenderer Cerato_Neck2;
	private final ModelRenderer Cerato_Body;
	private final ModelRenderer Cerato_Tail;
	private final ModelRenderer Cerato_Tail2;
	private final ModelRenderer Cerato_Tail3;
	private final ModelRenderer Cerato_Tail4;
	private final ModelRenderer Cerato_Left_Arm;
	private final ModelRenderer Cerato_Left_Arm2;
	private final ModelRenderer Cerato_Right_Arm;
	private final ModelRenderer Cerato_Right_Arm2;
	private final ModelRenderer Cerato_Left_Leg;
	private final ModelRenderer Cerato_Left_Leg2;
	private final ModelRenderer Cerato_Left_Leg3;
	private final ModelRenderer Cerato_Left_Leg4;
	private final ModelRenderer Cerato_Left_Leg5;
	private final ModelRenderer Cerato_Left_Leg6;

	public ModelCeratosaurusRemodel() {
		textureWidth = 192;
		textureHeight = 192;

		Cerato_Head = new ModelRenderer(this);
		Cerato_Head.setRotationPoint(0.0F, -17.0F, -18.0F);
		setRotationAngle(Cerato_Head, 0.1745F, 0.0F, 0.0F);
		Cerato_Head.setTextureOffset(36, 122).addBox(-5.0F, -6.0F, -8.0F, 10.0F, 10.0F, 8.0F, 0.0F, false);
		Cerato_Head.setTextureOffset(0, 122).addBox(-4.0F, -5.0F, -18.0F, 8.0F, 9.0F, 10.0F, 0.0F, false);

		Cerato_Jaw = new ModelRenderer(this);
		Cerato_Jaw.setRotationPoint(0.0F, 4.0F, 0.0F);
		Cerato_Head.addChild(Cerato_Jaw);
		Cerato_Jaw.setTextureOffset(0, 148).addBox(-5.0F, 0.0F, -8.0F, 10.0F, 2.0F, 8.0F, 0.0F, false);
		Cerato_Jaw.setTextureOffset(36, 148).addBox(-4.0F, 0.0F, -17.0F, 8.0F, 2.0F, 9.0F, 0.0F, false);

		Cerato_FrontHorn = new ModelRenderer(this);
		Cerato_FrontHorn.setRotationPoint(0.0F, -5.0F, -16.0F);
		Cerato_Head.addChild(Cerato_FrontHorn);
		setRotationAngle(Cerato_FrontHorn, 0.3491F, 0.0F, 0.0F);
		Cerato_FrontHorn.setTextureOffset(18, 165).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		Cerato_Backhorn1 = new ModelRenderer(this);
		Cerato_Backhorn1.setRotationPoint(3.0F, -6.0F, -6.0F);
		Cerato_Head.addChild(Cerato_Backhorn1);
		setRotationAngle(Cerato_Backhorn1, 0.1745F, 0.0F, 0.0F);
		Cerato_Backhorn1.setTextureOffset(28, 165).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Cerato_Backhorn2 = new ModelRenderer(this);
		Cerato_Backhorn2.setRotationPoint(-3.0F, -6.0F, -6.0F);
		Cerato_Head.addChild(Cerato_Backhorn2);
		setRotationAngle(Cerato_Backhorn2, 0.1745F, 0.0F, 0.0F);
		Cerato_Backhorn2.setTextureOffset(18, 172).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Cerato_Neck2 = new ModelRenderer(this);
		Cerato_Neck2.setRotationPoint(0.0F, -17.0F, -16.0F);
		setRotationAngle(Cerato_Neck2, -0.1745F, 0.0F, 0.0F);
		Cerato_Neck2.setTextureOffset(0, 73).addBox(-4.0F, -5.0152F, -3.8264F, 8.0F, 11.0F, 14.0F, 0.0F, false);

		Cerato_Body = new ModelRenderer(this);
		Cerato_Body.setRotationPoint(0.0F, -9.0F, -7.0F);
		Cerato_Body.setTextureOffset(0, 0).addBox(-7.0F, -12.0F, 10.0F, 14.0F, 19.0F, 26.0F, 0.0F, false);
		Cerato_Body.setTextureOffset(102, 45).addBox(-6.0F, -12.0F, 0.0F, 12.0F, 18.0F, 10.0F, 0.0F, false);

		Cerato_Tail = new ModelRenderer(this);
		Cerato_Tail.setRotationPoint(0.0F, 1.0F, 36.0F);
		Cerato_Body.addChild(Cerato_Tail);
		setRotationAngle(Cerato_Tail, -0.0873F, 0.0F, 0.0F);
		Cerato_Tail.setTextureOffset(80, 0).addBox(-6.0F, -10.0F, -1.0F, 12.0F, 14.0F, 16.0F, 0.0F, false);

		Cerato_Tail2 = new ModelRenderer(this);
		Cerato_Tail2.setRotationPoint(0.0F, 0.797F, 15.0697F);
		Cerato_Tail.addChild(Cerato_Tail2);
		setRotationAngle(Cerato_Tail2, 0.0873F, 0.0F, 0.0F);
		Cerato_Tail2.setTextureOffset(0, 45).addBox(-5.0F, -9.0F, -1.0F, 10.0F, 12.0F, 16.0F, 0.0F, false);

		Cerato_Tail3 = new ModelRenderer(this);
		Cerato_Tail3.setRotationPoint(0.0F, 0.9F, 15.0F);
		Cerato_Tail2.addChild(Cerato_Tail3);
		setRotationAngle(Cerato_Tail3, 0.0873F, 0.0F, 0.0F);
		Cerato_Tail3.setTextureOffset(52, 45).addBox(-4.0F, -8.0F, -1.0F, 8.0F, 10.0F, 17.0F, 0.0F, false);

		Cerato_Tail4 = new ModelRenderer(this);
		Cerato_Tail4.setRotationPoint(0.0F, 0.797F, 15.9303F);
		Cerato_Tail3.addChild(Cerato_Tail4);
		setRotationAngle(Cerato_Tail4, 0.0873F, 0.0F, 0.0F);
		Cerato_Tail4.setTextureOffset(0, 101).addBox(-3.0F, -7.0F, -1.0F, 6.0F, 8.0F, 13.0F, 0.0F, false);

		Cerato_Left_Arm = new ModelRenderer(this);
		Cerato_Left_Arm.setRotationPoint(7.0F, -6.0F, -2.0F);
		Cerato_Left_Arm.setTextureOffset(92, 148).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 10.0F, 7.0F, 0.0F, false);

		Cerato_Left_Arm2 = new ModelRenderer(this);
		Cerato_Left_Arm2.setRotationPoint(2.0F, 6.0F, 0.0F);
		Cerato_Left_Arm.addChild(Cerato_Left_Arm2);
		setRotationAngle(Cerato_Left_Arm2, -0.3491F, 0.0F, 0.0F);
		Cerato_Left_Arm2.setTextureOffset(0, 165).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);
		Cerato_Left_Arm2.setTextureOffset(36, 171).addBox(-4.0F, 6.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Left_Arm2.setTextureOffset(36, 168).addBox(-4.0F, 6.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Left_Arm2.setTextureOffset(36, 165).addBox(-4.0F, 6.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Cerato_Right_Arm = new ModelRenderer(this);
		Cerato_Right_Arm.setRotationPoint(-9.0F, -6.0F, -2.0F);
		Cerato_Right_Arm.setTextureOffset(70, 148).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 10.0F, 7.0F, 0.0F, false);

		Cerato_Right_Arm2 = new ModelRenderer(this);
		Cerato_Right_Arm2.setRotationPoint(2.0F, 6.0F, 0.0F);
		Cerato_Right_Arm.addChild(Cerato_Right_Arm2);
		setRotationAngle(Cerato_Right_Arm2, -0.3491F, 0.0F, 0.0F);
		Cerato_Right_Arm2.setTextureOffset(114, 148).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);
		Cerato_Right_Arm2.setTextureOffset(28, 176).addBox(1.0F, 6.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Right_Arm2.setTextureOffset(28, 173).addBox(1.0F, 6.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Right_Arm2.setTextureOffset(28, 170).addBox(1.0F, 6.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Cerato_Left_Leg = new ModelRenderer(this);
		Cerato_Left_Leg.setRotationPoint(7.0F, -10.0F, 20.0F);
		Cerato_Left_Leg.setTextureOffset(78, 73).addBox(-1.0F, -2.0F, -4.0F, 5.0F, 16.0F, 12.0F, 0.0F, false);

		Cerato_Left_Leg2 = new ModelRenderer(this);
		Cerato_Left_Leg2.setRotationPoint(0.0F, 15.0F, 1.0F);
		Cerato_Left_Leg.addChild(Cerato_Left_Leg2);
		Cerato_Left_Leg2.setTextureOffset(98, 122).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 18.0F, 8.0F, -0.1F, false);

		Cerato_Left_Leg3 = new ModelRenderer(this);
		Cerato_Left_Leg3.setRotationPoint(0.0F, 18.0F, 0.0F);
		Cerato_Left_Leg2.addChild(Cerato_Left_Leg3);
		Cerato_Left_Leg3.setTextureOffset(78, 101).addBox(-2.0F, -2.0F, -6.0F, 7.0F, 4.0F, 13.0F, 0.0F, false);

		Cerato_Left_Leg4 = new ModelRenderer(this);
		Cerato_Left_Leg4.setRotationPoint(-7.0F, -10.0F, 20.0F);
		Cerato_Left_Leg4.setTextureOffset(44, 73).addBox(-4.0F, -2.0F, -4.0F, 5.0F, 16.0F, 12.0F, 0.0F, false);

		Cerato_Left_Leg5 = new ModelRenderer(this);
		Cerato_Left_Leg5.setRotationPoint(-3.0F, 15.0F, 1.0F);
		Cerato_Left_Leg4.addChild(Cerato_Left_Leg5);
		Cerato_Left_Leg5.setTextureOffset(72, 122).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 18.0F, 8.0F, -0.1F, false);

		Cerato_Left_Leg6 = new ModelRenderer(this);
		Cerato_Left_Leg6.setRotationPoint(0.0F, 18.0F, 0.0F);
		Cerato_Left_Leg5.addChild(Cerato_Left_Leg6);
		Cerato_Left_Leg6.setTextureOffset(38, 101).addBox(-2.0F, -2.0F, -6.0F, 7.0F, 4.0F, 13.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Cerato_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Cerato_Neck2.render(matrixStack, buffer, packedLight, packedOverlay);
		Cerato_Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Cerato_Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Cerato_Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Cerato_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Cerato_Left_Leg4.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Cerato_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Cerato_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Cerato_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Cerato_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Cerato_Left_Leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Cerato_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Cerato_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Cerato_Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}