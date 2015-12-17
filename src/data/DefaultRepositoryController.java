package data;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import data.interfaces.IRepositoryController;
import exceptions.ItemNotFoundException;
import models.Game;
import models.Player;
import models.Team;

public class DefaultRepositoryController implements IRepositoryController {
	
	private MongoDatabase db;
	private static DefaultRepositoryController instance;
	
	@SuppressWarnings("resource")
	private DefaultRepositoryController() {
		this.db =  new MongoClient(new MongoClientURI("mongodb://adm:123456@ds056998.mongolab.com:56998/prog2")).getDatabase("prog2");
	}
	
	public static DefaultRepositoryController getInstance() {
		if (instance == null)
			instance = new DefaultRepositoryController();
		
		return instance;
	}

	@Override
	public void insertGame(Game game) {
		GameController gc = new GameController();
		
		Document doc = gc.convertToDocument(game);
		this.db.getCollection("games").insertOne(doc);		
	}

	@Override
	public void insertPlayer(Player player) {
		PlayerController pc = new PlayerController();
		
		Document doc = pc.convertToDocument(player);
		this.db.getCollection("players").insertOne(doc);
	}

	@Override
	public void insertTeam(Team team) {
		TeamController tc = new TeamController();
		
		Document doc = tc.convertToDocument(team);
		this.db.getCollection("teams").insertOne(doc);
	}

	@Override
	public Game findGame(int id) throws ItemNotFoundException {
		GameController controller = new GameController();
		Document gameDocument = this.db.getCollection("games").find(new Document("id",id)).first();
		if (gameDocument == null)
			throw new ItemNotFoundException("Não foi possível encontrar a partida");
		
		return controller.convertToObject(gameDocument, this);
	}

	@Override
	public Player findPlayer(String name) throws ItemNotFoundException {
		PlayerController controller = new PlayerController();
		Document playerDocument = this.db.getCollection("players").find(new Document("name",name)).first();
		if (playerDocument == null)
			throw new ItemNotFoundException("Não foi possível encontrar o jogador");
		
		return controller.convertToObject(playerDocument, this);
	}

	@Override
	public Team findTeam(String name) throws ItemNotFoundException {
		TeamController controller = new TeamController();
		Document teamDocument = this.db.getCollection("teams").find(new Document("name",name)).first();
		if (teamDocument == null)
			throw new ItemNotFoundException("Não foi possível encontrar o time");
		
		return controller.convertToObject(teamDocument, this);
	}	

}
