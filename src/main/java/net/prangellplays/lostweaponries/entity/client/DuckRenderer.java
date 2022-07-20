package net.prangellplays.lostweaponries.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.prangellplays.lostweaponries.LostWeaponries;
import net.prangellplays.lostweaponries.entity.custom.DuckEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DuckRenderer extends GeoEntityRenderer<DuckEntity> {
    public DuckRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new DuckModel());
    }

    @Override
    public Identifier getTexture(DuckEntity entity) {
        return new Identifier(LostWeaponries.MOD_ID, "textures/entity/duck/duck.png");
    }
}
