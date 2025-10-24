package survivalistessentials.data.loot;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.NotNull;

import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.ItemEnchantmentsPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.ItemSubPredicates;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;

import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;

import survivalistessentials.common.loot.LootItemBlockIsTagCondition;
import survivalistessentials.items.SurvivalistEssentialsItems;
import survivalistessentials.loot.SurvivalistEssentialsLootTables;
import survivalistessentials.SurvivalistEssentials;
import survivalistessentials.common.TagManager;
import survivalistessentials.util.LootConditionHelper;

public class GlobalLootModifier extends GlobalLootModifierProvider {

    public GlobalLootModifier(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider, SurvivalistEssentials.MODID);
    }

    @Override
    public @NotNull String getName() {
        return "SurvivalistEssentials - Global Loot Modifier";
    }

    @Override
    protected void start() {
        addPlantFiberDrops(TagManager.Blocks.FIBER_PLANTS, "fiber_plants");
        addStickDrops(BlockTags.LEAVES, "leaves");
    }

    public void addPlantFiberDrops(TagKey<Block> tag, String name) {
        this.add(
            "plant_fiber_from_" + name,
            new SurvivalistEssentialsLootTables.LootTableModifier(
                LootConditionHelper.createKnifeChanceCondition(0.16F, tag),
                new ItemStack(SurvivalistEssentialsItems.PLANT_FIBER)
            )
        );
    }

    public void addStickDrops(TagKey<Block> tag, String name) {
        HolderLookup.RegistryLookup<Enchantment> enchantmentRegistryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        this.add(
            "stick_drops_from_" + name,
            new SurvivalistEssentialsLootTables.LootTableModifier(
                LootConditionHelper.createKnifeChanceCondition(0.16F, tag),
                new ItemStack(Items.STICK)
            )
        );

        this.add(
            "extra_stick_drops_from_" + name,
            new SurvivalistEssentialsLootTables.LootTableModifier(
                LootConditionHelper.createExtraStickDropConditions(0.16F, tag, enchantmentRegistryLookup),
                new ItemStack(Items.STICK)
            )
        );
    }


}
