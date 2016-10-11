package _02_Hello_World;

import _17_Encapsulation.ColtsPlayers; //this is from Package 17 on Ecapsulation
import _18_Encapsulation_Proper.Player;

public class HelloWorld {
	
	public static void main(String[] args)
	{
		ColtsPlayers aConstonzo=new ColtsPlayers(); //this is from Package 17 on Ecapsulation
		aConstonzo.name="Anthony Costonzo"; //name is public
		aConstonzo.setNumber(74); //number is private so need to import class (line 3)
		aConstonzo.getNumber();		
		System.out.println(aConstonzo.getNumber());
		
		System.out.println("Hello World");
		System.out.print("Hello World");
		ColtsPlayers james = new ColtsPlayers("James", "Awesome", 600, "Very healthy");
		ColtsPlayers paul = new ColtsPlayers("Paul", "tougher than nails", 600, "very healthy"); 
	}
}


///
//>_02_HelloWorld
//_01_HelloWorld.java
//	-> TODO: Figure out how to do a Hello World in Eclipse using Java.
//	-> TODO: In that same file, figure out how to print Hello World to the console in a couple ways.
//				Example console output:   
//						#1 Hello World
//						#2 Hello ->This will use a different method than #1.
//						   World

//I asked if constructors were public in main files since they are public in class file. 



	
