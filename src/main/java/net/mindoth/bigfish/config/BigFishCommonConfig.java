package net.mindoth.bigfish.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class BigFishCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Double> SPECIAL_FISH_CHANCE;

    static {
        BUILDER.push("Configs for Big Fish");

        SPECIAL_FISH_CHANCE = BUILDER.comment("The chance of fishing up a fish from this mod instead of another fish. Default = 0.1 = 10%")
                .defineInRange("Chance", 0.1, 0.0, 1.0);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
