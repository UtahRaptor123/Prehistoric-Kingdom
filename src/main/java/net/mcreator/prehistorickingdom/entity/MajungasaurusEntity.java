
package net.mcreator.prehistorickingdom.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.SharedMonsterAttributes;
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
public class MajungasaurusEntity extends PrehistoricKingdomModElements.ModElement {
	public static EntityType entity = null;
	public MajungasaurusEntity(PrehistoricKingdomModElements instance) {
		super(instance, 40);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.AMBIENT).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 1.8f)).build("majungasaurus")
						.setRegistryName("majungasaurus");
		elements.entities.add(() -> entity);
		elements.items
				.add(() -> new SpawnEggItem(entity, -6058883, -33240, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("majungasaurus"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelMajungasaurus(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("prehistoric_kingdom:textures/majungasaurus_skin.png");
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
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false));
			this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
			this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.4));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, true));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, BaryonyxEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, CeratosaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MajungasaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CowEntity.class, false, true));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, PigEntity.class, false, true));
			this.goalSelector.addGoal(11, new AvoidEntityGoal(this, AllosaurusEntity.CustomEntity.class, (float) 6, 0.5, 0.4));
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
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(85);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8);
		}
	}

	// Made with Blockbench 3.5.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelMajungasaurus extends EntityModel<Entity> {
		private final ModelRenderer Majunga_Head;
		private final ModelRenderer Majunga_Jaw;
		private final ModelRenderer Majunga_Horn;
		private final ModelRenderer Majunga_Neck;
		private final ModelRenderer Majunga_Body;
		private final ModelRenderer Majunga_Tail1;
		private final ModelRenderer Majunga_Tail2;
		private final ModelRenderer Majunga_Tail3;
		private final ModelRenderer Majunga_Tail4;
		private final ModelRenderer Majunga_LeftArm1;
		private final ModelRenderer Majunga_LeftArm2;
		private final ModelRenderer Majunga_Left_Leg1;
		private final ModelRenderer Majunga_Left_Leg2;
		private final ModelRenderer Majunga_Left_Leg3;
		private final ModelRenderer Majunga_Right_Leg1;
		private final ModelRenderer Majunga_Right_Leg2;
		private final ModelRenderer Majunga_Right_Leg3;
		private final ModelRenderer Majunga_Right_Arm1;
		private final ModelRenderer Majunga_Right_Arm2;
		public ModelMajungasaurus() {
			textureWidth = 256;
			textureHeight = 256;
			Majunga_Head = new ModelRenderer(this);
			Majunga_Head.setRotationPoint(0.0F, -20.0F, -22.0F);
			setRotationAngle(Majunga_Head, 0.1745F, 0.0F, 0.0F);
			Majunga_Head.setTextureOffset(220, 192).addBox(-5.0F, -6.0F, -8.0F, 10.0F, 10.0F, 8.0F, 0.0F, false);
			Majunga_Head.setTextureOffset(214, 234).addBox(-4.0F, -5.0F, -17.0F, 8.0F, 9.0F, 9.0F, 0.0F, false);
			Majunga_Jaw = new ModelRenderer(this);
			Majunga_Jaw.setRotationPoint(0.0F, 4.0F, 0.0F);
			Majunga_Head.addChild(Majunga_Jaw);
			Majunga_Jaw.setTextureOffset(220, 178).addBox(-5.0F, 0.0F, -8.0F, 10.0F, 2.0F, 8.0F, 0.0F, false);
			Majunga_Jaw.setTextureOffset(216, 215).addBox(-4.0F, 0.0F, -16.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
			Majunga_Horn = new ModelRenderer(this);
			Majunga_Horn.setRotationPoint(0.0F, -6.0F, -6.0F);
			Majunga_Head.addChild(Majunga_Horn);
			setRotationAngle(Majunga_Horn, 0.4363F, 0.0F, 0.0F);
			Majunga_Horn.setTextureOffset(218, 154).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			Majunga_Neck = new ModelRenderer(this);
			Majunga_Neck.setRotationPoint(0.0F, -20.0F, -20.0F);
			setRotationAngle(Majunga_Neck, -0.1745F, 0.0F, 0.0F);
			Majunga_Neck.setTextureOffset(212, 124).addBox(-4.0F, -5.0152F, -3.8264F, 8.0F, 11.0F, 14.0F, 0.0F, false);
			Majunga_Body = new ModelRenderer(this);
			Majunga_Body.setRotationPoint(0.0F, -11.0F, -7.0F);
			setRotationAngle(Majunga_Body, 0.0873F, 0.0F, 0.0F);
			Majunga_Body.setTextureOffset(176, 40).addBox(-7.0F, -12.0F, 8.0F, 14.0F, 19.0F, 26.0F, 0.0F, false);
			Majunga_Body.setTextureOffset(208, 90).addBox(-6.0F, -12.0F, -4.0F, 12.0F, 18.0F, 12.0F, 0.0F, false);
			Majunga_Tail1 = new ModelRenderer(this);
			Majunga_Tail1.setRotationPoint(0.0F, -4.0F, 35.0F);
			Majunga_Body.addChild(Majunga_Tail1);
			setRotationAngle(Majunga_Tail1, -0.1746F, 0.0F, 0.0F);
			Majunga_Tail1.setTextureOffset(137, 0).addBox(-6.0F, -6.0F, -2.0F, 12.0F, 14.0F, 17.0F, 0.0F, false);
			Majunga_Tail2 = new ModelRenderer(this);
			Majunga_Tail2.setRotationPoint(0.0F, 0.5229F, 16.0228F);
			Majunga_Tail1.addChild(Majunga_Tail2);
			setRotationAngle(Majunga_Tail2, 0.0873F, 0.0F, 0.0F);
			Majunga_Tail2.setTextureOffset(68, 0).addBox(-5.0F, -5.6103F, -2.0267F, 10.0F, 12.0F, 17.0F, 0.0F, false);
			Majunga_Tail3 = new ModelRenderer(this);
			Majunga_Tail3.setRotationPoint(0.0F, 3.4771F, 14.9772F);
			Majunga_Tail2.addChild(Majunga_Tail3);
			setRotationAngle(Majunga_Tail3, 0.0873F, 0.0F, 0.0F);
			Majunga_Tail3.setTextureOffset(110, 39).addBox(-4.0F, -8.0875F, -0.0038F, 8.0F, 10.0F, 13.0F, 0.0F, false);
			Majunga_Tail4 = new ModelRenderer(this);
			Majunga_Tail4.setRotationPoint(0.0F, -0.6107F, 20.019F);
			Majunga_Tail3.addChild(Majunga_Tail4);
			setRotationAngle(Majunga_Tail4, 0.0873F, 0.0F, 0.0F);
			Majunga_Tail4.setTextureOffset(17, 0).addBox(-3.0F, -7.0F, -8.0F, 6.0F, 8.0F, 15.0F, 0.0F, false);
			Majunga_LeftArm1 = new ModelRenderer(this);
			Majunga_LeftArm1.setRotationPoint(7.0F, -10.0F, -6.0F);
			Majunga_LeftArm1.setTextureOffset(234, 0).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 9.0F, 7.0F, 0.0F, false);
			Majunga_LeftArm2 = new ModelRenderer(this);
			Majunga_LeftArm2.setRotationPoint(2.0F, 5.0F, 1.0F);
			Majunga_LeftArm1.addChild(Majunga_LeftArm2);
			setRotationAngle(Majunga_LeftArm2, 0.5236F, 0.0F, 0.0F);
			Majunga_LeftArm2.setTextureOffset(238, 20).addBox(-3.0F, -2.0F, -3.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);
			Majunga_LeftArm2.setTextureOffset(238, 20).addBox(-5.0F, 3.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Majunga_LeftArm2.setTextureOffset(238, 20).addBox(-5.0F, 3.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Majunga_LeftArm2.setTextureOffset(238, 20).addBox(-5.0F, 3.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Majunga_Left_Leg1 = new ModelRenderer(this);
			Majunga_Left_Leg1.setRotationPoint(7.0F, -9.0F, 17.0F);
			setRotationAngle(Majunga_Left_Leg1, -0.3491F, 0.0F, 0.0F);
			Majunga_Left_Leg1.setTextureOffset(0, 224).addBox(-1.0F, -6.0F, -7.0F, 5.0F, 18.0F, 14.0F, 0.0F, false);
			Majunga_Left_Leg2 = new ModelRenderer(this);
			Majunga_Left_Leg2.setRotationPoint(0.0F, 7.0F, -2.0F);
			Majunga_Left_Leg1.addChild(Majunga_Left_Leg2);
			setRotationAngle(Majunga_Left_Leg2, 0.3491F, 0.0F, 0.0F);
			Majunga_Left_Leg2.setTextureOffset(0, 188).addBox(-1.0F, 4.0F, -3.0F, 5.0F, 19.0F, 10.0F, 0.0F, false);
			Majunga_Left_Leg3 = new ModelRenderer(this);
			Majunga_Left_Leg3.setRotationPoint(0.0F, 25.0F, 0.0F);
			Majunga_Left_Leg2.addChild(Majunga_Left_Leg3);
			Majunga_Left_Leg3.setTextureOffset(0, 160).addBox(-2.0F, -2.0F, -8.0F, 7.0F, 4.0F, 15.0F, 0.0F, false);
			Majunga_Right_Leg1 = new ModelRenderer(this);
			Majunga_Right_Leg1.setRotationPoint(-7.0F, -9.0F, 17.0F);
			setRotationAngle(Majunga_Right_Leg1, -0.3491F, 0.0F, 0.0F);
			Majunga_Right_Leg1.setTextureOffset(41, 126).addBox(-4.0F, -6.0F, -7.0F, 5.0F, 18.0F, 14.0F, 0.0F, false);
			Majunga_Right_Leg2 = new ModelRenderer(this);
			Majunga_Right_Leg2.setRotationPoint(-3.0F, 7.0F, -2.0F);
			Majunga_Right_Leg1.addChild(Majunga_Right_Leg2);
			setRotationAngle(Majunga_Right_Leg2, 0.3491F, 0.0F, 0.0F);
			Majunga_Right_Leg2.setTextureOffset(0, 97).addBox(-1.0F, 4.0F, -3.0F, 5.0F, 19.0F, 10.0F, 0.0F, false);
			Majunga_Right_Leg3 = new ModelRenderer(this);
			Majunga_Right_Leg3.setRotationPoint(0.0F, 25.0F, 0.0F);
			Majunga_Right_Leg2.addChild(Majunga_Right_Leg3);
			Majunga_Right_Leg3.setTextureOffset(0, 75).addBox(-2.0F, -2.0F, -8.0F, 7.0F, 4.0F, 15.0F, 0.0F, false);
			Majunga_Right_Arm1 = new ModelRenderer(this);
			Majunga_Right_Arm1.setRotationPoint(-9.0F, -10.0F, -6.0F);
			Majunga_Right_Arm1.setTextureOffset(234, 0).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 9.0F, 7.0F, 0.0F, false);
			Majunga_Right_Arm2 = new ModelRenderer(this);
			Majunga_Right_Arm2.setRotationPoint(2.0F, 5.0F, 1.0F);
			Majunga_Right_Arm1.addChild(Majunga_Right_Arm2);
			setRotationAngle(Majunga_Right_Arm2, 0.5236F, 0.0F, 0.0F);
			Majunga_Right_Arm2.setTextureOffset(238, 20).addBox(-3.0F, -2.0F, -3.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);
			Majunga_Right_Arm2.setTextureOffset(238, 20).addBox(1.0F, 3.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Majunga_Right_Arm2.setTextureOffset(238, 20).addBox(1.0F, 3.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Majunga_Right_Arm2.setTextureOffset(238, 20).addBox(1.0F, 3.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Majunga_Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Majunga_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
			Majunga_Body.render(matrixStack, buffer, packedLight, packedOverlay);
			Majunga_LeftArm1.render(matrixStack, buffer, packedLight, packedOverlay);
			Majunga_Left_Leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			Majunga_Right_Leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			Majunga_Right_Arm1.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Majunga_Tail1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Majunga_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Majunga_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Majunga_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Majunga_Left_Leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Majunga_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Majunga_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Majunga_Right_Leg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
