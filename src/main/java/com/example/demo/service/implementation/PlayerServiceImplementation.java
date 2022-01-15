package com.example.demo.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.model.Player;
import com.example.demo.model.Team;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.service.PlayerService;

@Service
public class PlayerServiceImplementation implements PlayerService {

	@Autowired
	private PlayerRepository playerRepo;

	private final static int PAGESIZE=1;

	//create player if player doesn't exist.
	@Override
	public String createPlayer(Player player) {
		if(playerRepo.existsById(player.getId())) {
			return "Id with "+ player.getId()+ " data already exists.";
		}else {
			try {
				playerRepo.save(player);
				return player.getName()+ " data saved successfully.";
			}catch(Exception ex) {
				return "Not a valid input. Please enter valid data.";
			}
		}
	}

	//get player by id if player exists.
	@Override
	public Player findPlayer(int id) {
		if(playerRepo.existsById(id)) {
			return playerRepo.findById(id).get();
		}else {
			return null;
		}
	}

	//update player if player exists.
	@Override
	public String updatePlayer(Player player) {
		if(playerRepo.existsById(player.getId())) {
			try {
				playerRepo.save(player);
				return player.getName()+ " data updated successfully.";
			}catch(Exception ex) {
				return "Not a valid input. Please give only valid input";
			}
		}else {
			return "No such player with " +player.getId()+ " exists.";
		}
	}

	//delete player by id if player exists.
	@Override
	public String deletePlayer(int id) {
		Optional<Player> player = playerRepo.findById(id);
		if(player.isPresent()) {
			String name = player.get().getName();
			playerRepo.deleteById(id);
			return name+ " data deleted successfully.";	
		}else {
			return "No such player exists.";
		}
	}

	//getting list of all players.
	@Override
	public List<Player> getPlayers(int pageNo) {
		Pageable page = PageRequest.of(pageNo, PAGESIZE);
		Page<Player> paginatedResult = playerRepo.findAll(page);

		return paginatedResult.getContent();
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
