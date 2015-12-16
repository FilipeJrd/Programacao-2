package models;

import java.util.ArrayList;
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
	public List<String> getTeamsName() {
		List<String> resp = new ArrayList<String>();
		
		for (Team team : teams) {
			resp.add(team.getName());
		}
		return resp;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public List<Integer> getGamesId() {
		List<Integer> resp = new ArrayList<Integer>();
		
		for (Game game : games) {
			resp.add(game.getId());
		}
		return resp;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}	
	public String toString(){
		return "Name of Tournament: " + name + "\nTeams: " + teams + "\nGames: " + games; 
	}
}
