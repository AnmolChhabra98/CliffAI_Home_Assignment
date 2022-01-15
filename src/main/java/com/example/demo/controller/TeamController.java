package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customresponse.CustomResponse;
import com.example.demo.model.Team;
import com.example.demo.service.implementation.TeamServiceImplementation;

@RestController
public class TeamController {
	@Autowired 
	private TeamServiceImplementation teamService;

	//API: http://localhost:8085/get-all-teams, UseCase: To get list of teams 	
	@GetMapping("get-all-teams/{pageNo}")
	public CustomResponse<List<Team>> getAllTeams(@PathVariable int pageNo) {
		return new CustomResponse<List<Team>>("success","successfully retrive",teamService.getTeams(pageNo));
	}

	//API: http://localhost:8085/create-team, UseCase: To create a new team if doesn't exist.
	@PostMapping("create-team")
	public CustomResponse<String> createTeam(@RequestBody Team team) {
		return new CustomResponse<String>("success","successfully retrive",teamService.createTeam(team));
	}
}
