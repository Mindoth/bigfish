package net.mindoth.bigfish.event;

import net.mindoth.bigfish.BigFish;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.NestedLootTable;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.util.ObfuscationReflectionHelper;
import net.neoforged.neoforge.event.LootTableLoadEvent;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(modid = BigFish.MOD_ID)
public class FishLoot {

    public static final ResourceKey<LootTable> FISH = register("gameplay/fishing/fish");

    private static ResourceKey<LootTable> register(String path) {
        return BuiltInLootTables.register(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(BigFish.MOD_ID, path)));
    }

    @SubscribeEvent
    public static void addLootPools(LootTableLoadEvent event) {
        ResourceLocation name = event.getName();
        if ( name.equals(BuiltInLootTables.FISHING.location()) ) {
            LootPool pool = event.getTable().getPool("main");
            if ( pool != null ) addEntry(pool, getInjectEntry(FISH, 50, 0));
        }
    }

    private static LootPoolEntryContainer getInjectEntry(ResourceKey<LootTable> resourceKey, int weight, int quality) {
        return NestedLootTable.lootTableReference(resourceKey).setWeight(weight).setQuality(quality).build();
    }

    private static void addEntry(LootPool pool, LootPoolEntryContainer entry) {
        try {
            Field entries = LootPool.class.getDeclaredField("entries");
            entries.setAccessible(true);

            ArrayList<LootPoolEntryContainer> lootPoolEntriesArray = new ArrayList<>(pool.entries);
            ArrayList<LootPoolEntryContainer> newLootEntries = new ArrayList<>(lootPoolEntriesArray);

            if ( newLootEntries.stream().anyMatch(e -> e == entry) ) {
                throw new RuntimeException("Error in pool: " + entry + ". Entry is a duplicate");
            }

            newLootEntries.add(entry);
            entries.set(pool, newLootEntries);
        }
        catch ( IllegalAccessException | NoSuchFieldException e ) {
            System.out.println("Error in adding a new entry to the fishing loot table");
            e.printStackTrace();
        }
    }
}
