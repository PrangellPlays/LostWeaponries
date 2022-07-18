package net.prangellplays.lostweaponries.mixin;

import net.prangellplays.lostweaponries.mixin.ExampleMixin;
import net.minecraft.client.gui.screen.TitleScreen;
import net.prangellplays.lostweaponries.LostWeaponries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		LostWeaponries.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
