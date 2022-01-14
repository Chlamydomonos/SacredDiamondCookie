package xyz.chlamydomonos.underground.sdc.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import xyz.chlamydomonos.underground.sdc.core.loaders.ItemLoader;

@Mod(modid = SacredDiamondCookie.MODID,
     name = SacredDiamondCookie.NAME,
     version = SacredDiamondCookie.VERSION,
     acceptedMinecraftVersions = SacredDiamondCookie.ACCEPTED_MINECRAFT_VERSIONS,
     dependencies = SacredDiamondCookie.DEPENDENCIES)
public class SacredDiamondCookie
{
    public static final String MODID = "sdc";
    public static final String NAME = "Sacred Diamond Cookie";
    public static final String VERSION = "1.0.0";
    public static final String ACCEPTED_MINECRAFT_VERSIONS = "1.7.10";
    public static final String DEPENDENCIES =
            "required-after:IC2@[2.2.828-experimental,);" +
            "required-after:Thaumcraft@[4.2.3.5,);" +
            "required-after:underground@[1.0.0,)";

    public static CreativeTabs tabSDC = new CreativeTabs("sdc")
    {
        @Override
        public Item getTabIconItem()
        {
            return ItemLoader.SACRED_DIAMOND_COOKIE;
        }
    };

    @Mod.Instance(SacredDiamondCookie.MODID)
    public static SacredDiamondCookie INSTANCE;

    @SidedProxy(serverSide = "xyz.chlamydomonos.underground.sdc.core.CommonProxy",
                clientSide = "xyz.chlamydomonos.underground.sdc.core.ClientProxy")
    public static CommonProxy PROXY;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        PROXY.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        PROXY.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        PROXY.postInit(event);
    }
}
