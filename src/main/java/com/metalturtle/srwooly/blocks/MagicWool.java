package com.metalturtle.srwooly.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MagicWool extends Block {

    public MagicWool() {
        super(Block.Properties.create(Material.WOOL)
                .hardnessAndResistance(0.8f)
                .sound(SoundType.CLOTH)
                .harvestLevel(0)
                .setLightLevel(value -> 15));
    }
}
