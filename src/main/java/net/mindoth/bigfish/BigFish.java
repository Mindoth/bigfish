package net.mindoth.bigfish;

import net.mindoth.bigfish.config.ModCommonConfig;
import net.mindoth.bigfish.registries.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(BigFish.MOD_ID)
public class BigFish {
    public static final String MOD_ID = "bigfish";

    public BigFish(IEventBus modBus, ModContainer modContainer) {
        addRegistries(modBus);
        modContainer.registerConfig(ModConfig.Type.COMMON, ModCommonConfig.SPEC);
    }

    private void addRegistries(final IEventBus modBus) {
        ModItems.ITEMS.register(modBus);
    }
}
