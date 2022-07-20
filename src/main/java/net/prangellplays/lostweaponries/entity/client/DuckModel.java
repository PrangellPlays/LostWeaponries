package net.prangellplays.lostweaponries.entity.client;

import net.minecraft.util.Identifier;
import net.prangellplays.lostweaponries.LostWeaponries;
import net.prangellplays.lostweaponries.entity.custom.DuckEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class DuckModel extends AnimatedGeoModel<DuckEntity> {
    @Override
    public Identifier getModelResource(DuckEntity object) {
        return new Identifier(LostWeaponries.MOD_ID, "geo/model.geo.json");
    }

    @Override
    public Identifier getTextureResource(DuckEntity object) {
        return new Identifier(LostWeaponries.MOD_ID, "textures/entity/duck/duck.png");
    }

    @Override
    public Identifier getAnimationResource(DuckEntity animatable) {
        return new Identifier(LostWeaponries.MOD_ID, "animations/model.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(DuckEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null){
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F ));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F ));
        }
    }

}
