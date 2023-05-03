package me.ultrusmods.spleaves.data;

import me.ultrusmods.spleaves.register.SpleavesBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.Registry;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

public class SpleavesTagProvider extends FabricTagProvider<Block> {

    public SpleavesTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.BLOCK);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(SpleavesBlocks.COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.EXPOSED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.WEATHERED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.OXIDIZED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.WAXED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.WAXED_EXPOSED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.WAXED_WEATHERED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.WAXED_OXIDIZED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.REINFORCED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.EXPOSED_REINFORCED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.WEATHERED_REINFORCED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.OXIDIZED_REINFORCED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.WAXED_REINFORCED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.WAXED_EXPOSED_REINFORCED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.WAXED_WEATHERED_REINFORCED_COPPER_SPLEAVES.get())
                .add(SpleavesBlocks.WAXED_OXIDIZED_REINFORCED_COPPER_SPLEAVES.get());
    }
}
