package com.metalturtle.srwooly.init;

import com.metalturtle.srwooly.SenorWooly;
import com.metalturtle.srwooly.blocks.MagicWool;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class SrwoolyBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SenorWooly.MOD_ID);

    // Misc Blocks
    public static final RegistryObject<Block> MAGIC_WOOL = BLOCKS.register("magic_wool", MagicWool::new);
}
