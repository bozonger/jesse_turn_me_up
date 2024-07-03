package com.github.bozonger.jesse_turn_me_up.items;

import com.github.bozonger.jesse_turn_me_up.DrugsValues;
import com.github.bozonger.jesse_turn_me_up.Jesse_turn_me_up;
import com.github.bozonger.jesse_turn_me_up.RawPlantValues;
import com.github.bozonger.jesse_turn_me_up.blocks.BlockInit;
import com.github.bozonger.jesse_turn_me_up.items.custom.BoxOfMatches;
import com.github.bozonger.jesse_turn_me_up.items.custom.Joint;
import com.github.bozonger.jesse_turn_me_up.items.custom.Match;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Jesse_turn_me_up.MOD_ID);

    public static Item.Properties basicItem() {
        return new Item.Properties().tab(Jesse_turn_me_up.CREATIVE_TAB);
    }

    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food).tab(Jesse_turn_me_up.CREATIVE_TAB);
    }

    public static RegistryObject<Item> JOINT = ITEMS.register("joint", () -> new Joint(new Item.Properties().stacksTo(12).durability(1).tab(Jesse_turn_me_up.CREATIVE_TAB)));

    public static RegistryObject<Item> LIT_JOINT = ITEMS.register("lit_joint", () -> new Item(foodItem(DrugsValues.JOINT).tab(Jesse_turn_me_up.CREATIVE_TAB)));

    // Crops
    public static RegistryObject<Item> HASH = ITEMS.register("hash", () -> new Item(foodItem(RawPlantValues.HASH).tab(Jesse_turn_me_up.CREATIVE_TAB)));

    // Seeds
    public static RegistryObject<Item> HASH_SEED = ITEMS.register("hash_seed", () -> new ItemNameBlockItem(BlockInit.HASH_PLANT.get(), basicItem()));

    // Misc
    public static RegistryObject<Item> BOX_OF_MATCHES = ITEMS.register("box_of_matches", () -> new BoxOfMatches(new Item.Properties().stacksTo(1).durability(12).tab(Jesse_turn_me_up.CREATIVE_TAB)));
    public static RegistryObject<Item> MATCH = ITEMS.register("match", () -> new Match(new Item.Properties().stacksTo(12).durability(1).tab(Jesse_turn_me_up.CREATIVE_TAB)));
}