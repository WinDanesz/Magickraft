package com.rpxdytx.magickraft;

import com.rpxdytx.magickraft.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Magickraft.MODID, name = Magickraft.NAME, version = Magickraft.VERSION)
public class Magickraft
{
    public static final String MODID = "magickraft";
    public static final String NAME = "Magickraft";
    public static final String VERSION = "1.0";

    @Mod.Instance(MODID)
    public static Magickraft instance;

    @SidedProxy(clientSide = "com.rpxdytx.magickraft.proxy.ClientProxy",
            serverSide = "com.rpxdytx.magickraft.proxy.ServerProxy")
    public static CommonProxy proxy;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

    @EventHandler
    public void serverInit(FMLServerStartingEvent event)
    {
        proxy.serverInit(event);
    }
}
