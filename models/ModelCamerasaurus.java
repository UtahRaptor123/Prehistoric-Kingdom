// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelCamerasaurus extends EntityModel<Entity> {
	private final ModelRenderer Camra_Head;
	private final ModelRenderer Camra_Jaw;
	private final ModelRenderer Camra_Neck;
	private final ModelRenderer Camra_Neck2;
	private final ModelRenderer Camra_Neck3;
	private final ModelRenderer Camra_Body;
	private final ModelRenderer Camra_Tail;
	private final ModelRenderer Camra_Tail2;
	private final ModelRenderer Camra_Tail3;
	private final ModelRenderer Camra_Tail4;
	private final ModelRenderer Camra_Front_Left_Leg;
	private final ModelRenderer Camra_Front_Left_Leg2;
	private final ModelRenderer Camra_Front_Left_Leg3;
	private final ModelRenderer Camra_Back_Left_Leg;
	private final ModelRenderer Camra_Back_Left_Leg2;
	private final ModelRenderer Camra_Back_Left_Leg3;
	private final ModelRenderer Camra_Front_Right_Leg;
	private final ModelRenderer Camra_Front_Right_Leg2;
	private final ModelRenderer Camra_Front_Right_Leg3;
	private final ModelRenderer Camra_Back_Right_Leg;
	private final ModelRenderer Camra_Back_Right_Leg2;
	private final ModelRenderer Camra_Back_Right_Leg3;

	public ModelCamerasaurus() {
		textureWidth = 512;
		textureHeight = 512;

		Camra_Head = new ModelRenderer(this);
		Camra_Head.setRotationPoint(0.0F, -69.0F, -40.0F);
		Camra_Head.setTextureOffset(0, 0).addBox(-6.0F, -6.0F, -7.0F, 12.0F, 13.0F, 17.0F, 0.0F, false);
		Camra_Head.setTextureOffset(0, 0).addBox(-5.0F, -4.0F, -17.0F, 10.0F, 9.0F, 10.0F, 0.0F, false);
		Camra_Head.setTextureOffset(0, 0).addBox(-1.0F, -10.0F, -5.0F, 2.0F, 4.0F, 8.0F, 0.0F, false);
		Camra_Head.setTextureOffset(0, 0).addBox(-3.0F, -10.0F, -4.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		Camra_Head.setTextureOffset(0, 0).addBox(0.0F, -10.0F, -4.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		Camra_Head.setTextureOffset(0, 0).addBox(-1.0F, -12.0F, -4.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		Camra_Head.setTextureOffset(0, 0).addBox(-3.0F, -11.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		Camra_Head.setTextureOffset(0, 0).addBox(0.0F, -11.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		Camra_Jaw = new ModelRenderer(this);
		Camra_Jaw.setRotationPoint(0.0F, 7.0F, -9.0F);
		Camra_Head.addChild(Camra_Jaw);
		Camra_Jaw.setTextureOffset(0, 0).addBox(-4.0F, -2.0F, -7.0F, 8.0F, 2.0F, 9.0F, 0.0F, false);

		Camra_Neck = new ModelRenderer(this);
		Camra_Neck.setRotationPoint(0.0F, -51.0F, -23.0F);
		setRotationAngle(Camra_Neck, -0.8727F, 0.0F, 0.0F);
		Camra_Neck.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -4.0F, 10.0F, 15.0F, 28.0F, 0.0F, false);

		Camra_Neck2 = new ModelRenderer(this);
		Camra_Neck2.setRotationPoint(0.0F, 4.2293F, 24.832F);
		Camra_Neck.addChild(Camra_Neck2);
		setRotationAngle(Camra_Neck2, 0.2618F, 0.0F, 0.0F);
		Camra_Neck2.setTextureOffset(0, 0).addBox(-6.0F, -6.8192F, -1.5736F, 12.0F, 16.0F, 16.0F, 0.0F, false);

		Camra_Neck3 = new ModelRenderer(this);
		Camra_Neck3.setRotationPoint(0.0F, -12.8575F, -32.1976F);
		Camra_Neck2.addChild(Camra_Neck3);
		setRotationAngle(Camra_Neck3, -0.6109F, 0.0F, 0.0F);
		Camra_Neck3.setTextureOffset(0, 0).addBox(-5.0F, -3.1125F, -8.5798F, 10.0F, 13.0F, 18.0F, 0.0F, false);

		Camra_Body = new ModelRenderer(this);
		Camra_Body.setRotationPoint(0.0F, -21.0F, -2.0F);
		setRotationAngle(Camra_Body, -0.2618F, 0.0F, 0.0F);
		Camra_Body.setTextureOffset(0, 0).addBox(-10.0F, -11.0F, 0.0F, 20.0F, 22.0F, 39.0F, 0.0F, false);

		Camra_Tail = new ModelRenderer(this);
		Camra_Tail.setRotationPoint(0.0F, 1.5176F, 36.0681F);
		Camra_Body.addChild(Camra_Tail);
		setRotationAngle(Camra_Tail, 0.2618F, 0.0F, 0.0F);
		Camra_Tail.setTextureOffset(0, 0).addBox(-9.0F, -9.6928F, 0.2197F, 18.0F, 18.0F, 24.0F, 0.0F, false);

		Camra_Tail2 = new ModelRenderer(this);
		Camra_Tail2.setRotationPoint(0.0F, 0.0F, 22.0F);
		Camra_Tail.addChild(Camra_Tail2);
		setRotationAngle(Camra_Tail2, 0.2618F, 0.0F, 0.0F);
		Camra_Tail2.setTextureOffset(0, 0).addBox(-8.0F, -5.6928F, 0.2197F, 16.0F, 14.0F, 25.0F, 0.0F, false);

		Camra_Tail3 = new ModelRenderer(this);
		Camra_Tail3.setRotationPoint(0.0F, -0.1015F, 22.8033F);
		Camra_Tail2.addChild(Camra_Tail3);
		setRotationAngle(Camra_Tail3, 0.2618F, 0.0F, 0.0F);
		Camra_Tail3.setTextureOffset(0, 0).addBox(-6.0F, -2.6928F, 0.2197F, 12.0F, 11.0F, 25.0F, 0.0F, false);

		Camra_Tail4 = new ModelRenderer(this);
		Camra_Tail4.setRotationPoint(0.0F, -1.3923F, 21.5885F);
		Camra_Tail3.addChild(Camra_Tail4);
		setRotationAngle(Camra_Tail4, -0.3491F, 0.0F, 0.0F);
		Camra_Tail4.setTextureOffset(0, 0).addBox(-4.0F, -0.6928F, 0.2197F, 8.0F, 9.0F, 25.0F, 0.0F, false);

		Camra_Front_Left_Leg = new ModelRenderer(this);
		Camra_Front_Left_Leg.setRotationPoint(11.0F, -11.0F, 2.0F);
		setRotationAngle(Camra_Front_Left_Leg, 0.1745F, 0.0F, 0.0F);
		Camra_Front_Left_Leg.setTextureOffset(0, 0).addBox(-8.0F, -8.0F, -4.0F, 8.0F, 23.0F, 14.0F, 0.0F, false);

		Camra_Front_Left_Leg2 = new ModelRenderer(this);
		Camra_Front_Left_Leg2.setRotationPoint(0.0F, 18.885F, -2.3145F);
		Camra_Front_Left_Leg.addChild(Camra_Front_Left_Leg2);
		setRotationAngle(Camra_Front_Left_Leg2, -0.3491F, 0.0F, 0.0F);
		Camra_Front_Left_Leg2.setTextureOffset(0, 0).addBox(-6.0F, -7.0F, -2.0F, 6.0F, 16.0F, 12.0F, 0.0F, false);

		Camra_Front_Left_Leg3 = new ModelRenderer(this);
		Camra_Front_Left_Leg3.setRotationPoint(0.0F, 11.9913F, 1.099F);
		Camra_Front_Left_Leg2.addChild(Camra_Front_Left_Leg3);
		setRotationAngle(Camra_Front_Left_Leg3, 0.1745F, 0.0F, 0.0F);
		Camra_Front_Left_Leg3.setTextureOffset(0, 0).addBox(-6.0F, -4.0F, -6.0F, 6.0F, 8.0F, 15.0F, 0.0F, false);

		Camra_Back_Left_Leg = new ModelRenderer(this);
		Camra_Back_Left_Leg.setRotationPoint(11.0F, -11.0F, 25.0F);
		setRotationAngle(Camra_Back_Left_Leg, 0.1745F, 0.0F, 0.0F);
		Camra_Back_Left_Leg.setTextureOffset(0, 0).addBox(-8.0F, -8.0F, -4.0F, 8.0F, 23.0F, 14.0F, 0.0F, false);

		Camra_Back_Left_Leg2 = new ModelRenderer(this);
		Camra_Back_Left_Leg2.setRotationPoint(0.0F, 18.885F, -2.3145F);
		Camra_Back_Left_Leg.addChild(Camra_Back_Left_Leg2);
		setRotationAngle(Camra_Back_Left_Leg2, -0.3491F, 0.0F, 0.0F);
		Camra_Back_Left_Leg2.setTextureOffset(0, 0).addBox(-6.0F, -7.0F, -2.0F, 6.0F, 16.0F, 12.0F, 0.0F, false);

		Camra_Back_Left_Leg3 = new ModelRenderer(this);
		Camra_Back_Left_Leg3.setRotationPoint(0.0F, 11.9913F, 1.099F);
		Camra_Back_Left_Leg2.addChild(Camra_Back_Left_Leg3);
		setRotationAngle(Camra_Back_Left_Leg3, 0.1745F, 0.0F, 0.0F);
		Camra_Back_Left_Leg3.setTextureOffset(0, 0).addBox(-6.0F, -4.0F, -6.0F, 6.0F, 8.0F, 15.0F, 0.0F, false);

		Camra_Front_Right_Leg = new ModelRenderer(this);
		Camra_Front_Right_Leg.setRotationPoint(-3.0F, -11.0F, 2.0F);
		setRotationAngle(Camra_Front_Right_Leg, 0.1745F, 0.0F, 0.0F);
		Camra_Front_Right_Leg.setTextureOffset(0, 0).addBox(-8.0F, -8.0F, -4.0F, 8.0F, 23.0F, 14.0F, 0.0F, false);

		Camra_Front_Right_Leg2 = new ModelRenderer(this);
		Camra_Front_Right_Leg2.setRotationPoint(0.0F, 18.885F, -2.3145F);
		Camra_Front_Right_Leg.addChild(Camra_Front_Right_Leg2);
		setRotationAngle(Camra_Front_Right_Leg2, -0.3491F, 0.0F, 0.0F);
		Camra_Front_Right_Leg2.setTextureOffset(0, 0).addBox(-8.0F, -7.0F, -2.0F, 6.0F, 16.0F, 12.0F, 0.0F, false);

		Camra_Front_Right_Leg3 = new ModelRenderer(this);
		Camra_Front_Right_Leg3.setRotationPoint(0.0F, 11.9913F, 1.099F);
		Camra_Front_Right_Leg2.addChild(Camra_Front_Right_Leg3);
		setRotationAngle(Camra_Front_Right_Leg3, 0.1745F, 0.0F, 0.0F);
		Camra_Front_Right_Leg3.setTextureOffset(0, 0).addBox(-8.0F, -4.0F, -6.0F, 6.0F, 8.0F, 15.0F, 0.0F, false);

		Camra_Back_Right_Leg = new ModelRenderer(this);
		Camra_Back_Right_Leg.setRotationPoint(-3.0F, -11.0F, 25.0F);
		setRotationAngle(Camra_Back_Right_Leg, 0.1745F, 0.0F, 0.0F);
		Camra_Back_Right_Leg.setTextureOffset(0, 0).addBox(-8.0F, -8.0F, -4.0F, 8.0F, 23.0F, 14.0F, 0.0F, false);

		Camra_Back_Right_Leg2 = new ModelRenderer(this);
		Camra_Back_Right_Leg2.setRotationPoint(0.0F, 18.885F, -2.3145F);
		Camra_Back_Right_Leg.addChild(Camra_Back_Right_Leg2);
		setRotationAngle(Camra_Back_Right_Leg2, -0.3491F, 0.0F, 0.0F);
		Camra_Back_Right_Leg2.setTextureOffset(0, 0).addBox(-8.0F, -7.0F, -2.0F, 6.0F, 16.0F, 12.0F, 0.0F, false);

		Camra_Back_Right_Leg3 = new ModelRenderer(this);
		Camra_Back_Right_Leg3.setRotationPoint(0.0F, 11.9913F, 1.099F);
		Camra_Back_Right_Leg2.addChild(Camra_Back_Right_Leg3);
		setRotationAngle(Camra_Back_Right_Leg3, 0.1745F, 0.0F, 0.0F);
		Camra_Back_Right_Leg3.setTextureOffset(0, 0).addBox(-8.0F, -4.0F, -6.0F, 6.0F, 8.0F, 15.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Camra_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Camra_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Camra_Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Camra_Front_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Camra_Back_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Camra_Front_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Camra_Back_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Camra_Front_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Camra_Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Camra_Back_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Camra_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Camra_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Camra_Front_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Camra_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Camra_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Camra_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Camra_Back_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}