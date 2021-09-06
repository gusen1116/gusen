package com.wagusen.gusen.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class AS implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        if (command.getName().equals("AU")) {
            sender.sendMessage("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀ ");
            sender.sendMessage("⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀");
            sender.sendMessage("⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀  ");
            sender.sendMessage("⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀");
            sender.sendMessage("⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀ ");
            sender.sendMessage("⣀⣤⣴⣶⣶⣿⡟⠀⠀⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⣿⣷⠀   ");
            sender.sendMessage("⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿");
            sender.sendMessage("⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃ ");
            sender.sendMessage("⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀");
            sender.sendMessage("⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀  ");
            sender.sendMessage("⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀   ");
            sender.sendMessage("⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀   ");
            sender.sendMessage("⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀   ");
            sender.sendMessage("⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀   ");
            sender.sendMessage("⠀⠛⢿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀ ");
            sender.sendMessage("⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀  ");
            sender.sendMessage("⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀  ");
            sender.sendMessage("⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀");
            sender.sendMessage("⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ");
        }
        if (command.getName().equals("SANS")){
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠈⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠘⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⣤⣤⣿⣿⣿⣿⣿⣧⡄⠀⠀⠀⠀⠀⣤⣿⣿⣿⣿⣿⣧⣤⡄⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⣿⣿⣿⣿⡟⠛⢻⣿⣿⡇⠀⠀⠀⠀⠀⣿⣿⣿⠛⠛⣿⣿⣿⣿⡇⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠀⠉⠿⠿⣿⣷⣶⣾⣿⡏⠁⠀⢰⣶⠀⠀⠉⣿⣿⣶⣶⣿⡿⠿⠏⠁⢰⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠀⠀⠀⠉⠉⣉⡹⠏⠁⠀⢰⣾⣿⣶⠀⠀⠉⠿⣉⡉⠉⠁⠀⠀⢰⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⠀⠀⠀⣦⡀⠉⠁⠀⠀⠀⠸⠿⠿⠿⠀⠀⠀⠀⠉⠉⠀⣆⡀⠀⠈⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠶⠶⣿⠁⡶⢆⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⠶⣾⡿⠷⠆⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠁⢾⣧⡀⠉⢹⡏⠉⢹⠉⠉⠉⣿⠉⠉⣿⣀⠏⠁⠀⠀⢰⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠏⠉⠉⠿⣿⣿⣄⠀⠀⠀⠀⠘⠛⢻⣧⣀⣼⣄⣀⣀⣿⣄⠛⠛⠀⠀⠀⢀⣼⡿⠏⠁⠀⢀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢇⣀⣀⠀⠀⠉⠿⠿⣿⣷⣤⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⣤⣿⣿⡏⠁⠀⢀⣰⣿⣉⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⣶⣶⣶⣀⠀⠉⠿⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⣿⠿⠏⠁⢀⣰⣾⣿⣿⣿⣀⠉⠿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⡿⢏⣹⣿⣿⣿⠿⣿⣿⣿⣶⣶⣀⠉⠙⠿⢿⣇⡈⠉⠉⠉⠉⣀⣿⣿⠿⠿⠟⠁⣀⣀⣰⣾⣿⡿⢋⣿⣿⣿⣶⣀⠿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⡿⢏⣱⣾⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⢠⣶⡆⢀⣹⣷⣆⣀⣀⣀⣿⣉⠉⣀⠀⣶⣾⣿⣿⣿⣿⣿⡇⢸⣿⣿⣿⣿⣿⣀⠉⠿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⡿⢃⣼⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⠈⠛⠃⢸⣿⡏⠀⠁⠀⠛⣿⠛⠀⠛⠀⣿⣿⣿⣿⣿⡟⠋⠀⢸⣿⣿⣿⣿⣿⣿⣶⠀⠻⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⠃⢸⣿⣿⣿⣿⣿⣿⣿⠀⠀⠛⣤⣤⣤⣤⡔⢻⣦⡜⢻⡇⠀⠀⠀⠀⣿⠀⣤⣷⠀⣿⡿⠛⠋⢠⣤⣼⡆⢸⣿⣿⣿⣿⣿⣿⣿⣄⠀⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⠀⢸⣿⣿⣿⣿⣿⣿⠟⢠⣿⣿⣿⣿⣿⣿⡇⠘⢣⡄⢸⡇⠀⠀⠀⠀⣿⠀⣤⣤⠀⣿⠀⣿⣿⣿⣿⣿⣧⡄⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣷⡄⠘⢻⣿⣿⣿⣿⠀⢸⣿⣿⣿⣿⣿⣿⣇⠰⡟⠃⢸⡇⠀⠀⠀⠀⣿⠀⠛⠛⣤⠋⣤⣿⣿⣿⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣿⠋⢀⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣧⡄⠘⠛⢻⣿⠀⢸⣿⣿⣿⣿⣿⣿⣿⡇⢸⡇⢸⡇⠀⠀⠀⠀⣿⠀⣿⠀⠋⣴⣿⣿⣿⣿⣿⣿⣿⠇⣿⣿⣿⣿⣿⠋⢀⣤⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣄⣸⡿⠂⠈⠉⠿⣿⣿⣿⣿⣿⡇⠈⠁⠈⠉⢉⡉⢉⣉⣉⣀⠉⠀⠿⠿⠿⠿⠿⠿⠿⠏⠁⢀⣿⠋⠉⢉⣤⣤⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣀⣀⣀⣉⣉⣉⣉⣉⣡⣶⣶⣶⣶⣾⣿⣿⣿⣿⣿⣶⣶⣶⣶⣶⣶⣶⣶⣶⣄⣀⣸⣿⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢻⣿⡟⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢿⣿⣿⣿⣿⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⡟⠃⢠⣼⣿⣿⣿⣿⣿⣿⣿⡿⠻⣿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⡇⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿⢸⣿⣿⣿⣿⣿⡇⠀⠘⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢳⣼⡟⠃⢠⣾⣿⣿⣿⣿⣿⣿⣿⠿⠀⣷⡎⢻⣿⣿⣿⣿⡇⠀⠀⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⡇⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⠀⣶⣿⡇⢸⣿⣿⣿⣿⣷⠀⠀⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠸⠿⠇⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿⣿⡇⢸⣿⣿⣿⣿⣿⠀⠀⠿⣿⣿⠿⠿⠿⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣶⣎⣉⣉⣉⣉⣉⣉⣉⣉⣶⣿⣿⣷⣎⣉⣉⣉⣉⣉⣀⣀⣀⣉⣉⣶⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⢿⣿⡿⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠹⠿⠿⠿⠿⠿⣿⣿⣿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠉⠰⢆⡀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⣀⠶⠿⠉⠁⠀⠀⠀⠉⠹⠿⢿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠘⢷⡖⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠓⠒⠒⠒⠒⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣄⣼⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣤⣤⣤⣤⣤⣤⣤⣤⣤⣼⣧⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⣤⣤⣤⣤⣿⣤⣤⣤⣤⣤⣤⣤⣤⣤⣼⣿⣿⣿⣿⣿⣿⣿");
            sender.sendMessage("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        }
        return true;
    }

}
