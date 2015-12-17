package data;

import org.bson.Document;
import data.interfaces.*;
import models.Game;

public class GameController{
	
	private static final String winnerKey = "winner";
	private static final String direKey = "dire";
	private static final String radiantKey = "radiant";
	private static final String radiantPicksKey = "radiantPicks";
	private static final String direPicksKey = "direPicks";
	private static final String idKey = "id";

	public Document convertToDocument(Game obj) {
		Game game = (Game) obj;
		Document doc =  new Document();
		doc.append(winnerKey, game.getWinner());
		doc.append(direKey, game.getDire().getName());
		doc.append(radiantKey, game.getRadiant().getName());
		doc.append(radiantPicksKey, game.getRadiantPicks());
		doc.append(direPicksKey, game.getDirePicks());
		doc.append(idKey,game.getId());
		
		return doc;
	}
	
	public Game convertToObject(Document doc, IRepositoryController teamRep) {		
			return new Game(
					doc.getInteger(idKey),
					doc.getString(winnerKey),
					teamRep.findTeam((String)doc.get(radiantKey)),
					teamRep.findTeam((String)doc.get(direKey)),
					doc.getString(radiantPicksKey),
					doc.getString(direPicksKey));
	}
	
}