package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Player;
import com.example.demo.model.Team;

public interface PlayerService {
	String createPlayer(Player player);
	Player findPlayer(int id);
	String updatePlayer(Player player);
	String deletePlayer(int id);
	List<Player> getPlayers(int pageNo);
	
	//cross functions
	Team getTeam(int playerId);
	ArrayList<Player> getPlayer(int teamId);
}
