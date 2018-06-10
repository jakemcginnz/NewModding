package com.jakemcginnz.firstmod;

import com.jakemcginnz.firstmod.init.ModItems;
import com.jakemcginnz.firstmod.init.ModRecipes;
import com.jakemcginnz.firstmod.proxy.CommonProxy;
import com.jakemcginnz.firstmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {

	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}

	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event) {

	}
	
	public static CreativeTabs tabFirstMod = new CreativeTabs("tab_firstmod") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.RUBY);
		}
	};

}
