package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Team;

public interface TeamService {
	String createTeam(Team team);
	Team findTeam(int id);
	String updateTeam(Team team);
	String deleteTeam(int id);
	ArrayList<Team> getTeams(); 
}
