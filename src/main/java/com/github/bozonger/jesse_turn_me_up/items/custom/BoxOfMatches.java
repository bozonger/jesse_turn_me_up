package com.github.bozonger.jesse_turn_me_up.items.custom;

import com.github.bozonger.jesse_turn_me_up.items.ItemInit;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class BoxOfMatches extends Item {
    public BoxOfMatches(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, @NotNull InteractionHand hand) {
        ItemStack usedItem = player.getItemInHand(hand);
        ItemStack newItem = new ItemStack(ItemInit.MATCH.get());

        player.getInventory().add(newItem);

        usedItem.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(hand));

        return super.use(level, player, hand);
    }
}
