package net.mindoth.bigfish.registry;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BigFishFoods {
    public static final Food RAWFISH = (new Food.Builder()).nutrition(2).saturationMod(0.1F).build();
    public static final Food SHRIMPS = (new Food.Builder()).nutrition(2).saturationMod(0.2F).fast().build();
    public static final Food LOBSTER = (new Food.Builder()).nutrition(7).saturationMod(0.7F).build();
    public static final Food SLIMY_EEL = (new Food.Builder()).nutrition(0).saturationMod(0.0F).build();
    public static final Food SWORDFISH = (new Food.Builder()).nutrition(7).saturationMod(0.8F).build();
    public static final Food MONKFISH = (new Food.Builder()).nutrition(8).saturationMod(0.9F).build();
    public static final Food ANGLERFISH = (new Food.Builder()).nutrition(8).saturationMod(0.8F).effect(new EffectInstance(Effects.HEALTH_BOOST, 1800, 0), 1.0F).alwaysEat().build();
    public static final Food SHARK = (new Food.Builder()).nutrition(9).saturationMod(0.9F).build();
    public static final Food MANTARAY = (new Food.Builder()).nutrition(10).saturationMod(1.0F).build();
    public static final Food DARK_CRAB = (new Food.Builder()).nutrition(10).saturationMod(1.0F).build();
}
