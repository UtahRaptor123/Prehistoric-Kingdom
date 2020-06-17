// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelTovosaurus extends EntityModel<Entity> {
	private final ModelRenderer Tovosaur_Head;
	private final ModelRenderer Tovosaur_BottomJaw;
	private final ModelRenderer Body;
	private final ModelRenderer Tovosaur_Tail;
	private final ModelRenderer Tovosaur_Tail2;
	private final ModelRenderer Tovosaur_Tail3;
	private final ModelRenderer Tovosaur_Tail4;
	private final ModelRenderer Left_Arm;
	private final ModelRenderer Left_Arm_Musle;
	private final ModelRenderer Right_Arm;
	private final ModelRenderer Right_Arm_Musle;
	private final ModelRenderer Left_Leg;
	private final ModelRenderer Left_Leg2;
	private final ModelRenderer LeftLeg_LowerMusle;
	private final ModelRenderer LeftLeg_Foot;
	private final ModelRenderer Right_Leg;
	private final ModelRenderer Left_Leg4;
	private final ModelRenderer LeftLeg_LowerMusle2;
	private final ModelRenderer LeftLeg_Foot2;
	private final ModelRenderer Neck2;

	public ModelTovosaurus() {
		textureWidth = 256;
		textureHeight = 256;

		Tovosaur_Head = new ModelRenderer(this);
		Tovosaur_Head.setRotationPoint(1.0F, -28.0F, -24.0F);
		Tovosaur_Head.setTextureOffset(207, 188).addBox(-6.0F, -6.0F, -13.0F, 11.0F, 12.0F, 13.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(210, 216).addBox(-5.0F, -4.0F, -26.0F, 9.0F, 9.0F, 13.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(236, 247).addBox(-5.0F, -3.0F, -27.0F, 9.0F, 8.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(218, 126).addBox(-5.0F, -7.0F, -13.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(241, 153).addBox(-5.0F, -5.0F, -19.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(213, 153).addBox(3.0F, -5.0F, -19.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(227, 148).addBox(3.0F, -6.0F, -15.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(249, 148).addBox(-5.0F, -6.0F, -15.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(240, 124).addBox(3.0F, -7.0F, -13.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(3.0F, 5.0F, -27.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -27.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-3.0F, 5.0F, -27.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(1.0F, 5.0F, -27.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-1.0F, 5.0F, -27.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-1.0F, 6.0F, -27.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(1.0F, 6.0F, -27.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(3.0F, 6.0F, -27.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-3.0F, 6.0F, -27.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 6.0F, -27.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -25.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -23.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -21.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -19.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(4.0F, 6.0F, -25.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(4.0F, 6.0F, -23.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 6.0F, -23.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 6.0F, -21.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 6.0F, -19.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 6.0F, -17.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 6.0F, -15.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(-5.0F, 6.0F, -25.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(4.0F, 6.0F, -21.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(4.0F, 6.0F, -19.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(4.0F, 6.0F, -17.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(4.0F, 6.0F, -15.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(3.0F, 5.0F, -25.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(3.0F, 5.0F, -23.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(3.0F, 5.0F, -21.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(3.0F, 5.0F, -19.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(3.0F, 5.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_Head.setTextureOffset(0, 0).addBox(3.0F, 5.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Tovosaur_BottomJaw = new ModelRenderer(this);
		Tovosaur_BottomJaw.setRotationPoint(-1.0F, 4.0F, -8.0F);
		Tovosaur_Head.addChild(Tovosaur_BottomJaw);
		setRotationAngle(Tovosaur_BottomJaw, 0.2618F, 0.0F, 0.0F);
		Tovosaur_BottomJaw.setTextureOffset(206, 167).addBox(-3.0F, 0.0F, -18.0F, 7.0F, 2.0F, 18.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(4.0F, -1.0F, -18.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(4.0F, -1.0F, -16.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(4.0F, -1.0F, -14.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(4.0F, -1.0F, -12.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(4.0F, -1.0F, -10.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(4.0F, -1.0F, -8.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(4.0F, -1.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(4.0F, -1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(4.0F, -1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -6.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -8.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -10.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -12.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -14.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -16.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, -18.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -18.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(2.0F, -1.0F, -18.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Tovosaur_BottomJaw.setTextureOffset(0, 0).addBox(0.0F, -1.0F, -18.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(1.0F, -30.0F, -13.0F);
		Body.setTextureOffset(143, 0).addBox(-8.0F, -1.0F, -4.0F, 15.0F, 17.0F, 41.0F, 0.0F, false);

		Tovosaur_Tail = new ModelRenderer(this);
		Tovosaur_Tail.setRotationPoint(0.0F, -23.0F, 20.0F);
		Tovosaur_Tail.setTextureOffset(105, 220).addBox(-5.0F, -6.0F, 0.0F, 11.0F, 13.0F, 21.0F, 0.0F, false);

		Tovosaur_Tail2 = new ModelRenderer(this);
		Tovosaur_Tail2.setRotationPoint(0.0F, -0.0456F, 19.4791F);
		Tovosaur_Tail.addChild(Tovosaur_Tail2);
		setRotationAngle(Tovosaur_Tail2, 0.0873F, 0.0F, 0.0F);
		Tovosaur_Tail2.setTextureOffset(98, 176).addBox(-4.0F, -4.0F, 0.0F, 9.0F, 10.0F, 21.0F, 0.0F, false);

		Tovosaur_Tail3 = new ModelRenderer(this);
		Tovosaur_Tail3.setRotationPoint(0.0F, -0.649F, 17.5817F);
		Tovosaur_Tail2.addChild(Tovosaur_Tail3);
		setRotationAngle(Tovosaur_Tail3, -0.2618F, 0.0F, 0.0F);
		Tovosaur_Tail3.setTextureOffset(106, 155).addBox(-3.0F, -2.8652F, 0.2454F, 7.0F, 7.0F, 15.0F, 0.0F, false);

		Tovosaur_Tail4 = new ModelRenderer(this);
		Tovosaur_Tail4.setRotationPoint(0.0F, 4.1967F, 12.1079F);
		Tovosaur_Tail3.addChild(Tovosaur_Tail4);
		Tovosaur_Tail4.setTextureOffset(102, 121).addBox(-2.0F, -5.8045F, 0.5508F, 5.0F, 5.0F, 20.0F, 0.0F, false);

		Left_Arm = new ModelRenderer(this);
		Left_Arm.setRotationPoint(9.0F, -20.0F, -11.0F);
		Left_Arm.setTextureOffset(78, 100).addBox(-1.0F, -5.0F, -5.0F, 1.0F, 11.0F, 10.0F, 0.0F, false);

		Left_Arm_Musle = new ModelRenderer(this);
		Left_Arm_Musle.setRotationPoint(0.0F, 4.0F, -2.0F);
		Left_Arm.addChild(Left_Arm_Musle);
		setRotationAngle(Left_Arm_Musle, -0.8727F, 0.0F, 0.0F);
		Left_Arm_Musle.setTextureOffset(88, 68).addBox(-5.0F, -4.3498F, 0.0391F, 5.0F, 14.0F, 6.0F, 0.0F, false);
		Left_Arm_Musle.setTextureOffset(0, 0).addBox(-1.0F, 9.2581F, 4.4465F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Arm_Musle.setTextureOffset(0, 0).addBox(-5.0F, 9.2581F, 4.4465F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Arm_Musle.setTextureOffset(0, 0).addBox(-3.0F, 9.2581F, 4.4465F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Right_Arm = new ModelRenderer(this);
		Right_Arm.setRotationPoint(-8.0F, -20.0F, -10.0F);
		Right_Arm.setTextureOffset(148, 96).addBox(0.0F, -5.0F, -6.0F, 1.0F, 11.0F, 10.0F, 0.0F, false);

		Right_Arm_Musle = new ModelRenderer(this);
		Right_Arm_Musle.setRotationPoint(5.0F, 4.0F, -3.0F);
		Right_Arm.addChild(Right_Arm_Musle);
		setRotationAngle(Right_Arm_Musle, -0.8727F, 0.0F, 0.0F);
		Right_Arm_Musle.setTextureOffset(117, 72).addBox(-5.0F, -4.3498F, 0.0391F, 5.0F, 14.0F, 6.0F, 0.0F, false);
		Right_Arm_Musle.setTextureOffset(0, 0).addBox(-1.0F, 9.2581F, 4.4465F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Arm_Musle.setTextureOffset(0, 0).addBox(-5.0F, 9.2581F, 4.4465F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Arm_Musle.setTextureOffset(0, 0).addBox(-3.0F, 9.2581F, 4.4465F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Left_Leg = new ModelRenderer(this);
		Left_Leg.setRotationPoint(9.0F, -22.0F, 11.0F);
		Left_Leg.setTextureOffset(0, 228).addBox(-1.0F, -6.0F, -7.0F, 1.0F, 14.0F, 14.0F, 0.0F, false);

		Left_Leg2 = new ModelRenderer(this);
		Left_Leg2.setRotationPoint(0.0F, 8.0F, 2.0F);
		Left_Leg.addChild(Left_Leg2);
		setRotationAngle(Left_Leg2, 0.4363F, 0.0F, 0.0F);
		Left_Leg2.setTextureOffset(1, 188).addBox(-6.0F, -3.0F, -6.0F, 6.0F, 25.0F, 10.0F, 0.0F, false);

		LeftLeg_LowerMusle = new ModelRenderer(this);
		LeftLeg_LowerMusle.setRotationPoint(0.0F, 29.0F, 10.0F);
		Left_Leg.addChild(LeftLeg_LowerMusle);
		setRotationAngle(LeftLeg_LowerMusle, -0.0873F, 0.0F, 0.0F);
		LeftLeg_LowerMusle.setTextureOffset(4, 165).addBox(-6.0F, -3.0F, -4.0F, 6.0F, 16.0F, 8.0F, 0.0F, false);

		LeftLeg_Foot = new ModelRenderer(this);
		LeftLeg_Foot.setRotationPoint(0.0F, 44.0F, 0.0F);
		Left_Leg.addChild(LeftLeg_Foot);
		LeftLeg_Foot.setTextureOffset(3, 152).addBox(-6.0F, -2.0F, -2.0F, 6.0F, 4.0F, 15.0F, 0.0F, false);
		LeftLeg_Foot.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		LeftLeg_Foot.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		LeftLeg_Foot.setTextureOffset(0, 0).addBox(-6.0F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Right_Leg = new ModelRenderer(this);
		Right_Leg.setRotationPoint(-2.0F, -22.0F, 11.0F);
		Right_Leg.setTextureOffset(53, 221).addBox(-6.0F, -6.0F, -7.0F, 1.0F, 14.0F, 14.0F, 0.0F, false);

		Left_Leg4 = new ModelRenderer(this);
		Left_Leg4.setRotationPoint(0.0F, 8.0F, 2.0F);
		Right_Leg.addChild(Left_Leg4);
		setRotationAngle(Left_Leg4, 0.4363F, 0.0F, 0.0F);
		Left_Leg4.setTextureOffset(59, 174).addBox(-6.0F, -3.0F, -6.0F, 6.0F, 25.0F, 10.0F, 0.0F, false);

		LeftLeg_LowerMusle2 = new ModelRenderer(this);
		LeftLeg_LowerMusle2.setRotationPoint(0.0F, 29.0F, 10.0F);
		Right_Leg.addChild(LeftLeg_LowerMusle2);
		setRotationAngle(LeftLeg_LowerMusle2, -0.0873F, 0.0F, 0.0F);
		LeftLeg_LowerMusle2.setTextureOffset(64, 140).addBox(-6.0F, -3.0F, -4.0F, 6.0F, 16.0F, 8.0F, 0.0F, false);

		LeftLeg_Foot2 = new ModelRenderer(this);
		LeftLeg_Foot2.setRotationPoint(0.0F, 44.0F, 0.0F);
		Right_Leg.addChild(LeftLeg_Foot2);
		LeftLeg_Foot2.setTextureOffset(66, 107).addBox(-6.0F, -2.0F, -2.0F, 6.0F, 4.0F, 15.0F, 0.0F, false);
		LeftLeg_Foot2.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		LeftLeg_Foot2.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		LeftLeg_Foot2.setTextureOffset(0, 0).addBox(-6.0F, 0.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Neck2 = new ModelRenderer(this);
		Neck2.setRotationPoint(1.0F, -24.6031F, -23.4202F);
		setRotationAngle(Neck2, -0.3491F, 0.0F, 0.0F);
		Neck2.setTextureOffset(211, 65).addBox(-5.0F, -8.5107F, -3.6461F, 9.0F, 11.0F, 12.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Tovosaur_Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Tovosaur_Tail.render(matrixStack, buffer, packedLight, packedOverlay);
		Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
		Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		Neck2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Tovosaur_Tail4.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Tovosaur_Tail3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Right_Leg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.Tovosaur_Tail2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Tovosaur_Tail.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Tovosaur_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Tovosaur_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}