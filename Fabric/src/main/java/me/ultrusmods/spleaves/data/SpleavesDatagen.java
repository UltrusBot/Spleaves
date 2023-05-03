package me.ultrusmods.spleaves.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SpleavesDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(SpleavesModelProvider::new);
        fabricDataGenerator.addProvider(SpleavesTagProvider::new);
        fabricDataGenerator.addProvider(SpleavesRecipeProvider::new);
        fabricDataGenerator.addProvider(SpleavesBlockLootProvider::new);
    }
}
