package net.prangellplays.lostweaponries.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prangellplays.lostweaponries.LostWeaponries;
import net.prangellplays.lostweaponries.entity.custom.DuckEntity;

public class ModEntities {
    public static final EntityType<DuckEntity> DUCK = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(LostWeaponries.MOD_ID, "duck"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DuckEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build());

}
