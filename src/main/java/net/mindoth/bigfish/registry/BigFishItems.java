package net.mindoth.bigfish.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BigFishItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "bigfish");

    public static final RegistryObject<Item> DARK_CRAB = ITEMS.register("dark_crab",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> MANTARAY = ITEMS.register("mantaray",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> SHARK = ITEMS.register("shark",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> ANGLERFISH = ITEMS.register("anglerfish",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> MONKFISH = ITEMS.register("monkfish",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> SWORDFISH = ITEMS.register("swordfish",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> LOBSTER = ITEMS.register("lobster",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(BigFishFoods.RAWFISH)));

    public static final RegistryObject<Item> SLIMY_EEL = ITEMS.register("slimy_eel",
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
}
