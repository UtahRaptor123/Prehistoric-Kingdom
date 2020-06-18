// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelCeratosaurus extends EntityModel<Entity> {
	private final ModelRenderer Cerato_Left_Arm2;
	private final ModelRenderer Cerato_ArmBend3;
	private final ModelRenderer Cerato_ArmHand3;
	private final ModelRenderer Cerato_Arm_Claw3;
	private final ModelRenderer Cerato_Right_Arm;
	private final ModelRenderer Cerato_ArmBend2;
	private final ModelRenderer Cerato_ArmHand2;
	private final ModelRenderer Cerato_Arm_Claw2;
	private final ModelRenderer Cerato_Left_Leg;
	private final ModelRenderer Cerato_LongMusle;
	private final ModelRenderer Cerato_LowerMusle;
	private final ModelRenderer Cerato_Foot;
	private final ModelRenderer Cerato_Right_Leg2;
	private final ModelRenderer Cerato_LongMusle2;
	private final ModelRenderer Cerato_LowerMusle2;
	private final ModelRenderer Cerato_Foot2;
	private final ModelRenderer Cerato_Head2;
	private final ModelRenderer Cerato_Bottom_Jaw;
	private final ModelRenderer Cerato_Neck2;
	private final ModelRenderer Cerato_Body2;
	private final ModelRenderer Cerato_Tail2;
	private final ModelRenderer Cerato_Tail3;
	private final ModelRenderer Cerato_Tail4;
	private final ModelRenderer Cerato_Tail5;

	public ModelCeratosaurus() {
		textureWidth = 256;
		textureHeight = 256;

		Cerato_Left_Arm2 = new ModelRenderer(this);
		Cerato_Left_Arm2.setRotationPoint(6.0F, 0.0F, -6.0001F);
		setRotationAngle(Cerato_Left_Arm2, 0.0F, 3.1416F, 0.0F);
		Cerato_Left_Arm2.setTextureOffset(77, 246).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		Cerato_ArmBend3 = new ModelRenderer(this);
		Cerato_ArmBend3.setRotationPoint(0.0F, 4.0F, 0.0F);
		Cerato_Left_Arm2.addChild(Cerato_ArmBend3);
		setRotationAngle(Cerato_ArmBend3, 0.7854F, 0.0F, 0.0F);
		Cerato_ArmBend3.setTextureOffset(75, 230).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 10.0F, 4.0F, 0.0F, false);

		Cerato_ArmHand3 = new ModelRenderer(this);
		Cerato_ArmHand3.setRotationPoint(0.0F, 8.0F, 7.0F);
		Cerato_Left_Arm2.addChild(Cerato_ArmHand3);
		Cerato_ArmHand3.setTextureOffset(70, 209).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		Cerato_ArmHand3.setTextureOffset(0, 0).addBox(2.0F, 0.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_ArmHand3.setTextureOffset(0, 0).addBox(2.0F, 1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_ArmHand3.setTextureOffset(0, 0).addBox(2.0F, 3.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Cerato_Arm_Claw3 = new ModelRenderer(this);
		Cerato_Arm_Claw3.setRotationPoint(-1.0F, 11.0F, 8.0F);
		Cerato_Left_Arm2.addChild(Cerato_Arm_Claw3);
		setRotationAngle(Cerato_Arm_Claw3, -0.5236F, 0.0F, 0.0F);

		Cerato_Right_Arm = new ModelRenderer(this);
		Cerato_Right_Arm.setRotationPoint(-5.0F, 0.0F, -6.0F);
		setRotationAngle(Cerato_Right_Arm, 0.0F, 3.1416F, 0.0F);
		Cerato_Right_Arm.setTextureOffset(167, 83).addBox(1.0F, -2.0F, -2.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		Cerato_ArmBend2 = new ModelRenderer(this);
		Cerato_ArmBend2.setRotationPoint(0.0F, 4.0F, 0.0F);
		Cerato_Right_Arm.addChild(Cerato_ArmBend2);
		setRotationAngle(Cerato_ArmBend2, 0.7854F, 0.0F, 0.0F);
		Cerato_ArmBend2.setTextureOffset(169, 56).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 10.0F, 4.0F, 0.0F, false);

		Cerato_ArmHand2 = new ModelRenderer(this);
		Cerato_ArmHand2.setRotationPoint(0.0F, 8.0F, 7.0F);
		Cerato_Right_Arm.addChild(Cerato_ArmHand2);
		Cerato_ArmHand2.setTextureOffset(152, 64).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		Cerato_ArmHand2.setTextureOffset(0, 0).addBox(-3.0F, 3.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_ArmHand2.setTextureOffset(0, 0).addBox(-3.0F, 0.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_ArmHand2.setTextureOffset(0, 0).addBox(-3.0F, 1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Cerato_Arm_Claw2 = new ModelRenderer(this);
		Cerato_Arm_Claw2.setRotationPoint(-1.0F, 11.0F, 8.0F);
		Cerato_Right_Arm.addChild(Cerato_Arm_Claw2);
		setRotationAngle(Cerato_Arm_Claw2, -0.5236F, 0.0F, 0.0F);

		Cerato_Left_Leg = new ModelRenderer(this);
		Cerato_Left_Leg.setRotationPoint(6.0F, 2.0F, 10.0F);
		setRotationAngle(Cerato_Left_Leg, 0.0F, 3.1416F, 0.0F);
		Cerato_Left_Leg.setTextureOffset(0, 36).addBox(-1.0F, -11.0F, -7.0F, 1.0F, 13.0F, 10.0F, 0.0F, false);

		Cerato_LongMusle = new ModelRenderer(this);
		Cerato_LongMusle.setRotationPoint(0.0F, 2.0F, 0.0F);
		Cerato_Left_Leg.addChild(Cerato_LongMusle);
		setRotationAngle(Cerato_LongMusle, -0.3491F, 0.0F, 0.0F);
		Cerato_LongMusle.setTextureOffset(0, 74).addBox(-1.0F, -1.0F, -7.0F, 5.0F, 15.0F, 8.0F, 0.0F, false);

		Cerato_LowerMusle = new ModelRenderer(this);
		Cerato_LowerMusle.setRotationPoint(0.0F, 17.0F, -4.0F);
		Cerato_Left_Leg.addChild(Cerato_LowerMusle);
		setRotationAngle(Cerato_LowerMusle, 0.2618F, 0.0F, 0.0F);
		Cerato_LowerMusle.setTextureOffset(0, 96).addBox(-1.0F, -6.0F, -6.0F, 5.0F, 8.0F, 7.0F, 0.0F, false);

		Cerato_Foot = new ModelRenderer(this);
		Cerato_Foot.setRotationPoint(0.0F, 22.0F, 0.0F);
		Cerato_Left_Leg.addChild(Cerato_Foot);
		Cerato_Foot.setTextureOffset(0, 124).addBox(-1.0F, -3.0F, -9.0F, 5.0F, 3.0F, 13.0F, 0.0F, false);
		Cerato_Foot.setTextureOffset(54, 153).addBox(-1.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Foot.setTextureOffset(44, 151).addBox(1.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Foot.setTextureOffset(55, 155).addBox(3.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Foot.setTextureOffset(101, 157).addBox(-1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Foot.setTextureOffset(108, 169).addBox(1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Foot.setTextureOffset(112, 191).addBox(3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Cerato_Right_Leg2 = new ModelRenderer(this);
		Cerato_Right_Leg2.setRotationPoint(-3.0F, 2.0F, 10.0F);
		setRotationAngle(Cerato_Right_Leg2, 0.0F, 3.1416F, 0.0F);
		Cerato_Right_Leg2.setTextureOffset(0, 233).addBox(3.0F, -11.0F, -7.0F, 1.0F, 13.0F, 10.0F, 0.0F, false);

		Cerato_LongMusle2 = new ModelRenderer(this);
		Cerato_LongMusle2.setRotationPoint(0.0F, 2.0F, 0.0F);
		Cerato_Right_Leg2.addChild(Cerato_LongMusle2);
		setRotationAngle(Cerato_LongMusle2, -0.3491F, 0.0F, 0.0F);
		Cerato_LongMusle2.setTextureOffset(0, 200).addBox(-1.0F, -1.0F, -7.0F, 5.0F, 15.0F, 8.0F, 0.0F, false);

		Cerato_LowerMusle2 = new ModelRenderer(this);
		Cerato_LowerMusle2.setRotationPoint(0.0F, 17.0F, -4.0F);
		Cerato_Right_Leg2.addChild(Cerato_LowerMusle2);
		setRotationAngle(Cerato_LowerMusle2, 0.2618F, 0.0F, 0.0F);
		Cerato_LowerMusle2.setTextureOffset(0, 184).addBox(-1.0F, -6.0F, -6.0F, 5.0F, 8.0F, 7.0F, 0.0F, false);

		Cerato_Foot2 = new ModelRenderer(this);
		Cerato_Foot2.setRotationPoint(0.0F, 22.0F, 0.0F);
		Cerato_Right_Leg2.addChild(Cerato_Foot2);
		Cerato_Foot2.setTextureOffset(0, 152).addBox(-1.0F, -3.0F, -9.0F, 5.0F, 3.0F, 13.0F, 0.0F, false);
		Cerato_Foot2.setTextureOffset(132, 250).addBox(-1.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Foot2.setTextureOffset(132, 250).addBox(1.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Foot2.setTextureOffset(132, 250).addBox(3.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Cerato_Foot2.setTextureOffset(122, 251).addBox(-1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Foot2.setTextureOffset(122, 251).addBox(1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Foot2.setTextureOffset(122, 251).addBox(3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Cerato_Head2 = new ModelRenderer(this);
		Cerato_Head2.setRotationPoint(0.0F, -9.0F, -14.0F);
		Cerato_Head2.setTextureOffset(210, 201).addBox(-4.0F, -6.0F, -12.0F, 8.0F, 12.0F, 12.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(204, 230).addBox(-4.0F, -5.0F, -25.0F, 8.0F, 11.0F, 13.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(246, 134).addBox(-1.0F, -8.0F, -25.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(235, 133).addBox(-1.0F, -10.0F, -24.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(242, 106).addBox(-4.0F, -8.0F, -11.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(224, 104).addBox(2.0F, -8.0F, -11.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(245, 94).addBox(-4.0F, -9.0F, -10.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(229, 94).addBox(2.0F, -9.0F, -10.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(4.0F, 6.0F, -24.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(-4.0F, 6.0F, -24.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(2.0F, 6.0F, -25.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(-3.0F, 6.0F, -25.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(-4.0F, 6.0F, -20.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(-4.0F, 6.0F, -12.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(-4.0F, 6.0F, -18.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(-4.0F, 6.0F, -22.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(-4.0F, 6.0F, -16.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(4.0F, 6.0F, -22.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(-4.0F, 6.0F, -14.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(4.0F, 6.0F, -18.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(4.0F, 6.0F, -12.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(4.0F, 6.0F, -16.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(4.0F, 6.0F, -20.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Head2.setTextureOffset(0, 0).addBox(4.0F, 6.0F, -14.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);

		Cerato_Bottom_Jaw = new ModelRenderer(this);
		Cerato_Bottom_Jaw.setRotationPoint(0.0F, 5.0F, 0.0F);
		Cerato_Head2.addChild(Cerato_Bottom_Jaw);
		setRotationAngle(Cerato_Bottom_Jaw, 0.2618F, 0.0F, 0.0F);
		Cerato_Bottom_Jaw.setTextureOffset(207, 181).addBox(-3.0F, 0.0F, -25.0F, 6.0F, 1.0F, 17.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -25.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -23.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -19.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -15.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -13.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -17.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -21.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(3.0F, -1.0F, -25.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -25.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(1.0F, -1.0F, -25.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -23.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -21.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -19.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -17.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -15.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -13.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(222, 160).addBox(-1.0F, -1.0F, -23.0F, 2.0F, 1.0F, 15.0F, 0.0F, false);
		Cerato_Bottom_Jaw.setTextureOffset(226, 144).addBox(-3.0F, -3.0F, -8.0F, 6.0F, 4.0F, 7.0F, 0.0F, false);

		Cerato_Neck2 = new ModelRenderer(this);
		Cerato_Neck2.setRotationPoint(0.0F, -10.0F, -18.0F);
		setRotationAngle(Cerato_Neck2, -0.5236F, 0.0F, 0.0F);
		Cerato_Neck2.setTextureOffset(217, 63).addBox(-3.0F, -5.0F, 0.0F, 6.0F, 10.0F, 13.0F, 0.0F, false);

		Cerato_Body2 = new ModelRenderer(this);
		Cerato_Body2.setRotationPoint(0.0F, -2.0F, -8.0F);
		Cerato_Body2.setTextureOffset(165, 8).addBox(-6.0F, -9.0F, -1.0F, 12.0F, 14.0F, 31.0F, 0.0F, false);

		Cerato_Tail2 = new ModelRenderer(this);
		Cerato_Tail2.setRotationPoint(0.0F, -2.0F, 21.0F);
		Cerato_Tail2.setTextureOffset(129, 209).addBox(-5.0F, -7.0F, 1.0F, 10.0F, 11.0F, 12.0F, 0.0F, false);

		Cerato_Tail3 = new ModelRenderer(this);
		Cerato_Tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
		Cerato_Tail2.addChild(Cerato_Tail3);
		setRotationAngle(Cerato_Tail3, 0.1745F, 0.0F, 0.0F);
		Cerato_Tail3.setTextureOffset(125, 169).addBox(-4.0F, -6.0F, 0.0F, 8.0F, 10.0F, 24.0F, 0.0F, false);

		Cerato_Tail4 = new ModelRenderer(this);
		Cerato_Tail4.setRotationPoint(0.0F, 2.9393F, 23.3055F);
		Cerato_Tail3.addChild(Cerato_Tail4);
		setRotationAngle(Cerato_Tail4, 0.0873F, 0.0F, 0.0F);
		Cerato_Tail4.setTextureOffset(132, 135).addBox(-3.0F, -8.091F, -1.0834F, 6.0F, 9.0F, 24.0F, 0.0F, false);

		Cerato_Tail5 = new ModelRenderer(this);
		Cerato_Tail5.setRotationPoint(0.0F, -5.9393F, 22.6945F);
		Cerato_Tail4.addChild(Cerato_Tail5);
		setRotationAngle(Cerato_Tail5, -0.2618F, 0.0F, 0.0F);
		Cerato_Tail5.setTextureOffset(134, 106).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 8.0F, 15.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Cerato_Left_Arm2.render(matrixStack, buffer, packedLight, packedOverlay);
		Cerato_Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Cerato_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Cerato_Right_Leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		Cerato_Head2.render(matrixStack, buffer, packedLight, packedOverlay);
		Cerato_Neck2.render(matrixStack, buffer, packedLight, packedOverlay);
		Cerato_Body2.render(matrixStack, buffer, packedLight, packedOverlay);
		Cerato_Tail2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Cerato_Head2.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Cerato_Head2.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Cerato_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Cerato_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Cerato_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Cerato_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Cerato_Tail5.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.Cerato_Right_Leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}