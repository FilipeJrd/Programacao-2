package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		readInput();
	}
	
	public static void readInput() {
		Scanner scan = new Scanner(System.in);
		int input;
		
		do {
			System.out.println();
			System.out.println("Menu:");
			System.out.println("1 - Torneios");
			System.out.println("2 - Times");
			System.out.println("3 - Inserir dados");
			System.out.println("9 - Sair");
			
			input = scan.nextInt();
			
			switch(input) {
				case 1: 
					System.out.println("Mostrar torneios");
					break;
				case 2:
					System.out.println("Mostrar Times");
					break;
				case 3:
					insertData();
					break;
				case 9:
					System.out.println("GGWP!");
					break;
				default:
					System.out.println("Opção inválida!");			
			}			
		
		} while (input != 9);	
		
		scan.close();
	}
	
	private static void insertData() {
		
	}
	

}
