package xyz.chlamydomonos.underground.sdc.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xyz.chlamydomonos.underground.api.UndergroundAPI;
import xyz.chlamydomonos.underground.sdc.core.SacredDiamondCookie;

public class ItemSacredDiamondCookie extends ItemFood
{
    public ItemSacredDiamondCookie()
    {
        super(2, 0.1f, false);

        this.setUnlocalizedName("sacred_diamond_cookie");
        this.setCreativeTab(SacredDiamondCookie.tabSDC);
        setTextureName(SacredDiamondCookie.MODID + ":sacred_diamond_cookie");
        setAlwaysEdible();
    }

    @Override
    protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer player)
    {
        if(player instanceof EntityPlayerMP)
            UndergroundAPI.getInstance().setExtraTimeOnGround(
                    (EntityPlayerMP) player,
                    UndergroundAPI.getInstance().extraTimeOnGround((EntityPlayerMP) player) + 6000);
    }
}
