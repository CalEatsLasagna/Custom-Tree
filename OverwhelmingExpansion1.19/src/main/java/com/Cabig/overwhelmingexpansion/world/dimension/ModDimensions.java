package com.Cabig.overwhelmingexpansion.world.dimension;

import com.Cabig.overwhelmingexpansion.OverwhelmingExpansion;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {
    public static final ResourceKey<Level> OEDIM_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(OverwhelmingExpansion.MOD_ID, "oedim"));
    public static final ResourceKey<DimensionType> KJDIM_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, OEDIM_KEY.registry());

    public static void register() {
        System.out.println("Registering ModDimensions for " + OverwhelmingExpansion.MOD_ID);
    }
}
