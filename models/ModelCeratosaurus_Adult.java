// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelCeratosaurus_Adult extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Body2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Body3;
	private final ModelRenderer cube_r3;
	private final ModelRenderer CeratoHead;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer CeratoJaw;
	private final ModelRenderer CeratoNeck;
	private final ModelRenderer CeratoNeck2;
	private final ModelRenderer CeratoTail1;
	private final ModelRenderer CeratoTail2;
	private final ModelRenderer CeratoTail3;
	private final ModelRenderer CeratoTail4;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r4;
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r6;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r7;

	public ModelCeratosaurus_Adult() {
		textureWidth = 256;
		textureHeight = 256;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(1.0F, -3.0F, -7.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 56).addBox(-6.0F, -5.0F, -3.0F, 11.0F, 14.0F, 7.0F, 0.0F, false);

		Body2 = new ModelRenderer(this);
		Body2.setRotationPoint(0.0F, -1.0F, 7.0F);
		Body.addChild(Body2);
		setRotationAngle(Body2, -0.0873F, 0.0F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.7072F, -0.3909F);
		Body2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(-7.0F, -5.0F, -3.0F, 13.0F, 15.0F, 10.0F, 0.0F, false);

		Body3 = new ModelRenderer(this);
		Body3.setRotationPoint(0.0F, -0.8716F, 9.9619F);
		Body2.addChild(Body3);
		setRotationAngle(Body3, -0.0873F, 0.0F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.5F, 1.4615F, -1.3714F);
		Body3.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 25).addBox(-6.0F, -5.0F, -3.0F, 12.0F, 15.0F, 10.0F, 0.0F, false);

		CeratoHead = new ModelRenderer(this);
		CeratoHead.setRotationPoint(-0.5F, -1.0F, -6.0F);
		Body.addChild(CeratoHead);
		setRotationAngle(CeratoHead, 0.1745F, 0.0F, 0.0F);
		CeratoHead.setTextureOffset(78, 100).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);
		CeratoHead.setTextureOffset(89, 64).addBox(-3.5F, -7.0F, -13.0F, 7.0F, 5.0F, 9.0F, 0.0F, false);
		CeratoHead.setTextureOffset(98, 23).addBox(-3.5F, -2.0F, -13.0F, 7.0F, 2.0F, 9.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -6.1967F, -12.1079F);
		CeratoHead.addChild(bone);
		setRotationAngle(bone, 0.5236F, 0.0F, 0.0F);
		bone.setTextureOffset(0, 116).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.9F, -6.6034F, -2.8973F);
		CeratoHead.addChild(bone2);
		setRotationAngle(bone2, 0.5236F, 0.0F, 0.0F);
		bone2.setTextureOffset(123, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.9F, -7.4898F, -2.7411F);
		CeratoHead.addChild(bone3);
		setRotationAngle(bone3, 0.5236F, 0.0F, 0.0F);
		bone3.setTextureOffset(121, 11).addBox(-1.0F, -2.435F, -1.5393F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		CeratoJaw = new ModelRenderer(this);
		CeratoJaw.setRotationPoint(0.0F, -0.8112F, -3.8415F);
		CeratoHead.addChild(CeratoJaw);
		CeratoJaw.setTextureOffset(89, 11).addBox(-3.5F, -1.1888F, -9.1585F, 7.0F, 2.0F, 10.0F, -0.001F, false);
		CeratoJaw.setTextureOffset(88, 88).addBox(-3.5F, -3.1868F, -9.1585F, 7.0F, 2.0F, 10.0F, -0.001F, false);

		CeratoNeck = new ModelRenderer(this);
		CeratoNeck.setRotationPoint(0.5F, -3.3F, -0.8F);
		CeratoHead.addChild(CeratoNeck);
		setRotationAngle(CeratoNeck, -1.0036F, 0.0F, 0.0F);
		CeratoNeck.setTextureOffset(48, 99).addBox(-4.0F, -4.0F, -3.0F, 7.0F, 7.0F, 8.0F, 0.0F, false);

		CeratoNeck2 = new ModelRenderer(this);
		CeratoNeck2.setRotationPoint(0.0F, -2.6051F, 5.2167F);
		CeratoNeck.addChild(CeratoNeck2);
		setRotationAngle(CeratoNeck2, -1.0036F, 0.0F, 0.0F);
		CeratoNeck2.setTextureOffset(73, 28).addBox(-4.5F, -1.8057F, -3.3892F, 8.0F, 5.0F, 9.0F, 0.0F, false);

		CeratoTail1 = new ModelRenderer(this);
		CeratoTail1.setRotationPoint(0.6F, 4.0F, 22.0F);
		Body.addChild(CeratoTail1);
		setRotationAngle(CeratoTail1, -0.3054F, 0.0F, 0.0F);
		CeratoTail1.setTextureOffset(33, 39).addBox(-6.0F, -7.0F, -2.0F, 10.0F, 13.0F, 11.0F, 0.0F, false);

		CeratoTail2 = new ModelRenderer(this);
		CeratoTail2.setRotationPoint(0.0F, 0.4555F, 8.5319F);
		CeratoTail1.addChild(CeratoTail2);
		setRotationAngle(CeratoTail2, 0.1309F, 0.0F, 0.0F);
		CeratoTail2.setTextureOffset(44, 14).addBox(-5.0F, -7.4418F, -0.2596F, 8.0F, 12.0F, 11.0F, 0.0F, false);

		CeratoTail3 = new ModelRenderer(this);
		CeratoTail3.setRotationPoint(0.0F, 0.2331F, 10.1954F);
		CeratoTail2.addChild(CeratoTail3);
		setRotationAngle(CeratoTail3, 0.1309F, 0.0F, 0.0F);
		CeratoTail3.setTextureOffset(36, 63).addBox(-4.0F, -7.6408F, -0.0241F, 6.0F, 11.0F, 11.0F, 0.0F, false);

		CeratoTail4 = new ModelRenderer(this);
		CeratoTail4.setRotationPoint(0.0F, -0.4362F, 9.9905F);
		CeratoTail3.addChild(CeratoTail4);
		setRotationAngle(CeratoTail4, 0.1309F, 0.0F, 0.0F);
		CeratoTail4.setTextureOffset(64, 52).addBox(-3.0F, -7.1085F, 0.4816F, 4.0F, 10.0F, 11.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(5.0F, 2.0F, 10.0F);
		LeftLeg.setTextureOffset(70, 73).addBox(-2.0F, -5.0F, -5.0F, 5.0F, 12.0F, 9.0F, 0.0F, false);
		LeftLeg.setTextureOffset(48, 85).addBox(-2.0F, 19.0F, -8.9F, 5.0F, 3.0F, 11.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, 5.9F, 0.0F);
		LeftLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(24, 85).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 15.0F, 8.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-6.0F, 2.0F, 10.0F);
		RightLeg.setTextureOffset(71, 0).addBox(-2.0F, -5.0F, -5.0F, 5.0F, 12.0F, 9.0F, 0.0F, false);
		RightLeg.setTextureOffset(83, 42).addBox(-2.0F, 19.0F, -8.9F, 5.0F, 3.0F, 11.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.5F, 5.9F, 0.0F);
		RightLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 77).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 15.0F, 8.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(7.0F, 3.0F, -7.0F);
		setRotationAngle(LeftArm, -0.2182F, 0.0F, 0.0F);
		LeftArm.setTextureOffset(0, 100).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 7.0F, 5.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 4.8815F, 1.0822F);
		LeftArm.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.4363F, 0.0F, 0.2618F);
		cube_r6.setTextureOffset(104, 38).addBox(-3.0F, -1.302F, -3.1152F, 3.0F, 7.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-4.0F, 3.0F, -7.0F);
		setRotationAngle(RightArm, -0.2182F, 0.0F, 0.0F);
		RightArm.setTextureOffset(46, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 7.0F, 5.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, 4.8815F, 1.0822F);
		RightArm.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.4363F, 0.0F, -0.2618F);
		cube_r7.setTextureOffset(99, 0).addBox(0.0F, -1.302F, -3.1152F, 3.0F, 7.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.CeratoHead.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.CeratoHead.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.CeratoTail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.CeratoTail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.CeratoTail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.CeratoTail1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}