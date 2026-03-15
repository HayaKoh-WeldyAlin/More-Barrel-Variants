package de.pnku.more_barrel_variants.init;

import de.pnku.more_barrel_variants.MoreBarrelVariants;
import de.pnku.more_barrel_variants.block.MoreBarrelBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import static de.pnku.more_barrel_variants.MoreBarrelVariants.withModId;

public class MoreBarrelItems {
    public static final Item OAK_BARREL = new BlockItem(MoreBarrelBlocks.OAK_BARREL, new Item.Properties());
    public static final Item BIRCH_BARREL = new BlockItem(MoreBarrelBlocks.BIRCH_BARREL, new Item.Properties());
    public static final Item JUNGLE_BARREL = new BlockItem(MoreBarrelBlocks.JUNGLE_BARREL, new Item.Properties());
    public static final Item ACACIA_BARREL = new BlockItem(MoreBarrelBlocks.ACACIA_BARREL, new Item.Properties());
    public static final Item DARK_OAK_BARREL = new BlockItem(MoreBarrelBlocks.DARK_OAK_BARREL, new Item.Properties());
    public static final Item MANGROVE_BARREL = new BlockItem(MoreBarrelBlocks.MANGROVE_BARREL, new Item.Properties());
    public static final Item CHERRY_BARREL = new BlockItem(MoreBarrelBlocks.CHERRY_BARREL, new Item.Properties());
    public static final Item BAMBOO_BARREL = new BlockItem(MoreBarrelBlocks.BAMBOO_BARREL, new Item.Properties());
    public static final Item CRIMSON_BARREL = new BlockItem(MoreBarrelBlocks.CRIMSON_BARREL, new Item.Properties().fireResistant());
    public static final Item WARPED_BARREL = new BlockItem(MoreBarrelBlocks.WARPED_BARREL, new Item.Properties().fireResistant());

    private static Item previouslyRegisteredItem = Items.BARREL;

    public static void registerItems() {
        registerItem(OAK_BARREL);
        registerItem(BIRCH_BARREL);
        registerItem(JUNGLE_BARREL);
        registerItem(ACACIA_BARREL);
        registerItem(DARK_OAK_BARREL);
        registerItem(MANGROVE_BARREL);
        registerItem(CHERRY_BARREL);
        registerItem(BAMBOO_BARREL);
        registerItem(CRIMSON_BARREL);
        registerItem(WARPED_BARREL);
    }

    private static void registerItem(Item barrel) {
        String barrelName = ((MoreBarrelBlock) ((BlockItem) barrel).getBlock()).barrelWoodType + "_barrel";
        Registry.register(BuiltInRegistries.ITEM, withModId(barrelName), barrel);
        // mod_id change from lolmblv to more_barrel_variants - alias for backwards compatibility
            BuiltInRegistries.ITEM.addAlias(withModId(barrelName, true), withModId(barrelName));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(previouslyRegisteredItem, barrel));
        previouslyRegisteredItem = barrel;
    }
}