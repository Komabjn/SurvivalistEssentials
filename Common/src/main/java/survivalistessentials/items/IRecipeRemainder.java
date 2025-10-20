package survivalistessentials.items;

import net.minecraft.world.item.ItemStack;

public interface IRecipeRemainder {

    ItemStack getRecipeRemainder(ItemStack stack);

    ItemStack getCraftingRemainingItem(ItemStack stack);

}
