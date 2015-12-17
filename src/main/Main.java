package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import data.DefaultRepositoryController;
import exceptions.ItemNotFoundException;
import models.Game;
import models.Player;
import models.Team;

public class Main {
	
	private static Scanner intScanner;
	private static Scanner stringScanner;
	private static int input;
	private static DefaultRepositoryController repController;

	public static void main(String[] args) {
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		
		intScanner = new Scanner(System.in);
		stringScanner = new Scanner(System.in);
		repController = DefaultRepositoryController.getInstance();
		readInput();
	}
	
	public static void readInput() {		
		do {
			System.out.println("Menu:");
			System.out.println("1 - Pesquisar");
			System.out.println("2 - Inserir dados");
			System.out.println("9 - Sair");
			
			input = intScanner.nextInt();
			
			switch(input) {
				case 1: 
					searchData();
					break;
				case 2:
					insertData();
					break;
				case 9:
					System.out.println("GGWP!");
					break;
				default:
					System.out.println("Opcao invalida!");			
			}			
		
		} while (input != 9);	
		
		intScanner.close();
		stringScanner.close();
	}
	
	private static void searchData() {
		System.out.println("1 - Pesquisar Time");
		System.out.println("2 - Pesquisar Jogador");
		System.out.println("3 - Pesquisar Partida");
		System.out.println("9 - Sair");
		
		input = intScanner.nextInt();
		
		switch(input) {
			case 1:
				searchTeam();
				break;
			case 2:
				searchPlayer();
				break;
			case 3:
				searchGame();
				break;
		}		
	}
	
	private static void searchTeam() {
		System.out.println("Por favor, digite o nome do time");
		String teamName = stringScanner.nextLine();
		
		Team team = repController.findTeam(teamName);
		System.out.println(team.toString());
	}
	
	private static void searchPlayer() {
		System.out.println("Por favor, digite o nome do jogador");
		String playerName = stringScanner.nextLine();
		
		Player player = repController.findPlayer(playerName);
		System.out.println(player.toString());
	}
	
	private static void searchGame() {
		System.out.println("Por favor, digite o id da partida");
		int matchId = intScanner.nextInt();
		
		Game game = repController.findGame(matchId);
		System.out.println(game.toString());
	}
	
	private static void insertData() {
		System.out.println("1 - Inserir Jogo");
		System.out.println("2 - Inserir Time");
		System.out.println("3 - Inserir Jogador");
		System.out.println("4 - Voltar");
		System.out.println("9 - Sair");
				
		input = intScanner.nextInt();
		
		switch(input) {
			case 1:
				insertGame();
				break;
			case 2:
				insertTeam();
				break;
			case 3:
				insertPlayer();
				break;
			case 4:
				readInput();
				break;
		}
	}
	
	private static void insertGame() {
		System.out.println("Por favor, informar as informacoes da partida.");
		
		System.out.println("Id:");
		int id = intScanner.nextInt();
		
		System.out.println("Vencedor: ");
		String winner = stringScanner.nextLine();
		
		System.out.println("Time Radiant: ");
		String radiant = stringScanner.nextLine();
		
		System.out.println("Time Dire: ");
		String dire = stringScanner.nextLine();
		
		System.out.println("Picks Radiant: ");
		String radiantPicks = stringScanner.nextLine();
		
		System.out.println("Picks Dire: ");
		String direPicks = stringScanner.nextLine();
		
		Team radiantTeam = repController.findTeam(radiant);
		Team direTeam = repController.findTeam(dire);
		
		Game game = new Game(id, winner, radiantTeam, direTeam, radiantPicks, direPicks);
		repController.insertGame(game);
	}
	
	private static void insertTeam() {
		System.out.println("Por favor, informar as informacoes do time.");
		
		System.out.println("Nome: ");
		String name = stringScanner.nextLine();
		
		System.out.println("Pais: ");
		String country = stringScanner.nextLine();
		
		ArrayList<Player> players = new ArrayList<Player>();
		String player;
		
		for (int i = 0; i < 5; ++i) {
			System.out.println("Jogador " + (i+1) + ": ");
			player = stringScanner.nextLine();
			players.add(repController.findPlayer(player));
		}
		
		Team team = new Team(name, country, players);
		
		repController.insertTeam(team);
	}
	
	private static void insertPlayer() {
		System.out.println("Por favor, informar as informacoes do jogador.");
		
		System.out.println("Nome: ");
		String name = stringScanner.nextLine();
		
		System.out.println("Nickname: ");
		String nickname = stringScanner.nextLine();
		
		System.out.println("Posicao: ");
		String position = stringScanner.nextLine();
		
		Player player = new Player(name, nickname, position);
			
		repController.insertPlayer(player);				 
	}
	
}