package net.mindoth.bigfish.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ModCommonConfig {

    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.ConfigValue<Integer> ANGLERFISH_BOOST_POWER = BUILDER.comment("Anglerfish health boost amplifier (Default = 0)")
            .define("Anglerfish boost power", 0);

    public static final ModConfigSpec.ConfigValue<Integer> ANGLERFISH_BOOST_TIME = BUILDER.comment("Amount of time for health boost given by anglerfish in ticks (Default = 1800)")
            .define("Anglerfish boost time", 1800);

    public static final ModConfigSpec.ConfigValue<Integer> EEL_HUNGER_MIN = BUILDER.comment("Minimum hunger restored by cooked slimy eel (Default = 1)")
            .define("Min eel hunger", 1);

    public static final ModConfigSpec.ConfigValue<Double> EEL_SATURARION_MIN = BUILDER.comment("Minimum saturation restored by cooked slimy eel (Default = 0.1)")
            .define("Min eel saturation", 0.1);

    public static final ModConfigSpec.ConfigValue<Integer> EEL_HUNGER_MAX = BUILDER.comment("Maximum hunger restored by cooked slimy eel (Default = 10)")
            .define("Max eel hunger", 10);

    public static final ModConfigSpec.ConfigValue<Double> EEL_SATURARION_MAX = BUILDER.comment("Maximum saturation restored by cooked slimy eel (Default = 1.0)")
            .define("Max eel saturation", 1.0);

    public static final ModConfigSpec SPEC = BUILDER.build();
}
