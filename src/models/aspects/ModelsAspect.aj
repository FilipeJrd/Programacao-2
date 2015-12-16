package models.aspects;
import models.*;
public aspect ModelsAspect {

	public String Game.toString(){
		return "Match ID: " + this.getId() + "\nVencedor: " + this.getWinner() + "\n\nRadiant:\n" + this.getRadiant() + "\nPicks: " +this.getRadiantPicks() + "\n\nDire:\n" + this.getDire() + "\nPicks: " + this.getDirePicks();
	}
	public String Player.toString(){
		return "Nome: " + this.getName() + "\nNick: " + this.getNickname() + "\nPosi��o: " + this.getPosition();
	}
	public String Team.toString(){
		String linebreak = "\n";
		StringBuilder builder = new StringBuilder();
		builder.append("Time: " + this.getName() + linebreak);
		builder.append("Pa�s: " + this.getCountry() + linebreak);
		for (int i = 0; i < this.getPlayers().size(); ++i) {
			builder.append("\nJogador " + (i+1) + linebreak + this.getPlayers().get(i).toString() + linebreak);
		}
		
		return builder.toString();
	}
	public String TeamGameStatistics.toString(){
		return "Gold: " + this.getGold() + "\nKills: " + this.getKills() + "\nTowers Destroyed: " + this.getTowersDestroyed() + "\nBarracks Destroyed" + this.getBarracksDestroyed() + "\nRoshan Kills: "+ this.getRoshanKills() + "\nAegis Taken: " + this.getAegis() + "\nPicks: " + this.getPicks() + "\nBans: "+ this.getBans(); 
	}
	public String Tournament.toString(){
		return "Name of Tournament: " + this.getName() + "\nTeams: " + this.getTeams() + "\nGames: " + this.getGames(); 
	}
}
