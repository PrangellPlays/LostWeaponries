package net.prangellplays.lostweaponries.item.custom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.prangellplays.lostweaponries.effect.ModEffects;

public class FrostfireBlade extends SwordItem {
    public FrostfireBlade(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(ModEffects.FROSTBURN, 100, 0));
        return super.postHit(stack, target, attacker);
    }

}
