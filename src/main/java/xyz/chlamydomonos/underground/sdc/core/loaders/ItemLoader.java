package xyz.chlamydomonos.underground.sdc.core.loaders;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import xyz.chlamydomonos.underground.sdc.core.SacredDiamondCookie;
import xyz.chlamydomonos.underground.sdc.items.*;

public class ItemLoader
{
    public static final Item MATERIAL = new ItemMaterial();
    public static final Item SACRED_DIAMOND_COOKIE = new ItemSacredDiamondCookie();

    public ItemLoader()
    {
        register(MATERIAL, "material");
        register(SACRED_DIAMOND_COOKIE, "sacred_diamond_cookie");
    }

    private static void register(Item item, String name)
    {
        GameRegistry.registerItem(item, name, SacredDiamondCookie.MODID);
    }
}
