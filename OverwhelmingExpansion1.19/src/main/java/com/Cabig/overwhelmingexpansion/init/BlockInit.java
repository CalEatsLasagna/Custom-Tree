package com.Cabig.overwhelmingexpansion.init;

import com.Cabig.overwhelmingexpansion.OverwhelmingExpansion;
import com.Cabig.overwhelmingexpansion.blocks.custom.CabbagePlantBlock;
import com.Cabig.overwhelmingexpansion.blocks.custom.ModFlammableRotatedPillarBlock;
import com.google.common.base.Function;
import com.google.common.base.Supplier;

import com.Cabig.overwhelmingexpansion.world.feature.tree.DrainwoodTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OverwhelmingExpansion.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;
	
	//Occluded Gravel
	public static final RegistryObject<Block> OCCLUDED_GRAVEL = register("occluded_gravel",
			() -> new FallingBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.COLOR_PURPLE).strength(1.5f).sound(SoundType.GRAVEL)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
	
	//Occluded Stone
	public static final RegistryObject<Block> OCCLUDED_STONE = register("occluded_stone",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(2.25f).sound(SoundType.STONE).requiresCorrectToolForDrops()), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
	
	//Occluded Brick
	public static final RegistryObject<Block> OCCLUDED_BRICK = register("occluded_brick",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(2.25f).sound(SoundType.STONE).requiresCorrectToolForDrops()), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
	
	public static final RegistryObject<Block> OCCLUDED_BRICK_SLAB = register("occluded_brick_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(2.25f).sound(SoundType.STONE).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
	
	public static final RegistryObject<Block> OCCLUDED_BRICK_STAIRS = register("occluded_brick_stairs",
			() -> new StairBlock(() -> BlockInit.OCCLUDED_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(2.25f).sound(SoundType.STONE).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
	
	public static final RegistryObject<Block> OCCLUDED_BRICK_FENCE = register("occluded_brick_fence",
			() -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(2.25f).sound(SoundType.STONE).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));	
	
	public static final RegistryObject<Block> OCCLUDED_BRICK_FENCE_GATE = register("occluded_brick_fence_gate",
			() -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(2.25f).sound(SoundType.STONE).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));	
		
	public static final RegistryObject<Block> OCCLUDED_BRICK_WALL = register("occluded_brick_wall",
			() -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(2.25f).sound(SoundType.STONE).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));	
	
	
	//Cabbage
	public static final RegistryObject<Block> CABBAGE_PLANT = registerBlockWithoutBlockItem("cabbage_plant",
			() -> new CabbagePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
	
	
	//Drainwood
    public static final RegistryObject<Block> DRAINWOOD_LOG = register("drainwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .requiresCorrectToolForDrops()), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
	
   /* public static final RegistryObject<Block> DRAINWOOD_LOG = register("drainwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN).strength(2.04f).sound(SoundType.WOOD)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));*/
	
    public static final RegistryObject<Block> STRIPPED_DRAINWOOD_LOG = register("stripped_drainwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .requiresCorrectToolForDrops()), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
	
	public static final RegistryObject<Block> DRAINWOOD_PLANKS = register("drainwood_planks",
			() -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN).strength(2.04f).sound(SoundType.WOOD))
			{
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            }, object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
	
	public static final RegistryObject<Block> DRAINWOOD_SLAB = register("drainwood_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN).strength(2.25f).sound(SoundType.WOOD).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
	
	public static final RegistryObject<Block> DRAINWOOD_STAIRS = register("drainwood_stairs",
			() -> new StairBlock(() -> BlockInit.DRAINWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN).strength(2.25f).sound(SoundType.WOOD).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
	
	public static final RegistryObject<Block> DRAINWOOD_FENCE = register("drainwood_fence",
			() -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN).strength(2.25f).sound(SoundType.WOOD).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));	
	
	public static final RegistryObject<Block> DRAINWOOD_FENCE_GATE = register("drainwood_fence_gate",
			() -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN).strength(2.25f).sound(SoundType.WOOD).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
	
    public static final RegistryObject<Block> DRAINWOOD_SAPLING = register("drainwood_sapling",
            () -> new SaplingBlock(new DrainwoodTreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
    
    public static final RegistryObject<Block> DRAINWOOD_LEAVES = register("drainwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                    .requiresCorrectToolForDrops()){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            }, object -> () -> new BlockItem(object.get(), new Item.Properties().tab(OverwhelmingExpansion.OE_TAB)));
    
	
	private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block)
	{
		return BLOCKS.register(name, block);
	}
	
	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block)
	{
		return BLOCKS.register(name, block);
	}
	
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item)
	{
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}
}