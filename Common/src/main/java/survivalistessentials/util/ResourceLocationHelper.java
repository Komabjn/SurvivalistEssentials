package survivalistessentials.util;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

import survivalistessentials.SurvivalistEssentials;

public class ResourceLocationHelper extends technology.roughness.whitenoise.util.ResourceLocationHelper {

    public static Identifier prefix(String path) {
        return loc(SurvivalistEssentials.MODID, path);
    }

    public static Identifier getItemId(Item item) {
        return BuiltInRegistries.ITEM.getKey(item);
    }

}
