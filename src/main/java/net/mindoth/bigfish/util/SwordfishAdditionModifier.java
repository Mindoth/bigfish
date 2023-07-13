package net.mindoth.bigfish.util;

import com.google.gson.JsonObject;
import net.mindoth.bigfish.config.BigFishCommonConfig;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;

public class SwordfishAdditionModifier extends LootModifier {
    private final Item addedItem;

    protected SwordfishAdditionModifier(ILootCondition[] conditionsIn, Item addeditemIn) {
        super(conditionsIn);
        this.addedItem = addeditemIn;
    }

    @Nonnull
    @Override
    public List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {

        if ( generatedLoot.get(0).getItem().is(ItemTags.FISHES) ) {
            if ( context.getRandom().nextDouble() <= BigFishCommonConfig.SWORDFISH_CHANCE.get() ) {
                generatedLoot.clear();
                generatedLoot.add(new ItemStack(addedItem, 1));
            }
        }
        return generatedLoot;

    }

    public static class Serializer extends GlobalLootModifierSerializer<SwordfishAdditionModifier> {

        @Override
        public SwordfishAdditionModifier read(ResourceLocation location, JsonObject object, ILootCondition[] conditionsIn) {
            Item addedItem = ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation((JSONUtils.getAsString(object, "item"))));
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