package models;

public class Game {
	private String winner;
	private Team radiant;
	private Team dire;
	private TeamGameStatistics radiantStats;
	private TeamGameStatistics direStats;
	
	public Game(String winner, Team radiant, Team dire, TeamGameStatistics radiantStats, TeamGameStatistics direStats) {
		super();
		this.winner = winner;
		this.radiant = radiant;
		this.dire = dire;
		this.radiantStats = radiantStats;
		this.direStats = direStats;
	}
	
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public Team getRadiant() {
		return radiant;
	}
	public void setRadiant(Team radiant) {
		this.radiant = radiant;
	}
	public Team getDire() {
		return dire;
	}
	public void setDire(Team dire) {
		this.dire = dire;
	}
	public TeamGameStatistics getRadiantStats() {
		return radiantStats;
	}
	public void setRadiantStats(TeamGameStatistics radiantStats) {
		this.radiantStats = radiantStats;
	}
	public TeamGameStatistics getDireStats() {
		return direStats;
	}
	public void setDireStats(TeamGameStatistics direStats) {
		this.direStats = direStats;
	}
	
	

	
}
