
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
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
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
public class BaryOnyxEntity extends PrehistoricKingdomModElements.ModElement {
	public static EntityType entity = null;
	public BaryOnyxEntity(PrehistoricKingdomModElements instance) {
		super(instance, 52);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.7f, 1.9000000000000001f))
						.build("bary_onyx").setRegistryName("bary_onyx");
		elements.entities.add(() -> entity);
		elements.items
				.add(() -> new SpawnEggItem(entity, -1, -1, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("bary_onyx_spawn_egg"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelBaryonyx_Adult_(), 0.6f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("prehistoric_kingdom:textures/baryonyx_adult_skin.png");
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
			experienceValue = 50;
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
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 0.6, true));
			this.targetSelector.addGoal(2, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.6));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, true));
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
			this.entityDropItem(new ItemStack(Items.BONE, (int) (1)));
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
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source.getImmediateSource() instanceof PotionEntity)
				return false;
			if (source == DamageSource.CACTUS)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5);
		}
	}

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
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
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

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.BaryTail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.BaryLeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.BaryTail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.BaryTail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.BaryRightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.BaryHead.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.BaryHead.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
