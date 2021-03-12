package com.rpxdytx.magickraft.handlers;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class Registerer
{
    public static void registerItem(Item item, RegistryEvent.Register<Item> event)
    {
        IForgeRegistry<Item> registry = event.getRegistry();

        //Item info:
        ResourceLocation itemRegName;
        String itemUnName;
        CreativeTabs itemTab;

        itemRegName = item.getRegistryName();
        itemUnName = item.getUnlocalizedName();
        itemTab = item.getCreativeTab();

        item.setCreativeTab(itemTab);
        item.setRegistryName(itemRegName);
        item.setUnlocalizedName(itemUnName);

        registry.register(item);
    }

    public static void registerItems(RegistryEvent.Register<Item> event, Item... items)
    {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.registerAll(items);
    }

    public static void registerBlock(Block block, RegistryEvent.Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();

        //Block info:
        ResourceLocation blockRegName;
        String blockUnName;

        blockRegName = block.getRegistryName();
        blockUnName = block.getUnlocalizedName();

        block.setRegistryName(blockRegName);
        block.setUnlocalizedName(blockUnName);

        registry.register(block);
    }

    public static void registerBlocks(RegistryEvent.Register<Block> event, Block... blocks)
    {
        IForgeRegistry<Block> registry = event.getRegistry();

        registry.registerAll(blocks);
    }
}
