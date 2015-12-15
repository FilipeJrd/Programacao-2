package data;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

import data.interfaces.IController;
import models.Game;

public class GameController implements IController<Game>{
	private MongoCollection<Document> col;
	private TeamGameStatisticsController tgsController;
	public GameController(){
		this.col = DBInstance.db.getCollection("games");
		tgsController = new TeamGameStatisticsController();
	}
	@Override
	public Document convertToDocument(Game obj) {
		Game game = (Game) obj;
		Document doc =  new Document();
		doc.append("winner", game.getWinner());
		doc.append("dire", game.getDire().getName());
		doc.append("radiant", game.getRadiant().getName());
		
		Document direStats = tgsController.convertToDocument(game.getDireStats());
		Document radiantStats = tgsController.convertToDocument(game.getRadiantStats());
		doc.append("direStats",direStats);
		doc.append("radiantStats",radiantStats);
		return doc;
	}
	@Override
	public Game convertToObject(Document doc) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
}
