package com.wagusen.gusen.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class Effectcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command,  String label,  String[] args) {
        command.getName();
        Player player = (Player) sender;
        if(command.getName().equals("야투")){
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20*10000, 0, true, true, true));
            sender.sendMessage("야간투시 받았음!");
        }
        if(command.getName().equals("재생")){
            player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20*10000, 5, true, true, true));
            sender.sendMessage("재생효과 받았음!");
        }








        return true;
    }
}
