package data;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import data.interfaces.IController;
import data.interfaces.IRepository;
import models.Game;
import models.Team;
import models.Tournament;

public class TournamentController implements IController<Tournament>{

	@Override
	public Document convertToDocument(Tournament obj) {
		Document doc = new Document();
		doc.append("name", obj.getName());
		doc.append("teams", obj.getTeamsName());
		doc.append("teams", obj.getGamesId());
		return doc;
	}

	@Override
	public Tournament convertToObject(Document doc, IRepository rep) {
		List<Team> t =  new ArrayList<Team>();
		for (String name : (List<String>)doc.get("teams")) {
			t.add(rep.findTeam(name));
		}
		List<Game> g =  new ArrayList<Game>();
		for (int id : (List<Integer>)doc.get("games")) {
			g.add(rep.findGame(id));
		}
		return new Tournament(doc.getString("name"),t,g);
	}

}
