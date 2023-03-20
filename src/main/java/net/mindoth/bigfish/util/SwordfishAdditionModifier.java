package net.mindoth.bigfish.util;

import com.google.gson.JsonObject;
import net.mindoth.bigfish.config.BigFishCommonConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;

public class SwordfishAdditionModifier extends LootModifier {
    private final Item addedItem;

    protected SwordfishAdditionModifier(LootItemCondition[] conditionsIn, Item addeditemIn) {
        super(conditionsIn);
        this.addedItem = addeditemIn;
    }

    @Nonnull
    @Override
    public List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {

        if ( generatedLoot.get(0).is(ItemTags.FISHES) ) {
            if ( context.getRandom().nextDouble() <= BigFishCommonConfig.SPECIAL_FISH_CHANCE.get() ) {
                generatedLoot.clear();
                generatedLoot.add(new ItemStack(addedItem, 1));
            }
        }
        return generatedLoot;

    }

    public static class Serializer extends GlobalLootModifierSerializer<SwordfishAdditionModifier> {

        @Override
        public SwordfishAdditionModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] conditionsIn) {
            Item addedItem = ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation((GsonHelper.getAsString(object, "item"))));
            return new SwordfishAdditionModifier(conditionsIn, addedItem);
        }

        @Override
        public JsonObject write(SwordfishAdditionModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("item", ForgeRegistries.ITEMS.getKey(instance.addedItem).toString());
            return new JsonObject();
        }
    }
}