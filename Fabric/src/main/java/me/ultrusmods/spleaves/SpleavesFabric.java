package me.ultrusmods.spleaves;

import me.ultrusmods.spleaves.register.SpleavesBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

public class SpleavesFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        SpleavesCommon.init();
        OxidizableBlocksRegistry.registerOxidizableBlockPair(SpleavesBlocks.COPPER_SPLEAVES.get(), SpleavesBlocks.EXPOSED_COPPER_SPLEAVES.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(SpleavesBlocks.EXPOSED_COPPER_SPLEAVES.get(), SpleavesBlocks.WEATHERED_COPPER_SPLEAVES.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(SpleavesBlocks.WEATHERED_COPPER_SPLEAVES.get(), SpleavesBlocks.OXIDIZED_COPPER_SPLEAVES.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(SpleavesBlocks.COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_COPPER_SPLEAVES.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(SpleavesBlocks.EXPOSED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_EXPOSED_COPPER_SPLEAVES.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(SpleavesBlocks.WEATHERED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_WEATHERED_COPPER_SPLEAVES.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(SpleavesBlocks.OXIDIZED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_OXIDIZED_COPPER_SPLEAVES.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(SpleavesBlocks.REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.EXPOSED_REINFORCED_COPPER_SPLEAVES.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(SpleavesBlocks.EXPOSED_REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.WEATHERED_REINFORCED_COPPER_SPLEAVES.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(SpleavesBlocks.WEATHERED_REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.OXIDIZED_REINFORCED_COPPER_SPLEAVES.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(SpleavesBlocks.REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_REINFORCED_COPPER_SPLEAVES.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(SpleavesBlocks.EXPOSED_REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_EXPOSED_REINFORCED_COPPER_SPLEAVES.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(SpleavesBlocks.WEATHERED_REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_WEATHERED_REINFORCED_COPPER_SPLEAVES.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(SpleavesBlocks.OXIDIZED_REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_OXIDIZED_REINFORCED_COPPER_SPLEAVES.get());

    }
}
