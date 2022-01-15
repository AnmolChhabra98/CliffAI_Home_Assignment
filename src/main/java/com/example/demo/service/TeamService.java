package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Team;

public interface TeamService {
	String createTeam(Team team);
	Team findTeam(int id);
	String updateTeam(Team team);
	String deleteTeam(int id);
	List<Team> getTeams(int pageNo);
}
