
package net.mcreator.prehistorickingdom.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.prehistorickingdom.PrehistoricKingdomModElements;

@PrehistoricKingdomModElements.ModElement.Tag
public class PlasticeggshellfragmentItem extends PrehistoricKingdomModElements.ModElement {
	@ObjectHolder("prehistoric_kingdom:plasticeggshellfragment")
	public static final Item block = null;
	public PlasticeggshellfragmentItem(PrehistoricKingdomModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("plasticeggshellfragment");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
