package models.aspects;
import data.DefaultRepositoryController;

public aspect BDLogAspect {
	pointcut insertOnBD() : execution(void DefaultRepositoryController.insert*(..));
	pointcut returnFromDB(): call(* DefaultRepositoryController.find*(..));
	before(): insertOnBD(){
		System.out.println("Cadastrando dado....");
	}
	after(): insertOnBD(){
		System.out.println("Dado cadastrado!");
	}
	after() returning: returnFromDB(){
		System.out.println("Query realizada!\n");
	}
}
