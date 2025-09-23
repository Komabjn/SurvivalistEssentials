package survivalistessentials.event;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;

import survivalistessentials.config.ConfigHandler;
import survivalistessentials.data.integration.SurvivalistEssentialsIntegration;

public class ClientEventHandler {

    @SubscribeEvent
    public static void clientPlayerLogin(ClientPlayerNetworkEvent event) {
        if (!ModList.get().isLoaded(SurvivalistEssentialsIntegration.TS_MODID)
                && ModList.get().isLoaded(SurvivalistEssentialsIntegration.TCON_MODID)
                && ConfigHandler.Client.informTConCompat()) {
            Component message = Component.translatable("message.survivalistessentials.tcon_compat")
                .withStyle(ChatFormatting.DARK_GREEN);

            event.getPlayer().sendSystemMessage(message);
            ConfigHandler.Client.disableTConCompatMessage();
        }
    }

}
