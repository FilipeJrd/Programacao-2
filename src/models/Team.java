package models;

import java.util.List;

public class Team {
	private String name;
	private String country;
	private List<Player> players;
	
	
	public Team(String name, String country, List<Player> players) {
		super();
		this.name = name;
		this.country = country;
		this.players = players;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
}
