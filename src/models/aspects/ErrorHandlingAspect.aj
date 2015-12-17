package models.aspects;

import java.util.InputMismatchException;
import exceptions.ItemNotFoundException;
import main.Main;

public aspect ErrorHandlingAspect {
	
	declare soft: ItemNotFoundException : withincode(* *.*(..));
	
	pointcut inputValidator(): execution(void Main.*());
		
	void around(): inputValidator() {
		try {
			proceed();
		} catch(InputMismatchException e) {
			System.out.println("Opcao invalida!");
			System.out.println();
			Main.main(new String[0]);
		}
	}
	
}
