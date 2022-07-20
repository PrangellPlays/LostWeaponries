package net.prangellplays.lostweaponries.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.prangellplays.lostweaponries.entity.ModEntities;
import net.prangellplays.lostweaponries.entity.custom.DuckEntity;

public class ModRegistries {
    public static void registerModStuffs() {
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.DUCK, DuckEntity.setAttributes());
    }
}
