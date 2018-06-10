package com.jakemcginnz.firstmod.init;

import java.util.ArrayList;
import java.util.List;

import com.jakemcginnz.firstmod.items.ItemBase;
import com.jakemcginnz.firstmod.items.tools.ToolPickaxe;
import com.jakemcginnz.firstmod.items.tools.ToolSpade;
import com.jakemcginnz.firstmod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item RUBY = new ItemBase("ruby");
	
	//Materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 1000, 8.0F, 3.0F, 10);
	
	//Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICAXE = new ToolPickaxe("ruby_picaxe", MATERIAL_RUBY);

}
