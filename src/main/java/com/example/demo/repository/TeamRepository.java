package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer>{
	
}
