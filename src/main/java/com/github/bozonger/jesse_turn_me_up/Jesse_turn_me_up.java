package com.github.bozonger.jesse_turn_me_up;

import com.github.bozonger.jesse_turn_me_up.items.ItemInit;
import com.github.bozonger.jesse_turn_me_up.blocks.BlockInit;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.function.Supplier;

import static net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer;

@Mod(Jesse_turn_me_up.MOD_ID)
public class Jesse_turn_me_up {

    public static final String MOD_ID = "jesse_turn_me_up";

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab(Jesse_turn_me_up.MOD_ID){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.HASH.get());
        }
    };

    public Jesse_turn_me_up() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener((this::commonSetup));

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event){


    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
        }
    }
}
