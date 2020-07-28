package com.metalturtle.srwooly;

import com.metalturtle.srwooly.init.SenorWoolyBlocks;
import com.metalturtle.srwooly.init.SenorWoolyItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@SuppressWarnings({"SpellCheckingInspection", "EmptyMethod", "unused"})
@Mod("srwooly")
public class SenorWooly {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "srwooly";

    public SenorWooly() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register Blocks and Items
        SenorWoolyBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        SenorWoolyItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
    }

    // Making custom creative tab
    public static final ItemGroup TAB = new ItemGroup("srwoolyTab") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(SenorWoolyItems.TUBES.get());
        }
    };
}
