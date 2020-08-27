// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelTyrannosaurus_Rex_SubAdult extends EntityModel<Entity> {
	private final ModelRenderer Rexhead;
	private final ModelRenderer RexTopJaw;
	private final ModelRenderer RexBottomjaw;
	private final ModelRenderer RexCrest1;
	private final ModelRenderer RexCrest2;
	private final ModelRenderer RexNeck;
	private final ModelRenderer RexNeck2;
	private final ModelRenderer RexBody;
	private final ModelRenderer RexTail1;
	private final ModelRenderer RexTail2;
	private final ModelRenderer RexTail3;
	private final ModelRenderer RexTail4;
	private final ModelRenderer RexLeftArm1;
	private final ModelRenderer RexRightArm1;
	private final ModelRenderer RexLeftLeg1;
	private final ModelRenderer RexLeftLeg2;
	private final ModelRenderer RexLeftLeg3;
	private final ModelRenderer RexRightleg1;
	private final ModelRenderer RexRightleg2;
	private final ModelRenderer RexRightleg3;

	public ModelTyrannosaurus_Rex_SubAdult() {
		textureWidth = 256;
		textureHeight = 256;

		Rexhead = new ModelRenderer(this);
		Rexhead.setRotationPoint(0.0F, -28.0F, -21.0F);
		Rexhead.setTextureOffset(126, 16).addBox(-5.0F, -4.0F, -10.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		RexTopJaw = new ModelRenderer(this);
		RexTopJaw.setRotationPoint(0.0F, -1.0F, -9.0F);
		Rexhead.addChild(RexTopJaw);
		RexTopJaw.setTextureOffset(121, 52).addBox(-4.0F, -2.0F, -10.0F, 8.0F, 6.0F, 10.0F, 0.0F, false);

		RexBottomjaw = new ModelRenderer(this);
		RexBottomjaw.setRotationPoint(0.0F, 1.0F, 0.0F);
		RexTopJaw.addChild(RexBottomjaw);
		RexBottomjaw.setTextureOffset(136, 0).addBox(-3.0F, 3.0F, -9.0F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		RexBottomjaw.setTextureOffset(0, 1).addBox(4.0F, 3.0F, -10.0F, 0.0F, 1.0F, 9.0F, 0.0F, false);
		RexBottomjaw.setTextureOffset(0, 0).addBox(-4.0F, 3.0F, -10.0F, 0.0F, 1.0F, 9.0F, 0.0F, false);
		RexBottomjaw.setTextureOffset(0, 22).addBox(-4.0F, 3.0F, -10.0F, 8.0F, 1.0F, 0.0F, 0.0F, false);

		RexCrest1 = new ModelRenderer(this);
		RexCrest1.setRotationPoint(-5.0F, -7.0F, -12.0F);
		Rexhead.addChild(RexCrest1);
		setRotationAngle(RexCrest1, 0.0F, 0.0F, -0.4363F);
		RexCrest1.setTextureOffset(52, 52).addBox(-1.0F, 3.0F, 1.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		RexCrest2 = new ModelRenderer(this);
		RexCrest2.setRotationPoint(5.0F, -7.0F, -12.0F);
		Rexhead.addChild(RexCrest2);
		setRotationAngle(RexCrest2, 0.0F, 0.0F, 0.3927F);
		RexCrest2.setTextureOffset(0, 13).addBox(-1.0F, 3.0F, 1.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		RexNeck = new ModelRenderer(this);
		RexNeck.setRotationPoint(0.0F, -20.0F, -21.0F);
		setRotationAngle(RexNeck, -0.4363F, 0.0F, 0.0F);
		RexNeck.setTextureOffset(86, 0).addBox(-4.0F, -9.0F, -5.0F, 8.0F, 8.0F, 13.0F, 0.0F, false);

		RexNeck2 = new ModelRenderer(this);
		RexNeck2.setRotationPoint(0.0F, -1.8126F, 11.1548F);
		RexNeck.addChild(RexNeck2);
		setRotationAngle(RexNeck2, 0.3491F, 0.0F, 0.0F);
		RexNeck2.setTextureOffset(141, 107).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 10.0F, 6.0F, 0.0F, false);

		RexBody = new ModelRenderer(this);
		RexBody.setRotationPoint(0.0F, -26.0F, -9.0F);
		RexBody.setTextureOffset(68, 68).addBox(-6.0F, 0.0F, -1.0F, 12.0F, 15.0F, 10.0F, 0.0F, false);
		RexBody.setTextureOffset(0, 0).addBox(-7.0F, 0.0F, 9.0F, 14.0F, 17.0F, 21.0F, 0.0F, false);

		RexTail1 = new ModelRenderer(this);
		RexTail1.setRotationPoint(0.0F, 8.0F, 29.0F);
		RexBody.addChild(RexTail1);
		setRotationAngle(RexTail1, -0.1309F, 0.0F, 0.0F);
		RexTail1.setTextureOffset(0, 48).addBox(-6.0F, -5.8452F, -0.1041F, 12.0F, 13.0F, 10.0F, 0.0F, false);

		RexTail2 = new ModelRenderer(this);
		RexTail2.setRotationPoint(0.0F, -0.5756F, 8.7825F);
		RexTail1.addChild(RexTail2);
		setRotationAngle(RexTail2, 0.0873F, 0.0F, 0.0F);
		RexTail2.setTextureOffset(68, 29).addBox(-4.0F, -4.0066F, -0.2572F, 8.0F, 10.0F, 14.0F, 0.0F, false);

		RexTail3 = new ModelRenderer(this);
		RexTail3.setRotationPoint(0.0F, 2.1687F, 12.7031F);
		RexTail2.addChild(RexTail3);
		setRotationAngle(RexTail3, 0.0873F, 0.0F, 0.0F);
		RexTail3.setTextureOffset(0, 85).addBox(-2.0F, -4.7375F, 0.9058F, 4.0F, 8.0F, 13.0F, 0.0F, false);

		RexTail4 = new ModelRenderer(this);
		RexTail4.setRotationPoint(0.0F, 0.0015F, 12.9552F);
		RexTail3.addChild(RexTail4);
		setRotationAngle(RexTail4, 0.0873F, 0.0F, 0.0F);
		RexTail4.setTextureOffset(0, 121).addBox(-1.0F, -2.3887F, -0.1095F, 2.0F, 5.0F, 8.0F, 0.0F, false);

		RexLeftArm1 = new ModelRenderer(this);
		RexLeftArm1.setRotationPoint(7.0F, 14.0F, 0.0F);
		RexBody.addChild(RexLeftArm1);
		setRotationAngle(RexLeftArm1, 0.4363F, 0.0F, 0.0F);
		RexLeftArm1.setTextureOffset(0, 48).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);

		RexRightArm1 = new ModelRenderer(this);
		RexRightArm1.setRotationPoint(-7.0F, 14.0F, 0.0F);
		RexBody.addChild(RexRightArm1);
		setRotationAngle(RexRightArm1, 0.4363F, 0.0F, 0.0F);
		RexRightArm1.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);

		RexLeftLeg1 = new ModelRenderer(this);
		RexLeftLeg1.setRotationPoint(9.0F, -10.0F, 12.0F);
		RexLeftLeg1.setTextureOffset(95, 106).addBox(-2.0F, -8.0F, -6.0F, 5.0F, 14.0F, 13.0F, 0.0F, false);

		RexLeftLeg2 = new ModelRenderer(this);
		RexLeftLeg2.setRotationPoint(0.0F, 19.0F, 0.0F);
		RexLeftLeg1.addChild(RexLeftLeg2);
		RexLeftLeg2.setTextureOffset(134, 75).addBox(-2.0F, -13.0F, -2.0F, 5.0F, 24.0F, 9.0F, 0.0F, false);

		RexLeftLeg3 = new ModelRenderer(this);
		RexLeftLeg3.setRotationPoint(0.0F, 21.0F, 0.0F);
		RexLeftLeg2.addChild(RexLeftLeg3);
		RexLeftLeg3.setTextureOffset(77, 141).addBox(-2.0F, -10.0F, -6.0F, 5.0F, 4.0F, 13.0F, 0.0F, false);

		RexRightleg1 = new ModelRenderer(this);
		RexRightleg1.setRotationPoint(-13.0F, -10.0F, 12.0F);
		RexRightleg1.setTextureOffset(49, 106).addBox(1.0F, -8.0F, -6.0F, 5.0F, 14.0F, 13.0F, 0.0F, false);

		RexRightleg2 = new ModelRenderer(this);
		RexRightleg2.setRotationPoint(0.0F, 19.0F, 0.0F);
		RexRightleg1.addChild(RexRightleg2);
		RexRightleg2.setTextureOffset(130, 130).addBox(1.0F, -13.0F, -2.0F, 5.0F, 24.0F, 9.0F, 0.0F, false);

		RexRightleg3 = new ModelRenderer(this);
		RexRightleg3.setRotationPoint(0.0F, 21.0F, 0.0F);
		RexRightleg2.addChild(RexRightleg3);
		RexRightleg3.setTextureOffset(31, 141).addBox(1.0F, -10.0F, -6.0F, 5.0F, 4.0F, 13.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Rexhead.render(matrixStack, buffer, packedLight, packedOverlay);
		RexNeck.render(matrixStack, buffer, packedLight, packedOverlay);
		RexBody.render(matrixStack, buffer, packedLight, packedOverlay);
		RexLeftLeg1.render(matrixStack, buffer, packedLight, packedOverlay);
		RexRightleg1.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Rexhead.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Rexhead.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.RexTail1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.RexTail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.RexTail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.RexTail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.RexLeftLeg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.RexRightleg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}