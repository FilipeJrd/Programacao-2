package models.aspects;
import models.*;
import data.*;
import data.interfaces.*;

public aspect ControllersAspect {
	declare parents: GameController implements IModelController<Game>;
	declare parents:  PlayerController implements IModelController<Player> ;
	declare parents:  TeamController implements IModelController<Team> ;
	declare parents:  TeamGameStatisticsController implements IModelController<TeamGameStatistics> ;
	declare parents:  TournamentController implements IModelController<Tournament> ;
}
