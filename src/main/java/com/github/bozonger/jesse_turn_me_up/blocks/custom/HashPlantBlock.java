package com.github.bozonger.jesse_turn_me_up.blocks.custom;

import com.github.bozonger.jesse_turn_me_up.blocks.BlockInit;
import com.github.bozonger.jesse_turn_me_up.items.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class HashPlantBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;
    public HashPlantBlock(Properties properties){
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    public BlockState getPlant(BlockGetter level, BlockPos pos)
    {
        return BlockInit.HASH_PLANT.get().defaultBlockState();
    }

    @Override
    protected ItemLike getBaseSeedId(){
        return ItemInit.HASH_SEED.get();
    }
}
