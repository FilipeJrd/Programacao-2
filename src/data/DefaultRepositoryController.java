package data;


import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

import data.interfaces.IRepository;
import models.Game;
import models.Player;
import models.Team;
import models.Tournament;

public class DefaultRepositoryController implements IRepository {
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertGame(Game game) {
		GameController gc = new GameController();
		
		Document doc = gc.convertToDocument(game);
		DBInstance.db.getCollection("games").insertOne(doc);
		
	}

	@Override
	public void insertPlayer(Player player) {
		PlayerController pc = new PlayerController();
		
		Document doc = pc.convertToDocument(player);
		DBInstance.db.getCollection("players").insertOne(doc);
	}

	@Override
	public void insertTeam(Team team) {
		TeamController tc = new TeamController();
		
		Document doc = tc.convertToDocument(team);
		DBInstance.db.getCollection("teams").insertOne(doc);
	}

	@Override
	public void insertTournament(Tournament tournament) {
		TournamentController tc = new TournamentController();
		
		Document doc = tc.convertToDocument(tournament);
		DBInstance.db.getCollection("tournaments").insertOne(doc);
	}

	@Override
	public void removeGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePlayer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTeam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTournament() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Game findGame(int id) {
		GameController controller = new GameController();
		return controller.convertToObject(DBInstance.db.getCollection("games").find(new Document("id",id)).first(), this);
		
	}

	@Override
	public Player findPlayer(String name) {
		PlayerController controller = new PlayerController();
		return controller.convertToObject(DBInstance.db.getCollection("players").find(new Document("name",name)).first(), this);
	}

	@Override
	public Team findTeam(String name) {
		TeamController controller = new TeamController();
		return controller.convertToObject(DBInstance.db.getCollection("teams").find(new Document("name",name)).first(), this);
	}

	@Override
	public Tournament findTournament(String name) {
		TournamentController controller = new TournamentController();
		return controller.convertToObject(DBInstance.db.getCollection("tournaments").find(new Document("name",name)).first(), this);
		
	}

	@Override
	public void updateGame(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePlayer(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTeam(Team team) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTournament(Tournament tournament) {
		// TODO Auto-generated method stub
		
	}

}
