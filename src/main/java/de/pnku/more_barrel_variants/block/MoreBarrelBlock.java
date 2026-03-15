package de.pnku.more_barrel_variants.block;

import net.minecraft.world.level.block.BarrelBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreBarrelBlock extends BarrelBlock {
    public final String barrelWoodType;

    public MoreBarrelBlock(MapColor colour, String barrelWoodType) {
        super(Properties.ofFullCopy(Blocks.BARREL).mapColor(colour));
        this.barrelWoodType = barrelWoodType;
    }

    public MoreBarrelBlock(MapColor colour, SoundType soundType, String barrelWoodType) {
        super(Properties.ofFullCopy(Blocks.BARREL).mapColor(colour).sound(soundType));
        this.barrelWoodType = barrelWoodType;
    }

}