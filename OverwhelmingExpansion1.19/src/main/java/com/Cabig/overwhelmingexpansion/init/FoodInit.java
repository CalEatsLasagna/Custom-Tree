package com.Cabig.overwhelmingexpansion.init;

import net.minecraft.world.food.FoodProperties;

public class FoodInit {
    public static final FoodProperties CABBAGE = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.2F).build();
    
    public static final FoodProperties CABBAGE_LOAF = (new FoodProperties.Builder()).nutrition(8).saturationMod(2F).build();
}
