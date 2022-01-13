package xyz.chlamydomonos.underground.sdc.core.loaders;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import xyz.chlamydomonos.underground.sdc.blocks.BlockStrangeCarbon;
import xyz.chlamydomonos.underground.sdc.core.SacredDiamondCookie;

public class BlockLoader
{
    public static final Block STRANGE_CARBON_BLOCK = new BlockStrangeCarbon();

    public BlockLoader()
    {
        register(STRANGE_CARBON_BLOCK, "strange_carbon_block");
    }

    public static void register(Block block, String name)
    {
        GameRegistry.registerBlock(block, SacredDiamondCookie.MODID + ":" + name);
    }
}
