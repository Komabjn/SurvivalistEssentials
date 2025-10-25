package survivalistessentials.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public abstract class RecipeRemainderSwordItem extends Item implements IRecipeRemainder {

    public RecipeRemainderSwordItem(Item.Properties properties) {
        super(properties);
    }

    public abstract ItemStack getRemainingItem(ItemStack stack);

    //@Override
    //TODO FIX ME
    public final boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public final ItemStack getRecipeRemainder(ItemStack itemStack) {
        return getRemainingItem(itemStack);
    }

    @Override
    public final ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return getRemainingItem(itemStack);
    }

}
