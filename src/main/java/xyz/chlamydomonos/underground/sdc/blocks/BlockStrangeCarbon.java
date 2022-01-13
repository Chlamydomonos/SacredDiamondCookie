package xyz.chlamydomonos.underground.sdc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import xyz.chlamydomonos.underground.sdc.core.SacredDiamondCookie;
import xyz.chlamydomonos.underground.sdc.core.loaders.ItemLoader;

import java.util.Random;

public class BlockStrangeCarbon extends MultiIconBlock
{
    public BlockStrangeCarbon()
    {
        super(
                new String[]{
                        "0",
                        "1",
                        "2",
                        "3",
                        "4",
                        "5"
                },
                "strange_carbon_block",
                Material.sand,
                false
             );

        setBlockName("strange_carbon_block");
        setHardness(0.5f);
        setResistance(0.5f);
        setTickRandomly(true);
        setHarvestLevel("pickaxe", 0);
        setStepSound(Block.soundTypeSand);
        setCreativeTab(SacredDiamondCookie.tabSDC);
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        if(random.nextInt() % 128 == 0)
        {
            int metadata = world.getBlockMetadata(x, y, z);
            if(metadata < 5 && world.getSavedLightValue(EnumSkyBlock.Sky, x, y + 1, z) > 0)
                world.setBlockMetadataWithNotify(x, y, z, metadata + 1, 3);
        }
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        if(metadata == 5)
            return ItemLoader.MATERIAL;
        else
            return null;
    }

    @Override
    public int damageDropped(int metadata)
    {
        return metadata == 5 ? 2 : 0;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random)
    {
        if(meta != 5)
            return 0;
        return 3 + (random.nextInt() % 3 + 1) * fortune;
    }
}
