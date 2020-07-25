package com.metalturtle.srwooly.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.IForgeShearable;

public class MagicWool extends Block implements IForgeShearable {

    public MagicWool() {
        super(AbstractBlock.Properties.create(Material.WOOL)
                .hardnessAndResistance(0.8f)
                .sound(SoundType.CLOTH)
                .harvestLevel(0)
                .setLightLevel(value -> 15));
    }
}
