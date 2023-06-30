package com.Cabig.overwhelmingexpansion;

import com.Cabig.overwhelmingexpansion.init.BlockInit;
import com.Cabig.overwhelmingexpansion.init.FluidInit;
import com.Cabig.overwhelmingexpansion.init.ItemInit;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("overwhelmingexpansion")
public class OverwhelmingExpansion
{
	public static final String MOD_ID = "overwhelmingexpansion";
	
	public static final ResourceKey<Level> OE_OCCLUSION = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(OverwhelmingExpansion.MOD_ID, "oe_occlusion"));
	public static final ResourceKey<DimensionType> OE_OCCLUSION_TYPE = ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation(OverwhelmingExpansion.MOD_ID, "oe_occlusion"));
			
	public static final CreativeModeTab OE_TAB = new CreativeModeTab(MOD_ID)
	{

		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.CABBAGE_LOAF.get());
		}
		
	};
	
	private void clientSetup(final FMLClientSetupEvent event)
	{
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CABBAGE_PLANT.get(), RenderType.cutout());
		
	}

	public OverwhelmingExpansion()
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		FluidInit.FLUID_TYPES.register(bus);
		FluidInit.FLUIDS.register(bus);
		
        bus.addListener(this::clientSetup);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}
