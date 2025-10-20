package survivalistessentials.data.client;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import survivalistessentials.SurvivalistEssentials;
import survivalistessentials.common.Translations;

public class SurvivalistEssentialsLanguageProvider extends LanguageProvider {

    public SurvivalistEssentialsLanguageProvider(PackOutput output) {
        super(output, SurvivalistEssentials.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Creative Tab
        add(SurvivalistEssentials.MODID + ".items", "Survivalist Essentials Items");

        // Items
        addTranslationItem("plant_fiber", "Plant Fibers");
        addTranslationItem("plant_string", "Plant String");
        addTranslationItem("flint_shard", "Flint Shard");
        addTranslationItem("crude_knife", "Crude Knife");
        addTranslationItem("basic_knife", "Basic Knife");
        addTranslationItem("sharp_knife", "Sharp Knife");
        addTranslationItem("crude_hatchet", "Crude Hatchet");
        addTranslationItem("crude_saw", "Crude Saw");
        addTranslationItem("basic_saw", "Basic Saw");
        addTranslationItem("sharp_saw", "Sharp Saw");
        addTranslationItem("crude_saw_blade", "Crude Saw Blade");
        addTranslationItem("basic_saw_blade", "Basic Saw Blade");
        addTranslationItem("sharp_saw_blade", "Sharp Saw Blade");
        addTranslationItem("saw_handle", "Saw Handle");
        addTranslationItem("knife", "Knife");
        addTranslationItem("knife.description", "For cutting stuff.");
        addTranslationItem("mortar_and_pestle", "Mortar and Pestle");
        addTranslationItem("saw", "Saw");
        addTranslationItem("saw_blade", "Saw Blade");
        addTranslationItem("saw.description", "For cutting wood!");
        addTranslationItem("saw_blade_cast", "Saw Blade Cast");
        addTranslationItem("saw_blade_sand_cast", "Saw Blade Sand Cast");
        addTranslationItem("saw_blade_red_sand_cast", "Saw Blade Red Sand Cast");
        addTranslationItem("reinforced_wool_helmet", "Reinforced Wool Helmet");
        addTranslationItem("reinforced_wool_chestplate", "Reinforced Wool Chestplate");
        addTranslationItem("reinforced_wool_leggings", "Reinforced Wool Leggings");
        addTranslationItem("reinforced_wool_boots", "Reinforced Wool Boots");
        addTranslationItem("reinforced_jelled_slime_helmet", "Reinforced Slime Helmet");
        addTranslationItem("reinforced_jelled_slime_chestplate", "Reinforced Slime Chestplate");
        addTranslationItem("reinforced_jelled_slime_leggings", "Reinforced Slime Leggings");
        addTranslationItem("reinforced_jelled_slime_boots", "Reinforced Slime Boots");
        addTranslationItem("bandage", "Bandage");
        addTranslationItem("cloth", "Cloth");
        addTranslationItem("crude_bandage", "Crude Bandage");
        addTranslationItem("ointment", "Ointment");
        addTranslationItem("plant_paste", "Plant Paste");
        addTranslationItem("wooden_cup", "Mysterious Wooden Cup");
        addTranslationItem("book", "Survivalist Essentials");
        addTranslationItem("modpack_book", "Survivalist Essentials+");

        // Blocks
        addTranslationBlock("rock_stone_block", "Rock");
        addTranslationBlock("stone_loose_rock", "Loose Rock (Stone)");
        addTranslationBlock("andesite_loose_rock", "Loose Rock (Andesite)");
        addTranslationBlock("diorite_loose_rock", "Loose Rock (Diorite)");
        addTranslationBlock("granite_loose_rock", "Loose Rock (Granite)");
        addTranslationBlock("sandstone_loose_rock", "Loose Rock (Sandstone)");
        addTranslationBlock("red_sandstone_loose_rock", "Loose Rock (Red Sandstone)");

        // JEI Descriptions
        addJeiDescription("rock_stone", "Rocks are found lying on the ground. These can be used with the knife in a crafting table to get flint shards.");
        addJeiDescription("plant_fiber", "Plant fibers are dropped when breaking grass or leaves with a knife. They are used to make plant string for tools and plant paste for bandage ointment.");
        addJeiDescription("stick", "Sticks are dropped from leaves. Using any knife doubles the chance of getting a stick.");
        addJeiDescription("flint_shard", "Flint shards can be obtained from striking a rock on any rocky surface. Interact with any stone-like block with a rock, and it might split into two flint shards.");

        // Tooltips
        addTranslationTooltip("uselessTool1", "This tool cannot mine anything!");
        addTranslationTooltip("uselessTool2", "Can only be used for crafting.");
        addTranslationTooltip("uselessHoe1", "This hoe cannot hoe anything!");
        addTranslationTooltip("uselessWeapon1", "This weapon hits like a wet noodle!");
        addTranslationTooltip("uselessBow1", "This bows bowstring snapped!");
        addTranslationTooltip("uselessArmor1", "Axiom sizing: XXXL. Probably won't fit.");
        addTranslationTooltip("cxp", "Crafty");
        addTranslationMessage("tcon_compat", "It is recommended to install Tinkers' Survival with Survivalist Essentials for better compatibility with Tinkers' Construct. It offers Tinkers' versions of the Saw and Knife!");
        addTranslationMessage("notice", "Notice");
        addTranslationMessage("warning", "Warning");
        addTranslationMessage("wrong_tool", "A %s is required.");
        addTranslationMessage("wrong_tool2", "Ummm ... %s?");
        addTranslationMessage("tool_broke", "Your %s broke.");
        addTranslationMessage("spawn_set", "Not sleepy, but spawn set!");

        // Effects
        addTranslationEffect("stop_bleeding", "Stop Bleeding");
        addTranslationEffect("zombie_essence", "Zombie Essence");

        // TCon Patterns
        addTranslationPattern("saw_blade", "Saw Blade");

        // Configuration
        addConfigurationTitle("Survivalist Essentials");
        addConfigurationName("enablefailsound", "Enable Fail Sound");
        addConfigurationDescription("enablefailsound", "enablefailsound");
        addConfigurationName("informtconcompat", "Inform Tinkers' Construct Compatibility");
        addConfigurationDescription("informtconcompat", "informtconcompat");
        addConfigurationName("flintchance", "Flint Knapping Chance");
        addConfigurationDescription("flintchance", "flintchance");
        addConfigurationName("healrate", "Bandage Heal Rate");
        addConfigurationDescription("healrate", "healrate");
        addConfigurationName("slowdownspeed", "Incorrect Tool Slowdown Speed");
        addConfigurationDescription("slowdownspeed", "slowdownspeed");
        addConfigurationName("invertlisttowhitelist", "Invert Tool List to Whitelist");
        addConfigurationDescription("invertlisttowhitelist", "invertlisttowhitelist");
        addConfigurationName("mods", "Tool Mods List");
        addConfigurationDescription("mods", "modslist");
        addConfigurationName("items", "Tool Items List");
        addConfigurationDescription("items", "itemslist");
        addConfigurationName("logmodpackdata", "Log Modpack Data");
        addConfigurationDescription("logmodpackdata", "logmodpackdata");
        addConfigurationName("blockmods", "Block Mods List");
        addConfigurationDescription("blockmods", "blockmodslist");
        addConfigurationName("enablehungerpenalty", "Enable Hunger Penalty");
        addConfigurationDescription("enablehungerpenalty", "enablehungerpenalty");
        addConfigurationName("hunger", "Hunger After Death");
        addConfigurationDescription("hunger", "hunger");
        addConfigurationName("saturation", "Saturation After Death");
        addConfigurationDescription("saturation", "saturation");
        addConfigurationName("enablehealthpenalty", "Enable Health Penalty");
        addConfigurationDescription("enablehealthpenalty", "enablehealthpenalty");
        addConfigurationName("health", "Health After Death");
        addConfigurationDescription("health", "health");
        addConfigurationName("startinghealthpenalty", "Starting Health Penalty");
        addConfigurationDescription("startinghealthpenalty", "startinghealthpenalty");
        addConfigurationName("genericdamage", "Generic Tool Damage");
        addConfigurationDescription("genericdamage", "genericdamage");
        addConfigurationName("armormods", "Armor Mods List");
        addConfigurationDescription("armormods", "armormodslist");
        addConfigurationName("armor", "Armor Items List");
        addConfigurationDescription("armor", "armorlist");
        addConfigurationName("tag", "Tool and Armor Tags List");
        addConfigurationDescription("tag", "taglist");

        // Advancements
        addTranslationAdvancement("root.title", "Survivalist Essentials");
        addTranslationAdvancement("root.desc", "You're bound to ...");
        addTranslationAdvancement("sticks_and_stones.title", "Throw your Sticks and Stones");
        addTranslationAdvancement("sticks_and_stones.desc", "Pick up a rock from the ground and leaves might give some sticks");
        addTranslationAdvancement("flint_shard.title", "Rock + rock");
        addTranslationAdvancement("flint_shard.desc", "Maybe hitting your round rock on a cube rock will work");
        addTranslationAdvancement("crude_knife.title", "Crude, but still a knife");
        addTranslationAdvancement("crude_knife.desc", "Not a really good weapon, but pretty good as a lawnmower");
        addTranslationAdvancement("plant_string.title", "Crude String");
        addTranslationAdvancement("plant_string.desc", "Obtain a Plant String");
        addTranslationAdvancement("crude_hatchet.title", "Your first wood?");
        addTranslationAdvancement("crude_hatchet.desc", "Obtain a Crude Hatchet");
        addTranslationAdvancement("crude_saw.title", "Your first planks");
        addTranslationAdvancement("crude_saw.desc", "Obtain a Crude Saw");
        addTranslationAdvancement("getting_wood.title", "Getting Wood");
        addTranslationAdvancement("getting_wood.desc", "I got some wood.");

        // Guidebook
        addGuidebookTranslation("subtitle", "A Path to Survival");
        addGuidebookTranslation("intro", "Welcome to Survivalist Essentials!$(br)$(br)There are few very important things to remember when playing:$(br)$(li)A correct tool is required for harvesting.$(li)The only way to craft Wooden Planks and Sticks is with a saw.");
        addGuidebookTranslation("getting_started.name", "Getting Started");
        addGuidebookTranslation("getting_started.desc", "Gathering basic materials for crafting crude tools is essential for getting started. The following pages will cover what you MUST gather to survive.");
        addGuidebookTranslation("getting_started.materials.name", "Materials Gathering");
        addGuidebookTranslation("getting_started.materials.gather_stones.title", "Gathering Stones");
        addGuidebookTranslation("getting_started.materials.gather_stones.desc", "You may notice right away some small piles of rocks lying randomly on the ground throughout the world.$(br)$(br)Break and gather them quickly, they are a valuable AND necessary resource and needed for crafting tools.");
        addGuidebookTranslation("getting_started.materials.gather_sticks.title", "Get Sticks!!!");
        addGuidebookTranslation("getting_started.materials.gather_sticks.desc", "Sticks are essenial for creating your first Crude Tools. These are the most basic handles.$(br)$(br)Punching leaves and will drop sticks. The drop rate is not great but it will allow you to get sticks. Once you craft a knife, you can use it to increase the drop rate.");
        addGuidebookTranslation("getting_started.materials.flint_shards.title", "Flint Shards");
        addGuidebookTranslation("getting_started.materials.flint_shards.desc", "Crude tools need Flint Shards!$(br)$(br)Simply knapp (right-click) Rocks you've gathered on a hard surface (any regular Stone/Cobblestone/Granite/etc. hard blocks) and with a bit of luck, you can split them in half to obtain shards.$(br)$(br)Once you have the $(l:survivalistessentials:tools/crude_tools)Crude Knife$(), you can make more shards in your crafting grid.");
        addGuidebookTranslation("getting_started.materials.plant_fiber.title", "Plant Fiber");
        addGuidebookTranslation("getting_started.materials.plant_fiber.desc", "Next you'll need to get some Plant Fiber.$(br)$(br)Plant Fiber is a new drop when breaking grass or most plants with the Crude Knife. Grass is probably the easiest way to get Plant Fiber.$(br)$(br)You'll need Plant Fiber to craft Plant String used in crafting the Crude Hatchet, Crude Saw and Bandages.");
        addGuidebookTranslation("getting_started.materials.plant_string.title", "Plant String");
        addGuidebookTranslation("getting_started.materials.plant_string.desc", "Plant String is essential for crafting the Crude Hatchet and Crude Saw. Gather enough Plant Fiber!");
        addGuidebookTranslation("tools.name", "Tools");
        addGuidebookTranslation("tools.desc", "Tools are essential for gathering materials and getting your first wood planks!$(br)$(br)Punching trees is no longer an option, so you'll need these most basic tools to be able to craft better tools, or more advanced items using the crafting table.");
        addGuidebookTranslation("tools.crude_tools.name", "Crude Tools");
        addGuidebookTranslation("tools.crude_tools.knife.desc", "Crude Knife is essential for gathering Plant Fiber. This MUST be the first tool crafted to progress.");
        addGuidebookTranslation("tools.crude_tools.knife_recipes.name", "Crude Knife Recipes");
        addGuidebookTranslation("tools.crude_tools.knife_recipes.desc", "In addition to more shards, you can also craft in any crafting grid:$(br)$(li)String: knife and wool$(br)$(li)Sticks: knife and saplings");
        addGuidebookTranslation("tools.crude_tools.hatchet.desc", "Crude Hatchet is essential for gathering wood. You can now chop down trees!");
        addGuidebookTranslation("tools.crude_tools.crude_saw_blade.desc", "Crude Saw Blade is the first part for the Crude Saw. Blades are replaceable on the Saw. The crude blades have only half the output of sharper blade materials.");
        addGuidebookTranslation("tools.crude_tools.saw_handle.desc", "The Saw Handle is a reusable part for crafting the Crude Saw. Once the blade breaks, just reuse the left over handle to create a new Saw.");
        addGuidebookTranslation("tools.crude_tools.crude_saw.desc", "Crude Saw will allow you to craft planks! Upgrade the blade to increase plank output and durability.");
        addGuidebookTranslation("tools.crude_tools.planks.name", "Planks");
        addGuidebookTranslation("tools.crude_tools.planks.desc", "Here is an example recipe with the Crude Saw that will allow you to craft planks!");
        addGuidebookTranslation("tools.crude_tools.sticks.name", "Sticks");
        addGuidebookTranslation("tools.crude_tools.sticks.desc", "Here is an example recipe with the Crude Saw that will allow you to craft sticks!");
        addGuidebookTranslation("tools.improved_tools.name", "Improved Tools");
        addGuidebookTranslation("tools.improved_tools.subtitle", "Get sharper tools!");
        addGuidebookTranslation("tools.improved_tools.intro", "While crude tools will get you started, you'll want to create more durable tools.");
        addGuidebookTranslation("health.name", "Health");
        addGuidebookTranslation("health.desc", "It's a little more difficult getting started. To help with the process, some basic bandages are available to help in the early game.");
        addGuidebookTranslation("health.ingredients.name", "Ingredients");
        addGuidebookTranslation("health.ingredients.subtitle", "It's the little things...");
        addGuidebookTranslation("health.ingredients.desc", "There are several basic materials required for making bandages.");
        addGuidebookTranslation("health.ingredients.cloth.desc", "Cloth is an ingredient used for making Bandages.");
        addGuidebookTranslation("health.ingredients.mortar_and_pestle.desc", "Essential tool for crafting plant paste.");
        addGuidebookTranslation("health.ingredients.plant_paste.desc", "Essential ingredient for Ointment.");
        addGuidebookTranslation("health.ingredients.ointment.desc", "Ointment is an ingredient used for making Bandages.");
        addGuidebookTranslation("health.bandages.name", "Bandages");
        addGuidebookTranslation("health.bandages.subtitle", "Stop the bleeding...");
        addGuidebookTranslation("health.bandages.desc", "Crude bandages are simple to make. Bandages are a little more work, but do a much better job of stopping the bleeding.");
        addGuidebookTranslation("health.bandages.crude_bandage.desc", "Cheap bandage, great for early game.");
        addGuidebookTranslation("health.bandages.bandage.desc", "Better bandage, great for mid game.");
    }

    private void addTranslationItem(String id, String name) {
        add("item." + SurvivalistEssentials.MODID + "." + id, name);
    }

    private void addTranslationBlock(String id, String name) {
        add("block." + SurvivalistEssentials.MODID + "." + id, name);
    }

    private void addJeiDescription(String id, String description) {
        add("jei." + SurvivalistEssentials.MODID + ".description." + id, description);
    }

    private void addTranslationTooltip(String id, String tooltip) {
        add("tooltip." + SurvivalistEssentials.MODID + "." + id, tooltip);
    }

    private void addTranslationMessage(String id, String message) {
        add("message." + SurvivalistEssentials.MODID + "." + id, message);
    }

    private void addTranslationEffect(String id, String effect) {
        add("effect." + SurvivalistEssentials.MODID + "." + id, effect);
    }

    private void addTranslationPattern(String id, String pattern) {
        add("pattern." + SurvivalistEssentials.MODID + "." + id, pattern);
    }

    private void addTranslationAdvancement(String id, String text) {
        add("advancements." + SurvivalistEssentials.MODID + "." + id, text);
    }

    private void addGuidebookTranslation(String id, String text) {
        add("info." + SurvivalistEssentials.MODID + ".book." + id, text);
    }

    private void addConfigurationTitle(String title) {
        add(SurvivalistEssentials.MODID + ".configuration.title", title);
    }

    private void addConfigurationName(String id, String name) {
        add(SurvivalistEssentials.MODID + ".configuration." + id + ".name", name);
    }

    private void addConfigurationDescription(String id) {
        add(SurvivalistEssentials.MODID + ".configuration." + id + ".description", Translations.get(id));
    }

    private void addConfigurationDescription(String id, String key) {
        add(SurvivalistEssentials.MODID + ".configuration." + id + ".description", Translations.get(key));
    }

}
