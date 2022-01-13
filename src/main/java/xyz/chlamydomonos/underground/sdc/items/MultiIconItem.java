package xyz.chlamydomonos.underground.sdc.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import xyz.chlamydomonos.underground.sdc.core.SacredDiamondCookie;

import java.util.List;

public class MultiIconItem extends Item
{
    private final String[] types;
    private IIcon[] icons;
    public MultiIconItem(String[] types, String textureName)
    {
        this.types = types;
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setTextureName(SacredDiamondCookie.MODID + ":" + textureName);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void getSubItems(Item item, CreativeTabs creativeTabs, List subItems)
    {
        for(int i = 0; i < types.length; i++)
            subItems.add(new ItemStack(item, 1, i));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int damage)
    {
        int j = MathHelper.clamp_int(damage, 0, types.length - 1);
        return this.icons[j];
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        int i = MathHelper.clamp_int(itemStack.getItemDamage(), 0, types.length - 1);
        return super.getUnlocalizedName(itemStack) + "." + types[i];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        this.icons = new IIcon[types.length];

        for (int i = 0; i < types.length; ++i)
        {
            this.icons[i] = iconRegister.registerIcon(this.getIconString() + "_" + types[i]);
        }
    }
}
