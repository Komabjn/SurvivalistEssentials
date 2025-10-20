package survivalistessentials.util;

import net.minecraft.resources.ResourceLocation;

import survivalistessentials.SurvivalistEssentials;

public class ResourceLocationHelper extends technology.roughness.whitenoise.util.ResourceLocationHelper {

    public static ResourceLocation prefix(String path) {
        return loc(SurvivalistEssentials.MODID, path);
    }

}
