package net.mindoth.bigfish.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class BigFishFoods {
    public static final FoodProperties RAWFISH = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build();
    public static final FoodProperties SHRIMPS = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).fast().build();
    public static final FoodProperties LOBSTER = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.7F).build();
    public static final FoodProperties SLIMY_EEL = (new FoodProperties.Builder()).nutrition(0).saturationMod(0.0F).build();
    public static final FoodProperties SWORDFISH = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.8F).build();
    public static final FoodProperties MONKFISH = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.9F).build();
    public static final FoodProperties ANGLERFISH = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1800, 0), 1.0F).alwaysEat().build();
    public static final FoodProperties SHARK = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.9F).build();
    public static final FoodProperties MANTARAY = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.0F).build();
    public static final FoodProperties DARK_CRAB = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.0F).build();
}
