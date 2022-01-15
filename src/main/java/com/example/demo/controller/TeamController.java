package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Team;
import com.example.demo.service.implementation.TeamServiceImplementation;

@RestController
public class TeamController {
	@Autowired 
	private TeamServiceImplementation teamService;

	//API: http://localhost:8085/get-all-teams, UseCase: To get list of teams 
	@GetMapping("get-all-teams")
	public ResponseEntity<ArrayList<Team>> getAllUsers() {
		return new ResponseEntity<ArrayList<Team>>(teamService.getTeams(),HttpStatus.OK);
	}
}
