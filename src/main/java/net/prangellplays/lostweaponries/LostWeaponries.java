package net.prangellplays.lostweaponries;

import net.fabricmc.api.ModInitializer;
import net.prangellplays.lostweaponries.effect.ModEffects;
import net.prangellplays.lostweaponries.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class LostWeaponries implements ModInitializer {
	public static final String MOD_ID = "lostweaponries";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		GeckoLib.initialize();
		ModEffects.registerEffects();
		
	}
}
