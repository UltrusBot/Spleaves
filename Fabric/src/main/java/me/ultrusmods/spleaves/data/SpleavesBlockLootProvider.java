package me.ultrusmods.spleaves.data;

import me.ultrusmods.spleaves.Constants;
import me.ultrusmods.spleaves.register.SpleavesBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.function.BiConsumer;

public class SpleavesBlockLootProvider extends SimpleFabricLootTableProvider {
    public SpleavesBlockLootProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextParamSets.BLOCK);
    }

    @Override
    public void accept(BiConsumer<ResourceLocation, LootTable.Builder> resourceLocationBuilderBiConsumer) {
        dropSelf("copper_spleaves", SpleavesBlocks.COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("waxed_copper_spleaves", SpleavesBlocks.WAXED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("exposed_copper_spleaves", SpleavesBlocks.EXPOSED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("waxed_exposed_copper_spleaves", SpleavesBlocks.WAXED_EXPOSED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("weathered_copper_spleaves", SpleavesBlocks.WEATHERED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("waxed_weathered_copper_spleaves", SpleavesBlocks.WAXED_WEATHERED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("oxidized_copper_spleaves", SpleavesBlocks.OXIDIZED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("waxed_oxidized_copper_spleaves", SpleavesBlocks.WAXED_OXIDIZED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("reinforced_copper_spleaves", SpleavesBlocks.REINFORCED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("waxed_reinforced_copper_spleaves", SpleavesBlocks.WAXED_REINFORCED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("exposed_reinforced_copper_spleaves", SpleavesBlocks.EXPOSED_REINFORCED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("waxed_exposed_reinforced_copper_spleaves", SpleavesBlocks.WAXED_EXPOSED_REINFORCED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("weathered_reinforced_copper_spleaves", SpleavesBlocks.WEATHERED_REINFORCED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("waxed_weathered_reinforced_copper_spleaves", SpleavesBlocks.WAXED_WEATHERED_REINFORCED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("oxidized_reinforced_copper_spleaves", SpleavesBlocks.OXIDIZED_REINFORCED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
        dropSelf("waxed_oxidized_reinforced_copper_spleaves", SpleavesBlocks.WAXED_OXIDIZED_REINFORCED_COPPER_SPLEAVES.get(), resourceLocationBuilderBiConsumer);
    }

    public void dropSelf(String id, Block block, BiConsumer<ResourceLocation, LootTable.Builder> biConsumer) {
        biConsumer.accept(Constants.id("blocks/" +  id), BlockLoot.createSingleItemTable(block));
    }
}
