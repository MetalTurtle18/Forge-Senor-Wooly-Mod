package com.metalturtle.srwooly.util;

import com.metalturtle.srwooly.SenorWooly;
import com.metalturtle.srwooly.blocks.BlockItemBase;
import com.metalturtle.srwooly.blocks.MagicWool;
import com.metalturtle.srwooly.items.ItemBase;
import com.metalturtle.srwooly.items.SuperHealerFood;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SenorWooly.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SenorWooly.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> MAGIC_YARN = ITEMS.register("magic_yarn", ItemBase::new);
    public static final RegistryObject<Item> SENOR_WOOLIUM = ITEMS.register("senor_woolium", ItemBase::new);
    public static final RegistryObject<Item> TUBES = ITEMS.register("tubes", SuperHealerFood::new);
    public static final RegistryObject<Item> HEART_BACKPACK = ITEMS.register("heart_backpack", SuperHealerFood::new);

    // Blocks
    public static final RegistryObject<Block> MAGIC_WOOL = BLOCKS.register("magic_wool", MagicWool::new);

    //Block Items
    public static final RegistryObject<Item> MAGIC_WOOL_ITEM = ITEMS.register("magic_wool", () -> new BlockItemBase(MAGIC_WOOL.get()));

}
