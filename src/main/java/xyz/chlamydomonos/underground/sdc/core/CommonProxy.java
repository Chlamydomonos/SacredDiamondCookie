package xyz.chlamydomonos.underground.sdc.core;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import xyz.chlamydomonos.underground.sdc.core.loaders.BlockLoader;
import xyz.chlamydomonos.underground.sdc.core.loaders.ItemLoader;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        new BlockLoader();
        new ItemLoader();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
