package survivalistessentials.items.tool;

import org.jetbrains.annotations.NotNull;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

import survivalistessentials.items.RecipeRemainderAxeItem;

public class CrudeHatchet extends RecipeRemainderAxeItem {

    public CrudeHatchet(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @NotNull
    @Override
    public ItemStack getRemainingItem(@NotNull ItemStack stack) {
        ItemStack container = stack.copy();

        container.setDamageValue(container.getDamageValue() + 1);

        if (container.getDamageValue() < container.getMaxDamage()) {
            return container;
        }
        else {
            stack.shrink(1);

            return ItemStack.EMPTY;
        }
    }

}
