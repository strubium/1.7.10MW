package com.vicmatskiv.mw.blocks;

import java.util.Random;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockRubyOre extends Block {

    public BlockRubyOre()
    {
        super(Material.ROCK);
        //setRegistryName(ModernWarfareMod.MODID + "_" + "RubyOre");
        setUnlocalizedName(ModernWarfareMod.MODID + "_" + "RubyOre");
        setHardness(6F);
        setResistance(600000F);
        setSoundType(SoundType.STONE);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(ModernWarfareMod.gunsTab);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return CommonProxy.Ruby;
    }

}