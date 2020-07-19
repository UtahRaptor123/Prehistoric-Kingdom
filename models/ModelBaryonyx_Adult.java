// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelBaryonyx_Adult extends EntityModel<Entity> {
	private final ModelRenderer Bary_Head;
	private final ModelRenderer Crest;
	private final ModelRenderer Bary_Jaw;
	private final ModelRenderer Bary_Neck;
	private final ModelRenderer Bary_Neck2;
	private final ModelRenderer Bary_Body;
	private final ModelRenderer Bary_Tail1;
	private final ModelRenderer Bary_Tail2;
	private final ModelRenderer Bary_Tail3;
	private final ModelRenderer Bary_Tail4;
	private final ModelRenderer Left_Arm1;
	private final ModelRenderer Left_Arm2;
	private final ModelRenderer Left_Arm3;
	private final ModelRenderer Right_Arm1;
	private final ModelRenderer Right_Arm2;
	private final ModelRenderer Right_Arm3;
	private final ModelRenderer Bary_Left_Leg;
	private final ModelRenderer Bary_Left_Leg2;
	private final ModelRenderer Bary_Left_Leg3;
	private final ModelRenderer Bary_Left_Leg4;
	private final ModelRenderer Bary_Left_Leg5;
	private final ModelRenderer Bary_Left_Leg6;

	public ModelBaryonyx_Adult() {
		textureWidth = 176;
		textureHeight = 176;

		Bary_Head = new ModelRenderer(this);
		Bary_Head.setRotationPoint(0.0F, -17.0F, -14.0F);
		setRotationAngle(Bary_Head, 0.0873F, 0.0F, 0.0F);
		Bary_Head.setTextureOffset(36, 91).addBox(-4.0F, -5.0F, -10.0F, 8.0F, 10.0F, 10.0F, 0.0F, false);
		Bary_Head.setTextureOffset(0, 112).addBox(-4.0F, -4.0F, -19.0F, 8.0F, 7.0F, 9.0F, 0.0F, false);
		Bary_Head.setTextureOffset(86, 112).addBox(-3.0F, -3.0F, -28.0F, 6.0F, 6.0F, 9.0F, 0.0F, false);

		Crest = new ModelRenderer(this);
		Crest.setRotationPoint(0.0F, -3.0F, -13.0F);
		Bary_Head.addChild(Crest);
		setRotationAngle(Crest, 0.7854F, 0.0F, 0.0F);
		Crest.setTextureOffset(72, 150).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		Bary_Jaw = new ModelRenderer(this);
		Bary_Jaw.setRotationPoint(0.0F, 3.0F, -11.0F);
		Bary_Head.addChild(Bary_Jaw);
		Bary_Jaw.setTextureOffset(26, 135).addBox(-3.0F, 0.0F, -8.0F, 6.0F, 2.0F, 9.0F, 0.0F, false);
		Bary_Jaw.setTextureOffset(96, 135).addBox(-2.0F, 0.0F, -16.0F, 4.0F, 2.0F, 8.0F, 0.0F, false);

		Bary_Neck = new ModelRenderer(this);
		Bary_Neck.setRotationPoint(0.0F, -17.0F, -14.0F);
		setRotationAngle(Bary_Neck, -0.5236F, 0.0F, 0.0F);
		Bary_Neck.setTextureOffset(0, 91).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 9.0F, 12.0F, 0.0F, false);

		Bary_Neck2 = new ModelRenderer(this);
		Bary_Neck2.setRotationPoint(0.0F, -0.3301F, 12.6244F);
		Bary_Neck.addChild(Bary_Neck2);
		setRotationAngle(Bary_Neck2, 0.1745F, 0.0F, 0.0F);
		Bary_Neck2.setTextureOffset(0, 135).addBox(-4.0F, -4.3802F, -4.4949F, 8.0F, 10.0F, 5.0F, 0.0F, false);

		Bary_Body = new ModelRenderer(this);
		Bary_Body.setRotationPoint(0.0F, -11.0F, -4.0F);
		setRotationAngle(Bary_Body, 0.0873F, 0.0F, 0.0F);
		Bary_Body.setTextureOffset(96, 37).addBox(-6.0F, -5.0F, -1.0F, 12.0F, 14.0F, 11.0F, 0.0F, false);
		Bary_Body.setTextureOffset(0, 0).addBox(-7.0F, -5.0F, 10.0F, 14.0F, 15.0F, 22.0F, 0.0F, false);

		Bary_Tail1 = new ModelRenderer(this);
		Bary_Tail1.setRotationPoint(0.0F, 2.9962F, 31.9128F);
		Bary_Body.addChild(Bary_Tail1);
		setRotationAngle(Bary_Tail1, -0.1745F, 0.0F, 0.0F);
		Bary_Tail1.setTextureOffset(72, 0).addBox(-6.0F, -6.0F, -1.0F, 12.0F, 13.0F, 15.0F, 0.0F, false);

		Bary_Tail2 = new ModelRenderer(this);
		Bary_Tail2.setRotationPoint(0.0F, 0.0F, 14.0F);
		Bary_Tail1.addChild(Bary_Tail2);
		setRotationAngle(Bary_Tail2, 0.0873F, 0.0F, 0.0F);
		Bary_Tail2.setTextureOffset(0, 37).addBox(-5.0F, -5.0F, -1.0F, 10.0F, 12.0F, 15.0F, 0.0F, false);

		Bary_Tail3 = new ModelRenderer(this);
		Bary_Tail3.setRotationPoint(0.0F, 0.0F, 14.0F);
		Bary_Tail2.addChild(Bary_Tail3);
		setRotationAngle(Bary_Tail3, 0.0873F, 0.0F, 0.0F);
		Bary_Tail3.setTextureOffset(50, 37).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 11.0F, 15.0F, 0.0F, false);

		Bary_Tail4 = new ModelRenderer(this);
		Bary_Tail4.setRotationPoint(0.0F, 0.9962F, 13.9128F);
		Bary_Tail3.addChild(Bary_Tail4);
		setRotationAngle(Bary_Tail4, 0.0873F, 0.0F, 0.0F);
		Bary_Tail4.setTextureOffset(0, 64).addBox(-3.0F, -3.0F, -1.0F, 6.0F, 9.0F, 15.0F, 0.0F, false);

		Left_Arm1 = new ModelRenderer(this);
		Left_Arm1.setRotationPoint(6.0F, 5.0F, 3.0F);
		Bary_Body.addChild(Left_Arm1);
		setRotationAngle(Left_Arm1, 0.1745F, 0.0F, 0.0F);
		Left_Arm1.setTextureOffset(76, 135).addBox(-1.0F, -1.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, false);

		Left_Arm2 = new ModelRenderer(this);
		Left_Arm2.setRotationPoint(0.0F, 6.8871F, -0.2902F);
		Left_Arm1.addChild(Left_Arm2);
		setRotationAngle(Left_Arm2, 0.3491F, 0.0F, 0.0F);
		Left_Arm2.setTextureOffset(54, 150).addBox(-1.0F, -0.8871F, -1.7098F, 4.0F, 7.0F, 5.0F, -0.1F, false);

		Left_Arm3 = new ModelRenderer(this);
		Left_Arm3.setRotationPoint(0.0F, 7.1129F, 0.2902F);
		Left_Arm2.addChild(Left_Arm3);
		setRotationAngle(Left_Arm3, -1.5708F, 0.0F, 0.0F);
		Left_Arm3.setTextureOffset(18, 150).addBox(-1.1F, 0.5131F, -6.2139F, 4.0F, 8.0F, 5.0F, -0.2F, false);
		Left_Arm3.setTextureOffset(72, 158).addBox(-3.1F, 6.5131F, -4.2139F, 3.0F, 2.0F, 1.0F, -0.2F, false);
		Left_Arm3.setTextureOffset(84, 150).addBox(-3.1F, 6.5131F, -2.2139F, 3.0F, 2.0F, 1.0F, -0.2F, false);
		Left_Arm3.setTextureOffset(84, 153).addBox(-3.1F, 6.5131F, -6.2139F, 3.0F, 2.0F, 1.0F, -0.2F, false);

		Right_Arm1 = new ModelRenderer(this);
		Right_Arm1.setRotationPoint(-8.0F, 5.0F, 3.0F);
		Bary_Body.addChild(Right_Arm1);
		setRotationAngle(Right_Arm1, 0.1745F, 0.0F, 0.0F);
		Right_Arm1.setTextureOffset(56, 135).addBox(-1.0F, -1.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, false);

		Right_Arm2 = new ModelRenderer(this);
		Right_Arm2.setRotationPoint(0.0F, 6.8871F, -0.2902F);
		Right_Arm1.addChild(Right_Arm2);
		setRotationAngle(Right_Arm2, 0.3491F, 0.0F, 0.0F);
		Right_Arm2.setTextureOffset(36, 150).addBox(-1.0F, -0.8871F, -1.7098F, 4.0F, 7.0F, 5.0F, -0.1F, false);

		Right_Arm3 = new ModelRenderer(this);
		Right_Arm3.setRotationPoint(0.0F, 7.1129F, 0.2902F);
		Right_Arm2.addChild(Right_Arm3);
		setRotationAngle(Right_Arm3, -1.5708F, 0.0F, 0.0F);
		Right_Arm3.setTextureOffset(0, 150).addBox(-1.0F, 0.5131F, -6.323F, 4.0F, 8.0F, 5.0F, -0.2F, false);
		Right_Arm3.setTextureOffset(0, 163).addBox(2.0F, 6.5131F, -2.323F, 3.0F, 2.0F, 1.0F, -0.2F, false);
		Right_Arm3.setTextureOffset(8, 163).addBox(2.0F, 6.5131F, -4.323F, 3.0F, 2.0F, 1.0F, -0.2F, false);
		Right_Arm3.setTextureOffset(16, 163).addBox(2.0F, 6.5131F, -6.323F, 3.0F, 2.0F, 1.0F, -0.2F, false);

		Bary_Left_Leg = new ModelRenderer(this);
		Bary_Left_Leg.setRotationPoint(7.0F, -5.0F, 22.0F);
		Bary_Left_Leg.setTextureOffset(72, 64).addBox(0.0F, -4.0F, -6.0F, 4.0F, 16.0F, 11.0F, 0.0F, false);

		Bary_Left_Leg2 = new ModelRenderer(this);
		Bary_Left_Leg2.setRotationPoint(1.0F, 16.0F, 0.0F);
		Bary_Left_Leg.addChild(Bary_Left_Leg2);
		Bary_Left_Leg2.setTextureOffset(60, 112).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 14.0F, 9.0F, 0.0F, false);

		Bary_Left_Leg3 = new ModelRenderer(this);
		Bary_Left_Leg3.setRotationPoint(0.0F, 15.0F, 0.0F);
		Bary_Left_Leg2.addChild(Bary_Left_Leg3);
		Bary_Left_Leg3.setTextureOffset(110, 91).addBox(-2.0F, -5.0F, -8.0F, 6.0F, 3.0F, 13.0F, 0.0F, false);

		Bary_Left_Leg4 = new ModelRenderer(this);
		Bary_Left_Leg4.setRotationPoint(-7.0F, -5.0F, 22.0F);
		Bary_Left_Leg4.setTextureOffset(42, 64).addBox(-4.0F, -4.0F, -6.0F, 4.0F, 16.0F, 11.0F, 0.0F, false);

		Bary_Left_Leg5 = new ModelRenderer(this);
		Bary_Left_Leg5.setRotationPoint(-3.0F, 16.0F, 0.0F);
		Bary_Left_Leg4.addChild(Bary_Left_Leg5);
		Bary_Left_Leg5.setTextureOffset(34, 112).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 14.0F, 9.0F, 0.0F, false);

		Bary_Left_Leg6 = new ModelRenderer(this);
		Bary_Left_Leg6.setRotationPoint(0.0F, 15.0F, 0.0F);
		Bary_Left_Leg5.addChild(Bary_Left_Leg6);
		Bary_Left_Leg6.setTextureOffset(72, 91).addBox(-2.0F, -5.0F, -8.0F, 6.0F, 3.0F, 13.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Bary_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Bary_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Bary_Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Bary_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Bary_Left_Leg4.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Bary_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Bary_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Bary_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Bary_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Bary_Tail1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Bary_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Bary_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Bary_Left_Leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}