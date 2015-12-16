package data;

import org.bson.Document;

import data.interfaces.IController;
import data.interfaces.IRepository;
import models.TeamGameStatistics;

public class TeamGameStatisticsController implements IController<TeamGameStatistics>{
	
	@Override
	public Document convertToDocument(TeamGameStatistics obj) {
		TeamGameStatistics stats = (TeamGameStatistics) obj;
		Document doc = new Document();
		
		doc.append("aegis", stats.getAegis());
		doc.append("bans", stats.getBans());
		doc.append("barracks",stats.getBarracksDestroyed());
		doc.append("gold", stats.getGold());
		doc.append("kills", stats.getKills());
		doc.append("picks", stats.getPicks());
		doc.append("roshan", stats.getRoshanKills());
		doc.append("towers", stats.getTowersDestroyed());
		
		return doc;
	}

	@Override
	public TeamGameStatistics convertToObject(Document doc, IRepository rep) {
		return new TeamGameStatistics(
				(int)doc.get("gold"),
				(int)doc.get("kills"),
				(int)doc.get("towers"),
				(int)doc.get("barracks"),
				(int)doc.get("roshan"),
				(int)doc.get("aegis"),
				(String)doc.get("picks"),
			    (String)doc.get("bans"));
	}

}
