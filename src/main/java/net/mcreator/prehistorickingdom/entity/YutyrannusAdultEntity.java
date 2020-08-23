
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
public class YutyrannusAdultEntity extends PrehistoricKingdomModElements.ModElement {
	public static EntityType entity = null;
	public YutyrannusAdultEntity(PrehistoricKingdomModElements instance) {
		super(instance, 48);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.AMBIENT).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(0.4f, 0.3f)).build("yutyrannus_adult")
						.setRegistryName("yutyrannus_adult");
		elements.entities.add(() -> entity);
		elements.items
				.add(() -> new SpawnEggItem(entity, -154, -39424, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("yutyrannus_adult"));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelYutyrannus_Adult(), 0.7f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("prehistoric_kingdom:textures/yutyrannus_adult.png");
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
			experienceValue = 135;
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
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, CowEntity.class, false, true));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, PigEntity.class, false, true));
			this.goalSelector.addGoal(12, new AvoidEntityGoal(this, TyrannosuarusAdultEntity.CustomEntity.class, (float) 10, 0.5, 0.5));
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
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(135);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(15);
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelYutyrannus_Adult extends EntityModel<Entity> {
		private final ModelRenderer rex_Head;
		private final ModelRenderer Rex_Jaw;
		private final ModelRenderer Rexbrow1;
		private final ModelRenderer Rexbrow2;
		private final ModelRenderer Rex_Neck;
		private final ModelRenderer Rex_Body1;
		private final ModelRenderer Rex_Tail1;
		private final ModelRenderer Rex_Tail2;
		private final ModelRenderer Rex_Tail3;
		private final ModelRenderer Rex_Tail4;
		private final ModelRenderer Rex_Tail5;
		private final ModelRenderer Rex_Left_Arm1;
		private final ModelRenderer Rex_Left_Arm2;
		private final ModelRenderer Rex_Left_Arm3;
		private final ModelRenderer Rex_Left_Arm4;
		private final ModelRenderer Rex_Right_Arm1;
		private final ModelRenderer Rex_Right_Arm2;
		private final ModelRenderer Rex_Right_Arm3;
		private final ModelRenderer Rex_Right_Arm4;
		private final ModelRenderer Rex_Left_Leg;
		private final ModelRenderer Rex_Left_Leg2;
		private final ModelRenderer Rex_Left_Leg3;
		private final ModelRenderer Rex_Right_Leg;
		private final ModelRenderer Rex_Right_Leg2;
		private final ModelRenderer Rex_Right_Leg3;
		public ModelYutyrannus_Adult() {
			textureWidth = 256;
			textureHeight = 256;
			rex_Head = new ModelRenderer(this);
			rex_Head.setRotationPoint(0.0F, -25.0F, -15.0F);
			setRotationAngle(rex_Head, 0.0873F, 0.0F, 0.0F);
			rex_Head.setTextureOffset(106, 77).addBox(-5.0F, -6.0F, -9.0F, 10.0F, 11.0F, 9.0F, 0.0F, false);
			rex_Head.setTextureOffset(25, 92).addBox(-4.0F, -5.0F, -20.0F, 8.0F, 8.0F, 11.0F, 0.0F, false);
			rex_Head.setTextureOffset(55, 0).addBox(3.0F, 3.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rex_Head.setTextureOffset(12, 55).addBox(3.0F, 3.0F, -18.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rex_Head.setTextureOffset(0, 55).addBox(3.0F, 3.0F, -16.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rex_Head.setTextureOffset(15, 54).addBox(3.0F, 3.0F, -14.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rex_Head.setTextureOffset(12, 53).addBox(3.0F, 3.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rex_Head.setTextureOffset(0, 53).addBox(3.0F, 3.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rex_Head.setTextureOffset(18, 44).addBox(-4.0F, 3.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rex_Head.setTextureOffset(14, 44).addBox(-2.0F, 3.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rex_Head.setTextureOffset(0, 44).addBox(1.0F, 3.0F, -20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rex_Head.setTextureOffset(18, 42).addBox(-4.0F, 3.0F, -18.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rex_Head.setTextureOffset(14, 42).addBox(-4.0F, 3.0F, -16.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rex_Head.setTextureOffset(0, 42).addBox(-4.0F, 3.0F, -14.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rex_Head.setTextureOffset(18, 40).addBox(-4.0F, 3.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			rex_Head.setTextureOffset(14, 40).addBox(-4.0F, 3.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw = new ModelRenderer(this);
			Rex_Jaw.setRotationPoint(0.0F, 4.0F, -9.0F);
			rex_Head.addChild(Rex_Jaw);
			Rex_Jaw.setTextureOffset(80, 0).addBox(-3.0F, -1.0F, -10.0F, 6.0F, 2.0F, 11.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 40).addBox(2.0F, -2.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(15, 21).addBox(-3.0F, -2.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(19, 20).addBox(-3.0F, -2.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(19, 12).addBox(-3.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(19, 3).addBox(-3.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(19, 1).addBox(-3.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(12, 15).addBox(2.0F, -2.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 15).addBox(2.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(12, 13).addBox(2.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Jaw.setTextureOffset(0, 13).addBox(2.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rexbrow1 = new ModelRenderer(this);
			Rexbrow1.setRotationPoint(3.0F, -3.0038F, -12.0872F);
			rex_Head.addChild(Rexbrow1);
			setRotationAngle(Rexbrow1, 0.4363F, 0.0F, 0.0436F);
			Rexbrow1.setTextureOffset(82, 53).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);
			Rexbrow2 = new ModelRenderer(this);
			Rexbrow2.setRotationPoint(-3.0F, -3.0038F, -12.0872F);
			rex_Head.addChild(Rexbrow2);
			setRotationAngle(Rexbrow2, 0.4363F, 0.0F, -0.0436F);
			Rexbrow2.setTextureOffset(41, 64).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);
			Rex_Neck = new ModelRenderer(this);
			Rex_Neck.setRotationPoint(0.0F, -25.0F, -15.0F);
			setRotationAngle(Rex_Neck, -0.5236F, 0.0F, 0.0F);
			Rex_Neck.setTextureOffset(48, 95).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 9.0F, 16.0F, 0.0F, false);
			Rex_Neck.setTextureOffset(131, 84).addBox(-3.0F, 5.0F, -1.0F, 6.0F, 1.0F, 13.0F, 0.0F, false);
			Rex_Body1 = new ModelRenderer(this);
			Rex_Body1.setRotationPoint(0.0F, -15.0F, -7.0F);
			setRotationAngle(Rex_Body1, 0.0873F, 0.0F, 0.0F);
			Rex_Body1.setTextureOffset(54, 64).addBox(-6.0F, -11.0F, -1.0F, 12.0F, 16.0F, 13.0F, 0.0F, false);
			Rex_Body1.setTextureOffset(82, 141).addBox(-7.0F, -11.0F, -1.0F, 1.0F, 7.0F, 13.0F, 0.0F, false);
			Rex_Body1.setTextureOffset(67, 128).addBox(6.0F, -11.0F, -1.0F, 1.0F, 7.0F, 13.0F, 0.0F, false);
			Rex_Body1.setTextureOffset(19, 52).addBox(-8.0F, -11.0F, 11.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			Rex_Body1.setTextureOffset(16, 13).addBox(7.0F, -11.0F, 11.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			Rex_Body1.setTextureOffset(102, 25).addBox(-7.0F, -12.0F, -0.9995F, 14.0F, 1.0F, 13.0F, 0.0F, false);
			Rex_Body1.setTextureOffset(0, 0).addBox(-8.0F, -11.0F, 12.0F, 16.0F, 17.0F, 23.0F, 0.0F, false);
			Rex_Body1.setTextureOffset(0, 92).addBox(-9.0F, -11.0F, 12.0F, 1.0F, 7.0F, 23.0F, 0.0F, false);
			Rex_Body1.setTextureOffset(81, 81).addBox(8.0F, -11.0F, 12.0F, 1.0F, 7.0F, 23.0F, 0.0F, false);
			Rex_Body1.setTextureOffset(0, 40).addBox(-9.0F, -12.0F, 12.0006F, 18.0F, 1.0F, 23.0F, 0.0F, false);
			Rex_Tail1 = new ModelRenderer(this);
			Rex_Tail1.setRotationPoint(0.0F, 0.0F, 35.0F);
			Rex_Body1.addChild(Rex_Tail1);
			setRotationAngle(Rex_Tail1, -0.2618F, 0.0F, 0.0F);
			Rex_Tail1.setTextureOffset(0, 64).addBox(-7.0F, -10.0F, -3.0F, 14.0F, 15.0F, 13.0F, 0.0F, false);
			Rex_Tail2 = new ModelRenderer(this);
			Rex_Tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
			Rex_Tail1.addChild(Rex_Tail2);
			setRotationAngle(Rex_Tail2, 0.0873F, 0.0F, 0.0F);
			Rex_Tail2.setTextureOffset(62, 24).addBox(-6.0F, -9.0F, -1.0F, 12.0F, 13.0F, 16.0F, 0.0F, false);
			Rex_Tail3 = new ModelRenderer(this);
			Rex_Tail3.setRotationPoint(0.0F, 0.0F, 15.0F);
			Rex_Tail2.addChild(Rex_Tail3);
			Rex_Tail3.setTextureOffset(102, 0).addBox(-5.0F, -8.0F, 0.0F, 10.0F, 12.0F, 13.0F, 0.0F, false);
			Rex_Tail3.setTextureOffset(15, 142).addBox(5.0F, -3.0F, 0.0F, 3.0F, 2.0F, 13.0F, 0.0F, false);
			Rex_Tail3.setTextureOffset(140, 115).addBox(-8.0F, -3.0F, 0.0F, 3.0F, 2.0F, 13.0F, 0.0F, false);
			Rex_Tail4 = new ModelRenderer(this);
			Rex_Tail4.setRotationPoint(0.0F, 0.0F, 13.0F);
			Rex_Tail3.addChild(Rex_Tail4);
			setRotationAngle(Rex_Tail4, 0.0873F, 0.0F, 0.0F);
			Rex_Tail4.setTextureOffset(91, 53).addBox(-4.0F, -7.0F, -1.0F, 8.0F, 10.0F, 14.0F, 0.0F, false);
			Rex_Tail4.setTextureOffset(139, 139).addBox(4.0F, -3.0F, 0.0F, 4.0F, 2.0F, 13.0F, 0.0F, false);
			Rex_Tail4.setTextureOffset(135, 56).addBox(-8.0F, -3.0F, 0.0F, 4.0F, 2.0F, 13.0F, 0.0F, false);
			Rex_Tail5 = new ModelRenderer(this);
			Rex_Tail5.setRotationPoint(0.0F, 0.0F, 13.0F);
			Rex_Tail4.addChild(Rex_Tail5);
			Rex_Tail5.setTextureOffset(55, 0).addBox(-3.0F, -6.0F, -1.0F, 6.0F, 8.0F, 13.0F, 0.0F, false);
			Rex_Tail5.setTextureOffset(59, 53).addBox(-5.0F, -2.9987F, 12.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
			Rex_Tail5.setTextureOffset(110, 148).addBox(-6.0F, -3.0F, 0.0F, 3.0F, 2.0F, 12.0F, 0.0F, false);
			Rex_Tail5.setTextureOffset(143, 13).addBox(3.0F, -3.0F, 0.0F, 3.0F, 2.0F, 12.0F, 0.0F, false);
			Rex_Left_Arm1 = new ModelRenderer(this);
			Rex_Left_Arm1.setRotationPoint(7.0F, -12.0F, -4.0F);
			setRotationAngle(Rex_Left_Arm1, 0.3491F, 0.0F, 0.0F);
			Rex_Left_Arm1.setTextureOffset(0, 40).addBox(-1.0F, -2.0F, -3.0F, 4.0F, 7.0F, 6.0F, 0.0F, false);
			Rex_Left_Arm2 = new ModelRenderer(this);
			Rex_Left_Arm2.setRotationPoint(0.0F, 7.0F, 0.0F);
			Rex_Left_Arm1.addChild(Rex_Left_Arm2);
			setRotationAngle(Rex_Left_Arm2, 0.4363F, 0.0F, 0.0F);
			Rex_Left_Arm2.setTextureOffset(0, 13).addBox(-1.0F, -3.0F, 0.0F, 4.0F, 5.0F, 4.0F, -0.1F, false);
			Rex_Left_Arm2.setTextureOffset(0, 0).addBox(-2.8F, 1.0F, 1.0F, 2.0F, 1.0F, 1.0F, -0.1F, false);
			Rex_Left_Arm3 = new ModelRenderer(this);
			Rex_Left_Arm3.setRotationPoint(-1.0F, 1.0F, 0.0F);
			Rex_Left_Arm2.addChild(Rex_Left_Arm3);
			setRotationAngle(Rex_Left_Arm3, 0.0F, -0.4363F, -0.1309F);
			Rex_Left_Arm3.setTextureOffset(14, 4).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Left_Arm4 = new ModelRenderer(this);
			Rex_Left_Arm4.setRotationPoint(-1.0F, 1.0F, 4.0F);
			Rex_Left_Arm2.addChild(Rex_Left_Arm4);
			setRotationAngle(Rex_Left_Arm4, 0.0F, 0.4363F, -0.1745F);
			Rex_Left_Arm4.setTextureOffset(14, 2).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Right_Arm1 = new ModelRenderer(this);
			Rex_Right_Arm1.setRotationPoint(-9.0F, -12.0F, -4.0F);
			setRotationAngle(Rex_Right_Arm1, 0.3491F, 0.0F, 0.0F);
			Rex_Right_Arm1.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -3.0F, 4.0F, 7.0F, 6.0F, 0.0F, false);
			Rex_Right_Arm2 = new ModelRenderer(this);
			Rex_Right_Arm2.setRotationPoint(0.0F, 7.0F, 0.0F);
			Rex_Right_Arm1.addChild(Rex_Right_Arm2);
			setRotationAngle(Rex_Right_Arm2, 0.4363F, 0.0F, 0.0F);
			Rex_Right_Arm2.setTextureOffset(0, 53).addBox(-1.0F, -2.0F, 0.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
			Rex_Right_Arm2.setTextureOffset(0, 2).addBox(2.8F, 1.0F, 1.0F, 2.0F, 1.0F, 1.0F, -0.1F, false);
			Rex_Right_Arm3 = new ModelRenderer(this);
			Rex_Right_Arm3.setRotationPoint(3.0F, 1.0F, 0.0F);
			Rex_Right_Arm2.addChild(Rex_Right_Arm3);
			setRotationAngle(Rex_Right_Arm3, 0.0F, 0.4363F, 0.1309F);
			Rex_Right_Arm3.setTextureOffset(14, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Right_Arm4 = new ModelRenderer(this);
			Rex_Right_Arm4.setRotationPoint(3.0F, 1.0F, 4.0F);
			Rex_Right_Arm2.addChild(Rex_Right_Arm4);
			setRotationAngle(Rex_Right_Arm4, 0.0F, -0.4363F, 0.1309F);
			Rex_Right_Arm4.setTextureOffset(0, 4).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Rex_Left_Leg = new ModelRenderer(this);
			Rex_Left_Leg.setRotationPoint(8.0F, -16.0F, 21.0F);
			setRotationAngle(Rex_Left_Leg, 0.0F, 0.0F, 0.0F);
			Rex_Left_Leg.setTextureOffset(118, 118).addBox(0.0F, -4.0F, -6.0F, 5.0F, 18.0F, 12.0F, 0.0F, false);
			Rex_Left_Leg2 = new ModelRenderer(this);
			Rex_Left_Leg2.setRotationPoint(0.0F, 14.0F, 0.0F);
			Rex_Left_Leg.addChild(Rex_Left_Leg2);
			setRotationAngle(Rex_Left_Leg2, 0.0F, 0.0F, 0.0F);
			Rex_Left_Leg2.setTextureOffset(0, 122).addBox(0.0F, -1.0F, -3.0F, 5.0F, 24.0F, 9.0F, -0.1F, false);
			Rex_Left_Leg3 = new ModelRenderer(this);
			Rex_Left_Leg3.setRotationPoint(0.0F, 23.0F, 0.0F);
			Rex_Left_Leg2.addChild(Rex_Left_Leg3);
			Rex_Left_Leg3.setTextureOffset(121, 39).addBox(-1.0F, 0.0F, -7.0F, 7.0F, 4.0F, 13.0F, 0.0F, false);
			Rex_Right_Leg = new ModelRenderer(this);
			Rex_Right_Leg.setRotationPoint(-8.0F, -16.0F, 21.0F);
			Rex_Right_Leg.setTextureOffset(84, 111).addBox(-5.0F, -4.0F, -6.0F, 5.0F, 18.0F, 12.0F, 0.0F, false);
			Rex_Right_Leg2 = new ModelRenderer(this);
			Rex_Right_Leg2.setRotationPoint(-5.0F, 14.0F, 0.0F);
			Rex_Right_Leg.addChild(Rex_Right_Leg2);
			Rex_Right_Leg2.setTextureOffset(39, 120).addBox(0.0F, -1.0F, -3.0F, 5.0F, 24.0F, 9.0F, -0.1F, false);
			Rex_Right_Leg3 = new ModelRenderer(this);
			Rex_Right_Leg3.setRotationPoint(0.0F, 23.0F, 0.0F);
			Rex_Right_Leg2.addChild(Rex_Right_Leg3);
			Rex_Right_Leg3.setTextureOffset(116, 98).addBox(-1.0F, 0.0F, -7.0F, 7.0F, 4.0F, 13.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			rex_Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Rex_Neck.render(matrixStack, buffer, packedLight, packedOverlay);
			Rex_Body1.render(matrixStack, buffer, packedLight, packedOverlay);
			Rex_Left_Arm1.render(matrixStack, buffer, packedLight, packedOverlay);
			Rex_Right_Arm1.render(matrixStack, buffer, packedLight, packedOverlay);
			Rex_Left_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
			Rex_Right_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Rex_Right_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Rex_Tail1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Rex_Tail5.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Rex_Tail4.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Rex_Tail3.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.Rex_Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.rex_Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.rex_Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Rex_Left_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
