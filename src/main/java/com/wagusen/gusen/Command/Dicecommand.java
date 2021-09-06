package com.wagusen.gusen.Command;

import com.wagusen.gusen.Gusen;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.title.Title;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;

import java.time.Duration;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Dicecommand implements CommandExecutor {

    Random A = new Random();
    Random B = new Random();
    Random C = new Random();
    static int count;
    static boolean running = false;

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (running) {
            sender.sendMessage("마 기다리아");
            return true;
        }
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Location location = p.getLocation();
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute as " + p.getUniqueId() + " at @s run summon firework_rocket ~ ~ ~ {LifeTime:3,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:2,Explosions:[{Type:1,Flicker:0,Trail:1,Colors:[I;11743532,14602026],FadeColors:[I;15790320]}]}}}} ");
            Timer timer = new Timer();
            int a = A.nextInt(7);
            int b = B.nextInt(7);
            int c = C.nextInt(7);
            count = 5;
            running = true;

            sender.sendMessage(ChatColor.GOLD + "┌───────────────────────────┐");
            sender.sendMessage(ChatColor.AQUA + "                    주사위를 던졌습니다!      ");
            sender.sendMessage(ChatColor.GREEN + "                   던지사람: " + ChatColor.WHITE + sender.getName());
            sender.sendMessage(ChatColor.GOLD + "└───────────────────────────┘");
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    if (count > 0) {
                        sender.sendMessage(count + "");
                        count--;
                        ((Player) sender).playSound(((Player) sender).getLocation(), Sound.BLOCK_NOTE_BLOCK_BELL, SoundCategory.MASTER, 1.0f, 1.0f );
                    } else {
                        timer.cancel();
                        running = false;
                        if (a >= 0 && b >= 0) {
                            Title title1 = Title.title(Component.text(a + b + "이 나왔습니다").color(NamedTextColor.GREEN), Component.empty(), Title.Times.of(Duration.ofMillis(50 * 10), Duration.ofMillis(50 * 10), Duration.ofMillis(50 * 10)));
                            if (a != b) {
                                for (Player player : Bukkit.getOnlinePlayers()) {
                                    player.sendMessage(sender.getName() + "님이 " + "§a" + a + "+" + b + "이 나왔습니다!");
                                    player.showTitle(title1);
                                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, SoundCategory.MASTER, 1.0f, 1.0f);
                                }
                            }
                            if ((a != 0) && a == b) {
                                Title title2 = Title.title(Component.text(a + b + c + "이 나왔습니다").color(NamedTextColor.GREEN), Component.empty(), Title.Times.of(Duration.ofMillis(50 * 10), Duration.ofMillis(50 * 10), Duration.ofMillis(50 * 10)));
                                for (Player player : Bukkit.getOnlinePlayers()) {
                                    player.sendMessage(sender.getName() + "님이 " + "§a" + a + "+" + b + "+" + c + "이 나왔습니다!");
                                    player.showTitle(title2);
                                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, SoundCategory.MASTER, 1.0f, 1.0f);
                                }
                            }
                            if ((a + b == 0) && c > 0) {
                                Title title3 = Title.title(Component.text(a + b + "이 나왔습니다").color(NamedTextColor.GREEN), Component.empty(), Title.Times.of(Duration.ofMillis(50 * 10), Duration.ofMillis(50 * 10), Duration.ofMillis(50 * 10)));
                                for (Player player : Bukkit.getOnlinePlayers()) {
                                    player.sendMessage(sender.getName() + "님이 " + "§a" + a + "+" + b + "이 나왔습니다!");
                                    player.showTitle(title3);
                                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, SoundCategory.MASTER, 1.0f, 1.0f);
                                }
                            }
                            if (a + b + c == 0) {
                                Bukkit.getScheduler().runTask(Gusen.getPlugin(), new Runnable() {
                                    @Override
                                    public void run() {
                                        Firework firework = (Firework) location.getWorld().spawnEntity(location, EntityType.FIREWORK);
                                        FireworkMeta fireworkMeta = firework.getFireworkMeta();
                                        fireworkMeta.setPower(2);
                                        fireworkMeta.addEffect(FireworkEffect.builder().withColor(Color.AQUA).withFlicker().withTrail().build());
                                        firework.setFireworkMeta(fireworkMeta);
                                    }
                                });
                                Title title = Title.title(Component.text("와 대박! 축하합니다! 트리플 0!").color(NamedTextColor.GREEN), Component.empty(), Title.Times.of(Duration.ofMillis(50 * 10), Duration.ofMillis(50 * 10), Duration.ofMillis(50 * 10)));
                                for (Player player : Bukkit.getOnlinePlayers()) {
                                    player.sendMessage("이게 나와 버리네!");
                                    player.showTitle(title);
                                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, SoundCategory.MASTER, 1.0f, 1.0f);

                                }
                            }
                        }
                    }
                }
            };
            timer.schedule(timerTask, 1000, 1000);
        }
        return true;
    }
}
