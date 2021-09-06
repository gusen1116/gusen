package com.wagusen.gusen.Util;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class TagGame {

    private int task;

    private Player it;
    private boolean isPlaying;

    public TagGame() {
        this.task = -1;
        this.isPlaying = false;
    }

    public int getTask() {
        return task;
    }

    public void setTask(int task) {
        this.task = task;
    }

    public Player getIt() {
        return it;
    }

    public void setIt(Player it) {
        this.it = it;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {

        this.isPlaying = isPlaying;
    }

    public Player pickFirstIt() {
        return Bukkit.getOnlinePlayers().stream().skip((int) (Bukkit.getOnlinePlayers().size() * Math.random())).findFirst().orElse(null);
    }

    //public Scoreboard getboard() {
       // ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        //Scoreboard scoreboard = scoreboardManager.getMainScoreboard();
        //    Objective objective =
        //  }
    }

