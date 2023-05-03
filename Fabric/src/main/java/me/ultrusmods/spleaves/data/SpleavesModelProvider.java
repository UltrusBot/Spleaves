package me.ultrusmods.spleaves.data;

import me.ultrusmods.spleaves.block.SpleavesBlock;
import me.ultrusmods.spleaves.register.SpleavesBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class SpleavesModelProvider extends FabricModelProvider {
    public SpleavesModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        createSpleaves(SpleavesBlocks.COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_COPPER_SPLEAVES.get(), SpleavesBlocks.REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_REINFORCED_COPPER_SPLEAVES.get(), blockStateModelGenerator);
        createSpleaves(SpleavesBlocks.EXPOSED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_EXPOSED_COPPER_SPLEAVES.get(), SpleavesBlocks.EXPOSED_REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_EXPOSED_REINFORCED_COPPER_SPLEAVES.get(), blockStateModelGenerator);
        createSpleaves(SpleavesBlocks.WEATHERED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_WEATHERED_COPPER_SPLEAVES.get(), SpleavesBlocks.WEATHERED_REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_WEATHERED_REINFORCED_COPPER_SPLEAVES.get(), blockStateModelGenerator);
        createSpleaves(SpleavesBlocks.OXIDIZED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_OXIDIZED_COPPER_SPLEAVES.get(), SpleavesBlocks.OXIDIZED_REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_OXIDIZED_REINFORCED_COPPER_SPLEAVES.get(), blockStateModelGenerator);
    }
    public void createSpleaves(Block block, Block waxed, Block reinforced, Block reinforcedWaxed, BlockModelGenerators blockStateModelGenerator) {
        ResourceLocation regular = TexturedModel.CUBE.create(block, blockStateModelGenerator.modelOutput);
        ResourceLocation breaking = blockStateModelGenerator.createSuffixedVariant(block, "_breaking", ModelTemplates.CUBE_ALL, TextureMapping::cube);
        blockStateModelGenerator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(block).with(BlockModelGenerators.createBooleanModelDispatch(SpleavesBlock.BREAKING, breaking, regular)));
        blockStateModelGenerator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(waxed).with(BlockModelGenerators.createBooleanModelDispatch(SpleavesBlock.BREAKING, breaking, regular)));
        blockStateModelGenerator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(reinforced, Variant.variant().with(VariantProperties.MODEL, regular)));
        blockStateModelGenerator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(reinforcedWaxed, Variant.variant().with(VariantProperties.MODEL, regular)));
        blockStateModelGenerator.skipAutoItemBlock(waxed);
        blockStateModelGenerator.skipAutoItemBlock(reinforced);
        blockStateModelGenerator.skipAutoItemBlock(reinforcedWaxed);
        blockStateModelGenerator.delegateItemModel(waxed, regular);
        blockStateModelGenerator.delegateItemModel(reinforced, regular);
        blockStateModelGenerator.delegateItemModel(reinforcedWaxed, regular);

    }



    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {


    }
}
