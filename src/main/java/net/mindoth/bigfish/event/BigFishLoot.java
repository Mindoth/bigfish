package net.mindoth.bigfish.event;

import net.mindoth.bigfish.BigFish;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = BigFish.MOD_ID)
public class BigFishLoot {

    //Fishing
    public static final ResourceLocation FISH = register("gameplay/fishing/fish");

    private static ResourceLocation register(String path) {
        return BuiltInLootTables.register(new ResourceLocation(BigFish.MOD_ID, path));
    }

    @SubscribeEvent
    public static void addLootPools(LootTableLoadEvent event) {
        if ( event.getName().equals(BuiltInLootTables.FISHING) ) {
            LootPool pool = event.getTable().getPool("main");
            if ( pool != null ) {
                addEntry(pool, getInjectEntry(FISH, 100, -1));
            }
        }
    }

    private static LootPoolEntryContainer getInjectEntry(ResourceLocation location, int weight, int quality) {
        return LootTableReference.lootTableReference(location).setWeight(weight).setQuality(quality).build();
    }

    private static void addEntry(LootPool pool, LootPoolEntryContainer entry) {
        try {
            Field entries = ObfuscationReflectionHelper.findField(LootPool.class, "f_79023_");
            entries.setAccessible(true);

            LootPoolEntryContainer[] lootPoolEntriesArray = (LootPoolEntryContainer[]) entries.get(pool);
            ArrayList<LootPoolEntryContainer> newLootEntries = new ArrayList<>(List.of(lootPoolEntriesArray));

            if (newLootEntries.stream().anyMatch(e -> e == entry)) {
                throw new RuntimeException("Error in pool: " + entry + ". Entry is a duplicate");
            }

            newLootEntries.add(entry);

            LootPoolEntryContainer[] newLootEntriesArray = new LootPoolEntryContainer[newLootEntries.size()];
            newLootEntries.toArray(newLootEntriesArray);
            entries.set(pool, newLootEntriesArray);
        }
        catch (IllegalAccessException e) {
            System.out.println("Error in adding a new entry to the fishing loot table");
            e.printStackTrace();
        }
    }
}
