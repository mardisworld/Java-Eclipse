package _18_Encapsulation_Proper;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String args;//
		Player john=new Player("John", "gamer", 500, "super healthy");
		Player nick=new Player("Nick", "gamer", 550, "very healthy");
		Player marissa=new Player("Marissa", "not a gamer", 600, "healthy");
		
		
		//can set values using constructor rather than use ColtsPlayers aLuck=new ColtsPlayers();//
		john.getName();
		System.out.println(nick.getStatus());
		marissa.setNewPlayerName("Marissa Ann Staller");
		System.out.println(marissa.getName());

	}

}
