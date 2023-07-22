package net.mindoth.bigfish.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.mindoth.bigfish.BigFish;
import net.mindoth.bigfish.registry.BigFishItems;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MerchantOffer;
import net.minecraft.util.FoodStats;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;


@Mod.EventBusSubscriber(modid = BigFish.MOD_ID)
public class CommonEvents {

    @SubscribeEvent
    public static void onPlayerAte(final LivingEntityUseItemEvent.Finish event) {
        if ( event.getEntity() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity)event.getEntity();
            FoodStats foodData = player.getFoodData();
            if ( !player.level.isClientSide ) {
                if ( event.getItem().getItem().equals(BigFishItems.COOKED_SLIMY_EEL.get()) ) {
                    int addedFood = (int)(1 + Math.random() * (10 - 1));
                    foodData.setFoodLevel(foodData.getFoodLevel() + addedFood);
                    float addedSaturation = (float)(0.1 + Math.random() * (1.0 - 0.1));
                    foodData.setSaturation(foodData.getSaturationLevel() + addedSaturation);
                }
            }
        }
    }

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == VillagerProfession.FISHERMAN) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(BigFishItems.RAW_DARK_CRAB.get(), 4),
                    stack,12,30,0.05F));
        }
        if(event.getType() == VillagerProfession.FISHERMAN) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 5;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(BigFishItems.RAW_MANTARAY.get(), 4),
                    stack,12,30,0.05F));
        }

        if(event.getType() == VillagerProfession.FISHERMAN) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(BigFishItems.RAW_SHARK.get(), 6),
                    stack,12,30,0.05F));
        }
        if(event.getType() == VillagerProfession.FISHERMAN) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 4;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(BigFishItems.RAW_ANGLERFISH.get(), 6),
                    stack,12,30,0.05F));
        }

        if(event.getType() == VillagerProfession.FISHERMAN) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(BigFishItems.RAW_MONKFISH.get(), 13),
                    stack,16,20,0.05F));
        }
        if(event.getType() == VillagerProfession.FISHERMAN) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 3;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(BigFishItems.RAW_SWORDFISH.get(), 13),
                    stack,16,20,0.05F));
        }

        if(event.getType() == VillagerProfession.FISHERMAN) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(BigFishItems.RAW_LOBSTER.get(), 15),
                    stack,16,10,0.05F));
        }
        if(event.getType() == VillagerProfession.FISHERMAN) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 2;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(BigFishItems.RAW_SLIMY_EEL.get(), 15),
                    stack,16,10,0.05F));
        }
        if(event.getType() == VillagerProfession.FISHERMAN) {
            Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(BigFishItems.RAW_SHRIMPS.get(), 15),
                    stack,16,5,0.05F));
        }
    }
}
