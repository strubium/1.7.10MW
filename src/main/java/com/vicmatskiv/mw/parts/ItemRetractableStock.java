package com.vicmatskiv.mw.parts;

import net.minecraft.item.Item;

import com.vicmatskiv.mw.ModernWarfareMod;

public class ItemRetractableStock extends Item
{
	public ItemRetractableStock()
	{
		setMaxStackSize(64);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "RetractableStock"); 
		//setTextureName(ModernWarfareMod.MODID + ":" + "RetractableStock");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	
}