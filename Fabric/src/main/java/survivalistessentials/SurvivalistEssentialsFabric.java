package survivalistessentials;

import java.util.function.BiConsumer;

import net.fabricmc.api.ModInitializer;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class SurvivalistEssentialsFabric implements ModInitializer {

	@Override
    public void onInitialize() {
        registryInit();

        SurvivalistEssentials.init();
    }

    private void registryInit() {
    }

    private static <T> BiConsumer<T, ResourceLocation> bind(Registry<? super T> registry) {
        return (t, id) -> Registry.register(registry, id, t);
    }

}
