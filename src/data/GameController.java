package data;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

import data.interfaces.IController;
import data.interfaces.IRepository;
import models.Game;
import models.TeamGameStatistics;

public class GameController implements IController<Game>{
	private MongoCollection<Document> col;
	private TeamGameStatisticsController tgsController;
	private IRepository teamRep;
	
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
		doc.append("id",game.getId());
		Document direStats = tgsController.convertToDocument(game.getDireStats());
		Document radiantStats = tgsController.convertToDocument(game.getRadiantStats());
		doc.append("direStats",direStats);
		doc.append("radiantStats",radiantStats);
		
		return doc;
	}
	@Override
	public Game convertToObject(Document doc, IRepository teamRep) {
		
		return new Game((String)doc.get("winner"),
				teamRep.findTeam((String)doc.get("radiant")),
				teamRep.findTeam((String)doc.get("dire")),
				tgsController.convertToObject((Document)doc.get("radiantStats"), teamRep),
				tgsController.convertToObject((Document)doc.get("direStats"), teamRep),
				(int)doc.get("id"));
	}
	

	
	
}
