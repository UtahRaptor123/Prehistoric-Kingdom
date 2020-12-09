// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelBaryonyx_Adult_ extends EntityModel<Entity> {
	private final ModelRenderer BaryNeck;
	private final ModelRenderer BaryNeck2;
	private final ModelRenderer BaryHead;
	private final ModelRenderer BarySnout;
	private final ModelRenderer BaryJaw;
	private final ModelRenderer BaryCrest;
	private final ModelRenderer BaryBody;
	private final ModelRenderer BaryBody2;
	private final ModelRenderer BaryBody3;
	private final ModelRenderer BaryLeftLeg;
	private final ModelRenderer BaryLeftLeg2;
	private final ModelRenderer BaryLeftFoot;
	private final ModelRenderer BaryRightLeg;
	private final ModelRenderer BaryRightLeg2;
	private final ModelRenderer BaryRightFoot;
	private final ModelRenderer BaryLeftArm;
	private final ModelRenderer BaryLeftArm2;
	private final ModelRenderer BaryLeftArm3;
	private final ModelRenderer BaryRightArm;
	private final ModelRenderer BaryRightArm2;
	private final ModelRenderer BaryRightArm3;
	private final ModelRenderer BaryTail;
	private final ModelRenderer BaryTail2;
	private final ModelRenderer BaryTail3;

	public ModelBaryonyx_Adult_() {
		textureWidth = 128;
		textureHeight = 128;

		BaryNeck = new ModelRenderer(this);
		BaryNeck.setRotationPoint(0.0F, -9.8F, -7.0F);
		setRotationAngle(BaryNeck, -0.9599F, 0.0F, 0.0F);
		BaryNeck.setTextureOffset(82, 12).addBox(-2.5F, -1.0F, 0.0F, 5.0F, 6.0F, 8.0F, 0.0F, false);

		BaryNeck2 = new ModelRenderer(this);
		BaryNeck2.setRotationPoint(0.0F, -1.9646F, 11.1418F);
		BaryNeck.addChild(BaryNeck2);
		setRotationAngle(BaryNeck2, 0.3927F, 0.0F, 0.0F);
		BaryNeck2.setTextureOffset(84, 26).addBox(-3.0F, -0.7679F, -5.5679F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		BaryHead = new ModelRenderer(this);
		BaryHead.setRotationPoint(-0.5F, 6.6197F, -0.6062F);
		BaryNeck.addChild(BaryHead);
		setRotationAngle(BaryHead, 1.1345F, 0.0F, 0.0F);
		BaryHead.setTextureOffset(0, 81).addBox(-2.5F, -3.2964F, 2.0692F, 6.0F, 8.0F, 5.0F, 0.0F, false);
		BaryHead.setTextureOffset(25, 59).addBox(-2.0F, -2.2964F, -7.9308F, 5.0F, 5.0F, 11.0F, 0.0F, false);

		BarySnout = new ModelRenderer(this);
		BarySnout.setRotationPoint(0.0F, -9.0F, -5.0F);
		BaryHead.addChild(BarySnout);
		setRotationAngle(BarySnout, 0.0873F, 0.0F, 0.0F);
		BarySnout.setTextureOffset(0, 68).addBox(-1.5F, 6.5509F, -2.6F, 4.0F, 2.0F, 11.0F, 0.0F, false);

		BaryJaw = new ModelRenderer(this);
		BaryJaw.setRotationPoint(0.0F, 4.0F, 2.3F);
		BaryHead.addChild(BaryJaw);
		BaryJaw.setTextureOffset(63, 27).addBox(-2.0F, -1.2843F, -9.2791F, 5.0F, 2.0F, 11.0F, -0.01F, false);
		BaryJaw.setTextureOffset(0, 98).addBox(-2.0F, -3.3043F, -9.2791F, 5.0F, 2.0F, 11.0F, -0.01F, false);

		BaryCrest = new ModelRenderer(this);
		BaryCrest.setRotationPoint(0.4F, -7.0F, -7.0F);
		BaryHead.addChild(BaryCrest);
		setRotationAngle(BaryCrest, 0.3927F, 0.0F, 0.0F);
		BaryCrest.setTextureOffset(0, 0).addBox(-0.5F, 5.6681F, 2.8072F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		BaryBody = new ModelRenderer(this);
		BaryBody.setRotationPoint(0.0F, -2.0F, -2.4F);
		setRotationAngle(BaryBody, 0.1745F, 0.0F, 0.0F);
		BaryBody.setTextureOffset(83, 53).addBox(-4.0F, -4.7015F, 0.0826F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		BaryBody2 = new ModelRenderer(this);
		BaryBody2.setRotationPoint(0.0F, 0.0F, 3.0F);
		BaryBody.addChild(BaryBody2);
		setRotationAngle(BaryBody2, -0.0873F, 0.0F, 0.0F);
		BaryBody2.setTextureOffset(34, 15).addBox(-5.0F, -4.8F, 0.1F, 10.0F, 13.0F, 10.0F, 0.0F, false);

		BaryBody3 = new ModelRenderer(this);
		BaryBody3.setRotationPoint(0.0F, 0.0996F, 9.9913F);
		BaryBody2.addChild(BaryBody3);
		setRotationAngle(BaryBody3, -0.2182F, 0.0F, 0.0F);
		BaryBody3.setTextureOffset(0, 0).addBox(-5.5F, -4.8F, -0.9F, 11.0F, 14.0F, 11.0F, 0.0F, false);

		BaryLeftLeg = new ModelRenderer(this);
		BaryLeftLeg.setRotationPoint(5.0F, 2.0F, 13.0F);
		BaryLeftLeg.setTextureOffset(64, 0).addBox(-1.0F, -4.0F, -3.0F, 4.0F, 11.0F, 9.0F, 0.0F, false);

		BaryLeftLeg2 = new ModelRenderer(this);
		BaryLeftLeg2.setRotationPoint(1.5F, 6.3F, 3.0F);
		BaryLeftLeg.addChild(BaryLeftLeg2);
		setRotationAngle(BaryLeftLeg2, -0.1745F, 0.0F, 0.0F);
		BaryLeftLeg2.setTextureOffset(43, 75).addBox(-2.0F, 0.0F, -4.0F, 3.0F, 14.0F, 7.0F, 0.0F, false);

		BaryLeftFoot = new ModelRenderer(this);
		BaryLeftFoot.setRotationPoint(0.0F, 21.0F, -0.2F);
		BaryLeftLeg.addChild(BaryLeftFoot);
		BaryLeftFoot.setTextureOffset(73, 73).addBox(-1.0F, -2.0F, -6.0F, 4.0F, 3.0F, 10.0F, 0.0F, false);

		BaryRightLeg = new ModelRenderer(this);
		BaryRightLeg.setRotationPoint(-7.0F, 2.0F, 13.0F);
		BaryRightLeg.setTextureOffset(57, 59).addBox(-1.0F, -4.0F, -3.0F, 4.0F, 11.0F, 9.0F, 0.0F, false);

		BaryRightLeg2 = new ModelRenderer(this);
		BaryRightLeg2.setRotationPoint(1.5F, 6.3F, 3.0F);
		BaryRightLeg.addChild(BaryRightLeg2);
		setRotationAngle(BaryRightLeg2, -0.1745F, 0.0F, 0.0F);
		BaryRightLeg2.setTextureOffset(23, 75).addBox(-2.0F, 0.0F, -4.0F, 3.0F, 14.0F, 7.0F, 0.0F, false);

		BaryRightFoot = new ModelRenderer(this);
		BaryRightFoot.setRotationPoint(0.0F, 21.0F, -0.2F);
		BaryRightLeg.addChild(BaryRightFoot);
		BaryRightFoot.setTextureOffset(70, 40).addBox(-1.0F, -2.0F, -6.0F, 4.0F, 3.0F, 10.0F, 0.0F, false);

		BaryLeftArm = new ModelRenderer(this);
		BaryLeftArm.setRotationPoint(5.0F, 2.0F, 0.3F);
		BaryLeftArm.setTextureOffset(90, 0).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 5.0F, 0.0F, false);

		BaryLeftArm2 = new ModelRenderer(this);
		BaryLeftArm2.setRotationPoint(0.5F, 4.0F, 1.0F);
		BaryLeftArm.addChild(BaryLeftArm2);
		setRotationAngle(BaryLeftArm2, 0.4363F, 0.0F, 0.0F);
		BaryLeftArm2.setTextureOffset(45, 0).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		BaryLeftArm3 = new ModelRenderer(this);
		BaryLeftArm3.setRotationPoint(0.0F, 10.7F, 2.9F);
		BaryLeftArm.addChild(BaryLeftArm3);
		setRotationAngle(BaryLeftArm3, 0.3054F, 0.0F, 0.0F);
		BaryLeftArm3.setTextureOffset(63, 86).addBox(-1.5F, -4.348F, -5.3229F, 2.0F, 3.0F, 8.0F, -0.1F, false);

		BaryRightArm = new ModelRenderer(this);
		BaryRightArm.setRotationPoint(-4.0F, 2.0F, 0.3F);
		BaryRightArm.setTextureOffset(83, 86).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 5.0F, 0.0F, false);

		BaryRightArm2 = new ModelRenderer(this);
		BaryRightArm2.setRotationPoint(0.5F, 4.0F, 1.0F);
		BaryRightArm.addChild(BaryRightArm2);
		setRotationAngle(BaryRightArm2, 0.4363F, 0.0F, 0.0F);
		BaryRightArm2.setTextureOffset(0, 25).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);

		BaryRightArm3 = new ModelRenderer(this);
		BaryRightArm3.setRotationPoint(0.0F, 10.7F, 2.9F);
		BaryRightArm.addChild(BaryRightArm3);
		setRotationAngle(BaryRightArm3, 0.3054F, 0.0F, 0.0F);
		BaryRightArm3.setTextureOffset(33, 0).addBox(-1.5F, -4.348F, -5.3229F, 2.0F, 3.0F, 8.0F, -0.1F, false);

		BaryTail = new ModelRenderer(this);
		BaryTail.setRotationPoint(0.0F, 0.0F, 19.0F);
		setRotationAngle(BaryTail, -0.0873F, 0.0F, 0.0F);
		BaryTail.setTextureOffset(32, 38).addBox(-5.0F, -6.0F, 0.0F, 9.0F, 11.0F, 10.0F, 0.0F, false);

		BaryTail2 = new ModelRenderer(this);
		BaryTail2.setRotationPoint(0.0F, 0.0F, 10.0F);
		BaryTail.addChild(BaryTail2);
		setRotationAngle(BaryTail2, 0.0436F, 0.0F, 0.0F);
		BaryTail2.setTextureOffset(0, 25).addBox(-4.0F, -5.0F, -1.0F, 7.0F, 9.0F, 14.0F, 0.0F, false);

		BaryTail3 = new ModelRenderer(this);
		BaryTail3.setRotationPoint(0.0F, 0.0F, 12.0F);
		BaryTail2.addChild(BaryTail3);
		setRotationAngle(BaryTail3, 0.0873F, 0.0F, 0.0F);
		BaryTail3.setTextureOffset(0, 48).addBox(-3.0F, -4.0F, 0.0F, 5.0F, 7.0F, 13.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		BaryNeck.render(matrixStack, buffer, packedLight, packedOverlay);
		BaryBody.render(matrixStack, buffer, packedLight, packedOverlay);
		BaryLeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		BaryRightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		BaryLeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		BaryRightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		BaryTail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.BaryTail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.BaryLeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.BaryTail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.BaryTail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.BaryRightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.BaryHead.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.BaryHead.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}