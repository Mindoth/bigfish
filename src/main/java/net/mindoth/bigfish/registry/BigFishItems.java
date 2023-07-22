package net.mindoth.bigfish.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BigFishItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "bigfish");

    public static final RegistryObject<Item> RAW_DARK_CRAB = ITEMS.register("raw_dark_crab",
            () -> new Item(new Item.Properties().food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_MANTARAY = ITEMS.register("raw_mantaray",
            () -> new Item(new Item.Properties().food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_SHARK = ITEMS.register("raw_shark",
            () -> new Item(new Item.Properties().food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_ANGLERFISH = ITEMS.register("raw_anglerfish",
            () -> new Item(new Item.Properties().food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_MONKFISH = ITEMS.register("raw_monkfish",
            () -> new Item(new Item.Properties().food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_SWORDFISH = ITEMS.register("raw_swordfish",
            () -> new Item(new Item.Properties().food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_LOBSTER = ITEMS.register("raw_lobster",
            () -> new Item(new Item.Properties().food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_SLIMY_EEL = ITEMS.register("raw_slimy_eel",
            () -> new Item(new Item.Properties().food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_SHRIMPS = ITEMS.register("raw_shrimps",
            () -> new Item(new Item.Properties().food(BigFishFoods.RAWFISH)));



    public static final RegistryObject<Item> COOKED_DARK_CRAB = ITEMS.register("cooked_dark_crab",
            () -> new Item(new Item.Properties().food(BigFishFoods.DARK_CRAB)));

    public static final RegistryObject<Item> COOKED_MANTARAY = ITEMS.register("cooked_mantaray",
            () -> new Item(new Item.Properties().food(BigFishFoods.MANTARAY)));

    public static final RegistryObject<Item> COOKED_SHARK = ITEMS.register("cooked_shark",
            () -> new Item(new Item.Properties().food(BigFishFoods.SHARK)));

    public static final RegistryObject<Item> COOKED_ANGLERFISH = ITEMS.register("cooked_anglerfish",
            () -> new Item(new Item.Properties().food(BigFishFoods.ANGLERFISH)));

    public static final RegistryObject<Item> COOKED_MONKFISH = ITEMS.register("cooked_monkfish",
            () -> new Item(new Item.Properties().food(BigFishFoods.MONKFISH)));

    public static final RegistryObject<Item> COOKED_SWORDFISH = ITEMS.register("cooked_swordfish",
            () -> new Item(new Item.Properties().food(BigFishFoods.SWORDFISH)));

    public static final RegistryObject<Item> COOKED_LOBSTER = ITEMS.register("cooked_lobster",
            () -> new Item(new Item.Properties().food(BigFishFoods.LOBSTER)));

    public static final RegistryObject<Item> COOKED_SLIMY_EEL = ITEMS.register("cooked_slimy_eel",
            () -> new Item(new Item.Properties().food(BigFishFoods.SLIMY_EEL)));

    public static final RegistryObject<Item> COOKED_SHRIMPS = ITEMS.register("cooked_shrimps",
            () -> new Item(new Item.Properties().food(BigFishFoods.SHRIMPS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
