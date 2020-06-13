// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelMajungasaurus extends EntityModel<Entity> {
	private final ModelRenderer Majunga_Head;
	private final ModelRenderer Majunga_Jaw;
	private final ModelRenderer Majunga_Horn;
	private final ModelRenderer Majunga_Neck;
	private final ModelRenderer Majunga_Body;
	private final ModelRenderer Majunga_Tail;
	private final ModelRenderer Majunga_Tail2;
	private final ModelRenderer Majunga_Tail3;
	private final ModelRenderer Majunga_Left_Leg;
	private final ModelRenderer Majunga_Left_Leg2;
	private final ModelRenderer Majunga_Left_Leg3;
	private final ModelRenderer Majunga_Left_Leg4;
	private final ModelRenderer Majunga_Right_Leg;
	private final ModelRenderer Majunga_Right_Leg2;
	private final ModelRenderer Majunga_Right_Leg3;
	private final ModelRenderer Majunga_Right_Leg4;
	private final ModelRenderer Majunga_Left_Arm;
	private final ModelRenderer Majunga_Left_Arm2;
	private final ModelRenderer Majunga_Right_Arm;
	private final ModelRenderer Majunga_Right_Arm2;

	public ModelMajungasaurus() {
		textureWidth = 256;
		textureHeight = 256;

		Majunga_Head = new ModelRenderer(this);
		Majunga_Head.setRotationPoint(0.0F, -19.0F, -11.0F);
		Majunga_Head.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, -10.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		Majunga_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Head.setTextureOffset(0, 0).addBox(-3.0F, 5.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Head.setTextureOffset(0, 0).addBox(4.0F, 5.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Head.setTextureOffset(0, 0).addBox(4.0F, 5.0F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Head.setTextureOffset(0, 0).addBox(4.0F, 5.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Head.setTextureOffset(0, 0).addBox(4.0F, 5.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Head.setTextureOffset(0, 0).addBox(4.0F, 5.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Head.setTextureOffset(0, 0).addBox(2.0F, 5.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Head.setTextureOffset(0, 0).addBox(-5.0F, -4.0F, -15.0F, 10.0F, 9.0F, 5.0F, 0.0F, false);

		Majunga_Jaw = new ModelRenderer(this);
		Majunga_Jaw.setRotationPoint(0.0F, 5.0F, -4.0F);
		Majunga_Head.addChild(Majunga_Jaw);
		setRotationAngle(Majunga_Jaw, 0.5236F, 0.0F, 0.0F);
		Majunga_Jaw.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -11.0F, 8.0F, 1.0F, 13.0F, 0.0F, false);
		Majunga_Jaw.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Jaw.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Jaw.setTextureOffset(0, 0).addBox(1.0F, -1.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Jaw.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Jaw.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Jaw.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Jaw.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Majunga_Horn = new ModelRenderer(this);
		Majunga_Horn.setRotationPoint(0.0F, -4.0F, -10.0F);
		Majunga_Head.addChild(Majunga_Horn);
		setRotationAngle(Majunga_Horn, 0.2618F, 0.0F, 0.0F);
		Majunga_Horn.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		Majunga_Horn.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Majunga_Neck = new ModelRenderer(this);
		Majunga_Neck.setRotationPoint(0.0F, -20.0F, -11.0F);
		setRotationAngle(Majunga_Neck, -0.6109F, 0.0F, 0.0F);
		Majunga_Neck.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 8.0F, 11.0F, 0.0F, false);
		Majunga_Neck.setTextureOffset(0, 0).addBox(-2.0F, 6.0F, -2.0F, 4.0F, 1.0F, 11.0F, 0.0F, false);

		Majunga_Body = new ModelRenderer(this);
		Majunga_Body.setRotationPoint(0.0F, -13.0F, -5.0F);
		Majunga_Body.setTextureOffset(0, 0).addBox(-6.0F, -7.0F, -3.0F, 12.0F, 15.0F, 34.0F, 0.0F, false);

		Majunga_Tail = new ModelRenderer(this);
		Majunga_Tail.setRotationPoint(0.0F, 1.0F, 32.0F);
		Majunga_Body.addChild(Majunga_Tail);
		setRotationAngle(Majunga_Tail, -0.1745F, 0.0F, 0.0F);
		Majunga_Tail.setTextureOffset(0, 0).addBox(-5.0F, -6.0F, -2.0F, 10.0F, 12.0F, 18.0F, 0.0F, false);

		Majunga_Tail2 = new ModelRenderer(this);
		Majunga_Tail2.setRotationPoint(0.0F, 0.1761F, 16.2779F);
		Majunga_Tail.addChild(Majunga_Tail2);
		setRotationAngle(Majunga_Tail2, 0.0873F, 0.0F, 0.0F);
		Majunga_Tail2.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -2.0F, 8.0F, 10.0F, 21.0F, 0.0F, false);

		Majunga_Tail3 = new ModelRenderer(this);
		Majunga_Tail3.setRotationPoint(0.0F, -2.3121F, 36.1477F);
		Majunga_Tail.addChild(Majunga_Tail3);
		setRotationAngle(Majunga_Tail3, 0.2618F, 0.0F, 0.0F);
		Majunga_Tail3.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 8.0F, 21.0F, 0.0F, false);

		Majunga_Left_Leg = new ModelRenderer(this);
		Majunga_Left_Leg.setRotationPoint(7.0F, -10.0F, 15.0F);
		setRotationAngle(Majunga_Left_Leg, 0.3491F, 0.0F, 0.0F);
		Majunga_Left_Leg.setTextureOffset(0, 0).addBox(-6.0F, -6.0F, -5.0F, 6.0F, 19.0F, 10.0F, 0.0F, false);

		Majunga_Left_Leg2 = new ModelRenderer(this);
		Majunga_Left_Leg2.setRotationPoint(0.0F, 17.3429F, -2.0556F);
		Majunga_Left_Leg.addChild(Majunga_Left_Leg2);
		setRotationAngle(Majunga_Left_Leg2, -0.3491F, 0.0F, 0.0F);
		Majunga_Left_Leg2.setTextureOffset(0, 0).addBox(-5.0F, -6.0F, -3.0F, 5.0F, 19.0F, 8.0F, 0.0F, false);

		Majunga_Left_Leg3 = new ModelRenderer(this);
		Majunga_Left_Leg3.setRotationPoint(0.0F, 15.0F, -3.0F);
		Majunga_Left_Leg2.addChild(Majunga_Left_Leg3);
		setRotationAngle(Majunga_Left_Leg3, -0.6109F, 0.0F, 0.0F);
		Majunga_Left_Leg3.setTextureOffset(0, 0).addBox(-5.0F, -6.0F, -3.0F, 5.0F, 6.0F, 8.0F, 0.0F, false);

		Majunga_Left_Leg4 = new ModelRenderer(this);
		Majunga_Left_Leg4.setRotationPoint(0.0F, 30.0261F, -7.1809F);
		Majunga_Left_Leg.addChild(Majunga_Left_Leg4);
		setRotationAngle(Majunga_Left_Leg4, -0.3491F, 0.0F, 0.0F);
		Majunga_Left_Leg4.setTextureOffset(0, 0).addBox(-5.0F, -0.0261F, -10.8191F, 5.0F, 4.0F, 13.0F, 0.0F, false);

		Majunga_Right_Leg = new ModelRenderer(this);
		Majunga_Right_Leg.setRotationPoint(-2.0F, -10.0F, 15.0F);
		setRotationAngle(Majunga_Right_Leg, 0.3491F, 0.0F, 0.0F);
		Majunga_Right_Leg.setTextureOffset(0, 0).addBox(-5.0F, -6.0F, -5.0F, 6.0F, 19.0F, 10.0F, 0.0F, false);

		Majunga_Right_Leg2 = new ModelRenderer(this);
		Majunga_Right_Leg2.setRotationPoint(0.0F, 17.3429F, -2.0556F);
		Majunga_Right_Leg.addChild(Majunga_Right_Leg2);
		setRotationAngle(Majunga_Right_Leg2, -0.3491F, 0.0F, 0.0F);
		Majunga_Right_Leg2.setTextureOffset(0, 0).addBox(-5.0F, -6.0F, -3.0F, 5.0F, 19.0F, 8.0F, 0.0F, false);

		Majunga_Right_Leg3 = new ModelRenderer(this);
		Majunga_Right_Leg3.setRotationPoint(0.0F, 15.0F, -3.0F);
		Majunga_Right_Leg2.addChild(Majunga_Right_Leg3);
		setRotationAngle(Majunga_Right_Leg3, -0.6109F, 0.0F, 0.0F);
		Majunga_Right_Leg3.setTextureOffset(0, 0).addBox(-5.0F, -6.0F, -3.0F, 5.0F, 6.0F, 8.0F, 0.0F, false);

		Majunga_Right_Leg4 = new ModelRenderer(this);
		Majunga_Right_Leg4.setRotationPoint(0.0F, 30.0261F, -7.1809F);
		Majunga_Right_Leg.addChild(Majunga_Right_Leg4);
		setRotationAngle(Majunga_Right_Leg4, -0.3491F, 0.0F, 0.0F);
		Majunga_Right_Leg4.setTextureOffset(0, 0).addBox(-5.0F, -0.0261F, -10.8191F, 5.0F, 4.0F, 13.0F, 0.0F, false);

		Majunga_Left_Arm = new ModelRenderer(this);
		Majunga_Left_Arm.setRotationPoint(6.0F, -9.0F, -4.0F);
		Majunga_Left_Arm.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, false);

		Majunga_Left_Arm2 = new ModelRenderer(this);
		Majunga_Left_Arm2.setRotationPoint(0.0F, 6.0F, 1.0F);
		Majunga_Left_Arm.addChild(Majunga_Left_Arm2);
		setRotationAngle(Majunga_Left_Arm2, 0.6981F, 0.0F, 0.0F);
		Majunga_Left_Arm2.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -2.0F, 3.0F, 6.0F, 5.0F, 0.0F, false);
		Majunga_Left_Arm2.setTextureOffset(0, 0).addBox(-3.0F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Left_Arm2.setTextureOffset(0, 0).addBox(-3.0F, 2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Left_Arm2.setTextureOffset(0, 0).addBox(-3.0F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Majunga_Right_Arm = new ModelRenderer(this);
		Majunga_Right_Arm.setRotationPoint(-5.0F, -9.0F, -4.0F);
		Majunga_Right_Arm.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, false);

		Majunga_Right_Arm2 = new ModelRenderer(this);
		Majunga_Right_Arm2.setRotationPoint(0.0F, 6.0F, 1.0F);
		Majunga_Right_Arm.addChild(Majunga_Right_Arm2);
		setRotationAngle(Majunga_Right_Arm2, 0.6981F, 0.0F, 0.0F);
		Majunga_Right_Arm2.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -2.0F, 3.0F, 6.0F, 5.0F, 0.0F, false);
		Majunga_Right_Arm2.setTextureOffset(0, 0).addBox(1.0F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Right_Arm2.setTextureOffset(0, 0).addBox(1.0F, 2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Majunga_Right_Arm2.setTextureOffset(0, 0).addBox(1.0F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Majunga_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Majunga_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Majunga_Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Majunga_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Majunga_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Majunga_Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Majunga_Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Majunga_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Majunga_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Majunga_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Majunga_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Majunga_Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Majunga_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Majunga_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}