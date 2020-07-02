
package net.mcreator.prehistorickingdom.entity;

import net.minecraft.block.material.Material;

@PrehistoricKingdomModElements.ModElement.Tag
public class CamptosaurusEntity extends PrehistoricKingdomModElements.ModElement {

	public static EntityType entity = null;

	public CamptosaurusEntity(PrehistoricKingdomModElements instance) {
		super(instance, 42);

		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 1.8f)).build("camptosaurus")
						.setRegistryName("camptosaurus");

		elements.entities.add(() -> entity);

		elements.items
				.add(() -> new SpawnEggItem(entity, -13261, -26317, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("camptosaurus"));

	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelCamptosaurus(), 0.5f) {

				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("prehistoric_kingdom:textures/camptosaurus_skin.png");
				}
			};
		});

	}

	public static class CustomEntity extends MonsterEntity {

		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 55;
			setNoAI(false);

			enablePersistence();

		}

		@Override
		protected void registerGoals() {
			super.registerGoals();

			this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 0.4));
			this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(3, new SwimGoal(this));
			this.goalSelector.addGoal(4, new EatGrassGoal(this));
			this.goalSelector.addGoal(5, new AvoidEntityGoal(this, TyrannosaurusRexEntity.CustomEntity.class, (float) 6, 0.6, 0.6));
			this.goalSelector.addGoal(6, new AvoidEntityGoal(this, AllosaurusEntity.CustomEntity.class, (float) 6, 0.6, 0.6));
			this.goalSelector.addGoal(7, new AvoidEntityGoal(this, CeratosaurusEntity.CustomEntity.class, (float) 6, 0.6, 0.6));
			this.goalSelector.addGoal(8, new AvoidEntityGoal(this, TovosaurusEntity.CustomEntity.class, (float) 6, 0.6, 0.6));
			this.goalSelector.addGoal(9, new AvoidEntityGoal(this, UtahRaptorEntity.CustomEntity.class, (float) 6, 0.6, 0.6));
			this.goalSelector.addGoal(10, new PanicGoal(this, 0.6));

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
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(55);

			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);

			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4);

		}

	}

	// Made with Blockbench 3.5.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	public static class ModelCamptosaurus extends EntityModel<Entity> {
		private final ModelRenderer Campto_Head;
		private final ModelRenderer Campto_Jaw;
		private final ModelRenderer Campto_Neck;
		private final ModelRenderer Campto_Neck2;
		private final ModelRenderer Campto_Body;
		private final ModelRenderer Campto_Tail;
		private final ModelRenderer Campto_Tail2;
		private final ModelRenderer Campto_Tail3;
		private final ModelRenderer Campto_Tail4;
		private final ModelRenderer Campto_Left_Arm;
		private final ModelRenderer Campto_Left_Arm2;
		private final ModelRenderer Campto_Left_Arm3;
		private final ModelRenderer Campto_Right_Arm;
		private final ModelRenderer Campto_right_Arm2;
		private final ModelRenderer Campto_right_Arm3;
		private final ModelRenderer Campto_Left_Leg;
		private final ModelRenderer Campto_Left_Leg2;
		private final ModelRenderer Campto_Left_Leg3;
		private final ModelRenderer Campto_Left_Leg4;
		private final ModelRenderer Campto_Left_Leg5;
		private final ModelRenderer Campto_Left_Leg6;
		private final ModelRenderer Campto_Left_Leg7;
		private final ModelRenderer Campto_Left_Leg8;

		public ModelCamptosaurus() {
			textureWidth = 128;
			textureHeight = 128;

			Campto_Head = new ModelRenderer(this);
			Campto_Head.setRotationPoint(0.0F, 0.0F, -9.0F);
			Campto_Head.setTextureOffset(102, 104).addBox(-3.0F, -6.0F, -7.0F, 6.0F, 6.0F, 7.0F, 0.0F, false);
			Campto_Head.setTextureOffset(83, 91).addBox(-2.0F, -5.0F, -13.0F, 4.0F, 5.0F, 6.0F, 0.0F, false);
			Campto_Head.setTextureOffset(99, 118).addBox(-1.0F, -6.0F, -10.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

			Campto_Jaw = new ModelRenderer(this);
			Campto_Jaw.setRotationPoint(0.0F, 0.0F, -7.0F);
			Campto_Head.addChild(Campto_Jaw);
			setRotationAngle(Campto_Jaw, 0.5236F, 0.0F, 0.0F);
			Campto_Jaw.setTextureOffset(84, 49).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);

			Campto_Neck = new ModelRenderer(this);
			Campto_Neck.setRotationPoint(0.0F, -1.0F, -12.0F);
			setRotationAngle(Campto_Neck, -0.6981F, 0.0F, 0.0F);
			Campto_Neck.setTextureOffset(108, 86).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);

			Campto_Neck2 = new ModelRenderer(this);
			Campto_Neck2.setRotationPoint(0.0F, -0.9158F, 5.7586F);
			Campto_Neck.addChild(Campto_Neck2);
			setRotationAngle(Campto_Neck2, 0.3491F, 0.0F, 0.0F);
			Campto_Neck2.setTextureOffset(112, 72).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

			Campto_Body = new ModelRenderer(this);
			Campto_Body.setRotationPoint(0.0F, 3.0F, -4.0F);
			Campto_Body.setTextureOffset(84, 0).addBox(-4.0F, -5.0F, 0.0F, 8.0F, 9.0F, 14.0F, 0.0F, false);
			Campto_Body.setTextureOffset(66, 63).addBox(-4.0F, 4.0F, 2.0F, 8.0F, 1.0F, 11.0F, 0.0F, false);
			Campto_Body.setTextureOffset(72, 77).addBox(-3.0F, 5.0F, 3.0F, 6.0F, 1.0F, 9.0F, 0.0F, false);

			Campto_Tail = new ModelRenderer(this);
			Campto_Tail.setRotationPoint(0.0F, 1.0F, 13.0F);
			Campto_Body.addChild(Campto_Tail);
			setRotationAngle(Campto_Tail, -0.2618F, 0.0F, 0.0F);
			Campto_Tail.setTextureOffset(51, 0).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 7.0F, 9.0F, 0.0F, false);

			Campto_Tail2 = new ModelRenderer(this);
			Campto_Tail2.setRotationPoint(0.0F, 0.8568F, 8.2016F);
			Campto_Tail.addChild(Campto_Tail2);
			setRotationAngle(Campto_Tail2, -0.0873F, 0.0F, 0.0F);
			Campto_Tail2.setTextureOffset(51, 18).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 5.0F, 10.0F, 0.0F, false);

			Campto_Tail3 = new ModelRenderer(this);
			Campto_Tail3.setRotationPoint(0.0F, 0.3975F, 9.211F);
			Campto_Tail2.addChild(Campto_Tail3);
			setRotationAngle(Campto_Tail3, 0.4363F, 0.0F, 0.0F);
			Campto_Tail3.setTextureOffset(51, 34).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 4.0F, 11.0F, 0.0F, false);

			Campto_Tail4 = new ModelRenderer(this);
			Campto_Tail4.setRotationPoint(0.0F, 0.2118F, 9.0529F);
			Campto_Tail3.addChild(Campto_Tail4);
			setRotationAngle(Campto_Tail4, 0.1745F, 0.0F, 0.0F);
			Campto_Tail4.setTextureOffset(61, 52).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);

			Campto_Left_Arm = new ModelRenderer(this);
			Campto_Left_Arm.setRotationPoint(5.0F, 6.0F, -3.0F);
			Campto_Left_Arm.setTextureOffset(91, 121).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);

			Campto_Left_Arm2 = new ModelRenderer(this);
			Campto_Left_Arm2.setRotationPoint(0.0F, 2.0F, -1.0F);
			Campto_Left_Arm.addChild(Campto_Left_Arm2);
			setRotationAngle(Campto_Left_Arm2, -0.4363F, 0.0F, 0.0F);
			Campto_Left_Arm2.setTextureOffset(102, 26).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 6.0F, 3.0F, 0.0F, false);

			Campto_Left_Arm3 = new ModelRenderer(this);
			Campto_Left_Arm3.setRotationPoint(0.0F, 2.6579F, -0.9674F);
			Campto_Left_Arm2.addChild(Campto_Left_Arm3);
			setRotationAngle(Campto_Left_Arm3, -0.7854F, 0.0F, 0.0F);
			Campto_Left_Arm3.setTextureOffset(118, 36).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, false);
			Campto_Left_Arm3.setTextureOffset(0, 0).addBox(-3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Campto_Left_Arm3.setTextureOffset(0, 0).addBox(-3.0F, 0.7444F, 2.2214F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Campto_Left_Arm3.setTextureOffset(0, 0).addBox(-3.0F, -0.2817F, -0.5977F, 2.0F, 1.0F, 1.0F, 0.0F, false);

			Campto_Right_Arm = new ModelRenderer(this);
			Campto_Right_Arm.setRotationPoint(-3.0F, 6.0F, -3.0F);
			Campto_Right_Arm.setTextureOffset(120, 62).addBox(-2.0F, -2.0F, 0.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);

			Campto_right_Arm2 = new ModelRenderer(this);
			Campto_right_Arm2.setRotationPoint(0.0F, 2.0F, -1.0F);
			Campto_Right_Arm.addChild(Campto_right_Arm2);
			setRotationAngle(Campto_right_Arm2, -0.4363F, 0.0F, 0.0F);
			Campto_right_Arm2.setTextureOffset(106, 60).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 6.0F, 3.0F, 0.0F, false);

			Campto_right_Arm3 = new ModelRenderer(this);
			Campto_right_Arm3.setRotationPoint(0.0F, 2.6579F, -0.9674F);
			Campto_right_Arm2.addChild(Campto_right_Arm3);
			setRotationAngle(Campto_right_Arm3, -0.7854F, 0.0F, 0.0F);
			Campto_right_Arm3.setTextureOffset(118, 45).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, false);
			Campto_right_Arm3.setTextureOffset(0, 0).addBox(-1.0F, -0.2817F, -0.5977F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Campto_right_Arm3.setTextureOffset(0, 0).addBox(0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Campto_right_Arm3.setTextureOffset(0, 0).addBox(-1.0F, 0.7444F, 2.2214F, 2.0F, 1.0F, 1.0F, 0.0F, false);

			Campto_Left_Leg = new ModelRenderer(this);
			Campto_Left_Leg.setRotationPoint(-4.0F, 5.0F, 6.0F);
			setRotationAngle(Campto_Left_Leg, 0.2618F, 0.0F, 0.0F);
			Campto_Left_Leg.setTextureOffset(0, 113).addBox(-1.0F, -4.0F, -3.0F, 4.0F, 9.0F, 6.0F, 0.0F, false);

			Campto_Left_Leg2 = new ModelRenderer(this);
			Campto_Left_Leg2.setRotationPoint(0.0F, 7.9862F, -1.1046F);
			Campto_Left_Leg.addChild(Campto_Left_Leg2);
			setRotationAngle(Campto_Left_Leg2, -0.1745F, 0.0F, 0.0F);
			Campto_Left_Leg2.setTextureOffset(0, 98).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

			Campto_Left_Leg3 = new ModelRenderer(this);
			Campto_Left_Leg3.setRotationPoint(0.0F, 8.9658F, -0.7844F);
			Campto_Left_Leg2.addChild(Campto_Left_Leg3);
			setRotationAngle(Campto_Left_Leg3, -0.1745F, 0.0F, 0.0F);
			Campto_Left_Leg3.setTextureOffset(0, 88).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

			Campto_Left_Leg4 = new ModelRenderer(this);
			Campto_Left_Leg4.setRotationPoint(0.0F, 1.9924F, 0.1743F);
			Campto_Left_Leg3.addChild(Campto_Left_Leg4);
			setRotationAngle(Campto_Left_Leg4, 0.0873F, 0.0F, 0.0F);
			Campto_Left_Leg4.setTextureOffset(0, 71).addBox(-1.0F, -3.0F, -3.0F, 4.0F, 3.0F, 6.0F, 0.0F, false);

			Campto_Left_Leg5 = new ModelRenderer(this);
			Campto_Left_Leg5.setRotationPoint(2.0F, 5.0F, 6.0F);
			setRotationAngle(Campto_Left_Leg5, 0.2618F, 0.0F, 0.0F);
			Campto_Left_Leg5.setTextureOffset(23, 113).addBox(-1.0F, -4.0F, -3.0F, 4.0F, 9.0F, 6.0F, 0.0F, false);

			Campto_Left_Leg6 = new ModelRenderer(this);
			Campto_Left_Leg6.setRotationPoint(0.0F, 7.9862F, -1.1046F);
			Campto_Left_Leg5.addChild(Campto_Left_Leg6);
			setRotationAngle(Campto_Left_Leg6, -0.1745F, 0.0F, 0.0F);
			Campto_Left_Leg6.setTextureOffset(24, 98).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

			Campto_Left_Leg7 = new ModelRenderer(this);
			Campto_Left_Leg7.setRotationPoint(0.0F, 8.9658F, -0.7844F);
			Campto_Left_Leg6.addChild(Campto_Left_Leg7);
			setRotationAngle(Campto_Left_Leg7, -0.1745F, 0.0F, 0.0F);
			Campto_Left_Leg7.setTextureOffset(27, 86).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

			Campto_Left_Leg8 = new ModelRenderer(this);
			Campto_Left_Leg8.setRotationPoint(0.0F, 1.9924F, 0.1743F);
			Campto_Left_Leg7.addChild(Campto_Left_Leg8);
			setRotationAngle(Campto_Left_Leg8, 0.0873F, 0.0F, 0.0F);
			Campto_Left_Leg8.setTextureOffset(32, 69).addBox(-1.0F, -3.0F, -3.0F, 4.0F, 3.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Campto_Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Campto_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
			Campto_Body.render(matrixStack, buffer, packedLight, packedOverlay);
			Campto_Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
			Campto_Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
			Campto_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
			Campto_Left_Leg5.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.Campto_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Campto_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Campto_Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Campto_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Campto_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Campto_Left_Leg5.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Campto_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Campto_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
