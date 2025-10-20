package survivalistessentials;

import java.util.Map;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class SurvivalistEssentialsClientFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        /*
        for (Map.Entry<ResourceLocation, Item> entry : SurvivalistEssentialsItems.getAll().entrySet()) {
            ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register(entries -> entries.accept(entry.getValue()));
        }
         */
    }

}
