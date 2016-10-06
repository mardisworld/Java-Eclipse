package _06_inputOutput;

import java.util.Scanner;

public class _02_gold_challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inputInfo= new Scanner(System.in); //You only need this one time
		String DoorAnswer;
		boolean Door;

		System.out.println("Choose Your Own Adventure");
		System.out.println("You are a feminist surrogate fighting for the right to vote in the 1920s. You are planning on attending a protest rally.");
		System.out.println("You go to pick up your girlfriend at the house in which she and her husband live. Her husband is standing at the door and invites you in.");
		System.out.println("Do you go in the door to the house? Type 'yes' if you do or 'no' if you don't");
		DoorAnswer=inputInfo.nextLine();
		
		if(DoorAnswer.equals("yes")){
			Door=true;
		}
		else {Door=false;
		
	}
		if (Door) {
			System.out.println("You go into your friend's house with her husband, Harold.");
		}
		
		inputInfo.close(); //This closes the scanner to save memory
}
}
		//TODO Finish inputOutput Gold Challenge


//
//		if(DoorAnswer.equals("yes")){
//			Door=true;
//		}
//		else {Door=false;
//		
//	
//
//}
//
//	}
//

//06_02_challenges	
//TODO: 
	/*
	BRONZE:
		Create 2-3 questions you might see on a website using the Scanner.  
	SILVER:
		Create a story using the Scanner. 
		Do your best to add everything you've learned so far in the story. 
		Include Strings, booleans, integers, operators, etc. 
	GOLD:
		Make a choose your own adventure program that uses the Scanner. 
		Here is what you should use for the first question:
			You see a wide open door ahead. Do you go through it? 
			Enter yes or no: 
		
		Try to make about 10 different twists and turns in the story. 
	*/