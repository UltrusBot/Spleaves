package me.ultrusmods.spleaves.register;

import me.ultrusmods.spleaves.Constants;
import me.ultrusmods.spleaves.block.OxidizableSpleavesBlock;
import me.ultrusmods.spleaves.block.SpleavesBlock;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class SpleavesBlocks {
    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(Registry.BLOCK, Constants.MOD_ID);
    public static final RegistryObject<Block> COPPER_SPLEAVES = BLOCKS.register("copper_spleaves", () -> new OxidizableSpleavesBlock(getSpleavesProperties(Blocks.COPPER_BLOCK), 990, WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> EXPOSED_COPPER_SPLEAVES = BLOCKS.register("exposed_copper_spleaves", () -> new OxidizableSpleavesBlock(getSpleavesProperties(Blocks.EXPOSED_COPPER), 985, WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WEATHERED_COPPER_SPLEAVES = BLOCKS.register("weathered_copper_spleaves", () -> new OxidizableSpleavesBlock(getSpleavesProperties(Blocks.WEATHERED_COPPER), 950, WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> OXIDIZED_COPPER_SPLEAVES = BLOCKS.register("oxidized_copper_spleaves", () -> new OxidizableSpleavesBlock(getSpleavesProperties(Blocks.OXIDIZED_COPPER), 900, WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WAXED_COPPER_SPLEAVES = BLOCKS.register("waxed_copper_spleaves", () -> new SpleavesBlock(getSpleavesProperties(Blocks.COPPER_BLOCK), 990));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_SPLEAVES = BLOCKS.register("waxed_exposed_copper_spleaves", () -> new SpleavesBlock(getSpleavesProperties(Blocks.EXPOSED_COPPER), 985));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_SPLEAVES = BLOCKS.register("waxed_weathered_copper_spleaves", () -> new SpleavesBlock(getSpleavesProperties(Blocks.WEATHERED_COPPER), 950));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_SPLEAVES = BLOCKS.register("waxed_oxidized_copper_spleaves", () -> new SpleavesBlock(getSpleavesProperties(Blocks.OXIDIZED_COPPER), 900));

    public static final RegistryObject<Block> REINFORCED_COPPER_SPLEAVES = BLOCKS.register("reinforced_copper_spleaves", () -> new Block(getSpleavesProperties(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> EXPOSED_REINFORCED_COPPER_SPLEAVES = BLOCKS.register("exposed_reinforced_copper_spleaves", () -> new Block(getSpleavesProperties(Blocks.EXPOSED_COPPER)));
    public static final RegistryObject<Block> WEATHERED_REINFORCED_COPPER_SPLEAVES = BLOCKS.register("weathered_reinforced_copper_spleaves", () -> new Block(getSpleavesProperties(Blocks.WEATHERED_COPPER)));
    public static final RegistryObject<Block> OXIDIZED_REINFORCED_COPPER_SPLEAVES = BLOCKS.register("oxidized_reinforced_copper_spleaves", () -> new Block(getSpleavesProperties(Blocks.OXIDIZED_COPPER)));

    public static final RegistryObject<Block> WAXED_REINFORCED_COPPER_SPLEAVES = BLOCKS.register("waxed_reinforced_copper_spleaves", () -> new Block(getSpleavesProperties(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> WAXED_EXPOSED_REINFORCED_COPPER_SPLEAVES = BLOCKS.register("waxed_exposed_reinforced_copper_spleaves", () -> new Block(getSpleavesProperties(Blocks.EXPOSED_COPPER)));
    public static final RegistryObject<Block> WAXED_WEATHERED_REINFORCED_COPPER_SPLEAVES = BLOCKS.register("waxed_weathered_reinforced_copper_spleaves", () -> new Block(getSpleavesProperties(Blocks.WEATHERED_COPPER)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_REINFORCED_COPPER_SPLEAVES = BLOCKS.register("waxed_oxidized_reinforced_copper_spleaves", () -> new Block(getSpleavesProperties(Blocks.OXIDIZED_COPPER)));


    public static void init() {
    }
    private static BlockBehaviour.Properties getSpleavesProperties(Block block) {
        return Block.Properties.copy(block).noOcclusion().strength(1F, 1.5F);
    }

}
