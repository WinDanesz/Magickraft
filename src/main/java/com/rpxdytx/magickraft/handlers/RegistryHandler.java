package com.rpxdytx.magickraft.handlers;

import com.rpxdytx.magickraft.Magickraft;
import com.rpxdytx.magickraft.items.MKItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@GameRegistry.ObjectHolder(Magickraft.MODID)
@Mod.EventBusSubscriber(modid = Magickraft.MODID)
public class RegistryHandler
{
    @SubscribeEvent
    public void itemRegistry(RegistryEvent.Register<Item> event)
    {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.registerAll(MKItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public void modelRegistry(ModelRegistryEvent event)
    {
        for(Item item : MKItems.ITEMS)
        {
            ModelLoader.setCustomModelResourceLocation(item,0,
                    new ModelResourceLocation(item.getRegistryName(),"inventory"));
        }
    }
}
