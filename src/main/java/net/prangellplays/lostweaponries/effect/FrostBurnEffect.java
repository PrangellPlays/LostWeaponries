package net.prangellplays.lostweaponries.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FrostBurnEffect extends StatusEffect {
    public FrostBurnEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.world.isClient()) {
            double x = pLivingEntity.getX();
            double y = pLivingEntity.getY();
            double z = pLivingEntity.getZ();
            pLivingEntity.damage(DamageSource.DRAGON_BREATH, 0.2f);
            pLivingEntity.teleport(x, y, z);
            pLivingEntity.setVelocity(0, 0, 0);
        }

        super.applyUpdateEffect(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}
