package net.prangellplays.lostweaponries.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prangellplays.lostweaponries.LostWeaponries;

public class ModEffects {
    public static StatusEffect FROSTBURN;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(LostWeaponries.MOD_ID, name),
                new FrostBurnEffect(StatusEffectCategory.HARMFUL, 3124687));
    }

    public static void registerEffects() {
        FROSTBURN = registerStatusEffect("frostburn");
    }

}
