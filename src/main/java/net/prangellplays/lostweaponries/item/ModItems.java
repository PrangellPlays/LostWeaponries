package net.prangellplays.lostweaponries.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prangellplays.lostweaponries.LostWeaponries;
import net.prangellplays.lostweaponries.entity.ModEntities;
import net.prangellplays.lostweaponries.item.custom.AssasinDagger;
import net.prangellplays.lostweaponries.item.custom.FrostfireBlade;
import net.prangellplays.lostweaponries.item.custom.PotatoBlade;

public class ModItems {
    public static final Item PLASMYTHIC_MULTITOOL = registerItem("plasmythic_multitool",
            new PotatoBlade(ModToolMaterials.Plasmythic, -7, 2f, new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item POTATO_BLADE = registerItem("potato_blade",
            new PotatoBlade(ModToolMaterials.Potato, 1, 2f, new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item ASSASIN_DAGGER = registerItem("assasin_dagger",
            new AssasinDagger(ModToolMaterials.Assasinite, -6, 5f, new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item FROSTFIRE_BLADE = registerItem("frostfire_blade",
            new FrostfireBlade(ModToolMaterials.Frostfire, -2, -3f, new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item PLASMYTHIC_CRYSTAL = registerItem("plasmythic_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item POTATO_INGOT = registerItem("potato_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item ASSASINITE_INGOT = registerItem("assasinite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item FROSTFIRE_INGOT = registerItem("frostfire_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item CORRUPT_BOOK = registerItem("corrupt_book",
            new Item(new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item POTATO_KNISHES = registerItem("potato_knishes",
        new Item(new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar()).food(ModFoodComponents.POTATO_KNISHES)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LostWeaponries.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LostWeaponries.LOGGER.info("Registering Mod Items for" + LostWeaponries.MOD_ID);
    }
}
