
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
public class CeratosaurusEntity extends PrehistoricKingdomModElements.ModElement {
	public static EntityType entity = null;
	public CeratosaurusEntity(PrehistoricKingdomModElements instance) {
		super(instance, 39);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.AMBIENT).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.6f, 1.8f)).build("ceratosaurus")
						.setRegistryName("ceratosaurus");
		elements.entities.add(() -> entity);
		elements.items
				.add(() -> new SpawnEggItem(entity, -154, -10066330, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("ceratosaurus"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelCeratosaurusRemodel(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("prehistoric_kingdom:textures/ceratosaurus_skin_1.png");
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
			experienceValue = 80;
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
			this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.4));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, true));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, BaryonyxEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, MajungasaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, CowEntity.class, false, true));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, PigEntity.class, false, true));
			this.goalSelector.addGoal(10, new AvoidEntityGoal(this, AllosaurusEntity.CustomEntity.class, (float) 8, 0.6, 0.4));
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
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(80);
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
	public static class ModelCeratosaurusRemodel extends EntityModel<Entity> {
		private final ModelRenderer Cerato_Head;
		private final ModelRenderer Cerato_Jaw;
		private final ModelRenderer Cerato_FrontHorn;
		private final ModelRenderer Cerato_Backhorn1;
		private final ModelRenderer Cerato_Backhorn2;
		private final ModelRenderer Cerato_Neck2;
		private final ModelRenderer Cerato_Body;
		private final ModelRenderer Cerato_Tail;
		private final ModelRenderer Cerato_Tail2;
		private final ModelRenderer Cerato_Tail3;
		private final ModelRenderer Cerato_Tail4;
		private final ModelRenderer Cerato_Left_Arm;
		private final ModelRenderer Cerato_Left_Arm2;
		private final ModelRenderer Cerato_Right_Arm;
		private final ModelRenderer Cerato_Right_Arm2;
		private final ModelRenderer Cerato_Left_Leg;
		private final ModelRenderer Cerato_Left_Leg2;
		private final ModelRenderer Cerato_Left_Leg3;
		private final ModelRenderer Cerato_Left_Leg4;
		private final ModelRenderer Cerato_Left_Leg5;
		private final ModelRenderer Cerato_Left_Leg6;
		public ModelCeratosaurusRemodel() {
			textureWidth = 192;
			textureHeight = 192;
			Cerato_Head = new ModelRenderer(this);
			Cerato_Head.setRotationPoint(0.0F, -17.0F, -18.0F);
			setRotationAngle(Cerato_Head, 0.1745F, 0.0F, 0.0F);
			Cerato_Head.setTextureOffset(36, 122).addBox(-5.0F, -6.0F, -8.0F, 10.0F, 10.0F, 8.0F, 0.0F, false);
			Cerato_Head.setTextureOffset(0, 122).addBox(-4.0F, -5.0F, -18.0F, 8.0F, 9.0F, 10.0F, 0.0F, false);
			Cerato_Jaw = new ModelRenderer(this);
			Cerato_Jaw.setRotationPoint(0.0F, 4.0F, 0.0F);
			Cerato_Head.addChild(Cerato_Jaw);
			Cerato_Jaw.setTextureOffset(0, 148).addBox(-5.0F, 0.0F, -8.0F, 10.0F, 2.0F, 8.0F, 0.0F, false);
			Cerato_Jaw.setTextureOffset(36, 148).addBox(-4.0F, 0.0F, -17.0F, 8.0F, 2.0F, 9.0F, 0.0F, false);
			Cerato_FrontHorn = new ModelRenderer(this);
			Cerato_FrontHorn.setRotationPoint(0.0F, -5.0F, -16.0F);
			Cerato_Head.addChild(Cerato_FrontHorn);
			setRotationAngle(Cerato_FrontHorn, 0.3491F, 0.0F, 0.0F);
			Cerato_FrontHorn.setTextureOffset(18, 165).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 3.0F, 0.0F, false);
			Cerato_Backhorn1 = new ModelRenderer(this);
			Cerato_Backhorn1.setRotationPoint(3.0F, -6.0F, -6.0F);
			Cerato_Head.addChild(Cerato_Backhorn1);
			setRotationAngle(Cerato_Backhorn1, 0.1745F, 0.0F, 0.0F);
			Cerato_Backhorn1.setTextureOffset(28, 165).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			Cerato_Backhorn2 = new ModelRenderer(this);
			Cerato_Backhorn2.setRotationPoint(-3.0F, -6.0F, -6.0F);
			Cerato_Head.addChild(Cerato_Backhorn2);
			setRotationAngle(Cerato_Backhorn2, 0.1745F, 0.0F, 0.0F);
			Cerato_Backhorn2.setTextureOffset(18, 172).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			Cerato_Neck2 = new ModelRenderer(this);
			Cerato_Neck2.setRotationPoint(0.0F, -17.0F, -16.0F);
			setRotationAngle(Cerato_Neck2, -0.1745F, 0.0F, 0.0F);
			Cerato_Neck2.setTextureOffset(0, 73).addBox(-4.0F, -5.0152F, -3.8264F, 8.0F, 11.0F, 14.0F, 0.0F, false);
			Cerato_Body = new ModelRenderer(this);
			Cerato_Body.setRotationPoint(0.0F, -9.0F, -7.0F);
			Cerato_Body.setTextureOffset(0, 0).addBox(-7.0F, -12.0F, 10.0F, 14.0F, 19.0F, 26.0F, 0.0F, false);
			Cerato_Body.setTextureOffset(102, 45).addBox(-6.0F, -12.0F, 0.0F, 12.0F, 18.0F, 10.0F, 0.0F, false);
			Cerato_Tail = new ModelRenderer(this);
			Cerato_Tail.setRotationPoint(0.0F, 1.0F, 36.0F);
			Cerato_Body.addChild(Cerato_Tail);
			setRotationAngle(Cerato_Tail, -0.0873F, 0.0F, 0.0F);
			Cerato_Tail.setTextureOffset(80, 0).addBox(-6.0F, -10.0F, -1.0F, 12.0F, 14.0F, 16.0F, 0.0F, false);
			Cerato_Tail2 = new ModelRenderer(this);
			Cerato_Tail2.setRotationPoint(0.0F, 0.797F, 15.0697F);
			Cerato_Tail.addChild(Cerato_Tail2);
			setRotationAngle(Cerato_Tail2, 0.0873F, 0.0F, 0.0F);
			Cerato_Tail2.setTextureOffset(0, 45).addBox(-5.0F, -9.0F, -1.0F, 10.0F, 12.0F, 16.0F, 0.0F, false);
			Cerato_Tail3 = new ModelRenderer(this);
			Cerato_Tail3.setRotationPoint(0.0F, 0.9F, 15.0F);
			Cerato_Tail2.addChild(Cerato_Tail3);
			setRotationAngle(Cerato_Tail3, 0.0873F, 0.0F, 0.0F);
			Cerato_Tail3.setTextureOffset(52, 45).addBox(-4.0F, -8.0F, -1.0F, 8.0F, 10.0F, 17.0F, 0.0F, false);
			Cerato_Tail4 = new ModelRenderer(this);
			Cerato_Tail4.setRotationPoint(0.0F, 0.797F, 15.9303F);
			Cerato_Tail3.addChild(Cerato_Tail4);
			setRotationAngle(Cerato_Tail4, 0.0873F, 0.0F, 0.0F);
			Cerato_Tail4.setTextureOffset(0, 101).addBox(-3.0F, -7.0F, -1.0F, 6.0F, 8.0F, 13.0F, 0.0F, false);
			Cerato_Left_Arm = new ModelRenderer(this);
			Cerato_Left_Arm.setRotationPoint(7.0F, -6.0F, -2.0F);
			Cerato_Left_Arm.setTextureOffset(92, 148).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 10.0F, 7.0F, 0.0F, false);
			Cerato_Left_Arm2 = new ModelRenderer(this);
			Cerato_Left_Arm2.setRotationPoint(2.0F, 6.0F, 0.0F);
			Cerato_Left_Arm.addChild(Cerato_Left_Arm2);
			setRotationAngle(Cerato_Left_Arm2, -0.3491F, 0.0F, 0.0F);
			Cerato_Left_Arm2.setTextureOffset(0, 165).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);
			Cerato_Left_Arm2.setTextureOffset(36, 171).addBox(-4.0F, 6.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Cerato_Left_Arm2.setTextureOffset(36, 168).addBox(-4.0F, 6.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Cerato_Left_Arm2.setTextureOffset(36, 165).addBox(-4.0F, 6.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Cerato_Right_Arm = new ModelRenderer(this);
			Cerato_Right_Arm.setRotationPoint(-9.0F, -6.0F, -2.0F);
			Cerato_Right_Arm.setTextureOffset(70, 148).addBox(-1.0F, -4.0F, -4.0F, 4.0F, 10.0F, 7.0F, 0.0F, false);
			Cerato_Right_Arm2 = new ModelRenderer(this);
			Cerato_Right_Arm2.setRotationPoint(2.0F, 6.0F, 0.0F);
			Cerato_Right_Arm.addChild(Cerato_Right_Arm2);
			setRotationAngle(Cerato_Right_Arm2, -0.3491F, 0.0F, 0.0F);
			Cerato_Right_Arm2.setTextureOffset(114, 148).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 9.0F, 5.0F, 0.0F, false);
			Cerato_Right_Arm2.setTextureOffset(28, 176).addBox(1.0F, 6.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Cerato_Right_Arm2.setTextureOffset(28, 173).addBox(1.0F, 6.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Cerato_Right_Arm2.setTextureOffset(28, 170).addBox(1.0F, 6.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Cerato_Left_Leg = new ModelRenderer(this);
			Cerato_Left_Leg.setRotationPoint(7.0F, -10.0F, 20.0F);
			Cerato_Left_Leg.setTextureOffset(78, 73).addBox(-1.0F, -2.0F, -4.0F, 5.0F, 16.0F, 12.0F, 0.0F, false);
			Cerato_Left_Leg2 = new ModelRenderer(this);
			Cerato_Left_Leg2.setRotationPoint(0.0F, 15.0F, 1.0F);
			Cerato_Left_Leg.addChild(Cerato_Left_Leg2);
			Cerato_Left_Leg2.setTextureOffset(98, 122).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 18.0F, 8.0F, -0.1F, false);
			Cerato_Left_Leg3 = new ModelRenderer(this);
			Cerato_Left_Leg3.setRotationPoint(0.0F, 18.0F, 0.0F);
			Cerato_Left_Leg2.addChild(Cerato_Left_Leg3);
			Cerato_Left_Leg3.setTextureOffset(78, 101).addBox(-2.0F, -2.0F, -6.0F, 7.0F, 4.0F, 13.0F, 0.0F, false);
			Cerato_Left_Leg4 = new ModelRenderer(this);
			Cerato_Left_Leg4.setRotationPoint(-7.0F, -10.0F, 20.0F);
			Cerato_Left_Leg4.setTextureOffset(44, 73).addBox(-4.0F, -2.0F, -4.0F, 5.0F, 16.0F, 12.0F, 0.0F, false);
			Cerato_Left_Leg5 = new ModelRenderer(this);
			Cerato_Left_Leg5.setRotationPoint(-3.0F, 15.0F, 1.0F);
			Cerato_Left_Leg4.addChild(Cerato_Left_Leg5);
			Cerato_Left_Leg5.setTextureOffset(72, 122).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 18.0F, 8.0F, -0.1F, false);
			Cerato_Left_Leg6 = new ModelRenderer(this);
			Cerato_Left_Leg6.setRotationPoint(0.0F, 18.0F, 0.0F);
			Cerato_Left_Leg5.addChild(Cerato_Left_Leg6);
			Cerato_Left_Leg6.setTextureOffset(38, 101).addBox(-2.0F, -2.0F, -6.0F, 7.0F, 4.0F, 13.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Cerato_Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Cerato_Neck2.render(matrixStack, buffer, packedLight, packedOverlay);
			Cerato_Body.render(matrixStack, buffer, packedLight, packedOverlay);
			Cerato_Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
			Cerato_Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
			Cerato_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
			Cerato_Left_Leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Cerato_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Cerato_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Cerato_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Cerato_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Cerato_Left_Leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Cerato_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Cerato_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Cerato_Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
