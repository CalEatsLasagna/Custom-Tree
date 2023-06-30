package com.Cabig.overwhelmingexpansion.init;

import com.Cabig.overwhelmingexpansion.OverwhelmingExpansion;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {
	public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, OverwhelmingExpansion.MOD_ID);
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, OverwhelmingExpansion.MOD_ID);
	
	public static final FluidRegistryContainer LUMINCULA_FLUID = new FluidRegistryContainer("lumincula_fluid",
			FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true), 
			() -> FluidRegistryContainer.createExtension(new FluidRegistryContainer.ClientExtensions(OverwhelmingExpansion.MOD_ID, "lumincula_fluid").tint(0xBD88EC).fogColor(0.8f, 0.1f, 0.3f)),
			BlockBehaviour.Properties.copy(Blocks.WATER),
			new Item.Properties().tab(OverwhelmingExpansion.OE_TAB).stacksTo(1));
}
