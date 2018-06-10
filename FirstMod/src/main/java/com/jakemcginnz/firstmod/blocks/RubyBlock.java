package com.jakemcginnz.firstmod.blocks;

import com.jakemcginnz.firstmod.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase {

	public RubyBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL); // Block sound
		setHardness(5.0F); // How long it takes to mine
		setResistance(15.0F); // Explosive Resistance
		setHarvestLevel("pickaxe", 2); // tool required, 2 = iron pic
		setLightLevel(1.0F); // 15 = bright
		// setLightOpacity(1); //makes it like glass - see through
		// setBlockUnbreakable();
		setCreativeTab(Main.tabFirstMod);
	}
	
	

}
