package net.mindoth.bigfish.registries;

import net.minecraft.world.food.FoodProperties;

public class ModFood {
    public static final FoodProperties RAWFISH = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties SHRIMPS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F).fast().build();
    public static final FoodProperties LOBSTER = new FoodProperties.Builder().nutrition(7).saturationModifier(0.7F).build();
    public static final FoodProperties SLIMY_EEL = new FoodProperties.Builder().nutrition(0).saturationModifier(0.0F).build();
    public static final FoodProperties SWORDFISH = new FoodProperties.Builder().nutrition(7).saturationModifier(0.8F).build();
    public static final FoodProperties MONKFISH = new FoodProperties.Builder().nutrition(8).saturationModifier(0.9F).build();
    public static final FoodProperties ANGLERFISH = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).alwaysEdible().build();
    public static final FoodProperties SHARK = new FoodProperties.Builder().nutrition(9).saturationModifier(0.9F).build();
    public static final FoodProperties MANTARAY = new FoodProperties.Builder().nutrition(10).saturationModifier(1.0F).build();
    public static final FoodProperties DARK_CRAB = new FoodProperties.Builder().nutrition(10).saturationModifier(1.0F).build();
}
