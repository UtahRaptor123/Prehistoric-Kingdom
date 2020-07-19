
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
import net.minecraft.item.ItemStack;
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

import net.mcreator.prehistorickingdom.item.ChickenboneItem;
import net.mcreator.prehistorickingdom.PrehistoricKingdomModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@PrehistoricKingdomModElements.ModElement.Tag
public class BaryonyxEntity extends PrehistoricKingdomModElements.ModElement {
	public static EntityType entity = null;
	public BaryonyxEntity(PrehistoricKingdomModElements instance) {
		super(instance, 38);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.AMBIENT).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 1.8f)).build("baryonyx")
						.setRegistryName("baryonyx");
		elements.entities.add(() -> entity);
		elements.items
				.add(() -> new SpawnEggItem(entity, -13408768, -13395712, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("baryonyx"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelBaryonyx_Adult(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("prehistoric_kingdom:textures/baryonyx_skin.png");
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
			experienceValue = 75;
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
			this.targetSelector.addGoal(2, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.6));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, true));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, CeratosaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, MajungasaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, CowEntity.class, false, true));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, PigEntity.class, false, true));
			this.goalSelector.addGoal(10, new AvoidEntityGoal(this, AllosaurusEntity.CustomEntity.class, (float) 8, 0.8, 0.6));
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
			this.entityDropItem(new ItemStack(ChickenboneItem.block, (int) (1)));
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
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(75);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6);
		}
	}

	// Made with Blockbench 3.6.3
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelBaryonyx_Adult extends EntityModel<Entity> {
		private final ModelRenderer Bary_Head;
		private final ModelRenderer Crest;
		private final ModelRenderer Bary_Jaw;
		private final ModelRenderer Bary_Neck;
		private final ModelRenderer Bary_Neck2;
		private final ModelRenderer Bary_Body;
		private final ModelRenderer Bary_Tail1;
		private final ModelRenderer Bary_Tail2;
		private final ModelRenderer Bary_Tail3;
		private final ModelRenderer Bary_Tail4;
		private final ModelRenderer Left_Arm1;
		private final ModelRenderer Left_Arm2;
		private final ModelRenderer Left_Arm3;
		private final ModelRenderer Right_Arm1;
		private final ModelRenderer Right_Arm2;
		private final ModelRenderer Right_Arm3;
		private final ModelRenderer Bary_Left_Leg;
		private final ModelRenderer Bary_Left_Leg2;
		private final ModelRenderer Bary_Left_Leg3;
		private final ModelRenderer Bary_Left_Leg4;
		private final ModelRenderer Bary_Left_Leg5;
		private final ModelRenderer Bary_Left_Leg6;
		public ModelBaryonyx_Adult() {
			textureWidth = 176;
			textureHeight = 176;
			Bary_Head = new ModelRenderer(this);
			Bary_Head.setRotationPoint(0.0F, -17.0F, -14.0F);
			setRotationAngle(Bary_Head, 0.0873F, 0.0F, 0.0F);
			Bary_Head.setTextureOffset(36, 91).addBox(-4.0F, -5.0F, -10.0F, 8.0F, 10.0F, 10.0F, 0.0F, false);
			Bary_Head.setTextureOffset(0, 112).addBox(-4.0F, -4.0F, -19.0F, 8.0F, 7.0F, 9.0F, 0.0F, false);
			Bary_Head.setTextureOffset(86, 112).addBox(-3.0F, -3.0F, -28.0F, 6.0F, 6.0F, 9.0F, 0.0F, false);
			Crest = new ModelRenderer(this);
			Crest.setRotationPoint(0.0F, -3.0F, -13.0F);
			Bary_Head.addChild(Crest);
			setRotationAngle(Crest, 0.7854F, 0.0F, 0.0F);
			Crest.setTextureOffset(72, 150).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
			Bary_Jaw = new ModelRenderer(this);
			Bary_Jaw.setRotationPoint(0.0F, 3.0F, -11.0F);
			Bary_Head.addChild(Bary_Jaw);
			Bary_Jaw.setTextureOffset(26, 135).addBox(-3.0F, 0.0F, -8.0F, 6.0F, 2.0F, 9.0F, 0.0F, false);
			Bary_Jaw.setTextureOffset(96, 135).addBox(-2.0F, 0.0F, -16.0F, 4.0F, 2.0F, 8.0F, 0.0F, false);
			Bary_Neck = new ModelRenderer(this);
			Bary_Neck.setRotationPoint(0.0F, -17.0F, -14.0F);
			setRotationAngle(Bary_Neck, -0.5236F, 0.0F, 0.0F);
			Bary_Neck.setTextureOffset(0, 91).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 9.0F, 12.0F, 0.0F, false);
			Bary_Neck2 = new ModelRenderer(this);
			Bary_Neck2.setRotationPoint(0.0F, -0.3301F, 12.6244F);
			Bary_Neck.addChild(Bary_Neck2);
			setRotationAngle(Bary_Neck2, 0.1745F, 0.0F, 0.0F);
			Bary_Neck2.setTextureOffset(0, 135).addBox(-4.0F, -4.3802F, -4.4949F, 8.0F, 10.0F, 5.0F, 0.0F, false);
			Bary_Body = new ModelRenderer(this);
			Bary_Body.setRotationPoint(0.0F, -11.0F, -4.0F);
			setRotationAngle(Bary_Body, 0.0873F, 0.0F, 0.0F);
			Bary_Body.setTextureOffset(96, 37).addBox(-6.0F, -5.0F, -1.0F, 12.0F, 14.0F, 11.0F, 0.0F, false);
			Bary_Body.setTextureOffset(0, 0).addBox(-7.0F, -5.0F, 10.0F, 14.0F, 15.0F, 22.0F, 0.0F, false);
			Bary_Tail1 = new ModelRenderer(this);
			Bary_Tail1.setRotationPoint(0.0F, 2.9962F, 31.9128F);
			Bary_Body.addChild(Bary_Tail1);
			setRotationAngle(Bary_Tail1, -0.1745F, 0.0F, 0.0F);
			Bary_Tail1.setTextureOffset(72, 0).addBox(-6.0F, -6.0F, -1.0F, 12.0F, 13.0F, 15.0F, 0.0F, false);
			Bary_Tail2 = new ModelRenderer(this);
			Bary_Tail2.setRotationPoint(0.0F, 0.0F, 14.0F);
			Bary_Tail1.addChild(Bary_Tail2);
			setRotationAngle(Bary_Tail2, 0.0873F, 0.0F, 0.0F);
			Bary_Tail2.setTextureOffset(0, 37).addBox(-5.0F, -5.0F, -1.0F, 10.0F, 12.0F, 15.0F, 0.0F, false);
			Bary_Tail3 = new ModelRenderer(this);
			Bary_Tail3.setRotationPoint(0.0F, 0.0F, 14.0F);
			Bary_Tail2.addChild(Bary_Tail3);
			setRotationAngle(Bary_Tail3, 0.0873F, 0.0F, 0.0F);
			Bary_Tail3.setTextureOffset(50, 37).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 11.0F, 15.0F, 0.0F, false);
			Bary_Tail4 = new ModelRenderer(this);
			Bary_Tail4.setRotationPoint(0.0F, 0.9962F, 13.9128F);
			Bary_Tail3.addChild(Bary_Tail4);
			setRotationAngle(Bary_Tail4, 0.0873F, 0.0F, 0.0F);
			Bary_Tail4.setTextureOffset(0, 64).addBox(-3.0F, -3.0F, -1.0F, 6.0F, 9.0F, 15.0F, 0.0F, false);
			Left_Arm1 = new ModelRenderer(this);
			Left_Arm1.setRotationPoint(6.0F, 5.0F, 3.0F);
			Bary_Body.addChild(Left_Arm1);
			setRotationAngle(Left_Arm1, 0.1745F, 0.0F, 0.0F);
			Left_Arm1.setTextureOffset(76, 135).addBox(-1.0F, -1.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, false);
			Left_Arm2 = new ModelRenderer(this);
			Left_Arm2.setRotationPoint(0.0F, 6.8871F, -0.2902F);
			Left_Arm1.addChild(Left_Arm2);
			setRotationAngle(Left_Arm2, 0.3491F, 0.0F, 0.0F);
			Left_Arm2.setTextureOffset(54, 150).addBox(-1.0F, -0.8871F, -1.7098F, 4.0F, 7.0F, 5.0F, -0.1F, false);
			Left_Arm3 = new ModelRenderer(this);
			Left_Arm3.setRotationPoint(0.0F, 7.1129F, 0.2902F);
			Left_Arm2.addChild(Left_Arm3);
			setRotationAngle(Left_Arm3, -1.5708F, 0.0F, 0.0F);
			Left_Arm3.setTextureOffset(18, 150).addBox(-1.1F, 0.5131F, -6.2139F, 4.0F, 8.0F, 5.0F, -0.2F, false);
			Left_Arm3.setTextureOffset(72, 158).addBox(-3.1F, 6.5131F, -4.2139F, 3.0F, 2.0F, 1.0F, -0.2F, false);
			Left_Arm3.setTextureOffset(84, 150).addBox(-3.1F, 6.5131F, -2.2139F, 3.0F, 2.0F, 1.0F, -0.2F, false);
			Left_Arm3.setTextureOffset(84, 153).addBox(-3.1F, 6.5131F, -6.2139F, 3.0F, 2.0F, 1.0F, -0.2F, false);
			Right_Arm1 = new ModelRenderer(this);
			Right_Arm1.setRotationPoint(-8.0F, 5.0F, 3.0F);
			Bary_Body.addChild(Right_Arm1);
			setRotationAngle(Right_Arm1, 0.1745F, 0.0F, 0.0F);
			Right_Arm1.setTextureOffset(56, 135).addBox(-1.0F, -1.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, false);
			Right_Arm2 = new ModelRenderer(this);
			Right_Arm2.setRotationPoint(0.0F, 6.8871F, -0.2902F);
			Right_Arm1.addChild(Right_Arm2);
			setRotationAngle(Right_Arm2, 0.3491F, 0.0F, 0.0F);
			Right_Arm2.setTextureOffset(36, 150).addBox(-1.0F, -0.8871F, -1.7098F, 4.0F, 7.0F, 5.0F, -0.1F, false);
			Right_Arm3 = new ModelRenderer(this);
			Right_Arm3.setRotationPoint(0.0F, 7.1129F, 0.2902F);
			Right_Arm2.addChild(Right_Arm3);
			setRotationAngle(Right_Arm3, -1.5708F, 0.0F, 0.0F);
			Right_Arm3.setTextureOffset(0, 150).addBox(-1.0F, 0.5131F, -6.323F, 4.0F, 8.0F, 5.0F, -0.2F, false);
			Right_Arm3.setTextureOffset(0, 163).addBox(2.0F, 6.5131F, -2.323F, 3.0F, 2.0F, 1.0F, -0.2F, false);
			Right_Arm3.setTextureOffset(8, 163).addBox(2.0F, 6.5131F, -4.323F, 3.0F, 2.0F, 1.0F, -0.2F, false);
			Right_Arm3.setTextureOffset(16, 163).addBox(2.0F, 6.5131F, -6.323F, 3.0F, 2.0F, 1.0F, -0.2F, false);
			Bary_Left_Leg = new ModelRenderer(this);
			Bary_Left_Leg.setRotationPoint(7.0F, -5.0F, 22.0F);
			Bary_Left_Leg.setTextureOffset(72, 64).addBox(0.0F, -4.0F, -6.0F, 4.0F, 16.0F, 11.0F, 0.0F, false);
			Bary_Left_Leg2 = new ModelRenderer(this);
			Bary_Left_Leg2.setRotationPoint(1.0F, 16.0F, 0.0F);
			Bary_Left_Leg.addChild(Bary_Left_Leg2);
			Bary_Left_Leg2.setTextureOffset(60, 112).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 14.0F, 9.0F, 0.0F, false);
			Bary_Left_Leg3 = new ModelRenderer(this);
			Bary_Left_Leg3.setRotationPoint(0.0F, 15.0F, 0.0F);
			Bary_Left_Leg2.addChild(Bary_Left_Leg3);
			Bary_Left_Leg3.setTextureOffset(110, 91).addBox(-2.0F, -5.0F, -8.0F, 6.0F, 3.0F, 13.0F, 0.0F, false);
			Bary_Left_Leg4 = new ModelRenderer(this);
			Bary_Left_Leg4.setRotationPoint(-7.0F, -5.0F, 22.0F);
			Bary_Left_Leg4.setTextureOffset(42, 64).addBox(-4.0F, -4.0F, -6.0F, 4.0F, 16.0F, 11.0F, 0.0F, false);
			Bary_Left_Leg5 = new ModelRenderer(this);
			Bary_Left_Leg5.setRotationPoint(-3.0F, 16.0F, 0.0F);
			Bary_Left_Leg4.addChild(Bary_Left_Leg5);
			Bary_Left_Leg5.setTextureOffset(34, 112).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 14.0F, 9.0F, 0.0F, false);
			Bary_Left_Leg6 = new ModelRenderer(this);
			Bary_Left_Leg6.setRotationPoint(0.0F, 15.0F, 0.0F);
			Bary_Left_Leg5.addChild(Bary_Left_Leg6);
			Bary_Left_Leg6.setTextureOffset(72, 91).addBox(-2.0F, -5.0F, -8.0F, 6.0F, 3.0F, 13.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Bary_Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Bary_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
			Bary_Body.render(matrixStack, buffer, packedLight, packedOverlay);
			Bary_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
			Bary_Left_Leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Bary_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Bary_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Bary_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Bary_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Bary_Tail1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Bary_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Bary_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Bary_Left_Leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
