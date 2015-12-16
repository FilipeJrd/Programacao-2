package data.interfaces;

import models.Game;
import models.Player;
import models.Team;
import models.Tournament;

public interface IRepositoryController {
	
	public void insertGame(Game game);
	public void insertPlayer(Player player);
	public void insertTeam(Team team);
	public void insertTournament(Tournament tournament);
	
	public void removeGame();
	public void removePlayer();
	public void removeTeam();
	public void removeTournament();
	
	public Game findGame(int id);
	public Player findPlayer(String name);
	public Team findTeam(String name);
	public Tournament findTournament(String name);
	
	public void updateGame(Game game);
	public void updatePlayer(Player player);
	public void updateTeam(Team team);
	public void updateTournament(Tournament tournament);

}
