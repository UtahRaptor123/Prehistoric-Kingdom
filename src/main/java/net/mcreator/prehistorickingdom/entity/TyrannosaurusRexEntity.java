
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
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
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
public class TyrannosaurusRexEntity extends PrehistoricKingdomModElements.ModElement {
	public static EntityType entity = null;
	public TyrannosaurusRexEntity(PrehistoricKingdomModElements instance) {
		super(instance, 43);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(2.4f, 2.8f)).build("tyrannosaurus_rex")
						.setRegistryName("tyrannosaurus_rex");
		elements.entities.add(() -> entity);
		elements.items.add(
				() -> new SpawnEggItem(entity, -6737152, -3381760, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("tyrannosaurus_rex"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelTyrannosaurusRex(), 0.8f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("prehistoric_kingdom:textures/tyrannosaurusrex_skin.png");
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
			experienceValue = 170;
			setNoAI(false);
			enablePersistence();
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false));
			this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 0.2));
			this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(5, new SwimGoal(this));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, true));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, AllosaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, CeratosaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, TovosaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, UtahRaptorEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, ProtocertopsEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, CamptosaurusEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, OviraptorEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, CowEntity.class, false, true));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, PigEntity.class, false, true));
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
			return super.getMountedYOffset() + 2.2;
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
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(170);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(25);
		}
	}

	// Made with Blockbench 3.5.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelTyrannosaurusRex extends EntityModel<Entity> {
		private final ModelRenderer Rex_Head;
		private final ModelRenderer Rex_Jaw;
		private final ModelRenderer Rex_Neck;
		private final ModelRenderer Rex_Body;
		private final ModelRenderer Rex_Tail;
		private final ModelRenderer Rex_Tail2;
		private final ModelRenderer Rex_Tail3;
		private final ModelRenderer Rex_Tail4;
		private final ModelRenderer Rex_Left_Arm;
		private final ModelRenderer Rex_Left_Arm2;
		private final ModelRenderer Rex_Right_Arm;
		private final ModelRenderer Rex_Right_Arm2;
		private final ModelRenderer Rex_Left_Leg;
		private final ModelRenderer Rex_Left_Leg2;
		private final ModelRenderer Rex_Left_Leg3;
		private final ModelRenderer Rex_Right_Leg;
		private final ModelRenderer Rex_Right_Leg2;
		private final ModelRenderer Rex_Right_Leg3;
		public ModelTyrannosaurusRex() {
			textureWidth = 256;
			textureHeight = 256;
			Rex_Head = new ModelRenderer(this);
			Rex_Head.setRotationPoint(0.0F, -32.0F, -29.0F);
			Rex_Head.setTextureOffset(194, 226).addBox(-6.0F, -7.0F, -34.0F, 13.0F, 12.0F, 18.0F, 0.0F, false);
			Rex_Head.setTextureOffset(194, 192).addBox(-7.0F, -9.0F, -16.0F, 15.0F, 17.0F, 16.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -32.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -30.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -28.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -26.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -24.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(-6.0F, 5.0F, -18.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(-4.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -32.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -30.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -28.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -26.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -24.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(6.0F, 5.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(5.0F, 5.0F, -18.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(4.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(-2.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(0.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Head.setTextureOffset(0, 0).addBox(2.0F, 5.0F, -34.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw = new ModelRenderer(this);
			Rex_Jaw.setRotationPoint(0.0F, 6.0F, -16.0F);
			Rex_Head.addChild(Rex_Jaw);
			setRotationAngle(Rex_Jaw, 0.2618F, 0.0F, 0.0F);
			Rex_Jaw.setTextureOffset(198, 168).addBox(-5.0F, -1.0F, -17.0F, 11.0F, 3.0F, 18.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(4.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(4.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(3.0F, -2.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(1.0F, -2.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Neck = new ModelRenderer(this);
			Rex_Neck.setRotationPoint(0.0F, -32.0F, -29.0F);
			setRotationAngle(Rex_Neck, -0.5236F, 0.0F, 0.0F);
			Rex_Neck.setTextureOffset(194, 130).addBox(-6.0F, -7.0F, -5.0F, 13.0F, 14.0F, 18.0F, 0.0F, false);
			Rex_Body = new ModelRenderer(this);
			Rex_Body.setRotationPoint(0.0F, -27.0F, -18.0F);
			Rex_Body.setTextureOffset(180, 84).addBox(-8.0F, -8.0F, -4.0F, 17.0F, 22.0F, 21.0F, 0.0F, false);
			Rex_Body.setTextureOffset(160, 28).addBox(-9.0F, -8.0F, 17.0F, 19.0F, 23.0F, 29.0F, 0.0F, false);
			Rex_Tail = new ModelRenderer(this);
			Rex_Tail.setRotationPoint(0.0F, 0.0F, 46.0F);
			Rex_Body.addChild(Rex_Tail);
			setRotationAngle(Rex_Tail, 0.0873F, 0.0F, 0.0F);
			Rex_Tail.setTextureOffset(120, 217).addBox(-7.0F, -6.0F, -1.0F, 15.0F, 18.0F, 21.0F, 0.0F, false);
			Rex_Tail2 = new ModelRenderer(this);
			Rex_Tail2.setRotationPoint(0.0F, 3.0F, 20.0F);
			Rex_Tail.addChild(Rex_Tail2);
			setRotationAngle(Rex_Tail2, 0.0873F, 0.0F, 0.0F);
			Rex_Tail2.setTextureOffset(129, 176).addBox(-5.0F, -7.0F, -1.0F, 11.0F, 15.0F, 21.0F, 0.0F, false);
			Rex_Tail3 = new ModelRenderer(this);
			Rex_Tail3.setRotationPoint(0.0F, 1.0F, 20.0F);
			Rex_Tail2.addChild(Rex_Tail3);
			setRotationAngle(Rex_Tail3, 0.0873F, 0.0F, 0.0F);
			Rex_Tail3.setTextureOffset(132, 136).addBox(-4.0F, -6.0F, -1.0F, 9.0F, 12.0F, 21.0F, 0.0F, false);
			Rex_Tail4 = new ModelRenderer(this);
			Rex_Tail4.setRotationPoint(0.0F, 0.0F, 20.0F);
			Rex_Tail3.addChild(Rex_Tail4);
			setRotationAngle(Rex_Tail4, 0.0873F, 0.0F, 0.0F);
			Rex_Tail4.setTextureOffset(120, 97).addBox(-3.0F, -4.0F, -1.0F, 7.0F, 9.0F, 21.0F, 0.0F, false);
			Rex_Left_Arm = new ModelRenderer(this);
			Rex_Left_Arm.setRotationPoint(0.0F, 24.0F, 0.0F);
			Rex_Left_Arm.setTextureOffset(168, 0).addBox(5.0F, -45.0F, -21.0F, 5.0F, 11.0F, 8.0F, 0.0F, false);
			Rex_Left_Arm2 = new ModelRenderer(this);
			Rex_Left_Arm2.setRotationPoint(8.0F, -34.0F, -17.0F);
			Rex_Left_Arm.addChild(Rex_Left_Arm2);
			setRotationAngle(Rex_Left_Arm2, 0.7854F, 0.0F, 0.0F);
			Rex_Left_Arm2.setTextureOffset(139, 0).addBox(-3.0F, -2.0F, -2.0F, 5.0F, 9.0F, 6.0F, 0.0F, false);
			Rex_Left_Arm2.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Rex_Left_Arm2.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Rex_Right_Arm = new ModelRenderer(this);
			Rex_Right_Arm.setRotationPoint(-14.0F, 24.0F, 0.0F);
			Rex_Right_Arm.setTextureOffset(230, 0).addBox(5.0F, -45.0F, -21.0F, 5.0F, 11.0F, 8.0F, 0.0F, false);
			Rex_Right_Arm2 = new ModelRenderer(this);
			Rex_Right_Arm2.setRotationPoint(8.0F, -34.0F, -17.0F);
			Rex_Right_Arm.addChild(Rex_Right_Arm2);
			setRotationAngle(Rex_Right_Arm2, 0.7854F, 0.0F, 0.0F);
			Rex_Right_Arm2.setTextureOffset(202, 0).addBox(-3.0F, -2.0F, -2.0F, 5.0F, 9.0F, 6.0F, 0.0F, false);
			Rex_Right_Arm2.setTextureOffset(0, 0).addBox(2.0F, 5.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Rex_Right_Arm2.setTextureOffset(0, 0).addBox(2.0F, 5.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Rex_Left_Leg = new ModelRenderer(this);
			Rex_Left_Leg.setRotationPoint(10.0F, -15.0F, 19.0F);
			Rex_Left_Leg.setTextureOffset(0, 164).addBox(-8.0F, -14.0F, -11.0F, 9.0F, 26.0F, 19.0F, 0.0F, false);
			Rex_Left_Leg2 = new ModelRenderer(this);
			Rex_Left_Leg2.setRotationPoint(0.0F, 24.0F, 3.0F);
			Rex_Left_Leg.addChild(Rex_Left_Leg2);
			setRotationAngle(Rex_Left_Leg2, 0.2618F, 0.0F, 0.0F);
			Rex_Left_Leg2.setTextureOffset(0, 120).addBox(-8.0F, -14.0F, -6.0F, 9.0F, 25.0F, 13.0F, 0.0F, false);
			Rex_Left_Leg3 = new ModelRenderer(this);
			Rex_Left_Leg3.setRotationPoint(0.0F, 12.0F, -2.0F);
			Rex_Left_Leg2.addChild(Rex_Left_Leg3);
			setRotationAngle(Rex_Left_Leg3, -0.2618F, 0.0F, 0.0F);
			Rex_Left_Leg3.setTextureOffset(0, 46).addBox(-8.0F, -3.0F, -13.0F, 9.0F, 6.0F, 21.0F, 0.0F, false);
			Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -15.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -15.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-5.0F, 1.0F, -17.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-8.0F, -1.0F, -15.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-8.0F, 1.0F, -17.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Rex_Left_Leg3.setTextureOffset(0, 0).addBox(-1.0F, 1.0F, -17.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Rex_Right_Leg = new ModelRenderer(this);
			Rex_Right_Leg.setRotationPoint(-2.0F, -15.0F, 19.0F);
			Rex_Right_Leg.setTextureOffset(0, 211).addBox(-8.0F, -14.0F, -11.0F, 9.0F, 26.0F, 19.0F, 0.0F, false);
			Rex_Right_Leg2 = new ModelRenderer(this);
			Rex_Right_Leg2.setRotationPoint(0.0F, 24.0F, 3.0F);
			Rex_Right_Leg.addChild(Rex_Right_Leg2);
			setRotationAngle(Rex_Right_Leg2, 0.2618F, 0.0F, 0.0F);
			Rex_Right_Leg2.setTextureOffset(0, 76).addBox(-8.0F, -14.0F, -6.0F, 9.0F, 25.0F, 13.0F, 0.0F, false);
			Rex_Right_Leg3 = new ModelRenderer(this);
			Rex_Right_Leg3.setRotationPoint(0.0F, 12.0F, -2.0F);
			Rex_Right_Leg2.addChild(Rex_Right_Leg3);
			setRotationAngle(Rex_Right_Leg3, -0.2618F, 0.0F, 0.0F);
			Rex_Right_Leg3.setTextureOffset(0, 17).addBox(-8.0F, -3.0F, -13.0F, 9.0F, 6.0F, 21.0F, 0.0F, false);
			Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -15.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-1.0F, 1.0F, -17.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-8.0F, 1.0F, -17.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-5.0F, 1.0F, -17.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -15.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			Rex_Right_Leg3.setTextureOffset(0, 0).addBox(-8.0F, -1.0F, -15.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Rex_Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Rex_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
			Rex_Body.render(matrixStack, buffer, packedLight, packedOverlay);
			Rex_Left_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
			Rex_Right_Arm.render(matrixStack, buffer, packedLight, packedOverlay);
			Rex_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
			Rex_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Rex_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Rex_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Rex_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Rex_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Rex_Tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Rex_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Rex_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Rex_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
