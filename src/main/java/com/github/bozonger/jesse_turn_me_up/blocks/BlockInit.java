package com.github.bozonger.jesse_turn_me_up.blocks;

import com.github.bozonger.jesse_turn_me_up.Jesse_turn_me_up;
import com.github.bozonger.jesse_turn_me_up.blocks.custom.HashPlantBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Jesse_turn_me_up.MOD_ID);

    public static final RegistryObject<Block> HASH_PLANT = BLOCKS.register("hash_plant", () -> new HashPlantBlock(Block.Properties.copy(Blocks.CARROTS)));
}
