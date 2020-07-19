
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
public class AllosaurusEntity extends PrehistoricKingdomModElements.ModElement {
	public static EntityType entity = null;
	public AllosaurusEntity(PrehistoricKingdomModElements instance) {
		super(instance, 37);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.AMBIENT).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 1.8f)).build("allosaurus")
						.setRegistryName("allosaurus");
		elements.entities.add(() -> entity);
		elements.items
				.add(() -> new SpawnEggItem(entity, -13421773, -39373, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("allosaurus"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelAllosaurus_Remodel(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("prehistoric_kingdom:textures/allosaurus_remodel_skin_3.png");
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
			experienceValue = 110;
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
			this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.5));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, true));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, BaryonyxEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, CeratosaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MajungasaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CowEntity.class, false, true));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, PigEntity.class, false, true));
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
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(110);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7);
		}
	}

	// Made with Blockbench 3.6.0
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelAllosaurus_Remodel extends EntityModel<Entity> {
		private final ModelRenderer Allo_Head;
		private final ModelRenderer Allo_Jaw;
		private final ModelRenderer Allo_Crest1;
		private final ModelRenderer Allo_Crest2;
		private final ModelRenderer Allo_Neck;
		private final ModelRenderer Allo_Body;
		private final ModelRenderer Allo_Tail1;
		private final ModelRenderer Allo_Tail2;
		private final ModelRenderer Allo_Tail3;
		private final ModelRenderer Allo_Tail4;
		private final ModelRenderer Allo_Left_Arm;
		private final ModelRenderer Cerato_Left_Arm2;
		private final ModelRenderer Allo_Right_Arm;
		private final ModelRenderer Cerato_Right_Arm2;
		private final ModelRenderer Allo_Left_Leg1;
		private final ModelRenderer Allo_Left_Leg2;
		private final ModelRenderer Allo_Left_Leg3;
		private final ModelRenderer Allo_Right_Leg1;
		private final ModelRenderer Allo_Right_Leg2;
		private final ModelRenderer Allo_Right_Leg3;
		public ModelAllosaurus_Remodel() {
			textureWidth = 208;
			textureHeight = 208;
			Allo_Head = new ModelRenderer(this);
			Allo_Head.setRotationPoint(0.0F, -22.0F, -22.0F);
			setRotationAngle(Allo_Head, 0.1745F, 0.0F, 0.0F);
			Allo_Head.setTextureOffset(40, 165).addBox(-5.0F, -6.0F, -8.0F, 10.0F, 10.0F, 8.0F, 0.0F, false);
			Allo_Head.setTextureOffset(44, 111).addBox(-4.0F, -5.0F, -21.0F, 8.0F, 9.0F, 13.0F, 0.0F, false);
			Allo_Jaw = new ModelRenderer(this);
			Allo_Jaw.setRotationPoint(0.0F, 4.0F, 0.0F);
			Allo_Head.addChild(Allo_Jaw);
			Allo_Jaw.setTextureOffset(76, 165).addBox(-5.0F, 0.0F, -8.0F, 10.0F, 2.0F, 8.0F, 0.0F, false);
			Allo_Jaw.setTextureOffset(0, 165).addBox(-4.0F, 0.0F, -20.0F, 8.0F, 2.0F, 12.0F, 0.0F, false);
			Allo_Crest1 = new ModelRenderer(this);
			Allo_Crest1.setRotationPoint(3.0F, -6.0F, -6.0F);
			Allo_Head.addChild(Allo_Crest1);
			setRotationAngle(Allo_Crest1, 0.1745F, 0.0F, 0.5236F);
			Allo_Crest1.setTextureOffset(98, 136).addBox(-1.0F, -2.0F, -14.0F, 2.0F, 3.0F, 17.0F, 0.0F, false);
			Allo_Crest2 = new ModelRenderer(this);
			Allo_Crest2.setRotationPoint(-3.0F, -6.0F, -6.0F);
			Allo_Head.addChild(Allo_Crest2);
			setRotationAngle(Allo_Crest2, 0.1745F, 0.0F, -0.5236F);
			Allo_Crest2.setTextureOffset(60, 136).addBox(-1.0F, -2.0F, -14.0F, 2.0F, 3.0F, 17.0F, 0.0F, false);
			Allo_Neck = new ModelRenderer(this);
			Allo_Neck.setRotationPoint(0.0F, -22.0F, -20.0F);
			setRotationAngle(Allo_Neck, -0.1745F, 0.0F, 0.0F);
			Allo_Neck.setTextureOffset(0, 111).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 11.0F, 14.0F, 0.0F, false);
			Allo_Body = new ModelRenderer(this);
			Allo_Body.setRotationPoint(0.0F, -13.0F, -7.0F);
			setRotationAngle(Allo_Body, 0.0873F, 0.0F, 0.0F);
			Allo_Body.setTextureOffset(0, 0).addBox(-7.0F, -12.0F, 8.0F, 14.0F, 19.0F, 26.0F, 0.0F, false);
			Allo_Body.setTextureOffset(122, 45).addBox(-6.0F, -12.0F, -4.0F, 12.0F, 18.0F, 12.0F, 0.0F, false);
			Allo_Tail1 = new ModelRenderer(this);
			Allo_Tail1.setRotationPoint(0.0F, -3.0F, 35.0F);
			Allo_Body.addChild(Allo_Tail1);
			setRotationAngle(Allo_Tail1, -0.1745F, 0.0F, 0.0F);
			Allo_Tail1.setTextureOffset(80, 0).addBox(-6.0F, -7.0F, -3.0F, 12.0F, 15.0F, 21.0F, 0.0F, false);
			Allo_Tail2 = new ModelRenderer(this);
			Allo_Tail2.setRotationPoint(0.0F, 1.0F, 19.0F);
			Allo_Tail1.addChild(Allo_Tail2);
			setRotationAngle(Allo_Tail2, 0.0873F, 0.0F, 0.0F);
			Allo_Tail2.setTextureOffset(0, 45).addBox(-5.0F, -7.0F, -2.0F, 10.0F, 13.0F, 21.0F, 0.0F, false);
			Allo_Tail3 = new ModelRenderer(this);
			Allo_Tail3.setRotationPoint(0.0F, 0.0F, 17.0F);
			Allo_Tail2.addChild(Allo_Tail3);
			setRotationAngle(Allo_Tail3, 0.0873F, 0.0F, 0.0F);
			Allo_Tail3.setTextureOffset(62, 45).addBox(-4.0F, -6.0489F, -1.2161F, 8.0F, 12.0F, 22.0F, 0.0F, false);
			Allo_Tail4 = new ModelRenderer(this);
			Allo_Tail4.setRotationPoint(2.0F, 2.0F, 19.0F);
			Allo_Tail3.addChild(Allo_Tail4);
			setRotationAngle(Allo_Tail4, 0.0873F, 0.0F, 0.0F);
			Allo_Tail4.setTextureOffset(0, 79).addBox(-5.0F, -6.0F, -1.0F, 6.0F, 10.0F, 18.0F, 0.0F, false);
			Allo_Left_Arm = new ModelRenderer(this);
			Allo_Left_Arm.setRotationPoint(7.0F, -10.0F, -6.0F);
			Allo_Left_Arm.setTextureOffset(134, 165).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 10.0F, 7.0F, 0.0F, false);
			Cerato_Left_Arm2 = new ModelRenderer(this);
			Cerato_Left_Arm2.setRotationPoint(2.0F, 6.0F, 0.0F);
			Allo_Left_Arm.addChild(Cerato_Left_Arm2);
			setRotationAngle(Cerato_Left_Arm2, -0.3491F, 0.0F, 0.0F);
			Cerato_Left_Arm2.setTextureOffset(18, 183).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);
			Cerato_Left_Arm2.setTextureOffset(40, 186).addBox(-4.0F, 6.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Cerato_Left_Arm2.setTextureOffset(40, 183).addBox(-4.0F, 6.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Cerato_Left_Arm2.setTextureOffset(36, 192).addBox(-4.0F, 6.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Allo_Right_Arm = new ModelRenderer(this);
			Allo_Right_Arm.setRotationPoint(-9.0F, -10.0F, -6.0F);
			Allo_Right_Arm.setTextureOffset(112, 165).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 10.0F, 7.0F, 0.0F, false);
			Cerato_Right_Arm2 = new ModelRenderer(this);
			Cerato_Right_Arm2.setRotationPoint(2.0F, 6.0F, 0.0F);
			Allo_Right_Arm.addChild(Cerato_Right_Arm2);
			setRotationAngle(Cerato_Right_Arm2, -0.3491F, 0.0F, 0.0F);
			Cerato_Right_Arm2.setTextureOffset(0, 183).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);
			Cerato_Right_Arm2.setTextureOffset(36, 189).addBox(1.0F, 6.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Cerato_Right_Arm2.setTextureOffset(36, 186).addBox(1.0F, 6.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Cerato_Right_Arm2.setTextureOffset(36, 183).addBox(1.0F, 6.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Allo_Left_Leg1 = new ModelRenderer(this);
			Allo_Left_Leg1.setRotationPoint(7.0F, -9.0F, 17.0F);
			Allo_Left_Leg1.setTextureOffset(86, 79).addBox(-1.0F, -6.0F, -7.0F, 5.0F, 18.0F, 14.0F, 0.0F, false);
			Allo_Left_Leg2 = new ModelRenderer(this);
			Allo_Left_Leg2.setRotationPoint(0.0F, 7.0F, 0.0F);
			Allo_Left_Leg1.addChild(Allo_Left_Leg2);
			Allo_Left_Leg2.setTextureOffset(30, 136).addBox(-1.0F, 4.0F, -3.0F, 5.0F, 19.0F, 10.0F, -0.1F, false);
			Allo_Left_Leg3 = new ModelRenderer(this);
			Allo_Left_Leg3.setRotationPoint(0.0F, 25.0F, 0.0F);
			Allo_Left_Leg2.addChild(Allo_Left_Leg3);
			Allo_Left_Leg3.setTextureOffset(130, 111).addBox(-2.0F, -2.0F, -8.0F, 7.0F, 4.0F, 15.0F, -0.1F, false);
			Allo_Right_Leg1 = new ModelRenderer(this);
			Allo_Right_Leg1.setRotationPoint(-7.0F, -9.0F, 17.0F);
			Allo_Right_Leg1.setTextureOffset(48, 79).addBox(-4.0F, -6.0F, -7.0F, 5.0F, 18.0F, 14.0F, 0.0F, false);
			Allo_Right_Leg2 = new ModelRenderer(this);
			Allo_Right_Leg2.setRotationPoint(-3.0F, 7.0F, 0.0F);
			Allo_Right_Leg1.addChild(Allo_Right_Leg2);
			Allo_Right_Leg2.setTextureOffset(0, 136).addBox(-1.0F, 4.0F, -3.0F, 5.0F, 19.0F, 10.0F, -0.1F, false);
			Allo_Right_Leg3 = new ModelRenderer(this);
			Allo_Right_Leg3.setRotationPoint(0.0F, 25.0F, 0.0F);
			Allo_Right_Leg2.addChild(Allo_Right_Leg3);
			Allo_Right_Leg3.setTextureOffset(86, 111).addBox(-2.0F, -2.0F, -8.0F, 7.0F, 4.0F, 15.0F, -0.1F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Allo_Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Allo_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
			Allo_Body.render(matrixStack, buffer, packedLight, packedOverlay);
			Allo_Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
			Allo_Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
			Allo_Left_Leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			Allo_Right_Leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Allo_Right_Leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Allo_Left_Leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Allo_Tail1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Allo_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Allo_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Allo_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Allo_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Allo_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
