package survivalistessentials.data.recipe;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.NotNull;

import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger.TriggerInstance;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;

import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.neoforged.neoforge.common.conditions.NotCondition;

public class NeoForgeRecipeProvider extends RecipeProvider implements SurvivalistEssentialsRecipeProvider {

    public NeoForgeRecipeProvider(PackOutput output, CompletableFuture<Provider> registries) {
        super(output, registries);
    }

    @Override
    public void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        this.buildModRecipes(recipeOutput);
    }

    @Override
    public RecipeOutput modLoaded(RecipeOutput recipeOutput, String modid) {
        return recipeOutput.withConditions(new ModLoadedCondition(modid));
    }

    @Override
    public RecipeOutput modNotLoaded(RecipeOutput recipeOutput, String modid) {
        return recipeOutput.withConditions(new NotCondition(new ModLoadedCondition(modid)));
    }

    @Override
    public RecipeOutput configResourceCondition(RecipeOutput recipeOutput, String configOption) {
        return recipeOutput.withConditions(new ConfigResourceCondition(configOption));
    }

    @Override
    public Criterion<TriggerInstance> _has(ItemLike itemLike) {
        return has(itemLike);
    }

    @Override
    public Criterion<TriggerInstance> _has(TagKey<Item> tag) {
        return has(tag);
    }

}
