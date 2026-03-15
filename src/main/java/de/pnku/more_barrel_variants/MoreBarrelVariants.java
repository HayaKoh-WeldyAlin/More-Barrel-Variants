package de.pnku.more_barrel_variants;

import de.pnku.more_barrel_variants.init.MblvBlockInit;
import de.pnku.more_barrel_variants.init.MblvItemInit;
import de.pnku.more_barrel_variants.poi.MblvPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class MoreBarrelVariants implements ModInitializer {
    public static final String MODID = "lolmblv";

    @Override
    public void onInitialize() {
        MblvBlockInit.registerBlocks();
        MblvItemInit.registerItems();
        MblvPointOfInterestTypes.init();
    }

    public static ResourceLocation asId(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}