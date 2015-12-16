package models;
public class Game {
	private String winner;
	private Team radiant;
	private Team dire;
	private String radiantPicks;
	private String direPicks;
	private int id;	
	
	public Game(int id, String winner, Team radiant, Team dire, String radiantPicks, String direPicks) {
		this.winner = winner;
		this.radiant = radiant;
		this.dire = dire;
		this.radiantPicks = radiantPicks;
		this.direPicks = direPicks;
		this.id = id;
	}
	
	public int getId(){
		return this.id;
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
	public String getRadiantPicks() {
		return this.radiantPicks;
	}
	public void setRadiantPicks(String radiantPicks) {
		this.radiantPicks = radiantPicks;
	}
	public String getDirePicks() {
		return this.direPicks;
	}
	public void setDirePicks(String direPicks) {
		this.direPicks = direPicks;
	}
	
	
	
}