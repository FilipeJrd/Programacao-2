package data;

import org.bson.Document;
import data.interfaces.*;
import models.Player;

public class PlayerController{
	
	@Override
	public Document convertToDocument(Player obj) {
		Player stats = (Player) obj;
		Document doc = new Document();

		doc.append("name", stats.getName());
		doc.append("nickname", stats.getNickname());
		doc.append("position", stats.getPosition().toString());

		return doc;
	}

	@Override
	public Player convertToObject(Document doc, IRepositoryController rep) {
		Player player = new Player(doc.getString("name"),
				doc.getString("nickname"),
				doc.getString("position"));
		
		return player;
	}
}
