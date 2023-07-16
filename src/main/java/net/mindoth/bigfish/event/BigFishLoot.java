package net.mindoth.bigfish.event;

import net.mindoth.bigfish.BigFish;
import net.minecraft.loot.LootEntry;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.TableLootEntry;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.util.List;

@Mod.EventBusSubscriber(modid = BigFish.MOD_ID)
public class BigFishLoot {

    //Fishing
    public static final ResourceLocation FISH = register("gameplay/fishing/fish");

    private static ResourceLocation register(String path) {
        return LootTables.register(new ResourceLocation(BigFish.MOD_ID, path));
    }

    @SubscribeEvent
    public static void addLootPools(LootTableLoadEvent event) {
        if ( event.getName().equals(LootTables.FISHING) ) {
            LootPool pool = event.getTable().getPool("main");
            if ( pool != null ) {
                addEntry(pool, getInjectEntry(FISH, 100, -1));
            }
        }
    }

    private static LootEntry getInjectEntry(ResourceLocation location, int weight, int quality) {
        return TableLootEntry.lootTableReference(location).setWeight(weight).setQuality(quality).build();
    }

    private static void addEntry(LootPool pool, LootEntry entry) {
        try {
            List<LootEntry> lootEntries = (List<LootEntry>) ObfuscationReflectionHelper.findField(LootPool.class, "field_186453_a").get(pool);

            if (lootEntries.stream().anyMatch(e -> e == entry)) {
                throw new RuntimeException("Error in pool: " + entry + ". Entry is a duplicate");
            }

            lootEntries.add(entry);
        }
        catch (IllegalAccessException e) {
            System.out.println("Error in adding a new entry to the fishing loot table");
            e.printStackTrace();
        }
    }
}
