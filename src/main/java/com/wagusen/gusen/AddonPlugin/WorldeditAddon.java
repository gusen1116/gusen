package com.wagusen.gusen.AddonPlugin;

import com.sk89q.worldedit.IncompleteRegionException;
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.bukkit.BukkitPlayer;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.regions.Region;
import com.wagusen.gusen.Gusen;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;


public class WorldeditAddon implements CommandExecutor {
    //오리지널 겸 라인1 코드
    private static HashMap<Player, Timer> test = new HashMap<>();
    private Object Message;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
        if (test.containsKey(player)) {
            Timer t = test.get(player);
            t.cancel();
            test.remove(player);
            return true;
        }
        if (!(sender instanceof Player)) {
            sender.sendMessage("플레이어만 사용 가능한 명령어 입니다! :)");
            return true;
        }
        BukkitPlayer bukkitPlayer = BukkitAdapter.adapt(player);
        Region region = null;
        try {
            region = Gusen.worldEditPlugin.getSession(player).getSelection(bukkitPlayer.getWorld());
        } catch (IncompleteRegionException e) {
            e.printStackTrace();
        }
        if (region == null) {
            player.sendMessage(ChatColor.RED + "|경고| " + ChatColor.WHITE + "포지션이 설정이 안되었습니다!");
            return true;
        }
        BlockVector3 max = region.getMaximumPoint();
        BlockVector3 min = region.getMinimumPoint();
        double maxX = max.toVector3().toBlockPoint().getBlockX();
        double maxY = max.toVector3().toBlockPoint().getBlockY();
        double maxZ = max.toVector3().toBlockPoint().getBlockZ();
        double minX = min.toVector3().toBlockPoint().getBlockX();
        double minY = min.toVector3().toBlockPoint().getBlockY();
        double minZ = min.toVector3().toBlockPoint().getBlockZ();
        double a = ((maxX + minX) / 2);
        double b = ((maxY + minY) / 2);
        double c = ((minZ + maxZ) / 2);
        double d = Math.abs((maxX - minX) + 1) * Math.abs((maxY - minY) + 1) * Math.abs((maxZ - minZ) + 1);
        double e = Math.abs((maxX - minX) + 1) * Math.abs((maxY - minY) + 1);
        double f = Math.abs((maxY - minY) + 1) * Math.abs((maxZ - minZ) + 1);
        double g = Math.abs((maxX - minX) + 1) * Math.abs((maxZ - minZ) + 1);
        if (!(command.getName().equals("/clear"))) {
            player.sendMessage(ChatColor.GREEN + "────────────→" + ChatColor.GOLD + "[포지션 정보(1라인)]" + ChatColor.GREEN + "←────────────");
            if ((2 * a % 2 == 0) && (2 * b % 2 == 0) && (2 * c % 2 == 0)) {
                player.sendMessage(ChatColor.GOLD + "<최대> " + ChatColor.WHITE + max + " | " + ChatColor.AQUA + "<중심> " + ChatColor.WHITE + "(" + Math.round(a) + ", " + Math.round(b) + ", " + Math.round(c) + ")" + " | " + ChatColor.GOLD + "<최소> " + ChatColor.WHITE + min);
            } else {
                player.sendMessage(ChatColor.GOLD + "<최대> " + ChatColor.WHITE + max + " | " + ChatColor.AQUA + "<중심> " + ChatColor.WHITE + "(" + a + ", " + b + ", " + c + ")" + " | " + ChatColor.GOLD + "<최소> " + ChatColor.WHITE + min);
            }

            if ((a == minX) && !(b == minY) && !(c == minZ)) {
                if (f % 2 == 0) {
                    player.sendMessage("이 구역의 총 블럭 개수는 짝수개 입니다! " + ChatColor.GOLD + " | " + Math.round(f) + " 개");
                } else {
                    player.sendMessage("이 구역의 총 블럭 개수는 홀수개 입니다! " + ChatColor.GOLD + " | " + Math.round(f) + " 개");
                }
            }
            if (!(a == minX) && (b == minY) && !(c == minZ)) {
                if (g % 2 == 0) {
                    player.sendMessage("이 구역의 총 블럭 개수는 짝수개 입니다! " + ChatColor.GOLD + " | " + Math.round(g) + " 개");
                } else {
                    player.sendMessage("이 구역의 총 블럭 개수는 홀수개 입니다! " + ChatColor.GOLD + " | " + Math.round(g) + " 개");
                }
            }
            if (!(a == minX) && !(b == minY) && (c == minZ)) {
                if (e % 2 == 0) {
                    player.sendMessage("이 구역의 총 블럭 개수는 짝수개 입니다! " + ChatColor.GOLD + " | " + Math.round(e) + " 개");
                } else {
                    player.sendMessage("이 구역의 총 블럭 개수는 홀수개 입니다! " + ChatColor.GOLD + " | " + Math.round(e) + " 개");
                }
            }
            if (!(a == minX) && !(b == minY) && !(c == minZ)) {
                if ((d) % 2 == 0) {
                    player.sendMessage("이 구역의 총 블럭 개수는 짝수개 입니다! " + ChatColor.GOLD + " | " + Math.round(d) + " 개");
                } else {
                    player.sendMessage("이 구역의 총 블럭 개수는 홀수개 입니다! " + ChatColor.GOLD + " | " + Math.round(d) + " 개");
                }
            }
            if ((a == minX) && (b == minY) && !(c == minZ)) {
                if ((maxZ - minZ + 1) % 2 == 0) {
                    player.sendMessage("이 구역의 총 블럭 개수는 짝수개 입니다! " + ChatColor.GOLD + " | " + Math.round(Math.abs(maxZ - minZ + 1)) + " 개");
                } else {
                    player.sendMessage("이 구역의 총 블럭 개수는 홀수개 입니다! " + ChatColor.GOLD + " | " + Math.round(Math.abs(maxZ - minZ + 1)) + " 개");
                }
            }
            if ((a == minX) && !(b == minY) && (c == minZ)) {
                if ((maxY - minY + 1) % 2 == 0) {
                    player.sendMessage("이 구역의 총 블럭 개수는 짝수개 입니다! " + ChatColor.GOLD + " | " + Math.round(Math.abs(maxY - minY + 1)) + " 개");
                } else {
                    player.sendMessage("이 구역의 총 블럭 개수는 홀수개 입니다! " + ChatColor.GOLD + " | " + Math.round(Math.abs(maxY - minY + 1)) + " 개");
                }
            }
            if (!(a == minX) && (b == minY) && (c == minZ)) {
                if ((maxX - minX + 1) % 2 == 0) {
                    player.sendMessage("이 구역의 총 블럭 개수는 짝수개 입니다! " + ChatColor.GOLD + " | " + Math.round(Math.abs(maxX - minX + 1)) + " 개");
                } else {
                    player.sendMessage("이 구역의 총 블럭 개수는 홀수개 입니다! " + ChatColor.GOLD + " | " + Math.round(Math.abs(maxX - minX + 1)) + " 개");
                }
            }
            if ((a == minX) && (b == minY) && (c == minZ)) {
                player.sendMessage("이 구역의 총 블럭 개수는 홀수개 입니다! " + ChatColor.GOLD + " | " + " 1개");
            }
            if (!player.isOp()) {
                return true;
            }
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), a, b, c), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(245, 189, 4), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), a + 1, b + 1, c + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(245, 189, 4), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), a, b + 1, c), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(245, 189, 4), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), a, b, c + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(245, 189, 4), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), a + 1, b + 1, c), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(245, 189, 4), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), a, b, c + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(245, 189, 4), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), a + 1, b, c + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(245, 189, 4), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), a + 1, b, c), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(245, 189, 4), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), a, b + 1, c + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(245, 189, 4), 1));
                    for (int i = 0; !(maxX - minX == i); i++) {
                        player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), minX + i + 1, minY, minZ), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    }
                    for (int I = 0; !(maxY - minY == I); I++) {
                        player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), minX, minY + I + 1, minZ), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    }
                    for (int L = 0; !(maxZ - minZ == L); L++) {
                        player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), minX, minY, minZ + L + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    }
                    for (int l = 0; !(maxX - l == minX); l++) {
                        player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), maxX - l, maxY + 1, maxZ + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    }
                    for (int H = 0; !(maxZ - H == minZ); H++) {
                        player.spawnParticle(Particle.REDSTONE, new Location((player.getWorld()), maxX + 1, maxY + 1, maxZ - H), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    }
                    for (int h = 0; !(maxY - h == minY); h++) {
                        player.spawnParticle(Particle.REDSTONE, new Location((player.getWorld()), maxX + 1, maxY - h, maxZ + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    }
                    for (int M = 0; !(maxX - minX == M); M++) {
                        player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), minX + M + 1, maxY + 1, minZ), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    }
                    for (int m = 0; !(maxZ - minZ == m); m++) {
                        player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), minX, maxY + 1, minZ + m + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    }
                    for (int N = 0; !(maxX - N == minX); N++) {
                        player.spawnParticle(Particle.REDSTONE, new Location(player.getWorld(), maxX - N, minY, maxZ + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    }
                    for (int n = 0; !(maxZ - n == minZ); n++) {
                        player.spawnParticle(Particle.REDSTONE, new Location((player.getWorld()), maxX + 1, minY, maxZ - n), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    }
                    for (int G = 0; !(maxY - G == minY); G++) {
                        player.spawnParticle(Particle.REDSTONE, new Location((player.getWorld()), maxX + 1, maxY - G, minZ), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    }
                    for (int g = 0; !(maxY - g == minY); g++) {
                        player.spawnParticle(Particle.REDSTONE, new Location((player.getWorld()), minX, maxY - g, maxZ + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    }
                    player.spawnParticle(Particle.REDSTONE, new Location((player.getWorld()), minX, minY, minZ), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location((player.getWorld()), minX, minY, maxZ + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location((player.getWorld()), maxX + 1, maxY + 1, maxZ + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location((player.getWorld()), minX, maxY + 1, maxZ + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location((player.getWorld()), minX, maxY + 1, minZ), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location((player.getWorld()), maxX + 1, minY, maxZ + 1), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location((player.getWorld()), maxX + 1, minY, minZ), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                    player.spawnParticle(Particle.REDSTONE, new Location((player.getWorld()), maxX + 1, maxY + 1, minZ), 0, 0, 0, 0, new Particle.DustOptions(Color.fromRGB(102, 255, 196), 1));
                }
            }, 0, 100);
            test.put(player, timer);
            if (command.getName().equals("/clear")) {
                if (test.containsKey(player)) {
                    Timer t = test.get(player);
                    t.cancel();
                    test.remove(player);
                }
            }
        }
            return true;
        }

        public static void onDisable () {
            for (Timer timer : test.values()) {
                timer.cancel();
            }
        }


}