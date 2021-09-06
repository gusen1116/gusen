package com.wagusen.gusen.Command;

import com.wagusen.gusen.Gusen;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PaintCommand implements CommandExecutor {
    private Gusen gusen;

    public PaintCommand(Gusen gusen) {
        this.gusen = gusen;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("콘솔 혹은 커맨드 블럭에서는 사용 할수 없습니다!");
            return true;
        }
        Player player = (Player) sender;
        if (gusen.hasPainters()) {
            if (gusen.getPainters().contains(player)) {
                gusen.removePainter(player);
                player.sendMessage("이 명령어를 쓸수 없습니다!, 펄미션을 확이해주세요!");
                return true;
            }
        }
        gusen.addPainter(player);
        player.sendMessage("이 명령어를 사용할수 있습니다!");
        return true;
    }
}
