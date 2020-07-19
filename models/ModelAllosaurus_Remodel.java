// Made with Blockbench 3.6.0
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelAllosaurus_Remodel extends EntityModel<Entity> {
	private final ModelRenderer Allo_Head;
	private final ModelRenderer Allo_Jaw;
	private final ModelRenderer Allo_Crest1;
	private final ModelRenderer Allo_Crest2;
	private final ModelRenderer Allo_Neck;
	private final ModelRenderer Allo_Body;
	private final ModelRenderer Allo_Tail1;
	private final ModelRenderer Allo_Tail2;
	private final ModelRenderer Allo_Tail3;
	private final ModelRenderer Allo_Tail4;
	private final ModelRenderer Allo_Left_Arm;
	private final ModelRenderer Cerato_Left_Arm2;
	private final ModelRenderer Allo_Right_Arm;
	private final ModelRenderer Cerato_Right_Arm2;
	private final ModelRenderer Allo_Left_Leg1;
	private final ModelRenderer Allo_Left_Leg2;
	private final ModelRenderer Allo_Left_Leg3;
	private final ModelRenderer Allo_Right_Leg1;
	private final ModelRenderer Allo_Right_Leg2;
	private final ModelRenderer Allo_Right_Leg3;

	public ModelAllosaurus_Remodel() {
		textureWidth = 208;
		textureHeight = 208;

		Allo_Head = new ModelRenderer(this);
		Allo_Head.setRotationPoint(0.0F, -22.0F, -22.0F);
		setRotationAngle(Allo_Head, 0.1745F, 0.0F, 0.0F);
		Allo_Head.setTextureOffset(40, 165).addBox(-5.0F, -6.0F, -8.0F, 10.0F, 10.0F, 8.0F, 0.0F, false);
		Allo_Head.setTextureOffset(44, 111).addBox(-4.0F, -5.0F, -21.0F, 8.0F, 9.0F, 13.0F, 0.0F, false);

		Allo_Jaw = new ModelRenderer(this);
		Allo_Jaw.setRotationPoint(0.0F, 4.0F, 0.0F);
		Allo_Head.addChild(Allo_Jaw);
		Allo_Jaw.setTextureOffset(76, 165).addBox(-5.0F, 0.0F, -8.0F, 10.0F, 2.0F, 8.0F, 0.0F, false);
		Allo_Jaw.setTextureOffset(0, 165).addBox(-4.0F, 0.0F, -20.0F, 8.0F, 2.0F, 12.0F, 0.0F, false);

		Allo_Crest1 = new ModelRenderer(this);
		Allo_Crest1.setRotationPoint(3.0F, -6.0F, -6.0F);
		Allo_Head.addChild(Allo_Crest1);
		setRotationAngle(Allo_Crest1, 0.1745F, 0.0F, 0.5236F);
		Allo_Crest1.setTextureOffset(98, 136).addBox(-1.0F, -2.0F, -14.0F, 2.0F, 3.0F, 17.0F, 0.0F, false);

		Allo_Crest2 = new ModelRenderer(this);
		Allo_Crest2.setRotationPoint(-3.0F, -6.0F, -6.0F);
		Allo_Head.addChild(Allo_Crest2);
		setRotationAngle(Allo_Crest2, 0.1745F, 0.0F, -0.5236F);
		Allo_Crest2.setTextureOffset(60, 136).addBox(-1.0F, -2.0F, -14.0F, 2.0F, 3.0F, 17.0F, 0.0F, false);

		Allo_Neck = new ModelRenderer(this);
		Allo_Neck.setRotationPoint(0.0F, -22.0F, -20.0F);
		setRotationAngle(Allo_Neck, -0.1745F, 0.0F, 0.0F);
		Allo_Neck.setTextureOffset(0, 111).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 11.0F, 14.0F, 0.0F, false);

		Allo_Body = new ModelRenderer(this);
		Allo_Body.setRotationPoint(0.0F, -13.0F, -7.0F);
		setRotationAngle(Allo_Body, 0.0873F, 0.0F, 0.0F);
		Allo_Body.setTextureOffset(0, 0).addBox(-7.0F, -12.0F, 8.0F, 14.0F, 19.0F, 26.0F, 0.0F, false);
		Allo_Body.setTextureOffset(122, 45).addBox(-6.0F, -12.0F, -4.0F, 12.0F, 18.0F, 12.0F, 0.0F, false);

		Allo_Tail1 = new ModelRenderer(this);
		Allo_Tail1.setRotationPoint(0.0F, -3.0F, 35.0F);
		Allo_Body.addChild(Allo_Tail1);
		setRotationAngle(Allo_Tail1, -0.1745F, 0.0F, 0.0F);
		Allo_Tail1.setTextureOffset(80, 0).addBox(-6.0F, -7.0F, -3.0F, 12.0F, 15.0F, 21.0F, 0.0F, false);

		Allo_Tail2 = new ModelRenderer(this);
		Allo_Tail2.setRotationPoint(0.0F, 1.0F, 19.0F);
		Allo_Tail1.addChild(Allo_Tail2);
		setRotationAngle(Allo_Tail2, 0.0873F, 0.0F, 0.0F);
		Allo_Tail2.setTextureOffset(0, 45).addBox(-5.0F, -7.0F, -2.0F, 10.0F, 13.0F, 21.0F, 0.0F, false);

		Allo_Tail3 = new ModelRenderer(this);
		Allo_Tail3.setRotationPoint(0.0F, 0.0F, 17.0F);
		Allo_Tail2.addChild(Allo_Tail3);
		setRotationAngle(Allo_Tail3, 0.0873F, 0.0F, 0.0F);
		Allo_Tail3.setTextureOffset(62, 45).addBox(-4.0F, -6.0489F, -1.2161F, 8.0F, 12.0F, 22.0F, 0.0F, false);

		Allo_Tail4 = new ModelRenderer(this);
		Allo_Tail4.setRotationPoint(2.0F, 2.0F, 19.0F);
		Allo_Tail3.addChild(Allo_Tail4);
		setRotationAngle(Allo_Tail4, 0.0873F, 0.0F, 0.0F);
		Allo_Tail4.setTextureOffset(0, 79).addBox(-5.0F, -6.0F, -1.0F, 6.0F, 10.0F, 18.0F, 0.0F, false);

		Allo_Left_Arm = new ModelRenderer(this);
		Allo_Left_Arm.setRotationPoint(7.0F, -10.0F, -6.0F);
		Allo_Left_Arm.setTextureOffset(134, 165).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 10.0F, 7.0F, 0.0F, false);

		Cerato_Left_Arm2 = new ModelRenderer(this);
		Cerato_Left_Arm2.setRotationPoint(2.0F, 6.0F, 0.0F);
		Allo_Left_Arm.addChild(Cerato_Left_Arm2);
		setRotationAngle(Cerato_Left_Arm2, -0.3491F, 0.0F, 0.0F);
		Cerato_Left_Arm2.setTextureOffset(18, 183).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);
		Cerato_Left_Arm2.setTextureOffset(40, 186).addBox(-4.0F, 6.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Left_Arm2.setTextureOffset(40, 183).addBox(-4.0F, 6.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Left_Arm2.setTextureOffset(36, 192).addBox(-4.0F, 6.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Allo_Right_Arm = new ModelRenderer(this);
		Allo_Right_Arm.setRotationPoint(-9.0F, -10.0F, -6.0F);
		Allo_Right_Arm.setTextureOffset(112, 165).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 10.0F, 7.0F, 0.0F, false);

		Cerato_Right_Arm2 = new ModelRenderer(this);
		Cerato_Right_Arm2.setRotationPoint(2.0F, 6.0F, 0.0F);
		Allo_Right_Arm.addChild(Cerato_Right_Arm2);
		setRotationAngle(Cerato_Right_Arm2, -0.3491F, 0.0F, 0.0F);
		Cerato_Right_Arm2.setTextureOffset(0, 183).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);
		Cerato_Right_Arm2.setTextureOffset(36, 189).addBox(1.0F, 6.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Right_Arm2.setTextureOffset(36, 186).addBox(1.0F, 6.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Right_Arm2.setTextureOffset(36, 183).addBox(1.0F, 6.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Allo_Left_Leg1 = new ModelRenderer(this);
		Allo_Left_Leg1.setRotationPoint(7.0F, -9.0F, 17.0F);
		Allo_Left_Leg1.setTextureOffset(86, 79).addBox(-1.0F, -6.0F, -7.0F, 5.0F, 18.0F, 14.0F, 0.0F, false);

		Allo_Left_Leg2 = new ModelRenderer(this);
		Allo_Left_Leg2.setRotationPoint(0.0F, 7.0F, 0.0F);
		Allo_Left_Leg1.addChild(Allo_Left_Leg2);
		Allo_Left_Leg2.setTextureOffset(30, 136).addBox(-1.0F, 4.0F, -3.0F, 5.0F, 19.0F, 10.0F, -0.1F, false);

		Allo_Left_Leg3 = new ModelRenderer(this);
		Allo_Left_Leg3.setRotationPoint(0.0F, 25.0F, 0.0F);
		Allo_Left_Leg2.addChild(Allo_Left_Leg3);
		Allo_Left_Leg3.setTextureOffset(130, 111).addBox(-2.0F, -2.0F, -8.0F, 7.0F, 4.0F, 15.0F, -0.1F, false);

		Allo_Right_Leg1 = new ModelRenderer(this);
		Allo_Right_Leg1.setRotationPoint(-7.0F, -9.0F, 17.0F);
		Allo_Right_Leg1.setTextureOffset(48, 79).addBox(-4.0F, -6.0F, -7.0F, 5.0F, 18.0F, 14.0F, 0.0F, false);

		Allo_Right_Leg2 = new ModelRenderer(this);
		Allo_Right_Leg2.setRotationPoint(-3.0F, 7.0F, 0.0F);
		Allo_Right_Leg1.addChild(Allo_Right_Leg2);
		Allo_Right_Leg2.setTextureOffset(0, 136).addBox(-1.0F, 4.0F, -3.0F, 5.0F, 19.0F, 10.0F, -0.1F, false);

		Allo_Right_Leg3 = new ModelRenderer(this);
		Allo_Right_Leg3.setRotationPoint(0.0F, 25.0F, 0.0F);
		Allo_Right_Leg2.addChild(Allo_Right_Leg3);
		Allo_Right_Leg3.setTextureOffset(86, 111).addBox(-2.0F, -2.0F, -8.0F, 7.0F, 4.0F, 15.0F, -0.1F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Allo_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Allo_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Allo_Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Allo_Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Allo_Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Allo_Left_Leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		Allo_Right_Leg1.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Allo_Right_Leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Allo_Left_Leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Allo_Tail1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Allo_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Allo_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Allo_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Allo_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Allo_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}