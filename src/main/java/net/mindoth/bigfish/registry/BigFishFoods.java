package net.mindoth.bigfish.registry;

import net.minecraft.world.food.FoodProperties;

public class BigFishFoods {
    public static final FoodProperties RAWFISH = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build();
    public static final FoodProperties FOUR = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties SEVEN = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.7F).build();
    public static final FoodProperties EIGHT = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).build();
    public static final FoodProperties NINE = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.9F).build();
    public static final FoodProperties TEN = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.0F).build();
}
