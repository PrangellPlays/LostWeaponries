package net.prangellplays.lostweaponries.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class PotatoBlade extends SwordItem{
    public PotatoBlade(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.giveItemStack(new ItemStack(Items.POTATO));
        user.getItemCooldownManager().set(this, 2400);

        return  TypedActionResult.success(itemStack, world.isClient());
    }
}
