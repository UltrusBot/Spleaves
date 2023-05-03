package me.ultrusmods.spleaves.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class SpleavesBlock extends Block {
    public static final BooleanProperty BREAKING = BooleanProperty.create("breaking");
    private final int strength;
    public SpleavesBlock(Properties properties, int strength) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(BREAKING, false));
        this.strength = strength;
    }

    @Override
    public void stepOn(Level $$0, BlockPos $$1, BlockState $$2, Entity $$3) {
        if (!$$0.isClientSide() && !$$2.getValue(BREAKING)) {
            $$0.playSound(
                    null,
                    $$1,
                    $$2.getSoundType().getBreakSound(),
                    SoundSource.BLOCKS,
                    $$2.getSoundType().getVolume(),
                    $$2.getSoundType().getPitch() * 1.5f
            );
        }
        $$0.setBlockAndUpdate($$1, $$2.setValue(BREAKING, true));
        if ($$0 instanceof ServerLevel level) {
            level.scheduleTick($$1, this, 2);
        }


    }


    @Override
    public boolean isRandomlyTicking(BlockState $$0) {
        return $$0.getValue(BREAKING);
    }

    @Override
    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource random) {
        this.tick(blockState, serverLevel, blockPos, random);
    }

    @Override
    public void tick(BlockState $$0, ServerLevel $$1, BlockPos $$2, RandomSource $$3) {
        if ($$0.getValue(BREAKING)) {
            if ($$3.nextInt(1000) > strength) {
                $$1.destroyBlock($$2, false); // TODO: Make this configurable
            } else {
                $$1.scheduleTick($$2, this, 1);
            }
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> $$0) {
        $$0.add(BREAKING);
    }

    @Override
    public boolean propagatesSkylightDown(BlockState $$0, BlockGetter $$1, BlockPos $$2) {
        return true;
    }
}
