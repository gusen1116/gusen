package com.wagusen.gusen.Event;

import com.wagusen.gusen.Gusen;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteract implements Listener {
    private Gusen gusen;
        public PlayerInteract(Gusen gusen){
            this.gusen = gusen;
        }

    @EventHandler
    public void onPaint(PlayerInteractEvent event){
            if (!event.hasItem())
                return;
            if (!event.getItem().getType().isBlock())
                return;
            if(!gusen.hasPainters())
                return;
            if (!gusen.getPainters().contains(event.getPlayer()))
                return;
            if (event.getPlayer().rayTraceBlocks(50) == null)
                return;

            event.setCancelled(true);

        Block block = event.getPlayer().rayTraceBlocks(50).getHitBlock();
        block.setType(event.getItem().getType());
        return;
    }
}
