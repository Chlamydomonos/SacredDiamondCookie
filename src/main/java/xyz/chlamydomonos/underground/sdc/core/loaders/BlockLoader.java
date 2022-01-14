package xyz.chlamydomonos.underground.sdc.core.loaders;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import xyz.chlamydomonos.underground.sdc.blocks.*;
import xyz.chlamydomonos.underground.sdc.core.SacredDiamondCookie;

public class BlockLoader
{
    public static final Block STRANGE_CARBON_BLOCK = new BlockStrangeCarbon();
    public static final Block STRANGE_DIAMOND_BLOCK = new BlockStrangeDiamond();
    public static final Block SACRED_DIAMOND_DUST = new BlockSacredDiamondDust();

    public BlockLoader()
    {
        register(STRANGE_CARBON_BLOCK, "strange_carbon_block");
        register(STRANGE_DIAMOND_BLOCK, "strange_diamond_block");
        register(SACRED_DIAMOND_DUST, "sacred_diamond_dust");
    }

    public static void register(Block block, String name)
    {
        GameRegistry.registerBlock(block, SacredDiamondCookie.MODID + ":" + name);
    }
}
