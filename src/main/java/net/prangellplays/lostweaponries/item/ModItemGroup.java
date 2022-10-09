package net.prangellplays.lostweaponries.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.prangellplays.lostweaponries.LostWeaponries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup LostWeaponries = FabricItemGroupBuilder.build(new Identifier(net.prangellplays.lostweaponries.LostWeaponries.MOD_ID,  "lostweaponries"), () -> new ItemStack(ModItems.CORRUPT_BOOK));


}
