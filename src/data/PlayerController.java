package data;

import org.bson.Document;

import data.interfaces.IController;
import data.interfaces.IRepository;
import models.Player;
import models.TeamGameStatistics ;
import models.enums.Position;

public class PlayerController implements IController<Player> {
	@Override
	public Document convertToDocument(Player obj) {
		Player stats = (Player) obj;
		Document doc = new Document();
		
		doc.append("age", stats.getAge());

		doc.append("assists", stats.getAssists());

		doc.append("country", stats.getCountry());

		doc.append("deaths", stats.getDeaths());

		doc.append("kills", stats.getKills());

		doc.append("name", stats.getName());

		doc.append("nickname", stats.getNickname());

		doc.append("position", stats.getPosition().toString());

		return doc;
	}

	@Override
	public Player convertToObject(Document doc, IRepository rep) {
		Player player = new Player((String)doc.get("name"),
				(String)doc.get("nickname"),
				Position.valueOf((String)doc.get("position")),
				(int)doc.get("kills"),
				(int)doc.get("deaths"),
				(int)doc.get("assists"),
				(int)doc.get("age"),
				(String)doc.get("country"));
		return player;
	}
}
