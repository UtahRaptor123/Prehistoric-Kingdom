
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
import net.minecraft.entity.passive.AnimalEntity;
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
public class TyrannosuarusAdultEntity extends PrehistoricKingdomModElements.ModElement {
	public static EntityType entity = null;
	public TyrannosuarusAdultEntity(PrehistoricKingdomModElements instance) {
		super(instance, 47);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.AMBIENT).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(1.1f, 3.6f)).build("tyrannosuarus_adult")
						.setRegistryName("tyrannosuarus_adult");
		elements.entities.add(() -> entity);
		elements.items
				.add(() -> new SpawnEggItem(entity, -1, -1, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("tyrannosuarus_adult"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelTyrannosaurus_Rex_Adult(), 0.8f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("prehistoric_kingdom:textures/tyrannosaurus_skin.png");
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
			experienceValue = 200;
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
			this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.3));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, true));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, AllosaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, BaryonyxEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, CeratosaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MajungasaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, AnimalEntity.class, false, true));
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
			return super.getMountedYOffset() + 3;
		}

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
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
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(5);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(25);
		}
	}

	// Made with Blockbench 3.6.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelTyrannosaurus_Rex_Adult extends EntityModel<Entity> {
		private final ModelRenderer Rexhead;
		private final ModelRenderer RexTopJaw;
		private final ModelRenderer RexBottomjaw;
		private final ModelRenderer RexCrest1;
		private final ModelRenderer RexCrest2;
		private final ModelRenderer RexNeck;
		private final ModelRenderer RexNeck2;
		private final ModelRenderer RexBody;
		private final ModelRenderer RexTail1;
		private final ModelRenderer RexTail2;
		private final ModelRenderer RexTail3;
		private final ModelRenderer RexTail4;
		private final ModelRenderer RexLeftArm1;
		private final ModelRenderer RexRightArm1;
		private final ModelRenderer RexLeftLeg1;
		private final ModelRenderer RexLeftLeg2;
		private final ModelRenderer RexLeftLeg3;
		private final ModelRenderer RexRightleg1;
		private final ModelRenderer RexRightleg2;
		private final ModelRenderer RexRightleg3;
		public ModelTyrannosaurus_Rex_Adult() {
			textureWidth = 256;
			textureHeight = 256;
			Rexhead = new ModelRenderer(this);
			Rexhead.setRotationPoint(0.0F, -31.0F, -21.0F);
			Rexhead.setTextureOffset(126, 16).addBox(-7.0F, -8.0F, -10.0F, 14.0F, 14.0F, 10.0F, 0.0F, false);
			RexTopJaw = new ModelRenderer(this);
			RexTopJaw.setRotationPoint(0.0F, -1.0F, -9.0F);
			Rexhead.addChild(RexTopJaw);
			RexTopJaw.setTextureOffset(121, 52).addBox(-6.0F, -6.0F, -13.0F, 12.0F, 10.0F, 13.0F, 0.0F, false);
			RexTopJaw.setTextureOffset(42, 73).addBox(-6.0F, 4.0F, -13.0F, 0.0F, 2.0F, 12.0F, 0.0F, false);
			RexTopJaw.setTextureOffset(63, 0).addBox(-6.0F, 4.0F, -13.0F, 12.0F, 2.0F, 0.0F, 0.0F, false);
			RexTopJaw.setTextureOffset(68, 53).addBox(6.0F, 4.0F, -13.0F, 0.0F, 2.0F, 12.0F, 0.0F, false);
			RexBottomjaw = new ModelRenderer(this);
			RexBottomjaw.setRotationPoint(0.0F, 1.0F, 0.0F);
			RexTopJaw.addChild(RexBottomjaw);
			RexBottomjaw.setTextureOffset(136, 0).addBox(-5.0F, 3.0F, -12.0F, 10.0F, 3.0F, 11.0F, 0.0F, false);
			RexBottomjaw.setTextureOffset(0, 1).addBox(5.0F, 2.0F, -12.0F, 0.0F, 1.0F, 11.0F, 0.0F, false);
			RexBottomjaw.setTextureOffset(0, 0).addBox(-5.0F, 2.0F, -12.0F, 0.0F, 1.0F, 11.0F, 0.0F, false);
			RexBottomjaw.setTextureOffset(0, 22).addBox(-5.0F, 2.0F, -12.0F, 10.0F, 1.0F, 0.0F, 0.0F, false);
			RexCrest1 = new ModelRenderer(this);
			RexCrest1.setRotationPoint(-5.0F, -7.0F, -12.0F);
			Rexhead.addChild(RexCrest1);
			setRotationAngle(RexCrest1, 0.0F, 0.0F, -0.4363F);
			RexCrest1.setTextureOffset(52, 52).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);
			RexCrest2 = new ModelRenderer(this);
			RexCrest2.setRotationPoint(6.0F, -7.0F, -12.0F);
			Rexhead.addChild(RexCrest2);
			setRotationAngle(RexCrest2, 0.0F, 0.0F, 0.4363F);
			RexCrest2.setTextureOffset(0, 13).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);
			RexNeck = new ModelRenderer(this);
			RexNeck.setRotationPoint(0.0F, -28.0F, -21.0F);
			setRotationAngle(RexNeck, -0.4363F, 0.0F, 0.0F);
			RexNeck.setTextureOffset(86, 0).addBox(-6.0F, -9.0F, -5.0F, 12.0F, 13.0F, 13.0F, 0.0F, false);
			RexNeck2 = new ModelRenderer(this);
			RexNeck2.setRotationPoint(0.0F, -1.8126F, 11.1548F);
			RexNeck.addChild(RexNeck2);
			setRotationAngle(RexNeck2, 0.3491F, 0.0F, 0.0F);
			RexNeck2.setTextureOffset(141, 107).addBox(-7.0F, -9.0F, -5.0F, 14.0F, 15.0F, 6.0F, 0.0F, false);
			RexBody = new ModelRenderer(this);
			RexBody.setRotationPoint(0.0F, -26.0F, -9.0F);
			RexBody.setTextureOffset(68, 68).addBox(-9.0F, -8.0F, -1.0F, 18.0F, 23.0F, 15.0F, 0.0F, false);
			RexBody.setTextureOffset(0, 0).addBox(-10.0F, -8.0F, 14.0F, 20.0F, 25.0F, 23.0F, 0.0F, false);
			RexTail1 = new ModelRenderer(this);
			RexTail1.setRotationPoint(0.0F, 0.0F, 36.0F);
			RexBody.addChild(RexTail1);
			setRotationAngle(RexTail1, -0.1309F, 0.0F, 0.0F);
			RexTail1.setTextureOffset(0, 48).addBox(-9.0F, -6.0F, 0.0F, 18.0F, 21.0F, 16.0F, 0.0F, false);
			RexTail2 = new ModelRenderer(this);
			RexTail2.setRotationPoint(0.0F, 0.2611F, 14.0171F);
			RexTail1.addChild(RexTail2);
			setRotationAngle(RexTail2, 0.0873F, 0.0F, 0.0F);
			RexTail2.setTextureOffset(68, 29).addBox(-7.0F, -4.0F, 0.0F, 14.0F, 17.0F, 19.0F, 0.0F, false);
			RexTail3 = new ModelRenderer(this);
			RexTail3.setRotationPoint(0.0F, 0.0436F, 18.001F);
			RexTail2.addChild(RexTail3);
			setRotationAngle(RexTail3, 0.0873F, 0.0F, 0.0F);
			RexTail3.setTextureOffset(0, 85).addBox(-5.0F, -2.0F, 0.0F, 10.0F, 14.0F, 22.0F, 0.0F, false);
			RexTail4 = new ModelRenderer(this);
			RexTail4.setRotationPoint(0.0F, -0.0436F, 21.001F);
			RexTail3.addChild(RexTail4);
			setRotationAngle(RexTail4, 0.0873F, 0.0F, 0.0F);
			RexTail4.setTextureOffset(0, 121).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 11.0F, 15.0F, 0.0F, false);
			RexLeftArm1 = new ModelRenderer(this);
			RexLeftArm1.setRotationPoint(10.0F, 14.0F, 0.0F);
			RexBody.addChild(RexLeftArm1);
			setRotationAngle(RexLeftArm1, 0.4363F, 0.0F, 0.0F);
			RexLeftArm1.setTextureOffset(0, 48).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 7.0F, 4.0F, 0.0F, false);
			RexRightArm1 = new ModelRenderer(this);
			RexRightArm1.setRotationPoint(-10.0F, 14.0F, 0.0F);
			RexBody.addChild(RexRightArm1);
			setRotationAngle(RexRightArm1, 0.4363F, 0.0F, 0.0F);
			RexRightArm1.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 7.0F, 4.0F, 0.0F, false);
			RexLeftLeg1 = new ModelRenderer(this);
			RexLeftLeg1.setRotationPoint(11.0F, -10.0F, 19.0F);
			RexLeftLeg1.setTextureOffset(95, 106).addBox(-2.0F, -14.0F, -8.0F, 8.0F, 20.0F, 15.0F, 0.0F, false);
			RexLeftLeg2 = new ModelRenderer(this);
			RexLeftLeg2.setRotationPoint(0.0F, 19.0F, 0.0F);
			RexLeftLeg1.addChild(RexLeftLeg2);
			RexLeftLeg2.setTextureOffset(134, 75).addBox(-2.0F, -13.0F, -4.0F, 8.0F, 21.0F, 11.0F, 0.0F, false);
			RexLeftLeg3 = new ModelRenderer(this);
			RexLeftLeg3.setRotationPoint(0.0F, 21.0F, 0.0F);
			RexLeftLeg2.addChild(RexLeftLeg3);
			RexLeftLeg3.setTextureOffset(77, 141).addBox(-2.0F, -13.0F, -8.0F, 8.0F, 7.0F, 15.0F, 0.0F, false);
			RexRightleg1 = new ModelRenderer(this);
			RexRightleg1.setRotationPoint(-15.0F, -10.0F, 19.0F);
			RexRightleg1.setTextureOffset(49, 106).addBox(-2.0F, -14.0F, -8.0F, 8.0F, 20.0F, 15.0F, 0.0F, false);
			RexRightleg2 = new ModelRenderer(this);
			RexRightleg2.setRotationPoint(0.0F, 19.0F, 0.0F);
			RexRightleg1.addChild(RexRightleg2);
			RexRightleg2.setTextureOffset(130, 130).addBox(-2.0F, -13.0F, -4.0F, 8.0F, 21.0F, 11.0F, 0.0F, false);
			RexRightleg3 = new ModelRenderer(this);
			RexRightleg3.setRotationPoint(0.0F, 21.0F, 0.0F);
			RexRightleg2.addChild(RexRightleg3);
			RexRightleg3.setTextureOffset(31, 141).addBox(-2.0F, -13.0F, -8.0F, 8.0F, 7.0F, 15.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Rexhead.render(matrixStack, buffer, packedLight, packedOverlay);
			RexNeck.render(matrixStack, buffer, packedLight, packedOverlay);
			RexBody.render(matrixStack, buffer, packedLight, packedOverlay);
			RexLeftLeg1.render(matrixStack, buffer, packedLight, packedOverlay);
			RexRightleg1.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Rexhead.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Rexhead.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.RexTail1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.RexTail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.RexTail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.RexTail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.RexLeftLeg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.RexRightleg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
