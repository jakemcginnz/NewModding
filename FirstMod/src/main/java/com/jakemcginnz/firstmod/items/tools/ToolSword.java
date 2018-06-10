package com.jakemcginnz.firstmod.items.tools;

import com.jakemcginnz.firstmod.Main;
import com.jakemcginnz.firstmod.init.ModItems;
import com.jakemcginnz.firstmod.util.IHasModel;

import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {
	
	public ToolSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabFirstMod);
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
