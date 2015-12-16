package models;

import models.enums.Position;

public class Player {
	private String name;
	private String nickname;
	private Position position;
	private int kills;
	private int deaths;
	private int assists;
	private int age;
	private String country;
	

	public Player(String name, String nickname, Position position, int kills, int deaths, int assists, int age,
			String country) {
		this.name = name;
		this.nickname = nickname;
		this.position = position;
		this.kills = kills;
		this.deaths = deaths;
		this.assists = assists;
		this.age = age;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getKDA(){
		return (this.kills+this.assists)/this.deaths;
	}
	
	public String toString(){
		return "Name:" + name + "\nNick: " + nickname + "\nPosition: " + position + "\nKills: " + kills + "\nDeaths: " + deaths + "\nAssists: " + assists + "\nKDA: " + getKDA() + "\nAge: " + age + "\nCountry: " + country;
	}
	
}
