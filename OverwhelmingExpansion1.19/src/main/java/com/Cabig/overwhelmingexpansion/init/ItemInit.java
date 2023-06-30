package com.Cabig.overwhelmingexpansion.init;

import com.Cabig.overwhelmingexpansion.OverwhelmingExpansion;
import com.google.common.base.Supplier;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OverwhelmingExpansion.MOD_ID);
	
	public static final RegistryObject<Item> CABBAGE_LOAF = register("cabbage_loaf",
			() -> new Item(new Item.Properties().tab(OverwhelmingExpansion.OE_TAB).food(FoodInit.CABBAGE_LOAF)));
	
    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage",
            () -> new Item(new Item.Properties().tab(OverwhelmingExpansion.OE_TAB).food(FoodInit.CABBAGE)));
	
	public static final RegistryObject<Item> CABBAGE_SEEDS = register("cabbage_seeds",
			() -> new ItemNameBlockItem(BlockInit.CABBAGE_PLANT.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item)
	{
		return ITEMS.register(name, item);
	}
}
