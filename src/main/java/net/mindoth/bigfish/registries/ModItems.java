package net.mindoth.bigfish.registries;

import net.mindoth.bigfish.BigFish;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

@EventBusSubscriber(modid = BigFish.MOD_ID)
public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BigFish.MOD_ID);

    @SubscribeEvent
    public static void addToTab(BuildCreativeModeTabContentsEvent event) {
        if ( event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS ) {
            for ( DeferredHolder<Item, ? extends Item> holder : ModItems.ITEMS.getEntries() ) {
                event.accept(holder.get());
            }
        }
    }

    public static final DeferredItem<Item> RAW_DARK_CRAB = ITEMS.registerItem("raw_dark_crab",
            (properties) -> new Item(properties.food(ModFood.RAWFISH)));

    public static final DeferredItem<Item> RAW_MANTARAY = ITEMS.registerItem("raw_mantaray",
            (properties) -> new Item(properties.food(ModFood.RAWFISH)));

    public static final DeferredItem<Item> RAW_SHARK = ITEMS.registerItem("raw_shark",
            (properties) -> new Item(properties.food(ModFood.RAWFISH)));

    public static final DeferredItem<Item> RAW_ANGLERFISH = ITEMS.registerItem("raw_anglerfish",
            (properties) -> new Item(properties.food(ModFood.RAWFISH)));

    public static final DeferredItem<Item> RAW_MONKFISH = ITEMS.registerItem("raw_monkfish",
            (properties) -> new Item(properties.food(ModFood.RAWFISH)));

    public static final DeferredItem<Item> RAW_SWORDFISH = ITEMS.registerItem("raw_swordfish",
            (properties) -> new Item(properties.food(ModFood.RAWFISH)));

    public static final DeferredItem<Item> RAW_LOBSTER = ITEMS.registerItem("raw_lobster",
            (properties) -> new Item(properties.food(ModFood.RAWFISH)));

    public static final DeferredItem<Item> RAW_SLIMY_EEL = ITEMS.registerItem("raw_slimy_eel",
            (properties) -> new Item(properties.food(ModFood.RAWFISH)));

    public static final DeferredItem<Item> RAW_SHRIMPS = ITEMS.registerItem("raw_shrimps",
            (properties) -> new Item(properties.food(ModFood.RAWFISH)));



    public static final DeferredItem<Item> COOKED_DARK_CRAB = ITEMS.registerItem("cooked_dark_crab",
            (properties) -> new Item(properties.food(ModFood.DARK_CRAB)));

    public static final DeferredItem<Item> COOKED_MANTARAY = ITEMS.registerItem("cooked_mantaray",
            (properties) -> new Item(properties.food(ModFood.MANTARAY)));

    public static final DeferredItem<Item> COOKED_SHARK = ITEMS.registerItem("cooked_shark",
            (properties) -> new Item(properties.food(ModFood.SHARK)));

    public static final DeferredItem<Item> COOKED_ANGLERFISH = ITEMS.registerItem("cooked_anglerfish",
            (properties) -> new Item(properties.food(ModFood.ANGLERFISH)));

    public static final DeferredItem<Item> COOKED_MONKFISH = ITEMS.registerItem("cooked_monkfish",
            (properties) -> new Item(properties.food(ModFood.MONKFISH)));

    public static final DeferredItem<Item> COOKED_SWORDFISH = ITEMS.registerItem("cooked_swordfish",
            (properties) -> new Item(properties.food(ModFood.SWORDFISH)));

    public static final DeferredItem<Item> COOKED_LOBSTER = ITEMS.registerItem("cooked_lobster",
            (properties) -> new Item(properties.food(ModFood.LOBSTER)));

    public static final DeferredItem<Item> COOKED_SLIMY_EEL = ITEMS.registerItem("cooked_slimy_eel",
            (properties) -> new Item(properties.food(ModFood.SLIMY_EEL)));

    public static final DeferredItem<Item> COOKED_SHRIMPS = ITEMS.registerItem("cooked_shrimps",
            (properties) -> new Item(properties.food(ModFood.SHRIMPS)));
}
