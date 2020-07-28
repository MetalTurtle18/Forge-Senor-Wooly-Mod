package com.metalturtle.srwooly.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

@SuppressWarnings({"SpellCheckingInspection", "NullableProblems"})
public class SenorWooliumOre extends OreBlock {

    public SenorWooliumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0f, 3.0f)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .harvestLevel(3));
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        if(!(silktouch > 0)) {
            return 1 + fortune;
        }
        return 0;
    }
}
