package com.metalturtle.srwooly.items;

import com.metalturtle.srwooly.SenorWooly;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@SuppressWarnings("SpellCheckingInspection")
public class HeartBackpack extends Item{

    @Override
    @ParametersAreNonnullByDefault
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(1, new StringTextComponent(TextFormatting.RED + "El corazón está en mi mochilla---"));
    }
    public HeartBackpack() {
        super(new Item.Properties()
                .group(SenorWooly.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2f)
                        .effect(() -> new EffectInstance(Effects.ABSORPTION, 80, 34), 1)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
