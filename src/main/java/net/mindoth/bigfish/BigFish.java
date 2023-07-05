package net.mindoth.bigfish;

import net.mindoth.bigfish.config.BigFishCommonConfig;
import net.mindoth.bigfish.registry.BigFishItems;
import net.mindoth.bigfish.util.LootModifierEvents;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BigFish.MOD_ID)
public class BigFish {
    public static final String MOD_ID = "bigfish";

    public BigFish() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        addRegistries(modEventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BigFishCommonConfig.SPEC, "bigfish-common.toml");
    }

    private void addRegistries(final IEventBus modEventBus) {
        BigFishItems.ITEMS.register(modEventBus);
        LootModifierEvents.LOOT_MODIFIER_SERIALIZERS.register(modEventBus);
    }
}
