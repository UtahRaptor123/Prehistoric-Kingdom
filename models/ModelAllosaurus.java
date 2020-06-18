// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelAllosaurus extends EntityModel<Entity> {
	private final ModelRenderer Allosaur_Head;
	private final ModelRenderer Bottom_Jaw;
	private final ModelRenderer Allosaur_Neck;
	private final ModelRenderer Allosaur_Body;
	private final ModelRenderer Allosaur_Tail;
	private final ModelRenderer Allosaur_Tail2;
	private final ModelRenderer Allosaur_Tail3;
	private final ModelRenderer Allosaur_Left_Leg;
	private final ModelRenderer Allosaur_LeftMusle;
	private final ModelRenderer Allosaur_LeftMusle2;
	private final ModelRenderer Allosaur_LeftMusle3;
	private final ModelRenderer Allosaur_Right_Leg;
	private final ModelRenderer Allosaur_LeftMusle4;
	private final ModelRenderer Allosaur_LeftMusle5;
	private final ModelRenderer Allosaur_LeftMusle6;
	private final ModelRenderer Allosaur_Left_Arm;
	private final ModelRenderer Allosaur_Left_Arm2;
	private final ModelRenderer Allosaur_Left_Arm3;
	private final ModelRenderer Allosaur_Right_Arm;
	private final ModelRenderer Allosaur_Left_Arm5;
	private final ModelRenderer Allosaur_Left_Arm6;

	public ModelAllosaurus() {
		textureWidth = 256;
		textureHeight = 256;

		Allosaur_Head = new ModelRenderer(this);
		Allosaur_Head.setRotationPoint(0.0F, -15.0F, -21.0F);
		Allosaur_Head.setTextureOffset(214, 235).addBox(-5.0F, -10.0F, -10.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(219, 213).addBox(-4.0F, -8.0F, -20.0F, 8.0F, 8.0F, 10.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(238, 204).addBox(-4.0F, -6.0F, -21.0F, 8.0F, 6.0F, 1.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(239, 193).addBox(-4.0F, -10.0F, -17.0F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(239, 193).addBox(3.0F, -10.0F, -17.0F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(239, 193).addBox(-4.0F, -11.0F, -13.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(239, 193).addBox(3.0F, -11.0F, -13.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(239, 193).addBox(-4.0F, -9.0F, -19.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(239, 193).addBox(3.0F, -9.0F, -19.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(239, 193).addBox(-4.0F, -12.0F, -10.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(239, 193).addBox(3.0F, -12.0F, -10.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(239, 193).addBox(-4.0F, -13.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(239, 193).addBox(3.0F, -13.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -12.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -14.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -16.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -18.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(0, 0).addBox(4.0F, 0.0F, -18.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(0, 0).addBox(4.0F, 0.0F, -16.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(0, 0).addBox(4.0F, 0.0F, -14.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(0, 0).addBox(4.0F, 0.0F, -12.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -20.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Allosaur_Head.setTextureOffset(0, 0).addBox(4.0F, 0.0F, -20.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);

		Bottom_Jaw = new ModelRenderer(this);
		Bottom_Jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
		Allosaur_Head.addChild(Bottom_Jaw);
		setRotationAngle(Bottom_Jaw, 0.0873F, 0.0F, 0.0F);
		Bottom_Jaw.setTextureOffset(218, 165).addBox(-4.0F, -1.0F, -10.0F, 8.0F, 2.0F, 10.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(223, 149).addBox(-3.0F, -1.0F, -20.0F, 6.0F, 2.0F, 10.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(234, 179).addBox(-4.0F, -9.5736F, -3.8192F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(234, 179).addBox(3.0F, -8.5736F, -3.8192F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(0, 0).addBox(-4.0F, -4.0359F, -9.7942F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(0, 0).addBox(4.0F, -4.0359F, -9.7942F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -1.6699F, -11.1603F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.6699F, -11.1603F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -2.8038F, -13.3923F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(0, 0).addBox(3.0F, -2.8038F, -13.3923F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -1.9378F, -15.6244F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.9378F, -15.6244F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -2.2058F, -18.3564F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(0, 0).addBox(3.0F, -2.2058F, -18.3564F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(0, 0).addBox(1.0F, -2.2058F, -20.0885F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		Bottom_Jaw.setTextureOffset(0, 0).addBox(-2.0F, -2.2058F, -20.0885F, 1.0F, 2.0F, 0.0F, 0.0F, false);

		Allosaur_Neck = new ModelRenderer(this);
		Allosaur_Neck.setRotationPoint(0.0F, -18.0F, -20.0F);
		setRotationAngle(Allosaur_Neck, -0.5236F, 0.0F, 0.0F);
		Allosaur_Neck.setTextureOffset(207, 114).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 9.0F, 15.0F, 0.0F, false);

		Allosaur_Body = new ModelRenderer(this);
		Allosaur_Body.setRotationPoint(0.0F, -12.0F, -9.0F);
		Allosaur_Body.setTextureOffset(157, 56).addBox(-6.0F, -7.0F, -4.0F, 12.0F, 16.0F, 37.0F, 0.0F, false);

		Allosaur_Tail = new ModelRenderer(this);
		Allosaur_Tail.setRotationPoint(0.0F, -11.0F, 24.0F);
		setRotationAngle(Allosaur_Tail, 0.1745F, 0.0F, 0.0F);
		Allosaur_Tail.setTextureOffset(184, 13).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 13.0F, 23.0F, 0.0F, false);

		Allosaur_Tail2 = new ModelRenderer(this);
		Allosaur_Tail2.setRotationPoint(0.0F, 0.0F, 23.0F);
		Allosaur_Tail.addChild(Allosaur_Tail2);
		setRotationAngle(Allosaur_Tail2, 0.0873F, 0.0F, 0.0F);
		Allosaur_Tail2.setTextureOffset(123, 216).addBox(-3.0F, -6.0F, -4.0F, 6.0F, 11.0F, 24.0F, 0.0F, false);

		Allosaur_Tail3 = new ModelRenderer(this);
		Allosaur_Tail3.setRotationPoint(0.0F, 1.1565F, 23.9008F);
		Allosaur_Tail2.addChild(Allosaur_Tail3);
		setRotationAngle(Allosaur_Tail3, -0.1745F, 0.0F, 0.0F);
		Allosaur_Tail3.setTextureOffset(131, 173).addBox(-2.0F, -5.0F, -5.0F, 4.0F, 7.0F, 18.0F, 0.0F, false);

		Allosaur_Left_Leg = new ModelRenderer(this);
		Allosaur_Left_Leg.setRotationPoint(6.0F, -9.0F, 16.0F);
		Allosaur_Left_Leg.setTextureOffset(36, 228).addBox(0.0F, -7.0F, -6.0F, 1.0F, 13.0F, 12.0F, 0.0F, false);

		Allosaur_LeftMusle = new ModelRenderer(this);
		Allosaur_LeftMusle.setRotationPoint(0.0F, 13.0F, 0.0F);
		Allosaur_Left_Leg.addChild(Allosaur_LeftMusle);
		setRotationAngle(Allosaur_LeftMusle, 0.4363F, 0.0F, 0.0F);
		Allosaur_LeftMusle.setTextureOffset(1, 193).addBox(-4.0F, -9.0F, -1.0F, 5.0F, 19.0F, 8.0F, 0.0F, false);

		Allosaur_LeftMusle2 = new ModelRenderer(this);
		Allosaur_LeftMusle2.setRotationPoint(0.0F, 30.0F, 5.0F);
		Allosaur_Left_Leg.addChild(Allosaur_LeftMusle2);
		setRotationAngle(Allosaur_LeftMusle2, -0.3491F, 0.0F, 0.0F);
		Allosaur_LeftMusle2.setTextureOffset(31, 167).addBox(-4.0F, -12.0F, -6.0F, 5.0F, 13.0F, 7.0F, 0.0F, false);

		Allosaur_LeftMusle3 = new ModelRenderer(this);
		Allosaur_LeftMusle3.setRotationPoint(0.0F, 42.0F, -1.0F);
		Allosaur_Left_Leg.addChild(Allosaur_LeftMusle3);
		Allosaur_LeftMusle3.setTextureOffset(49, 153).addBox(-4.0F, -13.0F, -6.0F, 5.0F, 4.0F, 12.0F, 0.0F, false);
		Allosaur_LeftMusle3.setTextureOffset(0, 0).addBox(-4.0F, -11.0F, -7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Allosaur_LeftMusle3.setTextureOffset(0, 0).addBox(0.0F, -11.0F, -7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Allosaur_LeftMusle3.setTextureOffset(0, 0).addBox(-2.0F, -11.0F, -7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Allosaur_Right_Leg = new ModelRenderer(this);
		Allosaur_Right_Leg.setRotationPoint(-3.0F, -9.0F, 16.0F);
		Allosaur_Right_Leg.setTextureOffset(2, 229).addBox(-4.0F, -7.0F, -6.0F, 1.0F, 13.0F, 12.0F, 0.0F, false);

		Allosaur_LeftMusle4 = new ModelRenderer(this);
		Allosaur_LeftMusle4.setRotationPoint(0.0F, 13.0F, 0.0F);
		Allosaur_Right_Leg.addChild(Allosaur_LeftMusle4);
		setRotationAngle(Allosaur_LeftMusle4, 0.4363F, 0.0F, 0.0F);
		Allosaur_LeftMusle4.setTextureOffset(32, 193).addBox(-4.0F, -9.0F, -1.0F, 5.0F, 19.0F, 8.0F, 0.0F, false);

		Allosaur_LeftMusle5 = new ModelRenderer(this);
		Allosaur_LeftMusle5.setRotationPoint(0.0F, 30.0F, 5.0F);
		Allosaur_Right_Leg.addChild(Allosaur_LeftMusle5);
		setRotationAngle(Allosaur_LeftMusle5, -0.3491F, 0.0F, 0.0F);
		Allosaur_LeftMusle5.setTextureOffset(0, 166).addBox(-4.0F, -12.0F, -6.0F, 5.0F, 13.0F, 7.0F, 0.0F, false);

		Allosaur_LeftMusle6 = new ModelRenderer(this);
		Allosaur_LeftMusle6.setRotationPoint(0.0F, 42.0F, -1.0F);
		Allosaur_Right_Leg.addChild(Allosaur_LeftMusle6);
		Allosaur_LeftMusle6.setTextureOffset(2, 157).addBox(-4.0F, -13.0F, -5.962F, 5.0F, 4.0F, 12.0F, 0.0F, false);
		Allosaur_LeftMusle6.setTextureOffset(0, 0).addBox(-2.0F, -11.0F, -7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Allosaur_LeftMusle6.setTextureOffset(0, 0).addBox(0.0F, -11.0F, -7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Allosaur_LeftMusle6.setTextureOffset(0, 0).addBox(-4.0F, -11.0F, -7.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Allosaur_Left_Arm = new ModelRenderer(this);
		Allosaur_Left_Arm.setRotationPoint(7.0F, -7.0F, -9.0F);
		Allosaur_Left_Arm.setTextureOffset(157, 152).addBox(-1.0F, -4.0F, -3.0F, 1.0F, 8.0F, 7.0F, 0.0F, false);

		Allosaur_Left_Arm2 = new ModelRenderer(this);
		Allosaur_Left_Arm2.setRotationPoint(0.0F, 5.0F, -2.0F);
		Allosaur_Left_Arm.addChild(Allosaur_Left_Arm2);
		setRotationAngle(Allosaur_Left_Arm2, -0.5236F, 0.0F, 0.0F);
		Allosaur_Left_Arm2.setTextureOffset(146, 135).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 11.0F, 5.0F, 0.0F, false);

		Allosaur_Left_Arm3 = new ModelRenderer(this);
		Allosaur_Left_Arm3.setRotationPoint(0.0F, 11.0F, -6.0F);
		Allosaur_Left_Arm.addChild(Allosaur_Left_Arm3);
		setRotationAngle(Allosaur_Left_Arm3, 0.2618F, 0.0F, 0.0F);
		Allosaur_Left_Arm3.setTextureOffset(128, 123).addBox(-4.0F, -1.0F, -4.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		Allosaur_Left_Arm3.setTextureOffset(128, 123).addBox(-6.0F, -2.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Allosaur_Left_Arm3.setTextureOffset(128, 123).addBox(-6.0F, 0.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Allosaur_Left_Arm3.setTextureOffset(128, 123).addBox(-6.0F, 2.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Allosaur_Right_Arm = new ModelRenderer(this);
		Allosaur_Right_Arm.setRotationPoint(-3.0F, -7.0F, -9.0F);
		Allosaur_Right_Arm.setTextureOffset(176, 157).addBox(-4.0F, -4.0F, -3.0F, 1.0F, 8.0F, 7.0F, 0.0F, false);

		Allosaur_Left_Arm5 = new ModelRenderer(this);
		Allosaur_Left_Arm5.setRotationPoint(0.0F, 5.0F, -2.0F);
		Allosaur_Right_Arm.addChild(Allosaur_Left_Arm5);
		setRotationAngle(Allosaur_Left_Arm5, -0.5236F, 0.0F, 0.0F);
		Allosaur_Left_Arm5.setTextureOffset(176, 135).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 11.0F, 5.0F, 0.0F, false);

		Allosaur_Left_Arm6 = new ModelRenderer(this);
		Allosaur_Left_Arm6.setRotationPoint(0.0F, 11.0F, -6.0F);
		Allosaur_Right_Arm.addChild(Allosaur_Left_Arm6);
		setRotationAngle(Allosaur_Left_Arm6, 0.2618F, 0.0F, 0.0F);
		Allosaur_Left_Arm6.setTextureOffset(160, 125).addBox(-4.0F, -1.0F, -4.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		Allosaur_Left_Arm6.setTextureOffset(160, 125).addBox(0.0F, 2.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Allosaur_Left_Arm6.setTextureOffset(160, 125).addBox(0.0F, 0.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Allosaur_Left_Arm6.setTextureOffset(160, 125).addBox(-1.0F, -2.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Allosaur_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Allosaur_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Allosaur_Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Allosaur_Tail.render(matrixStack, buffer, packedLight, packedOverlay);
		Allosaur_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Allosaur_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Allosaur_Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Allosaur_Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Allosaur_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Allosaur_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Allosaur_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Allosaur_Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Allosaur_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Allosaur_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Allosaur_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}