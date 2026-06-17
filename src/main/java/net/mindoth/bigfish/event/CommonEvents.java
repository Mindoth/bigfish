package net.mindoth.bigfish.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.mindoth.bigfish.BigFish;
import net.mindoth.bigfish.config.ModCommonConfig;
import net.mindoth.bigfish.registries.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;

import java.util.List;

@EventBusSubscriber(modid = BigFish.MOD_ID)
public class CommonEvents {

    @SubscribeEvent
    public static void onPlayerAte(final LivingEntityUseItemEvent.Finish event) {
        if ( event.getEntity() instanceof Player) {
            Player player = (Player)event.getEntity();
            FoodData foodData = player.getFoodData();
            if ( !player.level().isClientSide ) {
                if ( event.getItem().getItem().equals(ModItems.COOKED_SLIMY_EEL.get()) ) {
                    int addedFood = (int)(ModCommonConfig.EEL_HUNGER_MIN.get() + Math.random() * (ModCommonConfig.EEL_HUNGER_MAX.get() - ModCommonConfig.EEL_HUNGER_MIN.get()));
                    foodData.setFoodLevel(foodData.getFoodLevel() + addedFood);
                    float addedSaturation = (float)(ModCommonConfig.EEL_SATURARION_MIN.get() + Math.random() * (ModCommonConfig.EEL_SATURARION_MAX.get() - ModCommonConfig.EEL_SATURARION_MIN.get()));
                    foodData.setSaturation(foodData.getSaturationLevel() + addedSaturation);
                }
                if ( event.getItem().getItem().equals(ModItems.COOKED_ANGLERFISH.get()) ) {
                    player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, ModCommonConfig.ANGLERFISH_BOOST_TIME.get(), ModCommonConfig.ANGLERFISH_BOOST_POWER.get()));
                }
            }
        }
    }

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if ( event.getType() == VillagerProfession.FISHERMAN ) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemCost(ModItems.RAW_DARK_CRAB.get(), 4),
                    stack,12,30,0.05F));
        }
        if ( event.getType() == VillagerProfession.FISHERMAN ) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemCost(ModItems.RAW_MANTARAY.get(), 4),
                    stack,12,30,0.05F));
        }

        if ( event.getType() == VillagerProfession.FISHERMAN ) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemCost(ModItems.RAW_SHARK.get(), 6),
                    stack,12,30,0.05F));
        }
        if ( event.getType() == VillagerProfession.FISHERMAN ) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemCost(ModItems.RAW_ANGLERFISH.get(), 6),
                    stack,12,30,0.05F));
        }

        if ( event.getType() == VillagerProfession.FISHERMAN ) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemCost(ModItems.RAW_MONKFISH.get(), 13),
                    stack,16,20,0.05F));
        }
        if ( event.getType() == VillagerProfession.FISHERMAN ) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemCost(ModItems.RAW_SWORDFISH.get(), 13),
                    stack,16,20,0.05F));
        }

        if ( event.getType() == VillagerProfession.FISHERMAN ) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemCost(ModItems.RAW_LOBSTER.get(), 15),
                    stack,16,10,0.05F));
        }
        if ( event.getType() == VillagerProfession.FISHERMAN ) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemCost(ModItems.RAW_SLIMY_EEL.get(), 15),
                    stack,16,10,0.05F));
        }
        if ( event.getType() == VillagerProfession.FISHERMAN ) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemCost(ModItems.RAW_SHRIMPS.get(), 15),
                    stack,16,5,0.05F));
        }
    }
}
