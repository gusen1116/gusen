package com.wagusen.gusen.Test;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GAMESTART{

    private static Map<Integer, GAMESTART> GAMESTART = new HashMap<Integer, GAMESTART>();

    private static int lastId = 0;

    private  int id;

    private Player MasterPlayer;

    private Set<Player> players;

    public GAMESTART(Player player){
        MasterPlayer = player;
        players.add(player);
        id= lastId;

    }
}