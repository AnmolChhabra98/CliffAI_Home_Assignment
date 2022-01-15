package com.example.demo.service.implementation;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Team;
import com.example.demo.repository.TeamRepository;
import com.example.demo.service.TeamService;

@Service
public class TeamServiceImplementation implements TeamService {
	
	@Autowired
	private TeamRepository teamRepo;
	
	@Override
	public String createTeam(Team team) {
		if(teamRepo.existsById(team.getId())) {
			return team.getName()+ " data already exists.";
		}else {
			teamRepo.save(team);
			return team.getName()+ " data saved successfully.";
		}
	}

	@Override
	public Team findTeam(int id) {
		if(teamRepo.existsById(id)) {
			return teamRepo.findById(id).get();
		}else {
			return null;
		}
	}

	@Override
	public String updateTeam(Team team) {
		if(teamRepo.existsById(team.getId())) {
			teamRepo.save(team);
			return team.getName()+ " data updated successfully.";
		}else {
			return "No such team exists.";
		}
	}

	@Override
	public String deleteTeam(int id) {
		Optional<Team> team = teamRepo.findById(id);
		if(team.isPresent()) {
			String name = team.get().getName();
			teamRepo.deleteById(id);
			return name+ " team data deleted successfully.";	
		}else {
			return "No such team exists.";
		}
	}

	@Override
	public ArrayList<Team> getTeams() {
		return (ArrayList<Team>) teamRepo.findAll();
	}

}
