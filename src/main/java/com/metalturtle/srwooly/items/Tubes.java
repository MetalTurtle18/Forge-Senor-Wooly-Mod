package com.metalturtle.srwooly.items;

import com.metalturtle.srwooly.SenorWooly;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Tubes extends Item {

    public Tubes() {
        super(new Item.Properties()
                .group(SenorWooly.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.ABSORPTION, 80, 34), 1)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
