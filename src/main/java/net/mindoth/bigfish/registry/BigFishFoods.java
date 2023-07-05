package net.mindoth.bigfish.registry;

import net.minecraft.item.Food;

public class BigFishFoods {
    public static final Food RAWFISH = (new Food.Builder()).nutrition(2).saturationMod(0.1F).build();
    public static final Food FOUR = (new Food.Builder()).nutrition(4).saturationMod(0.4F).build();
    public static final Food SEVEN = (new Food.Builder()).nutrition(7).saturationMod(0.7F).build();
    public static final Food EIGHT = (new Food.Builder()).nutrition(8).saturationMod(0.8F).build();
    public static final Food NINE = (new Food.Builder()).nutrition(9).saturationMod(0.9F).build();
    public static final Food TEN = (new Food.Builder()).nutrition(10).saturationMod(1.0F).build();
}
