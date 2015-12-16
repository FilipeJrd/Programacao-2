package data;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import data.interfaces.IController;
import data.interfaces.IRepository;
import models.Player;
import models.Team;

public class TeamController implements IController<Team>{
	
	@Override
	public Document convertToDocument(Team obj) {
		Document doc = new Document();
		doc.append("country", obj.getCountry());
		doc.append("name", obj.getName());
		doc.append("players", obj.getPlayersName());
		return doc;
	}

	@Override
	public Team convertToObject(Document doc, IRepository rep) {
		List<Player> players =  new ArrayList<Player>();
		for (String player : (List<String>)doc.get("players")) {
			players.add(rep.findPlayer(player));
		}
		return new Team(doc.getString("name"), doc.getString("country"), players) ;
	}

}
