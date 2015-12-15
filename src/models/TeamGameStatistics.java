package models;

import java.util.List;
import java.util.Map;

import models.enums.Hero;

public class TeamGameStatistics {
	private int gold;
	private int kills;
	private int towersDestroyed;
	private int barracksDestroyed;
	private int roshanKills;
	private int aegis;
	private Map<Hero, Player> picks;
	private List<Hero> bans;
	
	public TeamGameStatistics(int gold, int kills, int towersDestroyed, int barracksDestroyed, int roshanKills,
			int aegis, Map<Hero, Player> picks, List<Hero> bans) {
		this.gold = gold;
		this.kills = kills;
		this.towersDestroyed = towersDestroyed;
		this.barracksDestroyed = barracksDestroyed;
		this.roshanKills = roshanKills;
		this.aegis = aegis;
		this.picks = picks;
		this.bans = bans;
	}
	
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	public int getTowersDestroyed() {
		return towersDestroyed;
	}
	public void setTowersDestroyed(int towersDestroyed) {
		this.towersDestroyed = towersDestroyed;
	}
	public int getBarracksDestroyed() {
		return barracksDestroyed;
	}
	public void setBarracksDestroyed(int barracksDestroyed) {
		this.barracksDestroyed = barracksDestroyed;
	}
	public int getRoshanKills() {
		return roshanKills;
	}
	public void setRoshanKills(int roshanKills) {
		this.roshanKills = roshanKills;
	}
	public int getAegis() {
		return aegis;
	}
	public void setAegis(int aegis) {
		this.aegis = aegis;
	}
	public Map<Hero, Player> getPicks() {
		return picks;
	}
	public void setPicks(Map<Hero, Player> picks) {
		this.picks = picks;
	}
	public List<Hero> getBans() {
		return bans;
	}
	public void setBans(List<Hero> bans) {
		this.bans = bans;
	}
	
}
