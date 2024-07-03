package com.github.bozonger.jesse_turn_me_up.items.custom;

import com.github.bozonger.jesse_turn_me_up.items.ItemInit;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Joint extends Item {

    public Joint(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, @NotNull InteractionHand hand) {
        ItemStack usedItem = player.getItemInHand(hand);
        ItemStack neededItemOffhand = player.getOffhandItem();
        ItemStack newItem = new ItemStack(ItemInit.LIT_JOINT.get());
        ItemStack match = new ItemStack(ItemInit.MATCH.get());

        if (neededItemOffhand.getItem() == match.getItem()){
            player.getInventory().add(newItem);
            usedItem.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(hand));
            neededItemOffhand.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(hand));
        }
        else{
            System.out.println("nu a mers coaie in pula ta de prost");
        }

        return super.use(level, player, hand);
    }
}
