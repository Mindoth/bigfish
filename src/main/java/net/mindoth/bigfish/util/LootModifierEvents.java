package net.mindoth.bigfish.util;

import com.mojang.serialization.Codec;
import net.mindoth.bigfish.BigFish;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LootModifierEvents {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, BigFish.MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ANGLERFISH_FROM_FISHING =
            LOOT_MODIFIER_SERIALIZERS.register("anglerfish_from_fishing", AnglerfishAdditionModifier.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> DARK_CRAB_FROM_FISHING =
            LOOT_MODIFIER_SERIALIZERS.register("dark_crab_from_fishing", DarkCrabAdditionModifier.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> LOBSTER_FROM_FISHING =
            LOOT_MODIFIER_SERIALIZERS.register("lobster_from_fishing", LobsterAdditionModifier.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> MANTARAY_FROM_FISHING =
            LOOT_MODIFIER_SERIALIZERS.register("mantaray_from_fishing", MantarayAdditionModifier.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> MONKFISH_FROM_FISHING =
            LOOT_MODIFIER_SERIALIZERS.register("monkfish_from_fishing", MonkfishAdditionModifier.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> SHARK_FROM_FISHING =
            LOOT_MODIFIER_SERIALIZERS.register("shark_from_fishing", SharkAdditionModifier.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> SHRIMPS_FROM_FISHING =
            LOOT_MODIFIER_SERIALIZERS.register("shrimps_from_fishing", ShrimpsAdditionsModifier.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> SLIMY_EEL_FROM_FISHING =
            LOOT_MODIFIER_SERIALIZERS.register("slimy_from_fishing", SlimyEelAdditionModifier.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> SWORDFISH_FROM_FISHING =
            LOOT_MODIFIER_SERIALIZERS.register("swordfish_from_fishing", SwordfishAdditionModifier.CODEC);

    public static void register(IEventBus bus) {
        LOOT_MODIFIER_SERIALIZERS.register(bus);
    }
}