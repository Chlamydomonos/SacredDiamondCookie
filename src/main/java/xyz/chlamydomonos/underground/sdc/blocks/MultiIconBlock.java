package xyz.chlamydomonos.underground.sdc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import xyz.chlamydomonos.underground.sdc.core.SacredDiamondCookie;

import java.util.List;

public class MultiIconBlock extends Block
{
    private final String[] types;
    private IIcon[] icons;
    private final boolean subBlocks;
    public MultiIconBlock(String[] types, String textureName, Material material, boolean subBlocks)
    {
        super(material);
        this.types = types;
        this.setBlockTextureName(SacredDiamondCookie.MODID + ":" + textureName);
        this.subBlocks = subBlocks;
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.icons = new IIcon[types.length];

        for (int i = 0; i < types.length; ++i)
        {
            this.icons[i] = iconRegister.registerIcon(this.getTextureName() + "_" + types[i]);
        }
    }

    @Override
    public IIcon getIcon(int side, int meta)
    {
        return icons[meta];
    }

    @SuppressWarnings("unchecked")
    @Override
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        if(!subBlocks)
            super.getSubBlocks(p_149666_1_, p_149666_2_, p_149666_3_);
        else
        {
            for(int i = 0; i < types.length; i++)
            {
                p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
            }
        }
    }
}
