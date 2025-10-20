package survivalistessentials.data.recipe;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.Criterion;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.Recipe;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SpecialRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.minecraft.world.level.ItemLike;

import static survivalistessentials.util.ResourceLocationHelper.prefix;

public class RecipeProviderBase {

    private static Criterion<InventoryChangeTrigger.TriggerInstance> has(TagKey<Item> pTag) {
        return inventoryTrigger(ItemPredicate.Builder.item().of(pTag).build());
    }

    private static Criterion<InventoryChangeTrigger.TriggerInstance> has(ItemLike pItemLike) {
        return inventoryTrigger(ItemPredicate.Builder.item().of(pItemLike).build());
    }

    private static Criterion<InventoryChangeTrigger.TriggerInstance> inventoryTrigger(ItemPredicate... predicates) {
        return CriteriaTriggers.INVENTORY_CHANGED.createCriterion(
            new InventoryChangeTrigger.TriggerInstance(
                Optional.empty(),
                InventoryChangeTrigger.TriggerInstance.Slots.ANY,
                List.of(predicates)
            )
        );
    }

    public static void specialRecipe(RecipeOutput exporter, SimpleCraftingRecipeSerializer<?> serializer, Function<CraftingBookCategory, Recipe<?>> recipeFunction) {
        ResourceLocation name = BuiltInRegistries.RECIPE_SERIALIZER.getKey(serializer);

        SpecialRecipeBuilder.special(recipeFunction).save(
            exporter, prefix("dynamic/" + Objects.requireNonNull(name).getPath()).toString());
    }

}
