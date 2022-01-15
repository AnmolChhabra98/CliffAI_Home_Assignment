package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Entity
public class Player {
	@Id
	private int id;
	
	@NotNull
	private String name, age, created_at, updated_at;
	
	@ManyToOne()
	@JoinColumn(name = "team_id")
	private Team team;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Player(int id, String name, String age, String created_at, String updated_at, Team team) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.team = team;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", created_at=" + created_at + ", updated_at="
				+ updated_at + ", team=" + team + "]";
	}
}
