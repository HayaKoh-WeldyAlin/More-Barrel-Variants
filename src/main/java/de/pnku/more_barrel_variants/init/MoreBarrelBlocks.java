package de.pnku.more_barrel_variants.init;

import de.pnku.more_barrel_variants.MoreBarrelVariants;
import de.pnku.more_barrel_variants.block.MoreBarrelBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.MapColor;


import java.util.ArrayList;
import java.util.List;

import static  de.pnku.more_barrel_variants.MoreBarrelVariants.*;

public class MoreBarrelBlocks {
    public static final Block OAK_BARREL = new MoreBarrelBlock(MapColor.WOOD, "oak");
    public static final Block BIRCH_BARREL = new MoreBarrelBlock(MapColor.SAND, "birch");
    public static final Block JUNGLE_BARREL = new MoreBarrelBlock(MapColor.DIRT, "jungle");
    public static final Block ACACIA_BARREL = new MoreBarrelBlock(MapColor.COLOR_ORANGE, "acacia");
    public static final Block DARK_OAK_BARREL = new MoreBarrelBlock(MapColor.COLOR_BROWN, "dark_oak");
    public static final Block MANGROVE_BARREL = new MoreBarrelBlock(MapColor.COLOR_RED, "mangrove");
    public static final Block CHERRY_BARREL = new MoreBarrelBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry");
    public static final Block BAMBOO_BARREL = new MoreBarrelBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo");
    public static final Block CRIMSON_BARREL = new MoreBarrelBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson");
    public static final Block WARPED_BARREL = new MoreBarrelBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped");

    public static final List<Block> more_barrels = new ArrayList<>();


    public static void registerBlocks() {
        registerBlock(OAK_BARREL);
        registerBlock(BIRCH_BARREL);
        registerBlock(JUNGLE_BARREL);
        registerBlock(ACACIA_BARREL);
        registerBlock(DARK_OAK_BARREL);
        registerBlock(MANGROVE_BARREL);
        registerBlock(CHERRY_BARREL);
        registerBlock(BAMBOO_BARREL);
        registerBlock(CRIMSON_BARREL);
        registerBlock(WARPED_BARREL);
    }

    private static void registerBlock(Block barrel) {
        String barrelName = ((MoreBarrelBlock) barrel).barrelWoodType + "_barrel";
        Registry.register(BuiltInRegistries.BLOCK, withModId(barrelName), barrel);
        // mod_id change from lolmblv to more_barrel_variants - alias for backwards compatibility
            BuiltInRegistries.BLOCK.addAlias(withModId(barrelName, true), withModId(barrelName));
        more_barrels.add(barrel);
        BlockEntityType.BARREL.addSupportedBlock(barrel);
    }
}