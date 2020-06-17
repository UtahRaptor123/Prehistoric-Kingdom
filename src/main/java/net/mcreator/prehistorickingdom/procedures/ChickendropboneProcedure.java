package net.mcreator.prehistorickingdom.procedures;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;

import net.mcreator.prehistorickingdom.item.ChickenboneItem;
import net.mcreator.prehistorickingdom.PrehistoricKingdomModElements;

@PrehistoricKingdomModElements.ModElement.Tag
public class ChickendropboneProcedure extends PrehistoricKingdomModElements.ModElement {
	public ChickendropboneProcedure(PrehistoricKingdomModElements instance) {
		super(instance, 28);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Chickendropbone!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Chickendropbone!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Chickendropbone!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Chickendropbone!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Chickendropbone!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((entity instanceof ChickenEntity)) {
			for (int index0 = 0; index0 < (int) (4); index0++) {
				if ((0.5 >= Math.random())) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(ChickenboneItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
	}
}