package me.ultrusmods.spleaves.register;

import me.ultrusmods.spleaves.Constants;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class SpleavesItems {
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(Registry.ITEM, Constants.MOD_ID);
    public static final RegistryObject<Item> COPPER_SPLEAVES = ITEMS.register("copper_spleaves", () -> new BlockItem(SpleavesBlocks.COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> EXPOSED_COPPER_SPLEAVES = ITEMS.register("exposed_copper_spleaves", () -> new BlockItem(SpleavesBlocks.EXPOSED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WEATHERED_COPPER_SPLEAVES = ITEMS.register("weathered_copper_spleaves", () -> new BlockItem(SpleavesBlocks.WEATHERED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> OXIDIZED_COPPER_SPLEAVES = ITEMS.register("oxidized_copper_spleaves", () -> new BlockItem(SpleavesBlocks.OXIDIZED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WAXED_COPPER_SPLEAVES = ITEMS.register("waxed_copper_spleaves", () -> new BlockItem(SpleavesBlocks.WAXED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WAXED_EXPOSED_COPPER_SPLEAVES = ITEMS.register("waxed_exposed_copper_spleaves", () -> new BlockItem(SpleavesBlocks.WAXED_EXPOSED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WAXED_WEATHERED_COPPER_SPLEAVES = ITEMS.register("waxed_weathered_copper_spleaves", () -> new BlockItem(SpleavesBlocks.WAXED_WEATHERED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WAXED_OXIDIZED_COPPER_SPLEAVES = ITEMS.register("waxed_oxidized_copper_spleaves", () -> new BlockItem(SpleavesBlocks.WAXED_OXIDIZED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> REINFORCED_COPPER_SPLEAVES = ITEMS.register("reinforced_copper_spleaves", () -> new BlockItem(SpleavesBlocks.REINFORCED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> REINFORCED_EXPOSED_COPPER_SPLEAVES = ITEMS.register("exposed_reinforced_copper_spleaves", () -> new BlockItem(SpleavesBlocks.EXPOSED_REINFORCED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> REINFORCED_WEATHERED_COPPER_SPLEAVES = ITEMS.register("weathered_reinforced_copper_spleaves", () -> new BlockItem(SpleavesBlocks.WEATHERED_REINFORCED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> REINFORCED_OXIDIZED_COPPER_SPLEAVES = ITEMS.register("oxidized_reinforced_copper_spleaves", () -> new BlockItem(SpleavesBlocks.OXIDIZED_REINFORCED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WAXED_REINFORCED_COPPER_SPLEAVES = ITEMS.register("waxed_reinforced_copper_spleaves", () -> new BlockItem(SpleavesBlocks.WAXED_REINFORCED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WAXED_REINFORCED_EXPOSED_COPPER_SPLEAVES = ITEMS.register("waxed_exposed_reinforced_copper_spleaves", () -> new BlockItem(SpleavesBlocks.WAXED_EXPOSED_REINFORCED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WAXED_REINFORCED_WEATHERED_COPPER_SPLEAVES = ITEMS.register("waxed_weathered_reinforced_copper_spleaves", () -> new BlockItem(SpleavesBlocks.WAXED_WEATHERED_REINFORCED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WAXED_REINFORCED_OXIDIZED_COPPER_SPLEAVES = ITEMS.register("waxed_oxidized_reinforced_copper_spleaves", () -> new BlockItem(SpleavesBlocks.WAXED_OXIDIZED_REINFORCED_COPPER_SPLEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static void init() {
    }
}
