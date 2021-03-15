package com.rpxdytx.magickraft.items;

import com.rpxdytx.magickraft.creativetabs.MKTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMageWand extends Item {
	public ItemMageWand() {
		setCreativeTab(MKTabs.MAGE_TAB);
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return true;
	}
}
