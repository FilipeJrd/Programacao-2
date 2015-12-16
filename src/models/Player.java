package models;

public class Player {
	private String name;
	private String nickname;
	private String position;	

	public Player(String name, String nickname, String position) {
		this.name = name;
		this.nickname = nickname;
		this.position = position;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}	
	
	public String toString(){
		return "Nome: " + name + "\nNick: " + nickname + "\nPosi��o: " + position;
	}
	
}
