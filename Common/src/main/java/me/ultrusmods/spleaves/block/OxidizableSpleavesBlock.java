package me.ultrusmods.spleaves.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

public class OxidizableSpleavesBlock extends SpleavesBlock implements WeatheringCopper {
    private final WeatheringCopper.WeatherState weatherState;

    public OxidizableSpleavesBlock(Properties properties, int strength, WeatheringCopper.WeatherState weatherState) {
        super(properties, strength);
        this.weatherState = weatherState;
    }

    @Override
    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource random) {
        this.onRandomTick(blockState, serverLevel, blockPos, random);
        super.randomTick(blockState, serverLevel, blockPos, random);
    }

    @Override
    public boolean isRandomlyTicking(BlockState $$0) {
        return super.isRandomlyTicking($$0) ||  WeatheringCopper.getNext($$0.getBlock()).isPresent();
    }

    @Override
    public WeatherState getAge() {
        return weatherState;
    }
}
