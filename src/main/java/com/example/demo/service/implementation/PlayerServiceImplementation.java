package com.example.demo.service.implementation;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Player;
import com.example.demo.model.Team;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.service.PlayerService;

@Service
public class PlayerServiceImplementation implements PlayerService {
	
	@Autowired
	private PlayerRepository playerRepo;
	
	@Override
	public String createPlayer(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player findPlayer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletePlayer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Player> getPlayers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//getting players by giving team id
	@Override
	public ArrayList<Player> getPlayer(int teamId) {
		return playerRepo.findByTeamId(teamId);
	}

	//getting team by giving player id
	@Override
	public Team getTeam(int playerId) {
		Optional<Player> player = playerRepo.findById(playerId);
		if(player.isPresent()) {
			return player.get().getTeam();
		}else {
			return null;
		}
	}

}
