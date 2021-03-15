package com.rpxdytx.magickraft.creativetabs;

import com.rpxdytx.magickraft.registry.MKItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MageTab extends CreativeTabs
{
    public MageTab(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(MKItems.MAGE_WAND);
    }
}
