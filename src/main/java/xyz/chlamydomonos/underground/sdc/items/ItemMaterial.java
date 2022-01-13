package xyz.chlamydomonos.underground.sdc.items;

import xyz.chlamydomonos.underground.sdc.core.SacredDiamondCookie;

public class ItemMaterial extends MultiIconItem
{
    public ItemMaterial()
    {
        super(new String[]{
                "magic_diamond_powder",
                "strange_carbon_powder",
                "strange_diamond",
                "strange_diamond_powder",
                "sacred_diamond_powder",
                "sacred_diamond",
                "crushed_sacred_diamond"
        }, "material");

        this.setUnlocalizedName("material");
        this.setCreativeTab(SacredDiamondCookie.tabSDC);
    }
}
