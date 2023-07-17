package net.mindoth.bigfish;

import net.mindoth.bigfish.registry.BigFishItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
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
        BigFishItems.register(modEventBus);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if ( event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS ) {
            event.accept(BigFishItems.RAW_DARK_CRAB);
            event.accept(BigFishItems.COOKED_DARK_CRAB);
            event.accept(BigFishItems.RAW_MANTARAY);
            event.accept(BigFishItems.COOKED_MANTARAY);
            event.accept(BigFishItems.RAW_SHARK);
            event.accept(BigFishItems.COOKED_SHARK);
            event.accept(BigFishItems.RAW_ANGLERFISH);
            event.accept(BigFishItems.COOKED_ANGLERFISH);
            event.accept(BigFishItems.RAW_MONKFISH);
            event.accept(BigFishItems.COOKED_MONKFISH);
            event.accept(BigFishItems.RAW_SWORDFISH);
            event.accept(BigFishItems.COOKED_SWORDFISH);
            event.accept(BigFishItems.RAW_LOBSTER);
            event.accept(BigFishItems.COOKED_LOBSTER);
            event.accept(BigFishItems.RAW_SLIMY_EEL);
            event.accept(BigFishItems.COOKED_SLIMY_EEL);
            event.accept(BigFishItems.RAW_SHRIMPS);
            event.accept(BigFishItems.COOKED_SHRIMPS);
        }
    }
}
