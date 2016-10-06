package _06_inputOutput;


import java.util.Scanner;

public class _01_user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		String birthCity;
		String age;
		
	//Scanner is a Java class - used for User Input
		Scanner inputInfo= new Scanner(System.in); //You only need this one time
	
		//Set up a simple user input
		
		System.out.println("Please enter your name below: ");
		String userName=inputInfo.nextLine();
		//System.out.println("Hi, " + userName + " .");
		
		//Do the same thing for birth city and age
		
		System.out.println("Please enter your birth city below: ");
		birthCity=inputInfo.nextLine();
		//System.out.println("You were born in: " + birthCity);
		
		//age
		System.out.println("How old are you?");
		age=inputInfo.nextLine();
		//System.out.println("You are: " + age + " years old.");
		
		System.out.println("Hi, " + userName + "! You are " + age +" years old and you were born in " + birthCity + ".");
		
		inputInfo.close(); //This closes the scanner to save memory
		
		
		
//		//Soda Can from previous assignment (Karl's code)
//		
//		String myString="Soda Can";
//		Scanner fromStr= new Scanner(myString);
//		System.out.println("The words in the string are: ");
//		while (fromStr.hasNext()) {
//			System.out.println(fromStr.next());
//		}

	}

}

//TODO Look up how to input integers 