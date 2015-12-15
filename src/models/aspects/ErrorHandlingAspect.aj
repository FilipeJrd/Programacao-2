package models.aspects;

import main.Main;

public aspect ErrorHandlingAspect {

	pointcut inputValidator(): execution(void Main.readInput(..));
	
	pointcut inputValidator2(): execution(int java.util.Scanner.nextInt());
	
	void around(): inputValidator() {
		try {
			proceed();
		} catch(Exception e) {
			System.out.println(e);
			Main.readInput();
		}
	}
	
}
