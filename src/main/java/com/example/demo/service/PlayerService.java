package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Player;
import com.example.demo.model.Team;

public interface PlayerService {
	String createPlayer(Player player);
	Player findPlayer(int id);
	String updatePlayer(Player player);
	String deletePlayer(int id);
	ArrayList<Player> getPlayers();
	
	//cross functions
	Team getTeam(int playerId);
	ArrayList<Player> getPlayer(int teamId);
}
