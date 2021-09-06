package com.wagusen.gusen.Test;

import com.wagusen.gusen.Gusen;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.title.Title;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class dice implements CommandExecutor{
    Random r = new Random();


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        int i = r.nextInt(11);
    Title title = Title.title(Component.text(i + "이 나왔습니다").color(NamedTextColor.GREEN),Component.empty(), Title.Times.of(Duration.ofMillis(50*10),Duration.ofMillis(50*10),Duration.ofMillis(50*10)));
      for(Player player: Bukkit.getOnlinePlayers()){
        player.sendMessage(sender.getName()+ "님이 " + "§a" +i + ChatColor.WHITE  );
          player.showTitle(title);
          player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, SoundCategory.MASTER, 1.0f, 1.0f);
          List <String> dice = Gusen.getPlugin().dataManager.getConfig().getStringList("dice");
          for (String s : dice)
              sender.sendMessage(s);

      }

      return true;
    }
}
