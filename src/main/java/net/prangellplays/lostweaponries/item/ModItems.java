package net.prangellplays.lostweaponries.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prangellplays.lostweaponries.LostWeaponries;
import net.prangellplays.lostweaponries.entity.ModEntities;
import net.prangellplays.lostweaponries.item.custom.AssasinDagger;
import net.prangellplays.lostweaponries.item.custom.FrostfireBlade;
import net.prangellplays.lostweaponries.item.custom.PotatoBlade;

public class ModItems {
    public static final Item DUCK_BLADE = registerItem("duck_blade",
            new SwordItem(ModToolMaterials.EVERYTHING, 1, 2f, new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item POTATO_BLADE = registerItem("potato_blade",
            new PotatoBlade(ModToolMaterials.EVERYTHING, 1, 2f, new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item ASSASIN_DAGGER = registerItem("assasin_dagger",
            new AssasinDagger(ModToolMaterials.EVERYTHING, -6, 5f, new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item FROSTFIRE_BLADE = registerItem("frostfire_blade",
            new FrostfireBlade(ModToolMaterials.EVERYTHING, -2, -3f, new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item DUCK_INGOT = registerItem("duck_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item POTATO_INGOT = registerItem("potato_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item ALL_THE_INGOT = registerItem("all_the_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item CORRUPT_BOOK = registerItem("corrupt_book",
            new Item(new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item POTATO_KNISHES = registerItem("potato_knishes",
        new Item(new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar()).food(ModFoodComponents.POTATO_KNISHES)));

    public static final Item DUCK_SPAWN_EGG = registerItem("duck_spawn_egg",
            new SpawnEggItem(ModEntities.DUCK, 0xE6BC0C, 0xE6960C,
                    new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LostWeaponries.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LostWeaponries.LOGGER.info("Registering Mod Items for" + LostWeaponries.MOD_ID);
    }
}
