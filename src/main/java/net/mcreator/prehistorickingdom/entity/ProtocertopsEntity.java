
package net.mcreator.prehistorickingdom.entity;

import net.minecraft.block.material.Material;

@PrehistoricKingdomModElements.ModElement.Tag
public class ProtocertopsEntity extends PrehistoricKingdomModElements.ModElement {

	public static EntityType entity = null;

	public ProtocertopsEntity(PrehistoricKingdomModElements instance) {
		super(instance, 42);

		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 1.8f)).build("protocertops")
						.setRegistryName("protocertops");

		elements.entities.add(() -> entity);

		elements.items
				.add(() -> new SpawnEggItem(entity, -205, -16711681, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("protocertops"));

	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelProtocerotops(), 0.5f) {

				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("prehistoric_kingdom:textures/protocerotops_skin.png");
				}
			};
		});

	}

	public static class CustomEntity extends CreatureEntity {

		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 45;
			setNoAI(false);

			enablePersistence();

		}

		@Override
		protected void registerGoals() {
			super.registerGoals();

			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false));
			this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 0.4));
			this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(5, new SwimGoal(this));
			this.goalSelector.addGoal(6, new AvoidEntityGoal(this, TyrannosaurusRexEntity.CustomEntity.class, (float) 6, 0.6, 0.6));
			this.goalSelector.addGoal(7, new AvoidEntityGoal(this, AllosaurusEntity.CustomEntity.class, (float) 6, 0.6, 0.6));
			this.goalSelector.addGoal(8, new AvoidEntityGoal(this, CeratosaurusEntity.CustomEntity.class, (float) 6, 0.6, 0.6));
			this.goalSelector.addGoal(9, new AvoidEntityGoal(this, TovosaurusEntity.CustomEntity.class, (float) 6, 0.6, 0.6));
			this.goalSelector.addGoal(10, new EatGrassGoal(this));

		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
			this.entityDropItem(new ItemStack(FossilItem.block, (int) (1)));
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();

			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4);

			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(45);

			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);

			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3);

		}

	}

	// Made with Blockbench 3.5.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	public static class ModelProtocerotops extends EntityModel<Entity> {
		private final ModelRenderer Proto_Head;
		private final ModelRenderer Proto_Crest;
		private final ModelRenderer Proto_Neck;
		private final ModelRenderer Proto_Body;
		private final ModelRenderer Proto_Tail;
		private final ModelRenderer Proto_Tail2;
		private final ModelRenderer Proto_Tail3;
		private final ModelRenderer Proto_Tail4;
		private final ModelRenderer Quills;
		private final ModelRenderer Front_Left_Leg;
		private final ModelRenderer Musle_One;
		private final ModelRenderer Foot;
		private final ModelRenderer Front_Right_Leg;
		private final ModelRenderer Musle_One2;
		private final ModelRenderer Foot2;
		private final ModelRenderer Back_Left_Leg;
		private final ModelRenderer Musle_One3;
		private final ModelRenderer Foot3;
		private final ModelRenderer Back_Right_Leg;
		private final ModelRenderer Musle_One4;
		private final ModelRenderer Foot4;

		public ModelProtocerotops() {
			textureWidth = 256;
			textureHeight = 256;

			Proto_Head = new ModelRenderer(this);
			Proto_Head.setRotationPoint(0.0F, 9.0F, -9.0F);
			Proto_Head.setTextureOffset(224, 238).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Proto_Head.setTextureOffset(208, 216).addBox(-3.0F, -3.0F, -11.0F, 6.0F, 7.0F, 3.0F, 0.0F, false);
			Proto_Head.setTextureOffset(95, 5).addBox(-1.0F, -1.0F, -13.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			Proto_Head.setTextureOffset(225, 207).addBox(-3.0F, 4.0F, -8.0F, 6.0F, 2.0F, 8.0F, 0.0F, false);
			Proto_Head.setTextureOffset(240, 218).addBox(-2.0F, 4.0F, -11.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
			Proto_Head.setTextureOffset(160, 10).addBox(-1.0F, 5.0F, -12.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Head.setTextureOffset(163, 29).addBox(-1.0F, 4.0F, -13.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Proto_Head.setTextureOffset(119, 12).addBox(-1.0F, 0.0F, -14.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
			Proto_Head.setTextureOffset(0, 0).addBox(-2.0F, 6.0F, -9.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Head.setTextureOffset(0, 0).addBox(0.0F, 6.0F, -9.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Head.setTextureOffset(0, 0).addBox(-1.0F, 6.0F, -10.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Head.setTextureOffset(0, 0).addBox(1.0F, 6.0F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);

			Proto_Crest = new ModelRenderer(this);
			Proto_Crest.setRotationPoint(0.0F, -4.0F, 1.0F);
			Proto_Head.addChild(Proto_Crest);
			setRotationAngle(Proto_Crest, -0.4363F, 0.0F, 0.0F);
			Proto_Crest.setTextureOffset(231, 194).addBox(-5.0F, -3.5774F, -0.9063F, 10.0F, 8.0F, 1.0F, 0.0F, false);

			Proto_Neck = new ModelRenderer(this);
			Proto_Neck.setRotationPoint(0.0F, 14.0F, -8.0F);
			setRotationAngle(Proto_Neck, -0.3491F, 0.0F, 0.0F);
			Proto_Neck.setTextureOffset(231, 171).addBox(-2.0F, -6.0F, -4.0F, 4.0F, 6.0F, 8.0F, 0.0F, false);

			Proto_Body = new ModelRenderer(this);
			Proto_Body.setRotationPoint(0.0F, 24.0F, -11.0F);
			Proto_Body.setTextureOffset(196, 2).addBox(-5.0F, -17.0F, 6.0F, 10.0F, 10.0F, 19.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-1.0F, -18.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-1.0F, -18.0F, 8.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-1.0F, -18.0F, 10.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-1.0F, -18.0F, 12.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-1.0F, -18.0F, 14.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-1.0F, -18.0F, 16.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-1.0F, -18.0F, 18.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-1.0F, -18.0F, 20.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(2.0F, -18.0F, 21.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(2.0F, -18.0F, 19.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(2.0F, -18.0F, 17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(2.0F, -18.0F, 15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(2.0F, -18.0F, 13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(2.0F, -18.0F, 11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(2.0F, -18.0F, 9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(2.0F, -18.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-3.0F, -18.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-3.0F, -18.0F, 9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-3.0F, -18.0F, 11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-3.0F, -18.0F, 13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-3.0F, -18.0F, 15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-3.0F, -18.0F, 17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-3.0F, -18.0F, 19.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-3.0F, -18.0F, 21.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Proto_Body.setTextureOffset(248, 34).addBox(-1.0F, -18.0F, 22.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

			Proto_Tail = new ModelRenderer(this);
			Proto_Tail.setRotationPoint(0.0F, 13.0F, 14.0F);
			Proto_Tail.setTextureOffset(230, 73).addBox(-4.0F, -5.0F, 0.0F, 8.0F, 9.0F, 4.0F, 0.0F, false);

			Proto_Tail2 = new ModelRenderer(this);
			Proto_Tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
			Proto_Tail.addChild(Proto_Tail2);
			setRotationAngle(Proto_Tail2, 0.2618F, 0.0F, 0.0F);
			Proto_Tail2.setTextureOffset(226, 94).addBox(-3.0F, -4.0F, -1.0F, 6.0F, 7.0F, 7.0F, 0.0F, false);

			Proto_Tail3 = new ModelRenderer(this);
			Proto_Tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
			Proto_Tail2.addChild(Proto_Tail3);
			setRotationAngle(Proto_Tail3, 0.0873F, 0.0F, 0.0F);
			Proto_Tail3.setTextureOffset(232, 118).addBox(-2.0F, -3.794F, -0.1371F, 4.0F, 6.0F, 6.0F, 0.0F, false);

			Proto_Tail4 = new ModelRenderer(this);
			Proto_Tail4.setRotationPoint(0.0F, 2.0F, 6.0F);
			Proto_Tail3.addChild(Proto_Tail4);
			setRotationAngle(Proto_Tail4, -0.2618F, 0.0F, 0.0F);
			Proto_Tail4.setTextureOffset(200, 125).addBox(-1.0F, -4.2627F, -2.0581F, 2.0F, 4.0F, 4.0F, 0.0F, false);

			Quills = new ModelRenderer(this);
			Quills.setRotationPoint(0.0F, -5.0F, -1.0F);
			Proto_Tail.addChild(Quills);
			setRotationAngle(Quills, -0.6109F, 0.0F, 0.0F);
			Quills.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, 3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, 3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(0.0F, -4.0F, 3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(1.0F, -4.0F, 3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(3.0F, -4.0F, 3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(4.0F, -4.0F, 3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(2.0F, -3.0F, 7.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(0.0F, -3.0F, 9.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(1.0F, -3.0F, 10.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(-2.0F, -8.7341F, 8.985F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(0.0F, -7.8325F, 5.9539F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(2.0F, -5.8662F, 4.8892F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(1.0F, -10.3724F, 8.8378F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(-1.0F, -8.734F, 7.9849F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(0.0F, -11.2739F, 9.8688F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(1.0F, -3.0F, 6.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(-2.0F, -5.4575F, 3.2793F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, 8.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, 3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, 1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, 1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(1.0F, -3.1808F, 1.5736F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			Quills.setTextureOffset(0, 0).addBox(3.0F, -4.0F, 1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

			Front_Left_Leg = new ModelRenderer(this);
			Front_Left_Leg.setRotationPoint(6.0F, 15.0F, -2.0F);
			Front_Left_Leg.setTextureOffset(113, 103).addBox(-1.0F, -5.0F, -2.0F, 1.0F, 7.0F, 6.0F, 0.0F, false);

			Musle_One = new ModelRenderer(this);
			Musle_One.setRotationPoint(0.0F, 3.0F, 0.0F);
			Front_Left_Leg.addChild(Musle_One);
			setRotationAngle(Musle_One, 0.3491F, 0.0F, 0.0F);
			Musle_One.setTextureOffset(116, 120).addBox(-3.0F, -2.0F, -1.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

			Foot = new ModelRenderer(this);
			Foot.setRotationPoint(0.0F, 9.0F, 3.0F);
			Front_Left_Leg.addChild(Foot);
			Foot.setTextureOffset(126, 100).addBox(-3.0F, -2.0F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);

			Front_Right_Leg = new ModelRenderer(this);
			Front_Right_Leg.setRotationPoint(-3.0F, 15.0F, -2.0F);
			Front_Right_Leg.setTextureOffset(0, 189).addBox(-3.0F, -5.0F, -2.0F, 1.0F, 7.0F, 6.0F, 0.0F, false);

			Musle_One2 = new ModelRenderer(this);
			Musle_One2.setRotationPoint(0.0F, 3.0F, 0.0F);
			Front_Right_Leg.addChild(Musle_One2);
			setRotationAngle(Musle_One2, 0.3491F, 0.0F, 0.0F);
			Musle_One2.setTextureOffset(37, 208).addBox(-3.0F, -2.0F, -1.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

			Foot2 = new ModelRenderer(this);
			Foot2.setRotationPoint(0.0F, 9.0F, 3.0F);
			Front_Right_Leg.addChild(Foot2);
			Foot2.setTextureOffset(64, 246).addBox(-3.0F, -2.0F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);

			Back_Left_Leg = new ModelRenderer(this);
			Back_Left_Leg.setRotationPoint(6.0F, 15.0F, 9.0F);
			Back_Left_Leg.setTextureOffset(112, 239).addBox(-1.0F, -5.0F, -2.0F, 1.0F, 7.0F, 6.0F, 0.0F, false);

			Musle_One3 = new ModelRenderer(this);
			Musle_One3.setRotationPoint(0.0F, 3.0F, 0.0F);
			Back_Left_Leg.addChild(Musle_One3);
			setRotationAngle(Musle_One3, 0.3491F, 0.0F, 0.0F);
			Musle_One3.setTextureOffset(120, 200).addBox(-3.0F, -2.0F, -1.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

			Foot3 = new ModelRenderer(this);
			Foot3.setRotationPoint(0.0F, 9.0F, 3.0F);
			Back_Left_Leg.addChild(Foot3);
			Foot3.setTextureOffset(114, 168).addBox(-3.0F, -2.0F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);

			Back_Right_Leg = new ModelRenderer(this);
			Back_Right_Leg.setRotationPoint(-3.0F, 15.0F, 9.0F);
			Back_Right_Leg.setTextureOffset(4, 238).addBox(-3.0F, -5.0F, -2.0F, 1.0F, 7.0F, 6.0F, 0.0F, false);

			Musle_One4 = new ModelRenderer(this);
			Musle_One4.setRotationPoint(0.0F, 3.0F, 0.0F);
			Back_Right_Leg.addChild(Musle_One4);
			setRotationAngle(Musle_One4, 0.3491F, 0.0F, 0.0F);
			Musle_One4.setTextureOffset(19, 244).addBox(-3.0F, -2.0F, -1.0F, 3.0F, 8.0F, 4.0F, 0.0F, false);

			Foot4 = new ModelRenderer(this);
			Foot4.setRotationPoint(0.0F, 9.0F, 3.0F);
			Back_Right_Leg.addChild(Foot4);
			Foot4.setTextureOffset(1, 224).addBox(-3.0F, -2.0F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Proto_Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Proto_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
			Proto_Body.render(matrixStack, buffer, packedLight, packedOverlay);
			Proto_Tail.render(matrixStack, buffer, packedLight, packedOverlay);
			Front_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
			Front_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
			Back_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
			Back_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.Back_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Proto_Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Front_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Front_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Proto_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Proto_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Proto_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Back_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Proto_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Proto_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
