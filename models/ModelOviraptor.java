// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelOviraptor extends EntityModel<Entity> {
	private final ModelRenderer Oviraptor_Head;
	private final ModelRenderer Oviraptor_Jaw;
	private final ModelRenderer Feathers;
	private final ModelRenderer Oviraptor_Neck;
	private final ModelRenderer Oviraptor_Body;
	private final ModelRenderer Oviraptor_Tail;
	private final ModelRenderer Oviraptor_Tail2;
	private final ModelRenderer Oviraptor_Left_Arm;
	private final ModelRenderer Oviraptor_Left_Arm2;
	private final ModelRenderer Oviraptor_Right_Arm;
	private final ModelRenderer Oviraptor_Right_Arm2;
	private final ModelRenderer Oviraptor_Left_Leg;
	private final ModelRenderer Oviraptor_Left_Leg2;
	private final ModelRenderer Oviraptor_Left_Leg3;
	private final ModelRenderer Oviraptor_Left_Leg4;
	private final ModelRenderer Oviraptor_Right_Leg;
	private final ModelRenderer Oviraptor_Right_Leg2;
	private final ModelRenderer Oviraptor_Right_Leg3;
	private final ModelRenderer Oviraptor_Right_Leg4;

	public ModelOviraptor() {
		textureWidth = 128;
		textureHeight = 128;

		Oviraptor_Head = new ModelRenderer(this);
		Oviraptor_Head.setRotationPoint(0.0F, 0.0F, -5.0F);
		Oviraptor_Head.setTextureOffset(104, 89).addBox(-3.0F, -3.0F, -6.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		Oviraptor_Head.setTextureOffset(118, 101).addBox(-2.0F, -2.0F, -7.0F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		Oviraptor_Head.setTextureOffset(122, 113).addBox(-1.0F, -1.0F, -8.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		Oviraptor_Head.setTextureOffset(122, 122).addBox(-1.0F, 0.0F, -9.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		Oviraptor_Jaw = new ModelRenderer(this);
		Oviraptor_Jaw.setRotationPoint(0.0F, 3.0F, -2.0F);
		Oviraptor_Head.addChild(Oviraptor_Jaw);
		setRotationAngle(Oviraptor_Jaw, 0.7854F, 0.0F, 0.0F);
		Oviraptor_Jaw.setTextureOffset(112, 82).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Oviraptor_Jaw.setTextureOffset(122, 76).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		Feathers = new ModelRenderer(this);
		Feathers.setRotationPoint(0.0F, -3.0F, -3.0F);
		Oviraptor_Head.addChild(Feathers);
		setRotationAngle(Feathers, 0.5236F, 0.0F, 0.0F);
		Feathers.setTextureOffset(0, 0).addBox(-2.0F, 0.5F, 0.5981F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Feathers.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Feathers.setTextureOffset(0, 0).addBox(2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Feathers.setTextureOffset(0, 0).addBox(1.0F, 0.5F, 0.5981F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		Oviraptor_Neck = new ModelRenderer(this);
		Oviraptor_Neck.setRotationPoint(0.0F, 0.0F, -8.0F);
		setRotationAngle(Oviraptor_Neck, -0.9599F, 0.0F, 0.0F);
		Oviraptor_Neck.setTextureOffset(100, 58).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 4.0F, 10.0F, 0.0F, false);

		Oviraptor_Body = new ModelRenderer(this);
		Oviraptor_Body.setRotationPoint(0.0F, 8.0F, -3.0F);
		Oviraptor_Body.setTextureOffset(94, 40).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 11.0F, 0.0F, false);

		Oviraptor_Tail = new ModelRenderer(this);
		Oviraptor_Tail.setRotationPoint(0.0F, 0.0F, 9.0F);
		Oviraptor_Body.addChild(Oviraptor_Tail);
		setRotationAngle(Oviraptor_Tail, 0.4363F, 0.0F, 0.0F);
		Oviraptor_Tail.setTextureOffset(98, 22).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 4.0F, 11.0F, 0.0F, false);
		Oviraptor_Tail.setTextureOffset(47, 117).addBox(-4.0F, 1.0F, 1.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		Oviraptor_Tail.setTextureOffset(47, 104).addBox(2.0F, 1.0F, 1.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);

		Oviraptor_Tail2 = new ModelRenderer(this);
		Oviraptor_Tail2.setRotationPoint(0.0F, 0.662F, 8.5183F);
		Oviraptor_Tail.addChild(Oviraptor_Tail2);
		setRotationAngle(Oviraptor_Tail2, -0.1745F, 0.0F, 0.0F);
		Oviraptor_Tail2.setTextureOffset(102, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 11.0F, 0.0F, false);
		Oviraptor_Tail2.setTextureOffset(55, 58).addBox(-1.0F, -0.3437F, 10.1769F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		Oviraptor_Tail2.setTextureOffset(47, 90).addBox(-3.0F, 0.0F, 2.0F, 2.0F, 1.0F, 9.0F, 0.0F, false);
		Oviraptor_Tail2.setTextureOffset(47, 78).addBox(1.0F, 0.0F, 2.0F, 2.0F, 1.0F, 9.0F, 0.0F, false);

		Oviraptor_Left_Arm = new ModelRenderer(this);
		Oviraptor_Left_Arm.setRotationPoint(4.0F, 10.0F, -1.0F);
		setRotationAngle(Oviraptor_Left_Arm, -0.5236F, 0.0F, 0.0F);
		Oviraptor_Left_Arm.setTextureOffset(57, 65).addBox(-2.0F, -0.634F, 0.366F, 1.0F, 6.0F, 2.0F, 0.0F, false);
		Oviraptor_Left_Arm.setTextureOffset(99, 113).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		Oviraptor_Left_Arm2 = new ModelRenderer(this);
		Oviraptor_Left_Arm2.setRotationPoint(0.0F, 4.8301F, 1.634F);
		Oviraptor_Left_Arm.addChild(Oviraptor_Left_Arm2);
		setRotationAngle(Oviraptor_Left_Arm2, 0.7854F, 0.0F, 0.0F);
		Oviraptor_Left_Arm2.setTextureOffset(91, 123).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Oviraptor_Right_Arm = new ModelRenderer(this);
		Oviraptor_Right_Arm.setRotationPoint(-2.0F, 10.0F, -1.0F);
		setRotationAngle(Oviraptor_Right_Arm, -0.5236F, 0.0F, 0.0F);
		Oviraptor_Right_Arm.setTextureOffset(88, 113).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		Oviraptor_Right_Arm.setTextureOffset(66, 65).addBox(-1.0F, -0.634F, 0.366F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		Oviraptor_Right_Arm2 = new ModelRenderer(this);
		Oviraptor_Right_Arm2.setRotationPoint(0.0F, 4.8301F, 1.634F);
		Oviraptor_Right_Arm.addChild(Oviraptor_Right_Arm2);
		setRotationAngle(Oviraptor_Right_Arm2, 0.7854F, 0.0F, 0.0F);
		Oviraptor_Right_Arm2.setTextureOffset(103, 123).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Oviraptor_Left_Leg = new ModelRenderer(this);
		Oviraptor_Left_Leg.setRotationPoint(4.0F, 10.0F, 6.0F);
		setRotationAngle(Oviraptor_Left_Leg, 0.5236F, 0.0F, 0.0F);
		Oviraptor_Left_Leg.setTextureOffset(0, 109).addBox(-3.0F, -2.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		Oviraptor_Left_Leg2 = new ModelRenderer(this);
		Oviraptor_Left_Leg2.setRotationPoint(0.0F, 4.4641F, -0.2679F);
		Oviraptor_Left_Leg.addChild(Oviraptor_Left_Leg2);
		setRotationAngle(Oviraptor_Left_Leg2, -0.2618F, 0.0F, 0.0F);
		Oviraptor_Left_Leg2.setTextureOffset(0, 98).addBox(-3.0F, -2.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		Oviraptor_Left_Leg3 = new ModelRenderer(this);
		Oviraptor_Left_Leg3.setRotationPoint(0.0F, 9.6603F, -3.2679F);
		Oviraptor_Left_Leg.addChild(Oviraptor_Left_Leg3);
		setRotationAngle(Oviraptor_Left_Leg3, -0.7854F, 0.0F, 0.0F);
		Oviraptor_Left_Leg3.setTextureOffset(0, 62).addBox(-3.0F, -3.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		Oviraptor_Left_Leg4 = new ModelRenderer(this);
		Oviraptor_Left_Leg4.setRotationPoint(0.0F, 13.1244F, -5.2679F);
		Oviraptor_Left_Leg.addChild(Oviraptor_Left_Leg4);
		setRotationAngle(Oviraptor_Left_Leg4, -0.5236F, 0.0F, 0.0F);
		Oviraptor_Left_Leg4.setTextureOffset(20, 108).addBox(-3.0F, -3.0F, -5.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		Oviraptor_Right_Leg = new ModelRenderer(this);
		Oviraptor_Right_Leg.setRotationPoint(-1.0F, 10.0F, 6.0F);
		setRotationAngle(Oviraptor_Right_Leg, 0.5236F, 0.0F, 0.0F);
		Oviraptor_Right_Leg.setTextureOffset(0, 120).addBox(-3.0F, -2.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		Oviraptor_Right_Leg2 = new ModelRenderer(this);
		Oviraptor_Right_Leg2.setRotationPoint(0.0F, 4.4641F, -0.2679F);
		Oviraptor_Right_Leg.addChild(Oviraptor_Right_Leg2);
		setRotationAngle(Oviraptor_Right_Leg2, -0.2618F, 0.0F, 0.0F);
		Oviraptor_Right_Leg2.setTextureOffset(0, 85).addBox(-3.0F, -2.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		Oviraptor_Right_Leg3 = new ModelRenderer(this);
		Oviraptor_Right_Leg3.setRotationPoint(0.0F, 9.6603F, -3.2679F);
		Oviraptor_Right_Leg.addChild(Oviraptor_Right_Leg3);
		setRotationAngle(Oviraptor_Right_Leg3, -0.7854F, 0.0F, 0.0F);
		Oviraptor_Right_Leg3.setTextureOffset(0, 75).addBox(-3.0F, -3.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		Oviraptor_Right_Leg4 = new ModelRenderer(this);
		Oviraptor_Right_Leg4.setRotationPoint(0.0F, 13.1244F, -5.2679F);
		Oviraptor_Right_Leg.addChild(Oviraptor_Right_Leg4);
		setRotationAngle(Oviraptor_Right_Leg4, -0.5236F, 0.0F, 0.0F);
		Oviraptor_Right_Leg4.setTextureOffset(17, 120).addBox(-3.0F, -3.0F, -5.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Oviraptor_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Oviraptor_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Oviraptor_Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Oviraptor_Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Oviraptor_Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Oviraptor_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Oviraptor_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Oviraptor_Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Oviraptor_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Oviraptor_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Oviraptor_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Oviraptor_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Oviraptor_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}