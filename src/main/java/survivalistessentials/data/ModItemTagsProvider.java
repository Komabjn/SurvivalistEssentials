package survivalistessentials.data;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import survivalistessentials.common.TagManager;
import survivalistessentials.data.integration.SurvivalistEssentialsIntegration;
import survivalistessentials.items.SurvivalistEssentialsItems;
import survivalistessentials.SurvivalistEssentials;
import survivalistessentials.world.SurvivalistEssentialsWorld;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, ModBlockTagsProvider blockTagsProvider, ExistingFileHelper helper) {
        super(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), SurvivalistEssentials.MODID, helper);
    }

    @Override
    public String getName() {
        return "SurvivalistEssentials - Item Tags";
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        builder(
            TagManager.Items.FLINT_KNAPPABLE,
            Items.FLINT,
            SurvivalistEssentialsWorld.ROCK_STONE
        );
        this.tag(TagManager.Items.PICKAXE_TOOLS)
            .addOptional(SurvivalistEssentialsIntegration.ieLoc("buzzsaw"))
            .addOptional(SurvivalistEssentialsIntegration.ieLoc("drill"))
            .addOptional(SurvivalistEssentialsIntegration.ieLoc("hammer"));
        this.tag(TagManager.Items.AXE_TOOLS)
            .addOptional(SurvivalistEssentialsIntegration.ieLoc("buzzsaw"));
        builder(
            TagManager.Items.AXE_TOOLS,
            SurvivalistEssentialsItems.CRUDE_HATCHET
        );
        this.tag(TagManager.Items.SAW_TOOLS)
            .addOptional(SurvivalistEssentialsIntegration.tsLoc("saw"));
        builder(
            TagManager.Items.SAW_TOOLS,
            SurvivalistEssentialsItems.CRUDE_SAW,
            SurvivalistEssentialsItems.BASIC_SAW,
            SurvivalistEssentialsItems.SHARP_SAW
        );
        this.tag(TagManager.Items.ADVANCED_SAW_TOOLS)
            .addOptional(SurvivalistEssentialsIntegration.tsLoc("saw"));
        builder(
            TagManager.Items.ADVANCED_SAW_TOOLS,
            SurvivalistEssentialsItems.BASIC_SAW,
            SurvivalistEssentialsItems.SHARP_SAW
        );
        this.tag(TagManager.Items.SHOVEL_TOOLS)
            .addOptional(SurvivalistEssentialsIntegration.ieLoc("drill"));
        builder(
            TagManager.Items.HOE_TOOLS
        );
        this.tag(TagManager.Items.KNIFE_TOOLS)
            .addOptional(SurvivalistEssentialsIntegration.tsLoc("knife"));
        builder(
            TagManager.Items.KNIFE_TOOLS,
            SurvivalistEssentialsItems.CRUDE_KNIFE,
            SurvivalistEssentialsItems.BASIC_KNIFE,
            SurvivalistEssentialsItems.SHARP_KNIFE
        );
        this.tag(TagManager.Items.ADVANCED_KNIFE_TOOLS)
            .addOptional(SurvivalistEssentialsIntegration.tsLoc("knife"));
        builder(
            TagManager.Items.ADVANCED_KNIFE_TOOLS,
            SurvivalistEssentialsItems.BASIC_KNIFE,
            SurvivalistEssentialsItems.SHARP_KNIFE
        );
        this.tag(TagManager.Items.SHARP_TOOLS)
            .addOptional(SurvivalistEssentialsIntegration.ieLoc("revolver"))
            .addTag(TagManager.Items.KNIFE_TOOLS)
            .addTag(TagManager.Items.AXE_TOOLS);
        this.tag(TagManager.Items.SHEAR_TOOLS)
            .addTag(Tags.Items.TOOLS_SHEAR);
        builder(TagManager.Items.ROCK, SurvivalistEssentialsWorld.ROCK_STONE);
        builder(
            TagManager.Items.SAW_PARTS,
            SurvivalistEssentialsItems.SAW_HANDLE,
            SurvivalistEssentialsItems.CRUDE_SAW_BLADE
        );
        builder(
            TagManager.Items.BANDAGES,
            SurvivalistEssentialsItems.CRUDE_BANDAGE,
            SurvivalistEssentialsItems.BANDAGE
        );
        this.tag(TagManager.Items.COOKED_MEAT)
            .add(Items.COOKED_BEEF)
            .add(Items.COOKED_CHICKEN)
            .add(Items.COOKED_COD)
            .add(Items.COOKED_MUTTON)
            .add(Items.COOKED_PORKCHOP)
            .add(Items.COOKED_RABBIT)
            .add(Items.COOKED_SALMON)
            .addOptional(SurvivalistEssentialsIntegration.aquaLoc("fish_fillet_cooked"))
            .addOptional(SurvivalistEssentialsIntegration.aquaLoc("frog_legs_cooked"))
            .addOptional(SurvivalistEssentialsIntegration.bapLoc("turkey_cooked"))
            .addOptional(SurvivalistEssentialsIntegration.bapLoc("venisoncooked"))
            .addOptional(SurvivalistEssentialsIntegration.bapLoc("pheasantcooked"))
            .addOptional(SurvivalistEssentialsIntegration.bapLoc("crab_meat_cooked"))
            .addOptional(SurvivalistEssentialsIntegration.bapLoc("turkey_leg_cooked"))
            .addOptional(SurvivalistEssentialsIntegration.bapLoc("eel_meat_cooked"))
            .addOptional(SurvivalistEssentialsIntegration.bapLoc("calamari_cooked"))
            .addOptional(SurvivalistEssentialsIntegration.alexLoc("cooked_lobster_tail"))
            .addOptional(SurvivalistEssentialsIntegration.alexLoc("cooked_moose_ribs"))
            .addOptional(SurvivalistEssentialsIntegration.alexLoc("cooked_kangaroo_meat"))
            .addOptional(SurvivalistEssentialsIntegration.alexLoc("cooked_catfish"));

        // Fruit Trees
        addLogVariants(TagManager.Items.CHERRY_LOGS, "cherry", SurvivalistEssentialsIntegration::ftLoc);
        addLogVariants(TagManager.Items.CITRUS_LOGS, "citrus", SurvivalistEssentialsIntegration::ftLoc);

        // Biome Makeover
        this.tag(TagManager.Items.BMO_ANCIENT_OAK_LOG)
            .addOptional(SurvivalistEssentialsIntegration.BMO_ANCIENT_OAK_LOG);
        this.tag(TagManager.Items.BMO_STRIPPED_ANCIENT_OAK_LOG)
            .addOptional(SurvivalistEssentialsIntegration.BMO_STRIPPED_ANCIENT_OAK_LOG);
        this.tag(TagManager.Items.BMO_ANCIENT_OAK_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.BMO_ANCIENT_OAK_WOOD);
        this.tag(TagManager.Items.BMO_STRIPPED_ANCIENT_OAK_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.BMO_STRIPPED_ANCIENT_OAK_WOOD);
        this.tag(TagManager.Items.BMO_BLIGHTED_BALSA_LOG)
            .addOptional(SurvivalistEssentialsIntegration.BMO_BLIGHTED_BALSA_LOG);
        this.tag(TagManager.Items.BMO_STRIPPED_BLIGHTED_BALSA_LOG)
            .addOptional(SurvivalistEssentialsIntegration.BMO_STRIPPED_BLIGHTED_BALSA_LOG);
        this.tag(TagManager.Items.BMO_BLIGHTED_BALSA_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.BMO_BLIGHTED_BALSA_WOOD);
        this.tag(TagManager.Items.BMO_STRIPPED_BLIGHTED_BALSA_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.BMO_STRIPPED_BLIGHTED_BALSA_WOOD);
        this.tag(TagManager.Items.BMO_SWAMP_CYPRESS_LOG)
            .addOptional(SurvivalistEssentialsIntegration.BMO_SWAMP_CYPRESS_LOG);
        this.tag(TagManager.Items.BMO_STRIPPED_SWAMP_CYPRESS_LOG)
            .addOptional(SurvivalistEssentialsIntegration.BMO_STRIPPED_SWAMP_CYPRESS_LOG);
        this.tag(TagManager.Items.BMO_SWAMP_CYPRESS_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.BMO_SWAMP_CYPRESS_WOOD);
        this.tag(TagManager.Items.BMO_STRIPPED_SWAMP_CYPRESS_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.BMO_STRIPPED_SWAMP_CYPRESS_WOOD);
        this.tag(TagManager.Items.BMO_WILLOW_LOG)
            .addOptional(SurvivalistEssentialsIntegration.BMO_WILLOW_LOG);
        this.tag(TagManager.Items.BMO_STRIPPED_WILLOW_LOG)
            .addOptional(SurvivalistEssentialsIntegration.BMO_STRIPPED_WILLOW_LOG);
        this.tag(TagManager.Items.BMO_WILLOW_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.BMO_WILLOW_WOOD);
        this.tag(TagManager.Items.BMO_STRIPPED_WILLOW_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.BMO_STRIPPED_WILLOW_WOOD);

        // Biomes O' Plenty
        addLogVariants(TagManager.Items.BOP_DEAD_LOGS, "dead", SurvivalistEssentialsIntegration::bopLoc);
        addLogVariants(TagManager.Items.BOP_FIR_LOGS, "fir", SurvivalistEssentialsIntegration::bopLoc);
        addLogVariants(TagManager.Items.BOP_HELLBARK_LOGS, "hellbark", SurvivalistEssentialsIntegration::bopLoc);
        addLogVariants(TagManager.Items.BOP_JACARANDA_LOGS, "jacaranda", SurvivalistEssentialsIntegration::bopLoc);
        addLogVariants(TagManager.Items.BOP_MAGIC_LOGS, "magic", SurvivalistEssentialsIntegration::bopLoc);
        addLogVariants(TagManager.Items.BOP_MAHOGANY_LOGS, "mahogany", SurvivalistEssentialsIntegration::bopLoc);
        addLogVariants(TagManager.Items.BOP_PALM_LOGS, "palm", SurvivalistEssentialsIntegration::bopLoc);
        addLogVariants(TagManager.Items.BOP_REDWOOD_LOGS, "redwood", SurvivalistEssentialsIntegration::bopLoc);
        addLogVariants(TagManager.Items.BOP_UMBRAN_LOGS, "umbran", SurvivalistEssentialsIntegration::bopLoc);
        addLogVariants(TagManager.Items.BOP_WILLOW_LOGS, "willow", SurvivalistEssentialsIntegration::bopLoc);

        // Botania
        addLogVariants(TagManager.Items.BOTANIA_DREAMWOOD_LOGS, "dreamwood", SurvivalistEssentialsIntegration::botaniaLoc);
        addLogVariants(TagManager.Items.BOTANIA_LIVINGWOOD_LOGS, "livingwood", SurvivalistEssentialsIntegration::botaniaLoc);

        // Quark
        addLogVariants(TagManager.Items.QUARK_AZALEA_LOGS, "azalea", SurvivalistEssentialsIntegration::qLoc);
        addLogVariants(TagManager.Items.QUARK_BLOSSOM_LOGS, "blossom", SurvivalistEssentialsIntegration::qLoc);

        // All You Can Eat
        addLogVariants(TagManager.Items.AYCE_HAZEL_LOGS, "hazel", SurvivalistEssentialsIntegration::ayceLoc);

        // Tinkers' Construct
        addLogVariants(TagManager.Items.TCON_BLOODSHROOM_LOGS, "bloodshroom", SurvivalistEssentialsIntegration::tconLoc);
        addLogVariants(TagManager.Items.TCON_GREENHEART_LOGS, "greenheart", SurvivalistEssentialsIntegration::tconLoc);
        addLogVariants(TagManager.Items.TCON_SKYROOT_LOGS, "skyroot", SurvivalistEssentialsIntegration::tconLoc);

        // Water Source
        addSimpleLogVariants(TagManager.Items.WS_PALM_TREE_LOGS, "palm_tree", SurvivalistEssentialsIntegration::wsLoc);

        // Undergarden
        addLogVariants(TagManager.Items.UNDERGARDEN_GRONGLE_LOGS, "grongle", SurvivalistEssentialsIntegration::undergardenLoc);
        addLogVariants(TagManager.Items.UNDERGARDEN_SMOGSTEM_LOGS, "smogstem", SurvivalistEssentialsIntegration::undergardenLoc);
        addLogVariants(TagManager.Items.UNDERGARDEN_WIGGLEWOOD_LOGS, "wigglewood", SurvivalistEssentialsIntegration::undergardenLoc);

        // BYG
        addLogVariants(TagManager.Items.BYG_WHITE_MANGROVE_LOGS, "white_mangrove", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_REDWOOD_LOGS, "redwood", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_BLUE_ENCHANTED_LOGS, "blue_enchanted", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_GREEN_ENCHANTED_LOGS, "green_enchanted", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_MAHOGANY_LOGS, "mahogany", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_BAOBAB_LOGS, "baobab", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_JACARANDA_LOGS, "jacaranda", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_CYPRESS_LOGS, "cypress", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_PALM_LOGS, "palm", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_EBONY_LOGS, "ebony", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_RAINBOW_EUCALYPTUS_LOGS, "rainbow_eucalyptus", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_ASPEN_LOGS, "aspen", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_FIR_LOGS, "fir", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_SKYRIS_LOGS, "skyris", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_CIKA_LOGS, "cika", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_HOLLY_LOGS, "holly", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_MAPLE_LOGS, "maple", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_PINE_LOGS, "pine", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_WILLOW_LOGS, "willow", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_WITCH_HAZEL_LOGS, "witch_hazel", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_ZELKOVA_LOGS, "zelkova", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_IRONWOOD_LOGS, "ironwood", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_SAKURA_LOGS, "sakura", SurvivalistEssentialsIntegration::bygLoc);
        addLogVariants(TagManager.Items.BYG_SPIRIT_LOGS, "spirit", SurvivalistEssentialsIntegration::bygLoc);
        this.tag(TagManager.Items.BYG_PALO_VERDE_LOGS)
            .addOptionalTag(SurvivalistEssentialsIntegration.bygLoc("palo_verde_logs"));
        this.tag(TagManager.Items.BYG_FLORUS_STEMS)
            .addOptionalTag(SurvivalistEssentialsIntegration.bygLoc("florus_logs"));

        // Twilight Forest
        this.tag(TagManager.Items.TF_GIANT_LOGS)
            .addOptional(SurvivalistEssentialsIntegration.tfLoc("giant_log"));
        this.tag(TagManager.Items.TF_CANOPY_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_CANOPY_LOG);
        this.tag(TagManager.Items.TF_CANOPY_STRIPPED_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_CANOPY_STRIPPED_LOG);
        this.tag(TagManager.Items.TF_CANOPY_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_CANOPY_WOOD);
        this.tag(TagManager.Items.TF_CANOPY_STRIPPED_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_CANOPY_STRIPPED_WOOD);
        this.tag(TagManager.Items.TF_DARK_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_DARK_LOG);
        this.tag(TagManager.Items.TF_DARK_STRIPPED_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_DARK_STRIPPED_LOG);
        this.tag(TagManager.Items.TF_DARK_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_DARK_WOOD);
        this.tag(TagManager.Items.TF_DARK_STRIPPED_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_DARK_STRIPPED_WOOD);
        this.tag(TagManager.Items.TF_MANGROVE_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_MANGROVE_LOG);
        this.tag(TagManager.Items.TF_MANGROVE_STRIPPED_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_MANGROVE_STRIPPED_LOG);
        this.tag(TagManager.Items.TF_MANGROVE_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_MANGROVE_WOOD);
        this.tag(TagManager.Items.TF_MANGROVE_STRIPPED_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_MANGROVE_STRIPPED_WOOD);
        this.tag(TagManager.Items.TF_MINING_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_MINING_LOG);
        this.tag(TagManager.Items.TF_MINING_STRIPPED_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_MINING_STRIPPED_LOG);
        this.tag(TagManager.Items.TF_MINING_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_MINING_WOOD);
        this.tag(TagManager.Items.TF_MINING_STRIPPED_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_MINING_STRIPPED_WOOD);
        this.tag(TagManager.Items.TF_SORTING_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_SORTING_LOG);
        this.tag(TagManager.Items.TF_SORTING_STRIPPED_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_SORTING_STRIPPED_LOG);
        this.tag(TagManager.Items.TF_SORTING_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_SORTING_WOOD);
        this.tag(TagManager.Items.TF_SORTING_STRIPPED_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_SORTING_STRIPPED_WOOD);
        this.tag(TagManager.Items.TF_TIME_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_TIME_LOG);
        this.tag(TagManager.Items.TF_TIME_STRIPPED_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_TIME_STRIPPED_LOG);
        this.tag(TagManager.Items.TF_TIME_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_TIME_WOOD);
        this.tag(TagManager.Items.TF_TIME_STRIPPED_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_TIME_STRIPPED_WOOD);
        this.tag(TagManager.Items.TF_TRANSFORMATION_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_TRANSFORMATION_LOG);
        this.tag(TagManager.Items.TF_TRANSFORMATION_STRIPPED_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_TRANSFORMATION_STRIPPED_LOG);
        this.tag(TagManager.Items.TF_TRANSFORMATION_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_TRANSFORMATION_WOOD);
        this.tag(TagManager.Items.TF_TRANSFORMATION_STRIPPED_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_TRANSFORMATION_STRIPPED_WOOD);
        this.tag(TagManager.Items.TF_TWILIGHT_OAK_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_TWILIGHT_OAK_LOG);
        this.tag(TagManager.Items.TF_TWILIGHT_OAK_STRIPPED_LOG)
            .addOptional(SurvivalistEssentialsIntegration.TF_TWILIGHT_OAK_STRIPPED_LOG);
        this.tag(TagManager.Items.TF_TWILIGHT_OAK_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_TWILIGHT_OAK_WOOD);
        this.tag(TagManager.Items.TF_TWILIGHT_OAK_STRIPPED_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.TF_TWILIGHT_OAK_STRIPPED_WOOD);

        // Ecologics
        addLogVariants(TagManager.Items.ECO_COCONUT_LOGS, "coconut", SurvivalistEssentialsIntegration::ecoLoc);
        addLogVariants(TagManager.Items.ECO_WALNUT_LOGS, "walnut", SurvivalistEssentialsIntegration::ecoLoc);
        addLogVariants(TagManager.Items.ECO_AZALEA_LOGS, "azalea", SurvivalistEssentialsIntegration::ecoLoc);
        addLogVariants(TagManager.Items.ECO_FLOWERING_AZALEA_LOGS, "flowering_azalea", SurvivalistEssentialsIntegration::ecoLoc);

        // Malum
        addSoulwoodVariants(TagManager.Items.MALUM_RUNEWOOD_LOGS, "runewood");
        addRunewoodVariants(TagManager.Items.MALUM_SOULWOOD_LOGS, "soulwood");

        // Ice and Fire; Dragons
        this.tag(TagManager.Items.IFD_DREADWOOD_LOGS)
            .addOptional(SurvivalistEssentialsIntegration.ifdLoc("dreadwood_log"));

        // Aquaculture
        this.tag(TagManager.Items.AQUA_DRIFTWOOD)
            .addOptional(SurvivalistEssentialsIntegration.aquaLoc("driftwood"));

        // Immersive Engineering
        this.tag(TagManager.Items.IE_TREATED_WOOD)
            .addOptional(SurvivalistEssentialsIntegration.ieLoc("treated_wood_horizontal"))
            .addOptional(SurvivalistEssentialsIntegration.ieLoc("treated_wood_vertical"))
            .addOptional(SurvivalistEssentialsIntegration.ieLoc("treated_wood_packaged"));

        // Regions Unexplored
        this.tag(TagManager.Items.RU_ALPHA_LOGS)
            .addOptional(SurvivalistEssentialsIntegration.regionsLoc("alpha_log"));
        addLogVariants(TagManager.Items.RU_BAOBAB_LOGS, "baobab", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_BLACKWOOD_LOGS, "blackwood", SurvivalistEssentialsIntegration::regionsLoc);
        addShroomVariants(TagManager.Items.RU_BIOSHROOM_LOGS, "bioshroom", SurvivalistEssentialsIntegration::regionsLoc);
        addShroomVariants(TagManager.Items.RU_BLUE_BIOSHROOM_LOGS, "blue_bioshroom", SurvivalistEssentialsIntegration::regionsLoc);
        addSimpleLogVariants(TagManager.Items.RU_BRIMWOOD_LOGS, "brimwood", SurvivalistEssentialsIntegration::regionsLoc)
            .addOptional(SurvivalistEssentialsIntegration.regionsLoc("brimwood_log_magma"))
            .addOptional(SurvivalistEssentialsIntegration.regionsLoc("brimwood_wood"));
        addLogVariants(TagManager.Items.RU_COBALT_LOGS, "cobalt", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_CYPRESS_LOGS, "cypress", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_DEAD_LOGS, "dead", SurvivalistEssentialsIntegration::regionsLoc)
            .addOptional(SurvivalistEssentialsIntegration.regionsLoc("ashen_log"))
            .addOptional(SurvivalistEssentialsIntegration.regionsLoc("ashen_wood"));
        addLogVariants(TagManager.Items.RU_EUCALYPTUS_LOGS, "eucalyptus", SurvivalistEssentialsIntegration::regionsLoc);
        addShroomVariants(TagManager.Items.RU_GREEN_BIOSHROOM_LOGS, "green_bioshroom", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_JOSHUA_LOGS, "joshua", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_KAPOK_LOGS, "kapok", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_LARCH_LOGS, "larch", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_MAGNOLIA_LOGS, "magnolia", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_MAPLE_LOGS, "maple", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_MAUVE_LOGS, "mauve", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_PALM_LOGS, "palm", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_PINE_LOGS, "pine", SurvivalistEssentialsIntegration::regionsLoc);
        addShroomVariants(TagManager.Items.RU_PINK_BIOSHROOM_LOGS, "pink_bioshroom", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_REDWOOD_LOGS, "redwood", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_SOCOTRA_LOGS, "socotra", SurvivalistEssentialsIntegration::regionsLoc);
        addLogVariants(TagManager.Items.RU_WILLOW_LOGS, "willow", SurvivalistEssentialsIntegration::regionsLoc);
        addShroomVariants(TagManager.Items.RU_YELLOW_BIOSHROOM_LOGS, "yellow_bioshroom", SurvivalistEssentialsIntegration::regionsLoc);
    }

    private TagAppender<Item> addSimpleLogVariants(TagKey<Item> tag, String type, Function<String, ResourceLocation> modLoc) {
        return this.tag(tag)
            .addOptional(modLoc.apply(type + "_log"))
            .addOptional(SurvivalistEssentialsIntegration.wsLoc("stripped_" + type + "_log"));
    }

    private void addShroomVariants(TagKey<Item> tag, String type, Function<String, ResourceLocation> modLoc) {
        this.tag(tag)
            .addOptional(modLoc.apply(type + "_hyphae"))
            .addOptional(modLoc.apply("stripped_" + type + "_hyphae"))
            .addOptional(modLoc.apply(type + "_stem"))
            .addOptional(SurvivalistEssentialsIntegration.wsLoc("stripped_" + type + "_stem"));
    }

    private TagAppender<Item> addLogVariants(TagKey<Item> tag, String type, Function<String, ResourceLocation> modLoc) {
        return this.tag(tag)
            .addOptional(modLoc.apply(type + "_log"))
            .addOptional(modLoc.apply("stripped_" + type + "_log"))
            .addOptional(modLoc.apply(type + "_wood"))
            .addOptional(modLoc.apply("stripped_" + type + "_wood"));
    }

    private void addRunewoodVariants(TagKey<Item> tag, String type) {
        this.tag(tag)
            .addOptional(SurvivalistEssentialsIntegration.malumLoc(type))
            .addOptional(SurvivalistEssentialsIntegration.malumLoc(type + "_log"))
            .addOptional(SurvivalistEssentialsIntegration.malumLoc("stripped_" + type + "_log"))
            .addOptional(SurvivalistEssentialsIntegration.malumLoc("exposed_" + type + "_log"))
            .addOptional(SurvivalistEssentialsIntegration.malumLoc("revealed_" + type + "_log"));
    }

    private void addSoulwoodVariants(TagKey<Item> tag, String type) {
        this.tag(tag)
            .addOptional(SurvivalistEssentialsIntegration.malumLoc(type))
            .addOptional(SurvivalistEssentialsIntegration.malumLoc(type + "_log"))
            .addOptional(SurvivalistEssentialsIntegration.malumLoc("stripped_" + type))
            .addOptional(SurvivalistEssentialsIntegration.malumLoc("stripped_" + type + "_log"))
            .addOptional(SurvivalistEssentialsIntegration.malumLoc("blighted_" + type))
            .addOptional(SurvivalistEssentialsIntegration.malumLoc("exposed_" + type + "_log"))
            .addOptional(SurvivalistEssentialsIntegration.malumLoc("revealed_" + type + "_log"));
    }

    private void builder(TagKey<Item> tag, ItemLike... items) {
        this.tag(tag).add(Arrays.stream(items).map(ItemLike::asItem).toArray(Item[]::new));
    }

}
