package com.wagusen.gusen.Event;

import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;

public class fishevent implements Listener {

    @EventHandler
    public void onFishing(PlayerFishEvent event) {
        Player player = event.getPlayer();
        //낚시상태: 잡거나, 못잡거나, 물고기이외의 아이템
        if (event.getState() == PlayerFishEvent.State.REEL_IN) {
            player.sendMessage(ChatColor.RED + "아직 낚시대에 걸린게 없습니다!");
        } else if (event.getState() == PlayerFishEvent.State.FAILED_ATTEMPT) {
            player.sendMessage(ChatColor.DARK_GRAY + "당기는 타이밍이 느렸습니다!");
        } else if (event.getState() == PlayerFishEvent.State.BITE) {
            player.sendMessage(ChatColor.GOLD + "뭔가 걸렸습니다, 당기세요!");
            player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_PLACE, SoundCategory.MASTER, 1.0f, 1.0f);
        } else if (event.getState() == PlayerFishEvent.State.CAUGHT_FISH) {

            Item item = (Item) event.getCaught();
            ItemStack itemStack = item.getItemStack();
            Material material = itemStack.getType();
            String key =  "item.minecraft." + material.getKey().value();
            player.sendMessage(Component.translatable(key).append(Component.text("을 잡았습니다!")));

        } else if (event.getState() == PlayerFishEvent.State.CAUGHT_ENTITY) {
            Item item = (Item) event.getCaught();
            ItemStack itemStack = item.getItemStack();
            Material material = itemStack.getType();
            String key =  "item.minecraft." + material.getKey().value();
            player.sendMessage(Component.translatable(key).append(Component.text("을 잡았습니다!")));
        }
    }
}
