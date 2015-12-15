package data.interfaces;

import models.Game;
import models.Player;
import models.Team;
import models.Tournament;

public interface IRepository {
	
	public void save();
	public void load();
	
	public void insertGame(Game game);
	public void insertPlayer(Player player);
	public void insertTeam(Team team);
	public void insertTournament(Tournament tournament);
	
	public void removeGame();
	public void removePlayer();
	public void removeTeam();
	public void removeTournament();
	
	public void findGame();
	public void findPlayer();
	public void findTeam();
	public void findTournament();
	
	public void updateGame(Game game);
	public void updatePlayer(Player player);
	public void updateTeam(Team team);
	public void updateTournament(Tournament tournament);

}
