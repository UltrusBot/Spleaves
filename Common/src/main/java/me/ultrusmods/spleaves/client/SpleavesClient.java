package me.ultrusmods.spleaves.client;

import me.ultrusmods.spleaves.register.SpleavesBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.function.BiConsumer;

public class SpleavesClient {
    public static void registerBlockRenderTypes(BiConsumer<Block, RenderType> biConsumer) {
        biConsumer.accept(SpleavesBlocks.COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.EXPOSED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.WEATHERED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.OXIDIZED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.WAXED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.WAXED_EXPOSED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.WAXED_WEATHERED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.WAXED_OXIDIZED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.REINFORCED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.EXPOSED_REINFORCED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.WEATHERED_REINFORCED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.OXIDIZED_REINFORCED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.WAXED_REINFORCED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.WAXED_EXPOSED_REINFORCED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.WAXED_WEATHERED_REINFORCED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
        biConsumer.accept(SpleavesBlocks.WAXED_OXIDIZED_REINFORCED_COPPER_SPLEAVES.get(), RenderType.cutoutMipped());
    }
}
