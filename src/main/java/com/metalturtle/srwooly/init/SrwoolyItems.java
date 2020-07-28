package com.metalturtle.srwooly.init;

import com.metalturtle.srwooly.SenorWooly;
import com.metalturtle.srwooly.items.HeartBackpack;
import com.metalturtle.srwooly.items.Tubes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class SrwoolyItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SenorWooly.MOD_ID);

    // Misc Items
    public static final RegistryObject<Item> MAGIC_YARN = ITEMS.register("magic_yarn",
            () -> new Item(new Item.Properties().group(SenorWooly.TAB)));
    public static final RegistryObject<Item> SENOR_WOOLIUM = ITEMS.register("senor_woolium",
            () -> new Item(new Item.Properties().group(SenorWooly.TAB)));

    // Food
    public static final RegistryObject<Item> TUBES = ITEMS.register("tubes", Tubes::new);
    public static final RegistryObject<Item> HEART_BACKPACK = ITEMS.register("heart_backpack", HeartBackpack::new);

    // Block Items
    public static final RegistryObject<Item> MAGIC_WOOL_ITEM = ITEMS.register("magic_wool",
            () -> new BlockItem(SrwoolyBlocks.MAGIC_WOOL.get(), new Item.Properties().group(SenorWooly.TAB)));
}
