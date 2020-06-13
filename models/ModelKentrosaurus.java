// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelKentrosaurus extends EntityModel<Entity> {
	private final ModelRenderer Kentro_Head;
	private final ModelRenderer Kentro_Neck;
	private final ModelRenderer Kentro_Body;
	private final ModelRenderer Kentro_Side_Spikes;
	private final ModelRenderer Kentro_Side_Spikes2;
	private final ModelRenderer Kentro_Tail;
	private final ModelRenderer Kentro_Tail2;
	private final ModelRenderer Kentro_Tail3;
	private final ModelRenderer Kentro_Front_Left_Leg;
	private final ModelRenderer Kentro_Front_Left_Leg2;
	private final ModelRenderer Kentro_Front_Left_Leg3;
	private final ModelRenderer Kentro_Back_Left_Leg;
	private final ModelRenderer Kentro_Back_Left_Leg2;
	private final ModelRenderer Kentro_Back_Left_Leg3;
	private final ModelRenderer Kentro_Back_Right_Leg;
	private final ModelRenderer Kentro_Back_Right_Leg2;
	private final ModelRenderer Kentro_Back_Right_Leg3;
	private final ModelRenderer Kentro_Front_Right_Leg;
	private final ModelRenderer Kentro_Front_Right_Leg2;
	private final ModelRenderer Kentro_Front_Right_Leg3;

	public ModelKentrosaurus() {
		textureWidth = 128;
		textureHeight = 128;

		Kentro_Head = new ModelRenderer(this);
		Kentro_Head.setRotationPoint(0.0F, 5.0F, -12.0F);
		Kentro_Head.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -7.0F, 6.0F, 6.0F, 7.0F, 0.0F, false);
		Kentro_Head.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -12.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);

		Kentro_Neck = new ModelRenderer(this);
		Kentro_Neck.setRotationPoint(0.0F, 7.0F, -12.0F);
		setRotationAngle(Kentro_Neck, -0.4363F, 0.0F, 0.0F);
		Kentro_Neck.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);

		Kentro_Body = new ModelRenderer(this);
		Kentro_Body.setRotationPoint(0.0F, 8.0F, -7.0F);
		Kentro_Body.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -1.0F, 8.0F, 9.0F, 17.0F, 0.0F, false);
		Kentro_Body.setTextureOffset(0, 0).addBox(-1.0F, -8.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Kentro_Body.setTextureOffset(0, 0).addBox(-1.0F, -8.0F, 3.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Kentro_Body.setTextureOffset(0, 0).addBox(-1.0F, -8.0F, 6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Kentro_Body.setTextureOffset(0, 0).addBox(-1.0F, -8.0F, 9.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Kentro_Body.setTextureOffset(0, 0).addBox(-1.0F, -8.0F, 12.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Kentro_Body.setTextureOffset(0, 0).addBox(-1.0F, -8.0F, 15.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Kentro_Side_Spikes = new ModelRenderer(this);
		Kentro_Side_Spikes.setRotationPoint(-4.0F, 0.0F, 3.0F);
		Kentro_Body.addChild(Kentro_Side_Spikes);
		setRotationAngle(Kentro_Side_Spikes, 0.0F, 0.0F, 0.3491F);
		Kentro_Side_Spikes.setTextureOffset(0, 0).addBox(-7.0F, -2.0F, -1.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		Kentro_Side_Spikes.setTextureOffset(0, 0).addBox(-11.0F, -2.0F, 0.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		Kentro_Side_Spikes2 = new ModelRenderer(this);
		Kentro_Side_Spikes2.setRotationPoint(4.0F, 0.0F, 3.0F);
		Kentro_Body.addChild(Kentro_Side_Spikes2);
		setRotationAngle(Kentro_Side_Spikes2, 0.0F, 3.1416F, -0.3491F);
		Kentro_Side_Spikes2.setTextureOffset(0, 0).addBox(-7.0F, -2.0F, -1.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		Kentro_Side_Spikes2.setTextureOffset(0, 0).addBox(-11.0F, -2.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		Kentro_Tail = new ModelRenderer(this);
		Kentro_Tail.setRotationPoint(0.0F, 0.0F, 16.0F);
		Kentro_Body.addChild(Kentro_Tail);
		setRotationAngle(Kentro_Tail, -0.1745F, 0.0F, 0.0F);
		Kentro_Tail.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -1.0F, 6.0F, 7.0F, 10.0F, 0.0F, false);
		Kentro_Tail.setTextureOffset(0, 0).addBox(-1.0F, -6.3017F, 1.4487F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Kentro_Tail.setTextureOffset(0, 0).addBox(-1.0F, -6.649F, 3.4183F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Kentro_Tail.setTextureOffset(0, 0).addBox(-1.0F, -6.0115F, 5.5616F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Kentro_Tail.setTextureOffset(0, 0).addBox(-1.0F, -6.3588F, 7.5312F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Kentro_Tail.setTextureOffset(0, 0).addBox(-1.0F, -6.9392F, -0.6946F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Kentro_Tail2 = new ModelRenderer(this);
		Kentro_Tail2.setRotationPoint(0.0F, -2.0706F, 7.7274F);
		Kentro_Tail.addChild(Kentro_Tail2);
		setRotationAngle(Kentro_Tail2, 0.2618F, 0.0F, 0.0F);
		Kentro_Tail2.setTextureOffset(0, 0).addBox(-2.0F, -0.7679F, -0.134F, 4.0F, 5.0F, 11.0F, 0.0F, false);
		Kentro_Tail2.setTextureOffset(0, 0).addBox(-0.9243F, -2.7481F, 2.305F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Kentro_Tail2.setTextureOffset(0, 0).addBox(-0.9217F, -2.5724F, 4.2973F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Kentro_Tail2.setTextureOffset(0, 0).addBox(-0.9191F, -2.3968F, 6.2895F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Kentro_Tail2.setTextureOffset(0, 0).addBox(-0.9164F, -2.2211F, 8.2818F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		Kentro_Tail3 = new ModelRenderer(this);
		Kentro_Tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
		Kentro_Tail2.addChild(Kentro_Tail3);
		setRotationAngle(Kentro_Tail3, 0.2618F, 0.0F, 0.0F);
		Kentro_Tail3.setTextureOffset(0, 0).addBox(1.0F, 2.4877F, 7.6446F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Kentro_Tail3.setTextureOffset(0, 0).addBox(1.0F, 2.7434F, 5.4232F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Kentro_Tail3.setTextureOffset(0, 0).addBox(-7.0F, 2.4877F, 7.6446F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Kentro_Tail3.setTextureOffset(0, 0).addBox(-5.0F, 2.7434F, 5.4232F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Kentro_Tail3.setTextureOffset(0, 0).addBox(-9.0F, 0.8297F, 8.5843F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		Kentro_Tail3.setTextureOffset(0, 0).addBox(-9.0F, 1.0854F, 6.3629F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		Kentro_Tail3.setTextureOffset(0, 0).addBox(1.0F, 1.0854F, 6.3629F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		Kentro_Tail3.setTextureOffset(0, 0).addBox(1.0F, 0.8297F, 8.5843F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		Kentro_Tail3.setTextureOffset(0, 0).addBox(-1.0F, 0.2321F, -0.134F, 2.0F, 4.0F, 11.0F, 0.0F, false);

		Kentro_Front_Left_Leg = new ModelRenderer(this);
		Kentro_Front_Left_Leg.setRotationPoint(4.0F, 10.0F, -6.0F);
		setRotationAngle(Kentro_Front_Left_Leg, 0.4363F, 0.0F, 0.0F);
		Kentro_Front_Left_Leg.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		Kentro_Front_Left_Leg2 = new ModelRenderer(this);
		Kentro_Front_Left_Leg2.setRotationPoint(0.0F, 5.3768F, -0.3005F);
		Kentro_Front_Left_Leg.addChild(Kentro_Front_Left_Leg2);
		setRotationAngle(Kentro_Front_Left_Leg2, -0.4363F, 0.0F, 0.0F);
		Kentro_Front_Left_Leg2.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

		Kentro_Front_Left_Leg3 = new ModelRenderer(this);
		Kentro_Front_Left_Leg3.setRotationPoint(0.0F, 2.0F, 0.0F);
		Kentro_Front_Left_Leg2.addChild(Kentro_Front_Left_Leg3);
		Kentro_Front_Left_Leg3.setTextureOffset(0, 0).addBox(-2.0F, 5.0F, -3.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);

		Kentro_Back_Left_Leg = new ModelRenderer(this);
		Kentro_Back_Left_Leg.setRotationPoint(4.0F, 10.0F, 5.0F);
		setRotationAngle(Kentro_Back_Left_Leg, 0.4363F, 0.0F, 0.0F);
		Kentro_Back_Left_Leg.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		Kentro_Back_Left_Leg2 = new ModelRenderer(this);
		Kentro_Back_Left_Leg2.setRotationPoint(0.0F, 5.3768F, -0.3005F);
		Kentro_Back_Left_Leg.addChild(Kentro_Back_Left_Leg2);
		setRotationAngle(Kentro_Back_Left_Leg2, -0.4363F, 0.0F, 0.0F);
		Kentro_Back_Left_Leg2.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

		Kentro_Back_Left_Leg3 = new ModelRenderer(this);
		Kentro_Back_Left_Leg3.setRotationPoint(0.0F, 2.0F, 0.0F);
		Kentro_Back_Left_Leg2.addChild(Kentro_Back_Left_Leg3);
		Kentro_Back_Left_Leg3.setTextureOffset(0, 0).addBox(-2.0F, 5.0F, -3.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);

		Kentro_Back_Right_Leg = new ModelRenderer(this);
		Kentro_Back_Right_Leg.setRotationPoint(-4.0F, 10.0F, 5.0F);
		setRotationAngle(Kentro_Back_Right_Leg, 0.4363F, 0.0F, 0.0F);
		Kentro_Back_Right_Leg.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		Kentro_Back_Right_Leg2 = new ModelRenderer(this);
		Kentro_Back_Right_Leg2.setRotationPoint(1.0F, 5.3768F, -0.3005F);
		Kentro_Back_Right_Leg.addChild(Kentro_Back_Right_Leg2);
		setRotationAngle(Kentro_Back_Right_Leg2, -0.4363F, 0.0F, 0.0F);
		Kentro_Back_Right_Leg2.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

		Kentro_Back_Right_Leg3 = new ModelRenderer(this);
		Kentro_Back_Right_Leg3.setRotationPoint(0.0F, 2.0F, 0.0F);
		Kentro_Back_Right_Leg2.addChild(Kentro_Back_Right_Leg3);
		Kentro_Back_Right_Leg3.setTextureOffset(0, 0).addBox(-2.0F, 5.0F, -3.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);

		Kentro_Front_Right_Leg = new ModelRenderer(this);
		Kentro_Front_Right_Leg.setRotationPoint(-4.0F, 10.0F, -6.0F);
		setRotationAngle(Kentro_Front_Right_Leg, 0.4363F, 0.0F, 0.0F);
		Kentro_Front_Right_Leg.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		Kentro_Front_Right_Leg2 = new ModelRenderer(this);
		Kentro_Front_Right_Leg2.setRotationPoint(1.0F, 5.3768F, -0.3005F);
		Kentro_Front_Right_Leg.addChild(Kentro_Front_Right_Leg2);
		setRotationAngle(Kentro_Front_Right_Leg2, -0.4363F, 0.0F, 0.0F);
		Kentro_Front_Right_Leg2.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

		Kentro_Front_Right_Leg3 = new ModelRenderer(this);
		Kentro_Front_Right_Leg3.setRotationPoint(0.0F, 2.0F, 0.0F);
		Kentro_Front_Right_Leg2.addChild(Kentro_Front_Right_Leg3);
		Kentro_Front_Right_Leg3.setTextureOffset(0, 0).addBox(-2.0F, 5.0F, -3.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Kentro_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Kentro_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Kentro_Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Kentro_Front_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Kentro_Back_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Kentro_Back_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Kentro_Front_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Kentro_Front_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Kentro_Back_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Kentro_Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Kentro_Front_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Kentro_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Kentro_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Kentro_Back_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Kentro_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Kentro_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}