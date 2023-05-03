package me.ultrusmods.spleaves.data;

import me.ultrusmods.spleaves.register.SpleavesBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;

public class SpleavesRecipeProvider extends FabricRecipeProvider {
    public SpleavesRecipeProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<FinishedRecipe> exporter) {
        ShapedRecipeBuilder.shaped(SpleavesBlocks.COPPER_SPLEAVES.get(), 4)
                .pattern("C C")
                .pattern(" C ")
                .pattern("C C")
                .define('C', Items.COPPER_INGOT)
                .unlockedBy("has_item", has(Items.COPPER_INGOT))
                .save(exporter);
        ShapedRecipeBuilder.shaped(SpleavesBlocks.REINFORCED_COPPER_SPLEAVES.get(), 4)
                .pattern("CIC")
                .pattern("ICI")
                .pattern("CIC")
                .define('C', Items.COPPER_INGOT)
                .define('I', Items.IRON_NUGGET)
                .unlockedBy("has_item", has(Items.COPPER_INGOT))
                .save(exporter);
        waxedRecipe(exporter, SpleavesBlocks.COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_COPPER_SPLEAVES.get());
        waxedRecipe(exporter, SpleavesBlocks.EXPOSED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_EXPOSED_COPPER_SPLEAVES.get());
        waxedRecipe(exporter, SpleavesBlocks.WEATHERED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_WEATHERED_COPPER_SPLEAVES.get());
        waxedRecipe(exporter, SpleavesBlocks.OXIDIZED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_OXIDIZED_COPPER_SPLEAVES.get());
        waxedRecipe(exporter, SpleavesBlocks.REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_REINFORCED_COPPER_SPLEAVES.get());
        waxedRecipe(exporter, SpleavesBlocks.EXPOSED_REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_EXPOSED_REINFORCED_COPPER_SPLEAVES.get());
        waxedRecipe(exporter, SpleavesBlocks.WEATHERED_REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_WEATHERED_REINFORCED_COPPER_SPLEAVES.get());
        waxedRecipe(exporter, SpleavesBlocks.OXIDIZED_REINFORCED_COPPER_SPLEAVES.get(), SpleavesBlocks.WAXED_OXIDIZED_REINFORCED_COPPER_SPLEAVES.get());
    }

    private static void waxedRecipe(Consumer<FinishedRecipe> consumer, Block unwaxed, Block waxed) {
        ShapelessRecipeBuilder.shapeless(waxed)
                .requires(unwaxed)
                .requires(Items.HONEYCOMB)
                .group(getItemName(waxed))
                .unlockedBy(getHasName(unwaxed),
                has(unwaxed))
                .save(consumer, getConversionRecipeName(waxed, Items.HONEYCOMB));
    }
}
