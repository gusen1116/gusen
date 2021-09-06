package com.wagusen.gusen.Util;

import com.wagusen.gusen.Gusen;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;

public class DataManager {
    private Gusen plugin;
    private FileConfiguration dataConfig = null;
    private File configFile = null;

    public DataManager(Gusen plugin) {
        this.plugin = plugin;
        saveDefaultConfig();
    }

    public void reloadConfig() {
        if (this.configFile == null) {
            this.configFile = new File(this.plugin.getDataFolder(), "config.yml");
        }

        this.dataConfig = YamlConfiguration.loadConfiguration(this.configFile);

        InputStream defaultStream = this.plugin.getResource("config.yml");
        if (defaultStream != null) {
            YamlConfiguration defaultConfig = YamlConfiguration.loadConfiguration(new InputStreamReader(defaultStream));
            this.dataConfig.setDefaults(defaultConfig);
        }
    }

    public FileConfiguration getConfig() {
        if (this.dataConfig == null) reloadConfig();

        return this.dataConfig;
    }

    public void saveConfig(){
        if(this.dataConfig == null || this.configFile == null ) return;

        try {
            this.getConfig().save(this.configFile);
        } catch (IOException ioException) {
           this.plugin.getLogger().log(Level.SEVERE, "파일을 저장할 수 없습니다!", ioException);
        }
    }

    public void saveDefaultConfig() {
        Bukkit.getServer().getConsoleSender().sendMessage("콘피그테스트!");
        if (this.configFile == null)
            this.configFile = new File(this.plugin.getDataFolder(), "config.yml");

        if (!this.configFile.exists()) {
            this.plugin.saveResource("config.yml", false);
        }
    }
}
