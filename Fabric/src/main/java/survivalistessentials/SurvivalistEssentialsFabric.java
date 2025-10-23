package survivalistessentials;

import java.util.function.BiConsumer;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;

import survivalistessentials.common.HarvestBlock;
import survivalistessentials.common.loot.SurvivalistEssentialsLootConditionTypes;
import survivalistessentials.data.integration.SurvivalistEssentialsIntegration;
import survivalistessentials.items.SurvivalistEssentialsItems;
import survivalistessentials.sound.SurvivalistEssentialsSounds;
import survivalistessentials.world.SurvivalistEssentialsWorld;
import survivalistessentials.world.effect.SurvivalistEssentialsEffects;
import survivalistessentials.world.feature.SurvivalistEssentialsFeatures;

public class SurvivalistEssentialsFabric implements ModInitializer {

	@Override
    public void onInitialize() {
        registryInit();
        SurvivalistEssentials.init();
        SurvivalistEssentialsFeatures.setup();

        /*
         * Not 100% sure if this is the best event to hook into for ensuring all tags are loaded
         */
        ServerLifecycleEvents.SYNC_DATA_PACK_CONTENTS.register((player, flag) -> {
            HarvestBlock.setup();
        });

        ServerEntityEvents.EQUIPMENT_CHANGE.register((entity, slot, from, to) -> {
            if (entity instanceof Player player) {
                survivalistessentials.event.EquipmentChangeHandler.handleChange(player, slot, to);
            }
        });
    }

    /*
     * Note: The order of these initializations can be important due to dependencies between registries
     * for example, items that depend on blocks being registered first.
     */
    private void registryInit() {
        SurvivalistEssentialsFeatures.init(bind(BuiltInRegistries.FEATURE));
        SurvivalistEssentialsEffects.init(bind(BuiltInRegistries.MOB_EFFECT));
        SurvivalistEssentialsIntegration.init(bind(BuiltInRegistries.ITEM));
        SurvivalistEssentialsItems.init(bind(BuiltInRegistries.ITEM));
        SurvivalistEssentialsWorld.initBlocks(bind(BuiltInRegistries.BLOCK));
        SurvivalistEssentialsWorld.initItems(bind(BuiltInRegistries.ITEM));
        SurvivalistEssentialsLootConditionTypes.init(bind(BuiltInRegistries.LOOT_CONDITION_TYPE));
        SurvivalistEssentialsSounds.init(bind(BuiltInRegistries.SOUND_EVENT));

        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            Decoration.TOP_LAYER_MODIFICATION,
            SurvivalistEssentialsFeatures.PLACED_LOOSE_ROCKS_KEY
        );
    }

    private static <T> BiConsumer<T, ResourceLocation> bind(Registry<? super T> registry) {
        return (t, id) -> Registry.register(registry, id, t);
    }

}
