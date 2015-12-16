package models;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private String name;
	private String country;
	private List<Player> players;	
	
	public Team(String name, String country, List<Player> players) {
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
	public List<String> getPlayersName() {
		List<String> resp = new ArrayList<String>();
		
		for (Player player : players) {
			resp.add(player.getName());
		}
		return resp;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public String toString(){
		String linebreak = "\n";
		StringBuilder builder = new StringBuilder();
		builder.append("Time: " + this.name + linebreak);
		builder.append("País: " + this.country + linebreak);
		for (int i = 0; i < players.size(); ++i) {
			builder.append("\nJogador " + (i+1) + linebreak + players.get(i).toString() + linebreak);
		}
		
		return builder.toString();
	}
	
}
