package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {
	@Id
	private int id;
	
	private String name;
	private String location;
	private String created_at;
	private String updated_at;
	
	@OneToMany(mappedBy="team")
	private List<Player> players;
	
	//default constructor
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Team(int id, String name, String location, String created_at, String updated_at) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	
	//getters and setters for accessing private data members in other classes.
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", location=" + location + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + "]";
	}
}
