// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelCarnotaurus extends EntityModel<Entity> {
	private final ModelRenderer Carno_Head;
	private final ModelRenderer Carno_Horn1;
	private final ModelRenderer Carno_Horn2;
	private final ModelRenderer Carno_Jaw;
	private final ModelRenderer Carno_Neck;
	private final ModelRenderer Carno_Neck2;
	private final ModelRenderer Carno_Body;
	private final ModelRenderer Carno_Tail;
	private final ModelRenderer Carno_Tail2;
	private final ModelRenderer Carno_Tail3;
	private final ModelRenderer Carno_Tail4;
	private final ModelRenderer Carno_Left_Arm;
	private final ModelRenderer Carno_Left_Arm2;
	private final ModelRenderer Carno_Right_Arm;
	private final ModelRenderer Carno_Right_Arm2;
	private final ModelRenderer Carno_Left_Leg;
	private final ModelRenderer Carno_Left_Leg2;
	private final ModelRenderer Carno_Left_Leg3;
	private final ModelRenderer Carno_Left_Leg4;
	private final ModelRenderer Carno_Right_Leg;
	private final ModelRenderer Carno_Right_Leg2;
	private final ModelRenderer Carno_Right_Leg3;
	private final ModelRenderer Carno_Right_Leg4;

	public ModelCarnotaurus() {
		textureWidth = 256;
		textureHeight = 256;

		Carno_Head = new ModelRenderer(this);
		Carno_Head.setRotationPoint(0.0F, -15.0F, -14.0F);
		Carno_Head.setTextureOffset(220, 196).addBox(-5.0F, -5.0F, -8.0F, 10.0F, 10.0F, 8.0F, 0.0F, false);
		Carno_Head.setTextureOffset(232, 219).addBox(-5.0F, -4.0F, -10.0F, 10.0F, 9.0F, 2.0F, 0.0F, false);
		Carno_Head.setTextureOffset(232, 234).addBox(-5.0F, -3.0F, -12.0F, 10.0F, 8.0F, 2.0F, 0.0F, false);
		Carno_Head.setTextureOffset(234, 248).addBox(-5.0F, -2.0F, -13.0F, 10.0F, 7.0F, 1.0F, 0.0F, false);
		Carno_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Head.setTextureOffset(0, 0).addBox(-3.0F, 5.0F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Head.setTextureOffset(0, 0).addBox(4.0F, 5.0F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Head.setTextureOffset(0, 0).addBox(2.0F, 5.0F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Head.setTextureOffset(0, 0).addBox(4.0F, 5.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Head.setTextureOffset(0, 0).addBox(4.0F, 5.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Head.setTextureOffset(0, 0).addBox(4.0F, 5.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Head.setTextureOffset(0, 0).addBox(4.0F, 5.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Carno_Horn1 = new ModelRenderer(this);
		Carno_Horn1.setRotationPoint(-4.0F, -5.0F, -4.0F);
		Carno_Head.addChild(Carno_Horn1);
		setRotationAngle(Carno_Horn1, 0.0F, 0.0F, -0.6981F);
		Carno_Horn1.setTextureOffset(234, 187).addBox(-2.0F, -2.3572F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Carno_Horn1.setTextureOffset(227, 184).addBox(-2.0F, -3.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		Carno_Horn2 = new ModelRenderer(this);
		Carno_Horn2.setRotationPoint(4.0F, -5.0F, -4.0F);
		Carno_Head.addChild(Carno_Horn2);
		setRotationAngle(Carno_Horn2, 0.0F, 0.0F, 0.6981F);
		Carno_Horn2.setTextureOffset(248, 187).addBox(0.0F, -2.3572F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Carno_Horn2.setTextureOffset(250, 184).addBox(1.0F, -3.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		Carno_Jaw = new ModelRenderer(this);
		Carno_Jaw.setRotationPoint(0.0F, 5.0F, -4.0F);
		Carno_Head.addChild(Carno_Jaw);
		setRotationAngle(Carno_Jaw, 0.6109F, 0.0F, 0.0F);
		Carno_Jaw.setTextureOffset(184, 242).addBox(-4.0F, 0.0F, -9.0F, 8.0F, 2.0F, 12.0F, 0.0F, false);
		Carno_Jaw.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Jaw.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Jaw.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Jaw.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Jaw.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Jaw.setTextureOffset(0, 0).addBox(1.0F, -1.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Jaw.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Carno_Neck = new ModelRenderer(this);
		Carno_Neck.setRotationPoint(0.0F, -15.0F, -14.0F);
		setRotationAngle(Carno_Neck, -0.6109F, 0.0F, 0.0F);
		Carno_Neck.setTextureOffset(224, 160).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);

		Carno_Neck2 = new ModelRenderer(this);
		Carno_Neck2.setRotationPoint(0.0F, -0.4929F, 9.4211F);
		Carno_Neck.addChild(Carno_Neck2);
		setRotationAngle(Carno_Neck2, 0.3491F, 0.0F, 0.0F);
		Carno_Neck2.setTextureOffset(228, 145).addBox(-4.0F, -3.9397F, -5.342F, 8.0F, 7.0F, 6.0F, 0.0F, false);

		Carno_Body = new ModelRenderer(this);
		Carno_Body.setRotationPoint(0.0F, -9.0F, -5.0F);
		Carno_Body.setTextureOffset(184, 97).addBox(-5.0F, -6.0F, -1.0F, 10.0F, 12.0F, 26.0F, 0.0F, false);

		Carno_Tail = new ModelRenderer(this);
		Carno_Tail.setRotationPoint(0.0F, 0.0F, 24.0F);
		Carno_Body.addChild(Carno_Tail);
		setRotationAngle(Carno_Tail, -0.2618F, 0.0F, 0.0F);
		Carno_Tail.setTextureOffset(210, 69).addBox(-4.0F, -5.0F, -1.0F, 8.0F, 10.0F, 15.0F, 0.0F, false);

		Carno_Tail2 = new ModelRenderer(this);
		Carno_Tail2.setRotationPoint(0.0F, 0.4991F, 13.5923F);
		Carno_Tail.addChild(Carno_Tail2);
		setRotationAngle(Carno_Tail2, 0.0873F, 0.0F, 0.0F);
		Carno_Tail2.setTextureOffset(214, 40).addBox(-3.0F, -5.0F, -1.0F, 6.0F, 8.0F, 15.0F, 0.0F, false);

		Carno_Tail3 = new ModelRenderer(this);
		Carno_Tail3.setRotationPoint(0.0F, 0.2402F, 14.5582F);
		Carno_Tail2.addChild(Carno_Tail3);
		setRotationAngle(Carno_Tail3, 0.1745F, 0.0F, 0.0F);
		Carno_Tail3.setTextureOffset(218, 14).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 6.0F, 15.0F, 0.0F, false);

		Carno_Tail4 = new ModelRenderer(this);
		Carno_Tail4.setRotationPoint(0.0F, 0.0F, 15.0F);
		Carno_Tail3.addChild(Carno_Tail4);
		setRotationAngle(Carno_Tail4, 0.1745F, 0.0F, 0.0F);
		Carno_Tail4.setTextureOffset(177, 0).addBox(-1.0F, -3.1736F, -1.9848F, 2.0F, 4.0F, 15.0F, 0.0F, false);

		Carno_Left_Arm = new ModelRenderer(this);
		Carno_Left_Arm.setRotationPoint(6.0F, -6.0F, -3.0F);
		Carno_Left_Arm.setTextureOffset(187, 232).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		Carno_Left_Arm2 = new ModelRenderer(this);
		Carno_Left_Arm2.setRotationPoint(0.0F, 4.0F, 1.0F);
		Carno_Left_Arm.addChild(Carno_Left_Arm2);
		setRotationAngle(Carno_Left_Arm2, 0.6109F, 0.0F, 0.0F);
		Carno_Left_Arm2.setTextureOffset(197, 232).addBox(-3.0F, -3.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		Carno_Left_Arm2.setTextureOffset(0, 0).addBox(-4.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Left_Arm2.setTextureOffset(0, 0).addBox(-4.0F, 1.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Carno_Right_Arm = new ModelRenderer(this);
		Carno_Right_Arm.setRotationPoint(-5.0F, -6.0F, -3.0F);
		Carno_Right_Arm.setTextureOffset(185, 221).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		Carno_Right_Arm2 = new ModelRenderer(this);
		Carno_Right_Arm2.setRotationPoint(2.0F, 4.0F, 1.0F);
		Carno_Right_Arm.addChild(Carno_Right_Arm2);
		setRotationAngle(Carno_Right_Arm2, 0.6109F, 0.0F, 0.0F);
		Carno_Right_Arm2.setTextureOffset(201, 216).addBox(-3.0F, -3.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		Carno_Right_Arm2.setTextureOffset(0, 0).addBox(0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Right_Arm2.setTextureOffset(0, 0).addBox(0.0F, 1.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Carno_Left_Leg = new ModelRenderer(this);
		Carno_Left_Leg.setRotationPoint(5.0F, -6.0F, 16.0F);
		setRotationAngle(Carno_Left_Leg, -0.2618F, 0.0F, 0.0F);
		Carno_Left_Leg.setTextureOffset(4, 233).addBox(-4.0F, -3.0F, -6.0F, 5.0F, 14.0F, 9.0F, 0.0F, false);

		Carno_Left_Leg2 = new ModelRenderer(this);
		Carno_Left_Leg2.setRotationPoint(0.0F, 9.9181F, 1.6223F);
		Carno_Left_Leg.addChild(Carno_Left_Leg2);
		setRotationAngle(Carno_Left_Leg2, 0.5236F, 0.0F, 0.0F);
		Carno_Left_Leg2.setTextureOffset(7, 200).addBox(-4.0F, -3.0F, -5.0F, 5.0F, 14.0F, 8.0F, 0.0F, false);

		Carno_Left_Leg3 = new ModelRenderer(this);
		Carno_Left_Leg3.setRotationPoint(0.0F, 12.1087F, -1.174F);
		Carno_Left_Leg2.addChild(Carno_Left_Leg3);
		setRotationAngle(Carno_Left_Leg3, -0.4363F, 0.0F, 0.0F);
		Carno_Left_Leg3.setTextureOffset(0, 175).addBox(-4.0F, -3.0F, -4.0F, 5.0F, 8.0F, 7.0F, 0.0F, false);

		Carno_Left_Leg4 = new ModelRenderer(this);
		Carno_Left_Leg4.setRotationPoint(0.0F, 8.2258F, -0.5804F);
		Carno_Left_Leg3.addChild(Carno_Left_Leg4);
		setRotationAngle(Carno_Left_Leg4, 0.1745F, 0.0F, 0.0F);
		Carno_Left_Leg4.setTextureOffset(0, 148).addBox(-4.0F, -4.0F, -8.0F, 5.0F, 4.0F, 12.0F, 0.0F, false);
		Carno_Left_Leg4.setTextureOffset(0, 0).addBox(-4.0F, -2.0F, -9.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Carno_Left_Leg4.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -9.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Carno_Left_Leg4.setTextureOffset(0, 0).addBox(0.0F, -2.0F, -9.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Carno_Left_Leg4.setTextureOffset(0, 0).addBox(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Left_Leg4.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Left_Leg4.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Carno_Right_Leg = new ModelRenderer(this);
		Carno_Right_Leg.setRotationPoint(-2.0F, -6.0F, 16.0F);
		setRotationAngle(Carno_Right_Leg, -0.2618F, 0.0F, 0.0F);
		Carno_Right_Leg.setTextureOffset(84, 233).addBox(-4.0F, -3.0F, -6.0F, 5.0F, 14.0F, 9.0F, 0.0F, false);

		Carno_Right_Leg2 = new ModelRenderer(this);
		Carno_Right_Leg2.setRotationPoint(0.0F, 9.9181F, 1.6223F);
		Carno_Right_Leg.addChild(Carno_Right_Leg2);
		setRotationAngle(Carno_Right_Leg2, 0.5236F, 0.0F, 0.0F);
		Carno_Right_Leg2.setTextureOffset(86, 204).addBox(-4.0F, -3.0F, -5.0F, 5.0F, 14.0F, 8.0F, 0.0F, false);

		Carno_Right_Leg3 = new ModelRenderer(this);
		Carno_Right_Leg3.setRotationPoint(0.0F, 12.1087F, -1.174F);
		Carno_Right_Leg2.addChild(Carno_Right_Leg3);
		setRotationAngle(Carno_Right_Leg3, -0.4363F, 0.0F, 0.0F);
		Carno_Right_Leg3.setTextureOffset(89, 184).addBox(-4.0F, -3.0F, -4.0F, 5.0F, 8.0F, 7.0F, 0.0F, false);

		Carno_Right_Leg4 = new ModelRenderer(this);
		Carno_Right_Leg4.setRotationPoint(0.0F, 8.2258F, -0.5804F);
		Carno_Right_Leg3.addChild(Carno_Right_Leg4);
		setRotationAngle(Carno_Right_Leg4, 0.1745F, 0.0F, 0.0F);
		Carno_Right_Leg4.setTextureOffset(87, 148).addBox(-4.0F, -4.0F, -8.0F, 5.0F, 4.0F, 12.0F, 0.0F, false);
		Carno_Right_Leg4.setTextureOffset(0, 0).addBox(-4.0F, -2.0F, -9.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Carno_Right_Leg4.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -9.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Carno_Right_Leg4.setTextureOffset(0, 0).addBox(0.0F, -2.0F, -9.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Carno_Right_Leg4.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Right_Leg4.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Carno_Right_Leg4.setTextureOffset(0, 0).addBox(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Carno_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Carno_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Carno_Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Carno_Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Carno_Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Carno_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Carno_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Carno_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Carno_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Carno_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Carno_Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Carno_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Carno_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Carno_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Carno_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}