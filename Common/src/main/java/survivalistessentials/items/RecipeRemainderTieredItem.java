package survivalistessentials.items;

import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public abstract class RecipeRemainderTieredItem extends TieredItem implements IRecipeRemainder {

    public RecipeRemainderTieredItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    public abstract ItemStack getRemainingItem(ItemStack stack);

    @Override
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
