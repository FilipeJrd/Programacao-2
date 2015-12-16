package models.aspects;

import java.util.InputMismatchException;
import main.Main;

public aspect ErrorHandlingAspect {

	pointcut inputValidator(): execution(void Main.*());
		
	void around(): inputValidator() {
		try {
			proceed();
		} catch(InputMismatchException e) {
			System.out.println("Op��o inv�lida!");
			System.out.println();
			Main.main(new String[0]);
		}
	}
	
}
