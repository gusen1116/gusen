package com.wagusen.gusen;

import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import com.wagusen.gusen.AddonPlugin.WorldeditAddon;
import com.wagusen.gusen.AddonPlugin.Worldedithelp;
import com.wagusen.gusen.Command.AS;
import com.wagusen.gusen.Command.Dicecommand;
import com.wagusen.gusen.Command.Effectcommand;
import com.wagusen.gusen.Command.PaintCommand;
import com.wagusen.gusen.Event.PlayerInteract;
import com.wagusen.gusen.Event.fishevent;
import com.wagusen.gusen.Test.Test;
import com.wagusen.gusen.Test.dice;
import com.wagusen.gusen.Util.DataManager;
import com.wagusen.gusen.Util.Updater;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

public final class Gusen extends JavaPlugin {

    private static final Logger log = Logger.getLogger("Minecraft");
    private PluginManager pluginManager;
    private static TabCompleter tabCompleter;
    public static WorldEditPlugin worldEditPlugin;
    private static Gusen gusen;

    public static Gusen getPlugin() {
        return Gusen.gusen;
    }

    public PluginDescriptionFile pluginDescriptionFile;
    public static File file;
    public DataManager dataManager;

    public PluginManager getPluginManager() {
        return pluginManager;
    }

    public TabCompleter getTabCompleter() {
        return tabCompleter;
    }

    public static YamlConfiguration config;
    public static File dataFolder;
    private List<Player> painters = new ArrayList<Player>();

    @Override
    public void onEnable() {
        // Plugin startup logic
        gusen = this;

        Bukkit.getServer().getConsoleSender().sendMessage("와구센등장!");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "개발자" + ChatColor.WHITE + "gusen1116");
        Bukkit.getServer().getPluginManager().registerEvents(new fishevent(), this);
        registerCommand("dice", new dice());
        worldEditPlugin = getWorldEdit();
        registerCommand("testdice", new Dicecommand());
        registerCommand("야투", new Effectcommand());
        registerCommand("재생", new Effectcommand());
        registerCommand("/outline", new WorldeditAddon());
        registerCommand("showau", new AS());
        registerCommand("showsans", new AS());
        registerCommand("boom", new Test());
        registerCommand("/theother", new Worldedithelp());
        registerCommand("/clear2", new Worldedithelp());
        registerCommand("/clear", new WorldeditAddon());
        registerCommand("paint", new PaintCommand(this));
        this.dataManager = new DataManager(this);
        this.saveDefaultConfig();
        this.reloadConfig();
        this.getServer().getPluginManager().registerEvents(new PlayerInteract(this), this);
        try {
            this.init();
        } catch (Exception e) {
            Bukkit.getServer().getConsoleSender().sendMessage("플러그인 로딩중에 에러가 발생했습니다!");
        }
    }

    private void init() {
        Gusen.gusen = this;
        Gusen.config = (YamlConfiguration) this.getConfig();
        this.pluginDescriptionFile = this.getDescription();
        this.pluginManager = Bukkit.getServer().getPluginManager();
        dataFolder = new File(new File(Gusen.getPlugin().getDataFolder().getAbsoluteFile().getParent()).getParent());
        file = this.getFile();
        Updater.onEnable();
    }

    public void addPainter(Player player) {
        painters.add(player);
    }

    public void removePainter(Player player) {
        painters.remove(player);
    }

    public List<Player> getPainters() {
        return painters;
    }

    public boolean hasPainters() {
        if (painters.isEmpty())
            return false;
        return true;
    }

    private void registerCommand(String cmd, CommandExecutor executor) {
        if (gusen.getDescription().getCommands().containsKey(cmd)) {
            Objects.requireNonNull(this.getCommand(cmd)).setExecutor(executor);
            Objects.requireNonNull(this.getCommand(cmd)).setTabCompleter(tabCompleter);
        }
    }

    public WorldEditPlugin getWorldEdit() {
        Plugin plugin = Bukkit.getPluginManager().getPlugin("WorldEdit");
        if (plugin instanceof WorldEditPlugin) {
            return (WorldEditPlugin) plugin;
        } else {
            return null;
        }
    }



    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getServer().getConsoleSender().sendMessage("와구센꺼짐!");
        WorldeditAddon.onDisable();
        Worldedithelp.onDisable();
        Updater.onDisable();
    }
}


