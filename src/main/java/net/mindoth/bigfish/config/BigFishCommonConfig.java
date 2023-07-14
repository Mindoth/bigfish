package net.mindoth.bigfish.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class BigFishCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Double> ANGLERFISH_CHANCE;
    public static final ForgeConfigSpec.ConfigValue<Double> DARKCRAB_CHANCE;
    public static final ForgeConfigSpec.ConfigValue<Double> LOBSTER_CHANCE;
    public static final ForgeConfigSpec.ConfigValue<Double> MANTARAY_CHANCE;
    public static final ForgeConfigSpec.ConfigValue<Double> MONKFISH_CHANCE;
    public static final ForgeConfigSpec.ConfigValue<Double> SHARK_CHANCE;
    public static final ForgeConfigSpec.ConfigValue<Double> SHRIMPS_CHANCE;
    public static final ForgeConfigSpec.ConfigValue<Double> SLIMYEEL_CHANCE;
    public static final ForgeConfigSpec.ConfigValue<Double> SWORDFISH_CHANCE;

    static {
        BUILDER.push("Configs for Big Fish");

        ANGLERFISH_CHANCE = BUILDER.comment("The chance of fishing up an Anglerfish Default = 0.2 = 20%")
                .defineInRange("Anglerfish chance", 0.2, 0.0, 1.0);

        DARKCRAB_CHANCE = BUILDER.comment("The chance of fishing up a Dark crab Default = 0.1 = 10%")
                .defineInRange("Dark crab chance", 0.1, 0.0, 1.0);

        LOBSTER_CHANCE = BUILDER.comment("The chance of fishing up a Lobster Default = 0.4 = 40%")
                .defineInRange("Lobster chance", 0.4, 0.0, 1.0);

        MANTARAY_CHANCE = BUILDER.comment("The chance of fishing up a Mantaray Default = 0.1 = 10%")
                .defineInRange("Mantaray chance", 0.1, 0.0, 1.0);

        MONKFISH_CHANCE = BUILDER.comment("The chance of fishing up a Monkfish Default = 0.3 = 30%")
                .defineInRange("Monkfish chance", 0.3, 0.0, 1.0);

        SHARK_CHANCE = BUILDER.comment("The chance of fishing up an Shark Default = 0.2 = 20%")
                .defineInRange("Shark chance", 0.2, 0.0, 1.0);

        SHRIMPS_CHANCE = BUILDER.comment("The chance of fishing up Shrimps Default = 0.5 = 50%")
                .defineInRange("Shrimps chance", 0.5, 0.0, 1.0);

        SLIMYEEL_CHANCE = BUILDER.comment("The chance of fishing up an Slimy Eel Default = 0.4 = 40%")
                .defineInRange("Slimy Eel chance", 0.4, 0.0, 1.0);

        SWORDFISH_CHANCE = BUILDER.comment("The chance of fishing up an Swordfish Default = 0.3 = 30%")
                .defineInRange("Swordfish chance", 0.3, 0.0, 1.0);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
