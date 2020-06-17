// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelStegosaurus extends EntityModel<Entity> {
	private final ModelRenderer Stego_Head;
	private final ModelRenderer Stego_Neck;
	private final ModelRenderer Stego_Body;
	private final ModelRenderer Stego_Tail;
	private final ModelRenderer Stego_Tail2;
	private final ModelRenderer Stego_Tail3;
	private final ModelRenderer Stego_Tail4;
	private final ModelRenderer Stego_Leg_Left;
	private final ModelRenderer Stego_Leg2;
	private final ModelRenderer Stego_Leg3;
	private final ModelRenderer Stego_Leg_Right;
	private final ModelRenderer Stego_Leg4;
	private final ModelRenderer Stego_Leg5;
	private final ModelRenderer Stego_Left_BackLeg;
	private final ModelRenderer Stego_Left_BackLeg2;
	private final ModelRenderer Stego_Left_BackLeg3;
	private final ModelRenderer Stego_Right_BackLeg4;
	private final ModelRenderer Stego_Left_BackLeg5;
	private final ModelRenderer Stego_Left_BackLeg6;

	public ModelStegosaurus() {
		textureWidth = 256;
		textureHeight = 256;

		Stego_Head = new ModelRenderer(this);
		Stego_Head.setRotationPoint(0.0F, -2.0F, -26.0F);
		Stego_Head.setTextureOffset(209, 207).addBox(-5.0F, -6.0F, -12.0F, 10.0F, 9.0F, 12.0F, 0.0F, false);
		Stego_Head.setTextureOffset(222, 232).addBox(-3.0F, -4.0F, -21.0F, 6.0F, 7.0F, 9.0F, 0.0F, false);

		Stego_Neck = new ModelRenderer(this);
		Stego_Neck.setRotationPoint(0.0F, -1.0F, -26.0F);
		setRotationAngle(Stego_Neck, -0.5236F, 0.0F, 0.0F);
		Stego_Neck.setTextureOffset(206, 182).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 7.0F, 15.0F, 0.0F, false);

		Stego_Body = new ModelRenderer(this);
		Stego_Body.setRotationPoint(0.0F, 5.0F, -16.0F);
		setRotationAngle(Stego_Body, 0.0873F, 0.0F, 0.0F);
		Stego_Body.setTextureOffset(132, 0).addBox(-10.0F, -9.0F, -2.0F, 20.0F, 17.0F, 42.0F, 0.0F, false);
		Stego_Body.setTextureOffset(78, 0).addBox(-2.0F, -15.2525F, 26.9279F, 1.0F, 6.0F, 12.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(-1.0F, -15.2525F, 28.9279F, 1.0F, 6.0F, 8.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(-3.0F, -15.2525F, 28.9279F, 1.0F, 6.0F, 8.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(-1.0F, -17.3168F, 29.4546F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(-3.0F, -17.3206F, 29.3675F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(-1.0F, -20.3092F, 30.629F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(-3.0F, -20.3092F, 30.629F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		Stego_Body.setTextureOffset(78, 7).addBox(-2.0F, -14.6171F, -0.2308F, 1.0F, 6.0F, 14.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(-1.0F, -14.6171F, 1.7692F, 1.0F, 6.0F, 10.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(2.0F, -14.3931F, 15.8031F, 1.0F, 6.0F, 10.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(0.0F, -14.3931F, 15.8031F, 1.0F, 6.0F, 10.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(-3.0F, -14.6171F, 1.7692F, 1.0F, 6.0F, 10.0F, 0.0F, false);
		Stego_Body.setTextureOffset(78, 0).addBox(1.0F, -14.3931F, 13.8031F, 1.0F, 6.0F, 14.0F, 0.0F, false);
		Stego_Body.setTextureOffset(78, 0).addBox(-2.0F, -17.4949F, 28.3751F, 1.0F, 3.0F, 9.0F, 0.0F, false);
		Stego_Body.setTextureOffset(78, 0).addBox(-2.0F, -17.5943F, 1.2921F, 1.0F, 3.0F, 11.0F, 0.0F, false);
		Stego_Body.setTextureOffset(78, 0).addBox(1.0F, -17.3703F, 15.326F, 1.0F, 3.0F, 11.0F, 0.0F, false);
		Stego_Body.setTextureOffset(78, 0).addBox(-2.0F, -20.4835F, 29.6366F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		Stego_Body.setTextureOffset(78, 0).addBox(-2.0F, -20.5829F, 2.5536F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(-1.0F, -17.5943F, 3.2921F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(2.0F, -17.3703F, 17.326F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(0.0F, -17.3703F, 17.326F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(-3.0F, -17.5943F, 3.2921F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(-1.0F, -20.5829F, 4.5536F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(2.0F, -20.3589F, 18.5875F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(0.0F, -20.3589F, 18.5875F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		Stego_Body.setTextureOffset(114, 240).addBox(-3.0F, -20.5829F, 4.5536F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		Stego_Body.setTextureOffset(78, 0).addBox(1.0F, -20.3589F, 16.5875F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		Stego_Body.setTextureOffset(78, 0).addBox(-2.0F, -22.5631F, 30.8147F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		Stego_Body.setTextureOffset(78, 0).addBox(-2.0F, -22.6624F, 3.7317F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		Stego_Body.setTextureOffset(78, 0).addBox(1.0F, -22.4384F, 17.7656F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		Stego_Tail = new ModelRenderer(this);
		Stego_Tail.setRotationPoint(0.0F, 2.0F, 23.0F);
		setRotationAngle(Stego_Tail, 0.1745F, 0.0F, 0.0F);
		Stego_Tail.setTextureOffset(2, 218).addBox(-7.0F, -8.0F, -1.0F, 14.0F, 14.0F, 24.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(114, 240).addBox(-1.0F, -12.516F, 4.5324F, 1.0F, 5.0F, 6.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(114, 240).addBox(-1.0F, -17.6289F, 5.2422F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(78, 0).addBox(-2.0F, -13.5312F, 3.3588F, 1.0F, 6.0F, 8.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(78, 0).addBox(1.0F, -13.7643F, 13.5542F, 1.0F, 6.0F, 8.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(78, 0).addBox(-2.0F, -19.7265F, 5.1257F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(78, 0).addBox(1.0F, -19.9597F, 15.321F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(114, 240).addBox(0.0F, -17.862F, 15.4376F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(114, 240).addBox(2.0F, -17.862F, 15.4376F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(114, 240).addBox(-3.0F, -17.6289F, 5.2422F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(78, 0).addBox(-2.0F, -17.6137F, 4.4159F, 1.0F, 5.0F, 6.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(78, 0).addBox(1.0F, -17.8468F, 14.6113F, 1.0F, 5.0F, 6.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(114, 240).addBox(0.0F, -12.7491F, 14.7278F, 1.0F, 5.0F, 6.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(114, 240).addBox(2.0F, -12.7491F, 14.7278F, 1.0F, 5.0F, 6.0F, 0.0F, false);
		Stego_Tail.setTextureOffset(114, 240).addBox(-3.0F, -12.516F, 4.5324F, 1.0F, 5.0F, 6.0F, 0.0F, false);

		Stego_Tail2 = new ModelRenderer(this);
		Stego_Tail2.setRotationPoint(0.0F, 0.0F, 24.0F);
		Stego_Tail.addChild(Stego_Tail2);
		setRotationAngle(Stego_Tail2, -0.2618F, 0.0F, 0.0F);
		Stego_Tail2.setTextureOffset(6, 162).addBox(-5.0F, -6.3473F, -2.9696F, 10.0F, 12.0F, 24.0F, 0.0F, false);
		Stego_Tail2.setTextureOffset(78, 0).addBox(-2.0F, -10.9772F, -0.5229F, 1.0F, 5.0F, 6.0F, 0.0F, false);
		Stego_Tail2.setTextureOffset(78, 0).addBox(1.0F, -10.6782F, 7.5338F, 1.0F, 5.0F, 6.0F, 0.0F, false);
		Stego_Tail2.setTextureOffset(78, 0).addBox(-2.0F, -13.9581F, 0.0413F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		Stego_Tail2.setTextureOffset(78, 0).addBox(1.0F, -13.6592F, 8.098F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		Stego_Tail2.setTextureOffset(114, 240).addBox(-3.0F, -12.9581F, 1.0413F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Stego_Tail2.setTextureOffset(114, 240).addBox(-1.0F, -12.9581F, 1.0413F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Stego_Tail2.setTextureOffset(114, 240).addBox(0.0F, -12.6554F, 9.0108F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Stego_Tail2.setTextureOffset(114, 240).addBox(2.0F, -12.6554F, 9.0108F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Stego_Tail2.setTextureOffset(114, 240).addBox(-3.0F, -10.9772F, 0.4771F, 1.0F, 5.0F, 4.0F, 0.0F, false);
		Stego_Tail2.setTextureOffset(114, 240).addBox(-1.0F, -10.9772F, 0.4771F, 1.0F, 5.0F, 4.0F, 0.0F, false);
		Stego_Tail2.setTextureOffset(114, 240).addBox(0.0F, -10.6782F, 8.5338F, 1.0F, 5.0F, 4.0F, 0.0F, false);
		Stego_Tail2.setTextureOffset(114, 240).addBox(2.0F, -10.6782F, 8.5338F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		Stego_Tail3 = new ModelRenderer(this);
		Stego_Tail3.setRotationPoint(0.0F, 0.0342F, 20.1221F);
		Stego_Tail2.addChild(Stego_Tail3);
		setRotationAngle(Stego_Tail3, 0.4363F, 0.0F, 0.0F);
		Stego_Tail3.setTextureOffset(4, 120).addBox(-4.0F, -5.1472F, -2.6383F, 8.0F, 10.0F, 24.0F, 0.0F, false);
		Stego_Tail3.setTextureOffset(114, 240).addBox(-2.0F, -8.924F, 1.8682F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		Stego_Tail3.setTextureOffset(114, 240).addBox(0.0F, -7.7085F, 8.7619F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		Stego_Tail3.setTextureOffset(114, 240).addBox(-2.0F, -6.493F, 15.6555F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		Stego_Tail4 = new ModelRenderer(this);
		Stego_Tail4.setRotationPoint(0.0F, -2.1741F, 21.7037F);
		Stego_Tail3.addChild(Stego_Tail4);
		setRotationAngle(Stego_Tail4, 0.1745F, 0.0F, 0.0F);
		Stego_Tail4.setTextureOffset(0, 82).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 7.0F, 24.0F, 0.0F, false);
		Stego_Tail4.setTextureOffset(0, 0).addBox(2.0F, 2.2498F, 18.7229F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		Stego_Tail4.setTextureOffset(0, 0).addBox(-6.0F, 2.2498F, 18.7229F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		Stego_Tail4.setTextureOffset(0, 0).addBox(2.0F, 1.3815F, 13.7989F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		Stego_Tail4.setTextureOffset(0, 0).addBox(-6.0F, 1.3815F, 13.7989F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		Stego_Tail4.setTextureOffset(0, 0).addBox(6.0F, 3.2498F, 19.7229F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		Stego_Tail4.setTextureOffset(0, 0).addBox(-14.0F, 3.2498F, 19.7229F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		Stego_Tail4.setTextureOffset(0, 0).addBox(6.0F, 2.3815F, 14.7989F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		Stego_Tail4.setTextureOffset(0, 0).addBox(-14.0F, 2.3815F, 14.7989F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		Stego_Tail4.setTextureOffset(0, 0).addBox(14.0F, 4.2498F, 20.7229F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Stego_Tail4.setTextureOffset(0, 0).addBox(-19.0F, 4.2498F, 20.7229F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Stego_Tail4.setTextureOffset(0, 0).addBox(14.0F, 3.3815F, 15.7989F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Stego_Tail4.setTextureOffset(0, 0).addBox(-19.0F, 3.3815F, 15.7989F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		Stego_Leg_Left = new ModelRenderer(this);
		Stego_Leg_Left.setRotationPoint(10.0F, 10.0F, -13.0F);
		Stego_Leg_Left.setTextureOffset(225, 144).addBox(-5.0F, -5.0F, -2.0F, 6.0F, 8.0F, 7.0F, 0.0F, false);

		Stego_Leg2 = new ModelRenderer(this);
		Stego_Leg2.setRotationPoint(0.0F, 6.0F, -2.0F);
		Stego_Leg_Left.addChild(Stego_Leg2);
		setRotationAngle(Stego_Leg2, -0.2618F, 0.0F, 0.0F);
		Stego_Leg2.setTextureOffset(190, 145).addBox(-5.0F, -5.0F, 0.0F, 6.0F, 9.0F, 5.0F, 0.0F, false);

		Stego_Leg3 = new ModelRenderer(this);
		Stego_Leg3.setRotationPoint(0.0F, 12.0F, 0.0F);
		Stego_Leg_Left.addChild(Stego_Leg3);
		Stego_Leg3.setTextureOffset(165, 151).addBox(-5.0F, -2.0F, -3.0F, 6.0F, 4.0F, 5.0F, 0.0F, false);

		Stego_Leg_Right = new ModelRenderer(this);
		Stego_Leg_Right.setRotationPoint(-6.0F, 10.0F, -13.0F);
		Stego_Leg_Right.setTextureOffset(224, 168).addBox(-5.0F, -5.0F, -2.0F, 6.0F, 8.0F, 7.0F, 0.0F, false);

		Stego_Leg4 = new ModelRenderer(this);
		Stego_Leg4.setRotationPoint(0.0F, 6.0F, -2.0F);
		Stego_Leg_Right.addChild(Stego_Leg4);
		setRotationAngle(Stego_Leg4, -0.2618F, 0.0F, 0.0F);
		Stego_Leg4.setTextureOffset(201, 168).addBox(-5.0F, -5.0F, 0.0F, 6.0F, 9.0F, 5.0F, 0.0F, false);

		Stego_Leg5 = new ModelRenderer(this);
		Stego_Leg5.setRotationPoint(0.0F, 12.0F, 0.0F);
		Stego_Leg_Right.addChild(Stego_Leg5);
		Stego_Leg5.setTextureOffset(168, 168).addBox(-5.0F, -2.0F, -3.0F, 6.0F, 4.0F, 5.0F, 0.0F, false);

		Stego_Left_BackLeg = new ModelRenderer(this);
		Stego_Left_BackLeg.setRotationPoint(11.0F, 6.0F, 16.0F);
		Stego_Left_BackLeg.setTextureOffset(222, 122).addBox(-7.0F, -7.0F, -5.0F, 7.0F, 12.0F, 10.0F, 0.0F, false);

		Stego_Left_BackLeg2 = new ModelRenderer(this);
		Stego_Left_BackLeg2.setRotationPoint(0.0F, 11.0F, -2.0F);
		Stego_Left_BackLeg.addChild(Stego_Left_BackLeg2);
		setRotationAngle(Stego_Left_BackLeg2, -0.1745F, 0.0F, 0.0F);
		Stego_Left_BackLeg2.setTextureOffset(193, 125).addBox(-7.0F, -7.0F, -3.0F, 7.0F, 9.0F, 8.0F, 0.0F, false);

		Stego_Left_BackLeg3 = new ModelRenderer(this);
		Stego_Left_BackLeg3.setRotationPoint(0.0F, 14.0F, 0.0F);
		Stego_Left_BackLeg.addChild(Stego_Left_BackLeg3);
		Stego_Left_BackLeg3.setTextureOffset(152, 123).addBox(-7.0F, -2.0F, -5.0F, 7.0F, 6.0F, 7.0F, 0.0F, false);

		Stego_Right_BackLeg4 = new ModelRenderer(this);
		Stego_Right_BackLeg4.setRotationPoint(-4.0F, 6.0F, 16.0F);
		Stego_Right_BackLeg4.setTextureOffset(218, 72).addBox(-7.0F, -7.0F, -5.0F, 7.0F, 12.0F, 10.0F, 0.0F, false);

		Stego_Left_BackLeg5 = new ModelRenderer(this);
		Stego_Left_BackLeg5.setRotationPoint(0.0F, 11.0F, -2.0F);
		Stego_Right_BackLeg4.addChild(Stego_Left_BackLeg5);
		setRotationAngle(Stego_Left_BackLeg5, -0.1745F, 0.0F, 0.0F);
		Stego_Left_BackLeg5.setTextureOffset(185, 75).addBox(-7.0F, -7.0F, -3.0F, 7.0F, 9.0F, 8.0F, 0.0F, false);

		Stego_Left_BackLeg6 = new ModelRenderer(this);
		Stego_Left_BackLeg6.setRotationPoint(0.0F, 14.0F, 0.0F);
		Stego_Right_BackLeg4.addChild(Stego_Left_BackLeg6);
		Stego_Left_BackLeg6.setTextureOffset(150, 88).addBox(-7.0F, -2.0F, -5.0F, 7.0F, 6.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Stego_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Stego_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Stego_Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Stego_Tail.render(matrixStack, buffer, packedLight, packedOverlay);
		Stego_Leg_Left.render(matrixStack, buffer, packedLight, packedOverlay);
		Stego_Leg_Right.render(matrixStack, buffer, packedLight, packedOverlay);
		Stego_Left_BackLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		Stego_Right_BackLeg4.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Stego_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Stego_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Stego_Leg_Left.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Stego_Leg_Right.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Stego_Tail2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Stego_Tail4.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Stego_Tail3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Stego_Right_BackLeg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Stego_Tail.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Stego_Left_BackLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}