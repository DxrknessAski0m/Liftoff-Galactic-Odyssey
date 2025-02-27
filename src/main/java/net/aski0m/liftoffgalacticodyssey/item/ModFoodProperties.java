package net.aski0m.liftoffgalacticodyssey.item;

import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties SCREAMER_FLESH = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.4F)
            .effect(new MobEffectInstance(MobEffects.POISON, 200, 3), 0.75f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 0.65f)
            .build();
}