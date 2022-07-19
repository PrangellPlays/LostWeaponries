package net.prangellplays.lostweaponries.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prangellplays.lostweaponries.LostWeaponries;

public class ModItems {
    public static final Item DUCK_BLADE = registerItem("duck_blade",
            new SwordItem(ModToolMaterials.Duck, 1, 2f, new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));

    public static final Item DUCK_INGOT = registerItem("duck_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.LostWeaponries.setNoScrollbar())));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LostWeaponries.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LostWeaponries.LOGGER.info("Registering Mod Items for" + LostWeaponries.MOD_ID);
    }
}
