package net.mindoth.bigfish;

import net.mindoth.bigfish.registry.BigFishItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BigFish.MOD_ID)
public class BigFish {
    public static final String MOD_ID = "bigfish";

    public BigFish() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        addRegistries(modEventBus);
    }

    private void addRegistries(final IEventBus modEventBus) {
        BigFishItems.ITEMS.register(modEventBus);
    }
}
