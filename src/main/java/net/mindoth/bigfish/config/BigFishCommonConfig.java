package net.mindoth.bigfish.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class BigFishCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Integer> ANGLERFISH_BOOST_POWER;
    public static final ForgeConfigSpec.ConfigValue<Integer> ANGLERFISH_BOOST_TIME;
    public static final ForgeConfigSpec.ConfigValue<Integer> EEL_HUNGER_MIN;
    public static final ForgeConfigSpec.ConfigValue<Double> EEL_SATURARION_MIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> EEL_HUNGER_MAX;
    public static final ForgeConfigSpec.ConfigValue<Double> EEL_SATURARION_MAX;

    static {
        BUILDER.push("Configs for Big Fish");

        ANGLERFISH_BOOST_POWER = BUILDER.comment("Anglerfish health boost amplifier (Default = 0)")
                .define("Anglerfish boost power", 0);

        ANGLERFISH_BOOST_TIME = BUILDER.comment("Amount of time for health boost given by anglerfish in ticks (Default = 1800)")
                .define("Anglerfish boost time", 1800);

        EEL_HUNGER_MIN = BUILDER.comment("Minimum hunger restored by cooked slimy eel (Default = 1)")
                .define("Min eel hunger", 1);

        EEL_SATURARION_MIN = BUILDER.comment("Minimum saturation restored by cooked slimy eel (Default = 0.1)")
                .define("Min eel saturation", 0.1);

        EEL_HUNGER_MAX = BUILDER.comment("Maximum hunger restored by cooked slimy eel (Default = 10)")
                .define("Max eel hunger", 10);

        EEL_SATURARION_MAX = BUILDER.comment("Maximum saturation restored by cooked slimy eel (Default = 1.0)")
                .define("Max eel saturation", 1.0);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
