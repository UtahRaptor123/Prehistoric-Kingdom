
package net.mcreator.prehistorickingdom.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.prehistorickingdom.PrehistoricKingdomModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@PrehistoricKingdomModElements.ModElement.Tag
public class CeratosaurusEntity extends PrehistoricKingdomModElements.ModElement {
	public static EntityType entity = null;
	public CeratosaurusEntity(PrehistoricKingdomModElements instance) {
		super(instance, 39);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(1f, 2.2f)).build("ceratosaurus")
						.setRegistryName("ceratosaurus");
		elements.entities.add(() -> entity);
		elements.items
				.add(() -> new SpawnEggItem(entity, -256, -16777216, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("ceratosaurus"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelCeratosaurus(), 0.7f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("prehistoric_kingdom:textures/ceratosaurus_skin.png");
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
			experienceValue = 85;
			setNoAI(false);
			enablePersistence();
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, true));
			this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 0.4));
			this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(5, new SwimGoal(this));
			this.goalSelector.addGoal(6, new AvoidEntityGoal(this, TyrannosaurusRexEntity.CustomEntity.class, (float) 15, 0.6, 0.6));
			this.goalSelector.addGoal(7, new AvoidEntityGoal(this, TovosaurusEntity.CustomEntity.class, (float) 15, 0.6, 0.6));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, AllosaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, UtahRaptorEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, ProtocertopsEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, CamptosaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, OviraptorEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, PigEntity.class, false, true));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, true));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		@Override
		public double getMountedYOffset() {
			return super.getMountedYOffset() + 0.5;
		}

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
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
		public boolean processInteract(PlayerEntity sourceentity, Hand hand) {
			super.processInteract(sourceentity, hand);
			sourceentity.startRiding(this);
			int x = (int) this.getPosX();
			int y = (int) this.getPosY();
			int z = (int) this.getPosZ();
			ItemStack itemstack = sourceentity.getHeldItem(hand);
			Entity entity = this;
			return true;
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(85);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6);
		}

		@Override
		public void travel(Vec3d dir) {
			Entity entity = this.getPassengers().isEmpty() ? null : (Entity) this.getPassengers().get(0);
			if (this.isBeingRidden()) {
				this.rotationYaw = entity.rotationYaw;
				this.prevRotationYaw = this.rotationYaw;
				this.rotationPitch = entity.rotationPitch * 0.5F;
				this.setRotation(this.rotationYaw, this.rotationPitch);
				this.jumpMovementFactor = this.getAIMoveSpeed() * 0.15F;
				this.renderYawOffset = entity.rotationYaw;
				this.rotationYawHead = entity.rotationYaw;
				this.stepHeight = 1.0F;
				if (entity instanceof LivingEntity) {
					this.setAIMoveSpeed((float) this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getValue());
					float forward = ((LivingEntity) entity).moveForward;
					float strafe = 0;
					super.travel(new Vec3d(strafe, 0, forward));
				}
				this.prevLimbSwingAmount = this.limbSwingAmount;
				double d1 = this.getPosX() - this.prevPosX;
				double d0 = this.getPosZ() - this.prevPosZ;
				float f1 = MathHelper.sqrt(d1 * d1 + d0 * d0) * 4.0F;
				if (f1 > 1.0F)
					f1 = 1.0F;
				this.limbSwingAmount += (f1 - this.limbSwingAmount) * 0.4F;
				this.limbSwing += this.limbSwingAmount;
				return;
			}
			this.stepHeight = 0.5F;
			this.jumpMovementFactor = 0.02F;
			super.travel(dir);
		}
	}

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
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
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

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
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
}
