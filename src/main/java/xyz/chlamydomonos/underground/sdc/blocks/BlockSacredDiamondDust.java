package xyz.chlamydomonos.underground.sdc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import xyz.chlamydomonos.underground.sdc.core.SacredDiamondCookie;
import xyz.chlamydomonos.underground.sdc.core.loaders.ItemLoader;

import java.util.Random;

public class BlockSacredDiamondDust extends Block
{
    public BlockSacredDiamondDust()
    {
        super(Material.sand);
        setBlockName("sacred_diamond_dust");
        setBlockTextureName(SacredDiamondCookie.MODID + ":sacred_diamond_dust");
        setHardness(0.5f);
        setResistance(0.5f);
        setTickRandomly(true);
        setHarvestLevel("shovel", 0);
        setStepSound(Block.soundTypeSand);
        setCreativeTab(SacredDiamondCookie.tabSDC);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return ItemLoader.MATERIAL;
    }

    @Override
    public int damageDropped(int metadata)
    {
        return 4;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random)
    {
        return 4 + (random.nextInt() % fortune);
    }
}
