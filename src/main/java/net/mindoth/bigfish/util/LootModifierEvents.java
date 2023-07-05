package net.mindoth.bigfish.util;

import net.mindoth.bigfish.BigFish;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = BigFish.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class LootModifierEvents {
    @SubscribeEvent
    public static void registerLootModifiers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> ev) {
        ev.getRegistry().registerAll(
                new DarkCrabAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BigFish.MOD_ID, "dark_crab_from_fishing")),
                new MantarayAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BigFish.MOD_ID, "mantaray_from_fishing")),
                new SharkAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BigFish.MOD_ID, "shark_from_fishing")),
                new AnglerfishAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BigFish.MOD_ID, "anglerfish_from_fishing")),
                new MonkfishAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BigFish.MOD_ID, "monkfish_from_fishing")),
                new SwordfishAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BigFish.MOD_ID, "swordfish_from_fishing")),
                new LobsterAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BigFish.MOD_ID, "lobster_from_fishing")),
                new SlimyEelAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(BigFish.MOD_ID, "slimy_eel_from_fishing")),
                new ShrimpsAdditionsModifier.Serializer().setRegistryName
                        (new ResourceLocation(BigFish.MOD_ID, "shrimps_from_fishing"))
        );
    }
}