package survivalistessentials.data;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.minecraft.core.HolderLookup;

import survivalistessentials.SurvivalistEssentials;
import survivalistessentials.common.Translations;

public class SurvivalistEssentialsLanguageProvider extends FabricLanguageProvider {

    protected SurvivalistEssentialsLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryFuture) {
        super(dataOutput, "en_us", registryFuture);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder builder) {
    }

    private void addItem(TranslationBuilder builder, String id, String name) {
        builder.add("item." + SurvivalistEssentials.MODID + "." + id, name);
    }

    private void addTranslationTitle(TranslationBuilder builder, String title) {
        builder.add(SurvivalistEssentials.MODID + ".configuration.title", title);
    }

    private void addTranslationName(TranslationBuilder builder, String id, String name) {
        builder.add(SurvivalistEssentials.MODID + ".configuration." + id + ".name", name);
    }

    private void addTranslationDescription(TranslationBuilder builder, String id) {
        builder.add(SurvivalistEssentials.MODID + ".configuration." + id + ".description", Translations.get(id));
    }

    private void addTranslation(TranslationBuilder buildder, String id) {
        addTranslationName(buildder, id, Translations.get(id + ".title"));
        addTranslationDescription(buildder, id);
    }

    private void addTranslationDescription(TranslationBuilder builder, String id, String key) {
        builder.add(SurvivalistEssentials.MODID + ".configuration." + id + ".description", Translations.get(key));
    }

}
