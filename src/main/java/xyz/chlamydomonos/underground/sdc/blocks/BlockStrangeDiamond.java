package xyz.chlamydomonos.underground.sdc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xyz.chlamydomonos.underground.sdc.core.SacredDiamondCookie;

public class BlockStrangeDiamond extends Block
{
    public BlockStrangeDiamond()
    {
        super(Material.iron);
        setBlockName("strange_diamond_block");
        setBlockTextureName(SacredDiamondCookie.MODID + ":strange_diamond_block");
        setHardness(5.0f);
        setResistance(10.0f);
        setHarvestLevel("pickaxe", 1);
        setStepSound(Block.soundTypeStone);
        setCreativeTab(SacredDiamondCookie.tabSDC);
    }
}
