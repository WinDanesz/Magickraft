package com.rpxdytx.magickraft.items;

import com.rpxdytx.magickraft.Magickraft;
import com.rpxdytx.magickraft.creativetabs.MKTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MageWand extends Item
{
    public MageWand()
    {
        setUnlocalizedName("mage_wand");
        setRegistryName(Magickraft.MODID,"mage_wand");
        setCreativeTab(CreativeTabs.TOOLS);
        isEnchantable(new ItemStack(MKItems.MAGE_WAND));

        MKItems.ITEMS.add(this);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}
