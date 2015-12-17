package data.interfaces;

import exceptions.ItemNotFoundException;
import models.Game;
import models.Player;
import models.Team;

public interface IRepositoryController {
	
	public void insertGame(Game game);
	public void insertPlayer(Player player);
	public void insertTeam(Team team);
	
	public Game findGame(int id) throws ItemNotFoundException;
	public Player findPlayer(String name) throws ItemNotFoundException;
	public Team findTeam(String name) throws ItemNotFoundException;	

}
