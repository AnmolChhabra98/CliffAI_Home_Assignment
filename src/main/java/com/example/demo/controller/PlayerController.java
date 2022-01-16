package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customresponse.CustomResponse;
import com.example.demo.model.Player;
import com.example.demo.model.Team;
import com.example.demo.service.implementation.PlayerServiceImplementation;

@RestController
public class PlayerController {

	@Autowired
	private PlayerServiceImplementation playerService;

	//API: http://localhost:8085/create-player, UseCase: To create a new player if doesn't exist.
	@PostMapping("create-player")
	public CustomResponse<String> createTeam(@RequestBody Player player) {
		return new CustomResponse<String>("success","successfully retrive",playerService.createPlayer(player));
	}

	//API: http://localhost:8085/find-player-by-id/{playerId}, UseCase: To find a player by id if exist.
	@GetMapping("find-player-by-id/{playerId}")
	public CustomResponse<Player> findTeam(@PathVariable int playerId) {
		return new CustomResponse<Player>("success","successfully retrive",playerService.findPlayer(playerId));
	}

	//API: http://localhost:8085/update-player, UseCase: To update a player if exists.
	@PutMapping("/update-player")
	public CustomResponse<String> updatePlayer(@RequestBody Player player) {
		return new CustomResponse<String>("success","successfully retrive",playerService.updatePlayer(player));
	}

	//API: http://localhost:8085/delete-player-by-id/{teamId}, UseCase: To delete a player by id if exists.
	@DeleteMapping("delete-player-by-id/{playerId}")
	public CustomResponse<String> deletePlayer(@PathVariable int playerId) {
		return new CustomResponse<String>("success","successfully retrive",playerService.deletePlayer(playerId));
	}

	//API: http://localhost:8085/get-all-players, UseCase: To get list of all players on respective page 	
	@GetMapping("get-all-players/{pageNo}")
	public CustomResponse<List<Player>> getAllPlayers(@PathVariable int pageNo) {
		return new CustomResponse<List<Player>>("success","successfully retrive",playerService.getPlayers(pageNo));
	}

	//API: http://localhost:8085/get-players-by-teamid/{teamId}, UseCase: To get players by team id. 
	@GetMapping("get-players-by-teamid/{teamId}")
	public CustomResponse<ArrayList<Player>> getPlayerByTeamId(@PathVariable int teamId) {
		return new CustomResponse<ArrayList<Player>>("success","successfully retrive",playerService.getPlayer(teamId));
	}

	//API: http://localhost:8085/get-team-by-playerid/{playerId}, UseCase: To get team by player id. 
	@GetMapping("get-team-by-playerid/{playerId}")
	public CustomResponse<Team> getTeamByPlayerId(@PathVariable int playerId) {
		return new CustomResponse<Team>("success","successfully retrive",playerService.getTeam(playerId));
	}
}
