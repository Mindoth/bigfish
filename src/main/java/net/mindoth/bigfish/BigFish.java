package net.mindoth.bigfish;

import net.mindoth.bigfish.config.BigFishCommonConfig;
import net.mindoth.bigfish.registry.BigFishItems;
import net.mindoth.bigfish.util.ModLootModifiers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;
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
        ModLootModifiers.register(modEventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BigFishCommonConfig.SPEC, "bigfish-common.toml");
    }

    private void addRegistries(final IEventBus modEventBus) {
        BigFishItems.ITEMS.register(modEventBus);
        modEventBus.addListener(this::addCreative);
    }


    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(BigFishItems.DARK_CRAB);
            event.accept(BigFishItems.COOKED_DARK_CRAB);
            event.accept(BigFishItems.MANTARAY);
            event.accept(BigFishItems.COOKED_MANTARAY);
            event.accept(BigFishItems.SHARK);
            event.accept(BigFishItems.COOKED_SHARK);
            event.accept(BigFishItems.ANGLERFISH);
            event.accept(BigFishItems.COOKED_ANGLERFISH);
            event.accept(BigFishItems.MONKFISH);
            event.accept(BigFishItems.COOKED_MONKFISH);
            event.accept(BigFishItems.SWORDFISH);
            event.accept(BigFishItems.COOKED_SWORDFISH);
            event.accept(BigFishItems.LOBSTER);
            event.accept(BigFishItems.COOKED_LOBSTER);
            event.accept(BigFishItems.SLIMY_EEL);
            event.accept(BigFishItems.COOKED_SLIMY_EEL);
        }
    }
}
