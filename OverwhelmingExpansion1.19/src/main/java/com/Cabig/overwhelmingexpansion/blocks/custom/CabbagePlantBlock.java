package com.Cabig.overwhelmingexpansion.blocks.custom;

import com.Cabig.overwhelmingexpansion.init.BlockInit;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class CabbagePlantBlock extends CropBlock
{
	public static final IntegerProperty AGE = BlockStateProperties.AGE_5;
	
	public CabbagePlantBlock(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getMaxAge()
	{
		return 5;
	}
	
	@Override
	protected ItemLike getBaseSeedId()
	{
		return BlockInit.CABBAGE_PLANT.get();
	}
}