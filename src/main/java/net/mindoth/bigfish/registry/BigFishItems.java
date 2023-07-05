package net.mindoth.bigfish.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BigFishItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "bigfish");

    public static final RegistryObject<Item> RAW_DARK_CRAB = ITEMS.register("raw_dark_crab",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_MANTARAY = ITEMS.register("raw_mantaray",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_SHARK = ITEMS.register("raw_shark",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_ANGLERFISH = ITEMS.register("raw_anglerfish",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_MONKFISH = ITEMS.register("raw_monkfish",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_SWORDFISH = ITEMS.register("raw_swordfish",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_LOBSTER = ITEMS.register("raw_lobster",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_SLIMY_EEL = ITEMS.register("raw_slimy_eel",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> RAW_SHRIMPS = ITEMS.register("raw_shrimps",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> COOKED_DARK_CRAB = ITEMS.register("cooked_dark_crab",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.TEN)));

    public static final RegistryObject<Item> COOKED_MANTARAY = ITEMS.register("cooked_mantaray",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.TEN)));

    public static final RegistryObject<Item> COOKED_SHARK = ITEMS.register("cooked_shark",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.NINE)));

    public static final RegistryObject<Item> COOKED_ANGLERFISH = ITEMS.register("cooked_anglerfish",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.NINE)));

    public static final RegistryObject<Item> COOKED_MONKFISH = ITEMS.register("cooked_monkfish",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.EIGHT)));

    public static final RegistryObject<Item> COOKED_LOBSTER = ITEMS.register("cooked_lobster",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.EIGHT)));

    public static final RegistryObject<Item> COOKED_SWORDFISH = ITEMS.register("cooked_swordfish",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.SEVEN)));

    public static final RegistryObject<Item> COOKED_SLIMY_EEL = ITEMS.register("cooked_slimy_eel",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.SEVEN)));

    public static final RegistryObject<Item> COOKED_SHRIMPS = ITEMS.register("cooked_shrimps",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.FOUR)));
}
