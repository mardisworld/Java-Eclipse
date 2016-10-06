package _06_inputOutput;

import java.util.Scanner;

public class _02_challenges {

	public static void main(String[] args) {
		// /*BRONZE:Create 2-3 questions you might see on a website using the Scanner. 
		String Address;
		String maidenName;
		String favoriteBand;
		
		Scanner inputInfo= new Scanner(System.in); //You only need this one time
		
		System.out.println("What is your street address?");
		Address=inputInfo.nextLine();
		System.out.println("You live at : " + Address);
		
		System.out.println("What is your mother's maiden name?");
		maidenName=inputInfo.nextLine();
		System.out.println("Your mother's maiden name is: " + maidenName);
		
		System.out.println("What is your favorite band?");
		favoriteBand=inputInfo.nextLine();
		System.out.println("I like " + favoriteBand + " too.");
		
		inputInfo.close(); //This closes the scanner to save memory
		

	}

}

//Bronze challenge done
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