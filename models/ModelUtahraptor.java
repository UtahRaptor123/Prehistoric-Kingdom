// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelUtahraptor extends EntityModel<Entity> {
	private final ModelRenderer Utah_Head;
	private final ModelRenderer Utah_Feathers;
	private final ModelRenderer Utah_Jaw;
	private final ModelRenderer Utah_Neck;
	private final ModelRenderer Utah_Body;
	private final ModelRenderer Utah_Tail;
	private final ModelRenderer Utah_Tail2;
	private final ModelRenderer Utah_Tail3;
	private final ModelRenderer Utah_Left_Arm;
	private final ModelRenderer Utah_Left_Arm2;
	private final ModelRenderer Utah_Left_Arm3;
	private final ModelRenderer Utah_Right_Arm;
	private final ModelRenderer Utah_Right_Arm2;
	private final ModelRenderer Utah_Right_Arm3;
	private final ModelRenderer Utah_Left_leg;
	private final ModelRenderer Utah_Left_leg2;
	private final ModelRenderer Utah_Left_leg3;
	private final ModelRenderer Utah_Left_leg4;
	private final ModelRenderer Claw1;
	private final ModelRenderer Claw2;
	private final ModelRenderer Claw3;
	private final ModelRenderer Utah_Left_leg5;
	private final ModelRenderer Utah_Left_leg6;
	private final ModelRenderer Utah_Left_leg7;
	private final ModelRenderer Utah_Left_leg8;
	private final ModelRenderer Claw4;
	private final ModelRenderer Claw5;
	private final ModelRenderer Claw6;

	public ModelUtahraptor() {
		textureWidth = 128;
		textureHeight = 128;

		Utah_Head = new ModelRenderer(this);
		Utah_Head.setRotationPoint(0.0F, -4.0F, -10.0F);
		Utah_Head.setTextureOffset(102, 102).addBox(-3.0F, -3.0F, -7.0F, 6.0F, 7.0F, 7.0F, 0.0F, false);
		Utah_Head.setTextureOffset(106, 117).addBox(-2.0F, -2.0F, -14.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		Utah_Head.setTextureOffset(0, 0).addBox(-2.0F, 2.0F, -14.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Head.setTextureOffset(0, 0).addBox(1.0F, 2.0F, -14.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Head.setTextureOffset(0, 0).addBox(1.0F, 2.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Head.setTextureOffset(0, 0).addBox(-2.0F, 2.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Head.setTextureOffset(0, 0).addBox(1.0F, 2.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Head.setTextureOffset(0, 0).addBox(-2.0F, 2.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Utah_Feathers = new ModelRenderer(this);
		Utah_Feathers.setRotationPoint(0.0F, -3.0F, -4.0F);
		Utah_Head.addChild(Utah_Feathers);
		setRotationAngle(Utah_Feathers, -0.9599F, 0.0F, 0.0F);
		Utah_Feathers.setTextureOffset(20, 0).addBox(-4.0F, -5.0F, 1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		Utah_Feathers.setTextureOffset(20, 0).addBox(-2.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Utah_Feathers.setTextureOffset(20, 0).addBox(1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		Utah_Feathers.setTextureOffset(20, 0).addBox(3.0F, -4.0F, 1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Utah_Feathers.setTextureOffset(20, 0).addBox(-3.0F, -6.0F, 3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		Utah_Feathers.setTextureOffset(20, 0).addBox(2.0F, -5.0F, 3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		Utah_Jaw = new ModelRenderer(this);
		Utah_Jaw.setRotationPoint(0.0F, 1.0F, -9.0F);
		Utah_Head.addChild(Utah_Jaw);
		setRotationAngle(Utah_Jaw, 0.6109F, 0.0F, 0.0F);
		Utah_Jaw.setTextureOffset(108, 92).addBox(-2.0F, 2.0F, -5.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);
		Utah_Jaw.setTextureOffset(0, 0).addBox(-2.0F, 1.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Jaw.setTextureOffset(0, 0).addBox(-2.0F, 1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Jaw.setTextureOffset(0, 0).addBox(-2.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Jaw.setTextureOffset(0, 0).addBox(1.0F, 1.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Jaw.setTextureOffset(0, 0).addBox(1.0F, 1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Jaw.setTextureOffset(0, 0).addBox(1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Utah_Neck = new ModelRenderer(this);
		Utah_Neck.setRotationPoint(0.0F, -2.0F, -9.0F);
		setRotationAngle(Utah_Neck, -0.4363F, 0.0F, 0.0F);
		Utah_Neck.setTextureOffset(100, 75).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 5.0F, 10.0F, 0.0F, false);

		Utah_Body = new ModelRenderer(this);
		Utah_Body.setRotationPoint(0.0F, 1.0F, -4.0F);
		Utah_Body.setTextureOffset(78, 46).addBox(-3.0F, -5.0F, -1.0F, 6.0F, 8.0F, 19.0F, 0.0F, false);

		Utah_Tail = new ModelRenderer(this);
		Utah_Tail.setRotationPoint(0.0F, 0.0F, 18.0F);
		Utah_Body.addChild(Utah_Tail);
		setRotationAngle(Utah_Tail, 0.2618F, 0.0F, 0.0F);
		Utah_Tail.setTextureOffset(94, 26).addBox(-3.0F, -4.0F, -1.0F, 6.0F, 6.0F, 11.0F, 0.0F, false);
		Utah_Tail.setTextureOffset(70, 101).addBox(-5.0F, -1.0F, -1.0F, 2.0F, 1.0F, 11.0F, 0.0F, false);
		Utah_Tail.setTextureOffset(45, 101).addBox(3.0F, -1.0F, -1.0F, 2.0F, 1.0F, 11.0F, 0.0F, false);

		Utah_Tail2 = new ModelRenderer(this);
		Utah_Tail2.setRotationPoint(0.0F, 0.0706F, 7.7274F);
		Utah_Tail.addChild(Utah_Tail2);
		setRotationAngle(Utah_Tail2, 0.2618F, 0.0F, 0.0F);
		Utah_Tail2.setTextureOffset(98, 7).addBox(-2.0F, -3.0981F, 1.366F, 4.0F, 5.0F, 11.0F, 0.0F, false);
		Utah_Tail2.setTextureOffset(38, 88).addBox(2.0F, -1.0981F, 1.366F, 4.0F, 1.0F, 11.0F, 0.0F, false);
		Utah_Tail2.setTextureOffset(70, 88).addBox(-6.0F, -1.0981F, 1.366F, 4.0F, 1.0F, 11.0F, 0.0F, false);

		Utah_Tail3 = new ModelRenderer(this);
		Utah_Tail3.setRotationPoint(0.0F, -2.5622F, 11.2942F);
		Utah_Tail2.addChild(Utah_Tail3);
		setRotationAngle(Utah_Tail3, -0.3491F, 0.0F, 0.0F);
		Utah_Tail3.setTextureOffset(72, 114).addBox(-1.0F, -0.0981F, 1.366F, 2.0F, 3.0F, 11.0F, 0.0F, false);
		Utah_Tail3.setTextureOffset(44, 0).addBox(-8.0F, 0.8424F, 11.5462F, 16.0F, 1.0F, 11.0F, 0.0F, false);
		Utah_Tail3.setTextureOffset(100, 0).addBox(-6.0F, 0.783F, 21.7264F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		Utah_Tail3.setTextureOffset(66, 73).addBox(-7.0F, 0.9019F, 1.366F, 6.0F, 1.0F, 11.0F, 0.0F, false);
		Utah_Tail3.setTextureOffset(31, 69).addBox(1.0F, 0.9019F, 1.366F, 6.0F, 1.0F, 11.0F, 0.0F, false);

		Utah_Left_Arm = new ModelRenderer(this);
		Utah_Left_Arm.setRotationPoint(4.0F, 3.0F, -3.0F);
		Utah_Left_Arm.setTextureOffset(86, 14).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);

		Utah_Left_Arm2 = new ModelRenderer(this);
		Utah_Left_Arm2.setRotationPoint(0.0F, 5.0F, -1.0F);
		Utah_Left_Arm.addChild(Utah_Left_Arm2);
		setRotationAngle(Utah_Left_Arm2, -0.3491F, 0.0F, 0.0F);
		Utah_Left_Arm2.setTextureOffset(73, 25).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 7.0F, 4.0F, 0.0F, false);

		Utah_Left_Arm3 = new ModelRenderer(this);
		Utah_Left_Arm3.setRotationPoint(0.0F, 4.1008F, 0.4284F);
		Utah_Left_Arm2.addChild(Utah_Left_Arm3);
		setRotationAngle(Utah_Left_Arm3, -1.2217F, 0.0F, 0.0F);
		Utah_Left_Arm3.setTextureOffset(65, 14).addBox(-1.0F, -0.5395F, -3.0126F, 2.0F, 6.0F, 4.0F, 0.0F, false);
		Utah_Left_Arm3.setTextureOffset(0, 0).addBox(-3.0F, 4.4604F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Left_Arm3.setTextureOffset(0, 0).addBox(-3.0F, 4.4604F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Left_Arm3.setTextureOffset(0, 0).addBox(-3.0F, 4.4604F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Utah_Right_Arm = new ModelRenderer(this);
		Utah_Right_Arm.setRotationPoint(-4.0F, 3.0F, -3.0F);
		Utah_Right_Arm.setTextureOffset(86, 26).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);

		Utah_Right_Arm2 = new ModelRenderer(this);
		Utah_Right_Arm2.setRotationPoint(0.0F, 5.0F, -1.0F);
		Utah_Right_Arm.addChild(Utah_Right_Arm2);
		setRotationAngle(Utah_Right_Arm2, -0.3491F, 0.0F, 0.0F);
		Utah_Right_Arm2.setTextureOffset(71, 29).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 7.0F, 4.0F, 0.0F, false);

		Utah_Right_Arm3 = new ModelRenderer(this);
		Utah_Right_Arm3.setRotationPoint(0.0F, 4.1008F, 0.4284F);
		Utah_Right_Arm2.addChild(Utah_Right_Arm3);
		setRotationAngle(Utah_Right_Arm3, -1.2217F, 0.0F, 0.0F);
		Utah_Right_Arm3.setTextureOffset(58, 30).addBox(-1.0F, -0.5395F, -3.0126F, 2.0F, 6.0F, 4.0F, 0.0F, false);
		Utah_Right_Arm3.setTextureOffset(0, 0).addBox(1.0F, 4.4604F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Right_Arm3.setTextureOffset(0, 0).addBox(1.0F, 4.4604F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Utah_Right_Arm3.setTextureOffset(0, 0).addBox(0.0F, 4.4604F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		Utah_Left_leg = new ModelRenderer(this);
		Utah_Left_leg.setRotationPoint(4.0F, 1.0F, 10.0F);
		setRotationAngle(Utah_Left_leg, 0.3491F, 0.0F, 0.0F);
		Utah_Left_leg.setTextureOffset(20, 112).addBox(-3.0F, -3.0F, -3.0F, 3.0F, 9.0F, 6.0F, 0.0F, false);

		Utah_Left_leg2 = new ModelRenderer(this);
		Utah_Left_leg2.setRotationPoint(0.0F, 7.2619F, -0.5148F);
		Utah_Left_leg.addChild(Utah_Left_leg2);
		setRotationAngle(Utah_Left_leg2, -0.1745F, 0.0F, 0.0F);
		Utah_Left_leg2.setTextureOffset(22, 95).addBox(-3.0F, -2.0F, -3.0F, 3.0F, 10.0F, 5.0F, 0.0F, false);

		Utah_Left_leg3 = new ModelRenderer(this);
		Utah_Left_leg3.setRotationPoint(0.0F, 9.0369F, -0.578F);
		Utah_Left_leg2.addChild(Utah_Left_leg3);
		setRotationAngle(Utah_Left_leg3, -0.4363F, 0.0F, 0.0F);
		Utah_Left_leg3.setTextureOffset(20, 82).addBox(-3.0F, -2.0F, -3.0F, 3.0F, 7.0F, 5.0F, 0.0F, false);

		Utah_Left_leg4 = new ModelRenderer(this);
		Utah_Left_leg4.setRotationPoint(0.0F, 5.3473F, -0.6378F);
		Utah_Left_leg3.addChild(Utah_Left_leg4);
		setRotationAngle(Utah_Left_leg4, -1.309F, 0.0F, 0.0F);
		Utah_Left_leg4.setTextureOffset(24, 69).addBox(-3.0F, -3.0F, -1.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		Claw1 = new ModelRenderer(this);
		Claw1.setRotationPoint(0.0F, 5.3539F, 1.7305F);
		Utah_Left_leg4.addChild(Claw1);
		setRotationAngle(Claw1, 0.0F, 0.0F, -0.6981F);
		Claw1.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Claw2 = new ModelRenderer(this);
		Claw2.setRotationPoint(-3.0F, 5.3539F, 1.7305F);
		Utah_Left_leg4.addChild(Claw2);
		setRotationAngle(Claw2, 0.0F, 0.0F, 0.2618F);
		Claw2.setTextureOffset(0, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Claw3 = new ModelRenderer(this);
		Claw3.setRotationPoint(-2.0F, 5.3539F, -1.2695F);
		Utah_Left_leg4.addChild(Claw3);
		setRotationAngle(Claw3, 0.7854F, 0.0F, 0.0F);
		Claw3.setTextureOffset(0, 0).addBox(-1.0F, -0.3539F, -2.7305F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Claw3.setTextureOffset(0, 0).addBox(-1.0F, 0.6461F, -2.7305F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Utah_Left_leg5 = new ModelRenderer(this);
		Utah_Left_leg5.setRotationPoint(-1.0F, 1.0F, 10.0F);
		setRotationAngle(Utah_Left_leg5, 0.3491F, 0.0F, 0.0F);
		Utah_Left_leg5.setTextureOffset(0, 113).addBox(-3.0F, -3.0F, -3.0F, 3.0F, 9.0F, 6.0F, 0.0F, false);

		Utah_Left_leg6 = new ModelRenderer(this);
		Utah_Left_leg6.setRotationPoint(0.0F, 7.2619F, -0.5148F);
		Utah_Left_leg5.addChild(Utah_Left_leg6);
		setRotationAngle(Utah_Left_leg6, -0.1745F, 0.0F, 0.0F);
		Utah_Left_leg6.setTextureOffset(0, 97).addBox(-3.0F, -2.0F, -3.0F, 3.0F, 10.0F, 5.0F, 0.0F, false);

		Utah_Left_leg7 = new ModelRenderer(this);
		Utah_Left_leg7.setRotationPoint(0.0F, 9.0369F, -0.578F);
		Utah_Left_leg6.addChild(Utah_Left_leg7);
		setRotationAngle(Utah_Left_leg7, -0.4363F, 0.0F, 0.0F);
		Utah_Left_leg7.setTextureOffset(0, 83).addBox(-3.0F, -2.0F, -3.0F, 3.0F, 7.0F, 5.0F, 0.0F, false);

		Utah_Left_leg8 = new ModelRenderer(this);
		Utah_Left_leg8.setRotationPoint(0.0F, 5.3473F, -0.6378F);
		Utah_Left_leg7.addChild(Utah_Left_leg8);
		setRotationAngle(Utah_Left_leg8, -1.309F, 0.0F, 0.0F);
		Utah_Left_leg8.setTextureOffset(0, 69).addBox(-3.0F, -3.0F, -1.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		Claw4 = new ModelRenderer(this);
		Claw4.setRotationPoint(0.0F, 5.3539F, 1.7305F);
		Utah_Left_leg8.addChild(Claw4);
		setRotationAngle(Claw4, 0.0F, 0.0F, -0.2618F);
		Claw4.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Claw5 = new ModelRenderer(this);
		Claw5.setRotationPoint(-3.0F, 5.3539F, 1.7305F);
		Utah_Left_leg8.addChild(Claw5);
		setRotationAngle(Claw5, 0.0F, 0.0F, 0.6981F);
		Claw5.setTextureOffset(0, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Claw6 = new ModelRenderer(this);
		Claw6.setRotationPoint(0.0F, 5.3539F, -1.2695F);
		Utah_Left_leg8.addChild(Claw6);
		setRotationAngle(Claw6, 0.7854F, 0.0F, 0.0F);
		Claw6.setTextureOffset(0, 0).addBox(-1.0F, -0.3539F, -2.7305F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Claw6.setTextureOffset(0, 0).addBox(-1.0F, 0.6461F, -2.7305F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Utah_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Utah_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Utah_Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Utah_Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Utah_Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Utah_Left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Utah_Left_leg5.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Utah_Left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Utah_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Utah_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Utah_Left_leg5.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Utah_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Utah_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Utah_Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}