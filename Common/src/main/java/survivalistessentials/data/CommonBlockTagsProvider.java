package survivalistessentials.data;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.NotNull;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import survivalistessentials.data.integration.SurvivalistEssentialsIntegration;
import survivalistessentials.common.TagManager;
import survivalistessentials.world.SurvivalistEssentialsWorld;

public class CommonBlockTagsProvider extends IntrinsicHolderTagsProvider<Block> {

    @SuppressWarnings("deprecation")
    public CommonBlockTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, Registries.BLOCK, lookupProvider, (block) -> block.builtInRegistryHolder().key());
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(TagManager.Blocks.ALWAYS_BREAKABLE)
            .addTag(TagManager.Blocks.LOOSE_ROCKS)
            .add(Blocks.GRAVEL)
            .add(Blocks.BAMBOO)
            .add(Blocks.SNOW)
            .add(Blocks.GLOW_LICHEN)
            .addOptionalTag(BlockTags.DIRT.location())
            .addOptionalTag(BlockTags.SAND.location())
            .addOptionalTag(TagManager.Blocks.SANDS.location())
            .addOptionalTag(TagManager.Blocks.GRAVELS.location())
            .addOptionalTag(BlockTags.BEDS.location())
            .addOptionalTag(SurvivalistEssentialsIntegration.tconLoc("slimy_vines"))
            .addOptionalTag(SurvivalistEssentialsIntegration.tconLoc("slimy_leaves"))
            .addTag(TagManager.Blocks.FIBER_PLANTS);

        this.tag(TagManager.Blocks.ALWAYS_DROPS)
            .addTag(TagManager.Blocks.LOOSE_ROCKS)
            .add(Blocks.GRAVEL)
            .add(Blocks.BAMBOO)
            .add(Blocks.SNOW)
            .add(Blocks.GLOW_LICHEN)
            .addOptionalTag(BlockTags.DIRT.location())
            .addOptionalTag(BlockTags.SAND.location())
            .addOptionalTag(BlockTags.BEDS.location())
            .addOptionalTag(TagManager.Blocks.SANDS.location())
            .addOptionalTag(TagManager.Blocks.GRAVELS.location())
            .addOptionalTag(SurvivalistEssentialsIntegration.tconLoc("slimy_vines"))
            .addOptionalTag(SurvivalistEssentialsIntegration.tconLoc("slimy_leaves"))
            .addTag(TagManager.Blocks.FIBER_PLANTS);

        this.tag(TagManager.Blocks.LOOSE_ROCK_PLACEABLE_ON)
            .add(Blocks.GRAVEL)
            .add(Blocks.STONE)
            .add(Blocks.CALCITE)
            .add(Blocks.GRANITE)
            .add(Blocks.DIORITE)
            .add(Blocks.ANDESITE)
            .add(Blocks.COAL_ORE)
            .add(Blocks.SANDSTONE)
            .add(Blocks.IRON_BLOCK)
            .add(Blocks.COPPER_ORE)
            .add(Blocks.MOSSY_COBBLESTONE)
            .add(Blocks.RED_SANDSTONE)
            .addOptionalTag(TagManager.Blocks.GRAVELS.location())
            .addOptionalTag(BlockTags.DIRT.location())
            .addOptionalTag(BlockTags.SAND.location())
            .addOptionalTag(TagManager.Blocks.SANDS.location())
            .addOptionalTag(BlockTags.TERRACOTTA.location())
            .addOptionalTag(TagManager.Blocks.ORES_COAL.location())
            .addOptionalTag(TagManager.Blocks.ORES_COPPER.location())
            .addOptionalTag(TagManager.Blocks.ORES_IRON.location());

        this.tag(TagManager.Blocks.LOOSE_ROCKS)
            .add(SurvivalistEssentialsWorld.ANDESITE_LOOSE_ROCK)
            .add(SurvivalistEssentialsWorld.DIORITE_LOOSE_ROCK)
            .add(SurvivalistEssentialsWorld.GRANITE_LOOSE_ROCK)
            .add(SurvivalistEssentialsWorld.STONE_LOOSE_ROCK)
            .add(SurvivalistEssentialsWorld.SANDSTONE_LOOSE_ROCK)
            .add(SurvivalistEssentialsWorld.RED_SANDSTONE_LOOSE_ROCK);

        this.tag(TagManager.Blocks.FIBER_PLANTS)
            .add(Blocks.VINE)
            .add(Blocks.FERN)
            .add(Blocks.LARGE_FERN)
            .add(Blocks.GRASS_BLOCK)
            .add(Blocks.TALL_GRASS)
            .addOptionalTag(BlockTags.LEAVES.location())
            .addOptional(SurvivalistEssentialsIntegration.sgcLoc("avocado_leaves"))
            .addOptional(SurvivalistEssentialsIntegration.exnihiloLoc("infested_leaves"))
            .addOptional(SurvivalistEssentialsIntegration.exnihiloLoc("infesting_leaves"))
            .addOptionalTag(TagManager.commonLoc("grass"))
            .addOptionalTag(TagManager.commonLoc("leaves"))
            .addOptionalTag(TagManager.commonLoc("bushes"))
            .addOptionalTag(SurvivalistEssentialsIntegration.regionsLoc("grass"));

        this.tag(TagManager.Blocks.BRANCHES)
            .addOptionalTag(SurvivalistEssentialsIntegration.dynamictreesLoc("branches"));

        this.tag(TagManager.Blocks.MINEABLE_WITH_SHARP)
            .add(Blocks.COBWEB)
            .addOptionalTag(BlockTags.WOOL_CARPETS.location())
            .addOptionalTag(BlockTags.WOOL.location())
            .addOptionalTag(BlockTags.CANDLE_CAKES.location());
    }

}
