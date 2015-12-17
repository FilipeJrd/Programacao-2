package models.aspects;
import models.*;
public aspect ModelsAspect {

	public String Game.toString(){
		return "Match ID: " + this.getId() + "\nVencedor: " + this.getWinner() + "\n\nRadiant:\n" + this.getRadiant() + "\nPicks: " +this.getRadiantPicks() + "\n\nDire:\n" + this.getDire() + "\nPicks: " + this.getDirePicks();
	}
	
	public String Player.toString(){
		return "Nome: " + this.getName() + "\nNick: " + this.getNickname() + "\nPosicao: " + this.getPosition();
	}
	
	public String Team.toString(){
		String linebreak = "\n";
		StringBuilder builder = new StringBuilder();
		builder.append("Time: " + this.getName() + linebreak);
		builder.append("Pais: " + this.getCountry() + linebreak);
		for (int i = 0; i < this.getPlayers().size(); ++i) {
			builder.append("\nJogador " + (i+1) + linebreak + this.getPlayers().get(i).toString() + linebreak);
		}
		
		return builder.toString();
	}
	
}
