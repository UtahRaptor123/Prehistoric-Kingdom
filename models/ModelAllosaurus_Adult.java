// Made with Blockbench 3.7.3
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelAllosaurus_Adult extends EntityModel<Entity> {
	private final ModelRenderer AlloHead;
	private final ModelRenderer AlloJaw;
	private final ModelRenderer AlloCrest2;
	private final ModelRenderer AlloCrest1;
	private final ModelRenderer AlloNeck;
	private final ModelRenderer AlloNeck2;
	private final ModelRenderer AlloBody;
	private final ModelRenderer AlloBody2;
	private final ModelRenderer AlloTail;
	private final ModelRenderer AlloTail2;
	private final ModelRenderer AlloTail3;
	private final ModelRenderer AlloTail4;
	private final ModelRenderer AlloLeftArm;
	private final ModelRenderer AlloLeftArm2;
	private final ModelRenderer AlloRightArm;
	private final ModelRenderer AlloRightArm2;
	private final ModelRenderer AlloLeftLeg;
	private final ModelRenderer AlloLeftLeg2;
	private final ModelRenderer AlloLeftFoot;
	private final ModelRenderer AlloRightLeg;
	private final ModelRenderer AlloRightLeg2;
	private final ModelRenderer AlloRightFoot;

	public ModelAllosaurus_Adult() {
		textureWidth = 256;
		textureHeight = 256;

		AlloHead = new ModelRenderer(this);
		AlloHead.setRotationPoint(0.0F, -12.0F, -12.0F);
		setRotationAngle(AlloHead, 0.0873F, 0.0F, 0.0F);
		AlloHead.setTextureOffset(99, 25).addBox(-4.0F, -4.0F, -6.0F, 8.0F, 9.0F, 6.0F, 0.0F, false);
		AlloHead.setTextureOffset(50, 97).addBox(-3.5F, -3.0F, -13.6F, 7.0F, 6.0F, 8.0F, 0.0F, false);

		AlloJaw = new ModelRenderer(this);
		AlloJaw.setRotationPoint(0.0F, 3.9F, -5.0F);
		AlloHead.addChild(AlloJaw);
		AlloJaw.setTextureOffset(98, 66).addBox(-3.0F, -1.0F, -8.0F, 6.0F, 2.0F, 8.0F, 0.0F, false);

		AlloCrest2 = new ModelRenderer(this);
		AlloCrest2.setRotationPoint(2.7F, -4.0F, -8.0F);
		AlloHead.addChild(AlloCrest2);
		setRotationAngle(AlloCrest2, 0.48F, 0.0F, 0.2182F);
		AlloCrest2.setTextureOffset(115, 0).addBox(0.0F, 0.0F, -3.0F, 1.0F, 3.0F, 7.0F, 0.0F, false);

		AlloCrest1 = new ModelRenderer(this);
		AlloCrest1.setRotationPoint(-2.8F, -4.0F, -8.0F);
		AlloHead.addChild(AlloCrest1);
		setRotationAngle(AlloCrest1, 0.48F, 0.0F, -0.2182F);
		AlloCrest1.setTextureOffset(113, 92).addBox(-0.9F, 0.0F, -3.0F, 1.0F, 3.0F, 7.0F, 0.0F, false);

		AlloNeck = new ModelRenderer(this);
		AlloNeck.setRotationPoint(-0.5F, -11.0F, -12.0F);
		setRotationAngle(AlloNeck, -0.3927F, 0.0F, 0.0F);
		AlloNeck.setTextureOffset(50, 112).addBox(-3.0F, -4.0F, -2.0F, 7.0F, 8.0F, 4.0F, 0.0F, false);

		AlloNeck2 = new ModelRenderer(this);
		AlloNeck2.setRotationPoint(0.1F, 1.2409F, 4.8436F);
		AlloNeck.addChild(AlloNeck2);
		setRotationAngle(AlloNeck2, -0.3927F, 0.0F, 0.0F);
		AlloNeck2.setTextureOffset(87, 47).addBox(-3.1F, -3.6538F, -4.5327F, 7.0F, 8.0F, 10.0F, 0.1F, false);

		AlloBody = new ModelRenderer(this);
		AlloBody.setRotationPoint(0.0F, -8.0F, -7.6F);
		setRotationAngle(AlloBody, 0.0873F, 0.0F, 0.0F);
		AlloBody.setTextureOffset(81, 107).addBox(-4.0F, -4.4109F, -0.5602F, 8.0F, 12.0F, 3.0F, 0.0F, false);
		AlloBody.setTextureOffset(0, 66).addBox(-6.0F, -4.4109F, 2.4398F, 12.0F, 15.0F, 9.0F, 0.0F, false);

		AlloBody2 = new ModelRenderer(this);
		AlloBody2.setRotationPoint(0.0F, 2.565F, 17.8443F);
		AlloBody.addChild(AlloBody2);
		setRotationAngle(AlloBody2, -0.2618F, 0.0F, 0.0F);
		AlloBody2.setTextureOffset(0, 0).addBox(-7.0F, -5.1058F, -7.9732F, 14.0F, 16.0F, 17.0F, 0.0F, false);

		AlloTail = new ModelRenderer(this);
		AlloTail.setRotationPoint(0.0F, 3.7085F, 7.7619F);
		AlloBody2.addChild(AlloTail);
		setRotationAngle(AlloTail, 0.0873F, 0.0F, 0.0F);
		AlloTail.setTextureOffset(0, 34).addBox(-6.0F, -7.8081F, -0.279F, 12.0F, 14.0F, 15.0F, 0.0F, false);

		AlloTail2 = new ModelRenderer(this);
		AlloTail2.setRotationPoint(0.0F, 0.394F, 13.9084F);
		AlloTail.addChild(AlloTail2);
		setRotationAngle(AlloTail2, 0.0873F, 0.0F, 0.0F);
		AlloTail2.setTextureOffset(48, 19).addBox(-5.0F, -7.1572F, -0.6086F, 10.0F, 12.0F, 15.0F, 0.0F, false);

		AlloTail3 = new ModelRenderer(this);
		AlloTail3.setRotationPoint(0.0F, -1.0F, 14.0F);
		AlloTail2.addChild(AlloTail3);
		setRotationAngle(AlloTail3, 0.0873F, 0.0F, 0.0F);
		AlloTail3.setTextureOffset(40, 49).addBox(-4.0F, -5.2324F, -1.1155F, 8.0F, 10.0F, 15.0F, 0.0F, false);

		AlloTail4 = new ModelRenderer(this);
		AlloTail4.setRotationPoint(0.5F, -1.0053F, 12.778F);
		AlloTail3.addChild(AlloTail4);
		setRotationAngle(AlloTail4, 0.1745F, 0.0F, 0.0F);
		AlloTail4.setTextureOffset(43, 75).addBox(-4.0F, -3.4602F, -0.2365F, 7.0F, 9.0F, 12.0F, 0.0F, false);

		AlloLeftArm = new ModelRenderer(this);
		AlloLeftArm.setRotationPoint(4.0F, 0.0F, -2.0F);
		AlloLeftArm.setTextureOffset(104, 107).addBox(0.0F, -5.0F, -2.0F, 4.0F, 8.0F, 6.0F, 0.0F, false);

		AlloLeftArm2 = new ModelRenderer(this);
		AlloLeftArm2.setRotationPoint(2.0F, 8.0F, 0.0F);
		AlloLeftArm.addChild(AlloLeftArm2);
		setRotationAngle(AlloLeftArm2, -0.3054F, 0.0F, 0.0F);
		AlloLeftArm2.setTextureOffset(112, 41).addBox(-1.5F, -5.9714F, -2.6887F, 3.0F, 8.0F, 5.0F, 0.0F, false);

		AlloRightArm = new ModelRenderer(this);
		AlloRightArm.setRotationPoint(-6.0F, 0.0F, -2.0F);
		AlloRightArm.setTextureOffset(104, 77).addBox(-4.0F, -5.0F, -2.0F, 4.0F, 8.0F, 6.0F, 0.0F, false);

		AlloRightArm2 = new ModelRenderer(this);
		AlloRightArm2.setRotationPoint(-2.0F, 8.0F, 0.0F);
		AlloRightArm.addChild(AlloRightArm2);
		setRotationAngle(AlloRightArm2, -0.3054F, 0.0F, 0.0F);
		AlloRightArm2.setTextureOffset(0, 0).addBox(-1.5F, -5.9714F, -2.6887F, 3.0F, 8.0F, 5.0F, 0.0F, false);

		AlloLeftLeg = new ModelRenderer(this);
		AlloLeftLeg.setRotationPoint(7.0F, 1.0F, 11.0F);
		AlloLeftLeg.setTextureOffset(84, 0).addBox(-2.0F, -7.0F, -4.0F, 5.0F, 14.0F, 10.0F, 0.0F, false);

		AlloLeftLeg2 = new ModelRenderer(this);
		AlloLeftLeg2.setRotationPoint(0.5F, 4.0F, 1.1F);
		AlloLeftLeg.addChild(AlloLeftLeg2);
		setRotationAngle(AlloLeftLeg2, -0.2182F, 0.0F, 0.0F);
		AlloLeftLeg2.setTextureOffset(25, 91).addBox(-2.0F, 1.0F, -3.0F, 4.0F, 17.0F, 8.0F, 0.0F, false);

		AlloLeftFoot = new ModelRenderer(this);
		AlloLeftFoot.setRotationPoint(0.0F, 23.0F, 0.0F);
		AlloLeftLeg.addChild(AlloLeftFoot);
		AlloLeftFoot.setTextureOffset(75, 66).addBox(-2.0F, -3.0F, -9.0F, 5.0F, 3.0F, 12.0F, 0.0F, false);

		AlloRightLeg = new ModelRenderer(this);
		AlloRightLeg.setRotationPoint(-8.0F, 1.0F, 11.0F);
		AlloRightLeg.setTextureOffset(82, 82).addBox(-2.0F, -7.0F, -4.0F, 5.0F, 14.0F, 10.0F, 0.0F, false);

		AlloRightLeg2 = new ModelRenderer(this);
		AlloRightLeg2.setRotationPoint(0.5F, 4.0F, 1.1F);
		AlloRightLeg.addChild(AlloRightLeg2);
		setRotationAngle(AlloRightLeg2, -0.2182F, 0.0F, 0.0F);
		AlloRightLeg2.setTextureOffset(0, 91).addBox(-2.0F, 1.0F, -3.0F, 4.0F, 17.0F, 8.0F, 0.0F, false);

		AlloRightFoot = new ModelRenderer(this);
		AlloRightFoot.setRotationPoint(0.0F, 23.0F, 0.0F);
		AlloRightLeg.addChild(AlloRightFoot);
		AlloRightFoot.setTextureOffset(46, 0).addBox(-2.0F, -3.0F, -9.0F, 5.0F, 3.0F, 12.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		AlloHead.render(matrixStack, buffer, packedLight, packedOverlay);
		AlloNeck.render(matrixStack, buffer, packedLight, packedOverlay);
		AlloBody.render(matrixStack, buffer, packedLight, packedOverlay);
		AlloLeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		AlloRightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		AlloLeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		AlloRightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.AlloTail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.AlloTail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.AlloTail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.AlloTail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.AlloLeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.AlloHead.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.AlloHead.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.AlloRightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}