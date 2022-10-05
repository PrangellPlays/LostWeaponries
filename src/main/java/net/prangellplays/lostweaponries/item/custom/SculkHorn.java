package net.prangellplays.lostweaponries.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.command.PlaySoundCommand;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SculkHorn extends Item {
    public SculkHorn(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        world.addParticle(ParticleTypes.SONIC_BOOM, playerEntity.getX(), playerEntity.getY() + 2.0, playerEntity.getZ(), 5.0, 0.0, 5.0);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
