package survivalistessentials;

import java.util.function.BiConsumer;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;

import survivalistessentials.common.HarvestBlock;

public class SurvivalistEssentialsFabric implements ModInitializer {

	@Override
    public void onInitialize() {
        registryInit();

        SurvivalistEssentials.init();
        HarvestBlock.setup();

        ServerEntityEvents.EQUIPMENT_CHANGE.register((entity, slot, from, to) -> {
            if (entity instanceof Player player) {
                survivalistessentials.event.EquipmentChangeHandler.handleChange(player, slot, to);
            }
        });
    }

    private void registryInit() {
    }

    private static <T> BiConsumer<T, ResourceLocation> bind(Registry<? super T> registry) {
        return (t, id) -> Registry.register(registry, id, t);
    }

}
