package net.prangellplays.lostweaponries;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.prangellplays.lostweaponries.entity.ModEntities;
import net.prangellplays.lostweaponries.entity.client.DuckRenderer;

public class LostWeaponriesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.DUCK, DuckRenderer::new);
    }
}
