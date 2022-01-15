package com.example.demo.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.model.Team;
import com.example.demo.repository.TeamRepository;
import com.example.demo.service.TeamService;

@Service
public class TeamServiceImplementation implements TeamService {

	@Autowired
	private TeamRepository teamRepo;

	private final static Integer PAGESIZE = 1;

	@Override
	public String createTeam(Team team) {
		if(teamRepo.existsById(team.getId())) {
			return team.getName()+ " team already exists.";
		}else {
			try {
				teamRepo.save(team);
				return team.getName()+ " team saved successfully.";
			}catch(Exception ex) {
				return "Not a valid input. Please enter valid input.";
			}
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
			try {
				teamRepo.save(team);
				return team.getName()+ " data updated successfully.";
			}catch(Exception ex){
				return "Not a valid input. Please give only valid input";
			}
		}else {
			return "No such team with " +team.getId()+ " exists.";
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

	//Getting only 1(i:e pagesize) record at a page.
	@Override
	public List<Team> getTeams(int pageNo) {
		Pageable page = PageRequest.of(pageNo, PAGESIZE);
		Page<Team> paginatedResult = teamRepo.findAll(page);
		return paginatedResult.getContent();

		//return (ArrayList<Team>) teamRepo.findAll();
	}

}
