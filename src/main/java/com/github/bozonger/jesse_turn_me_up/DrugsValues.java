package com.github.bozonger.jesse_turn_me_up;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class DrugsValues {
    public static final FoodProperties JOINT = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(0.4f).effect(new MobEffectInstance(MobEffects.CONFUSION, 100, 0, false, false), 1.0f).build();

}
