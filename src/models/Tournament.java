package models;

import java.util.List;

public class Tournament {
	private String name;
	private List<Team> teams;
	private List<Game> games;
	
	public Tournament(String name, List<Team> teams, List<Game> games) {
		this.name = name;
		this.teams = teams;
		this.games = games;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}	
}
