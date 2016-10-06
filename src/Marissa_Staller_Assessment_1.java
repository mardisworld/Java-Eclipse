
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Marissa_Staller_Assessment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1 An easy one...
//Declare and initialize variables with three types: 
//An integer, a boolean, and a String
//Print each one to the console.
		
		int num=5;
		Boolean isSinging=false;
		String studentName="Samantha";
		
		System.out.println(studentName + " bought us " + num + " tickets to a Broadway musical, and when we go, isSinging will be set to true." );
		System.out.println("Right now, isSinging is equal to " + isSinging);
		
		
//2 Set a new password
//You know how you forget your password and have to change it sometimes?
//You know how you can't use the same password that you've used in the past?
//Well, write some code that tests that.
//Create two Strings, one for an old password and one for a new password. 
//Write code to test if the two passwords are equal. If the 
//two Strings are equal, print a message to the user that requires
//them to create a different password.
		
		String OldPassword="OldPassword";
		String NewPassword="OldPassword";
		
		if(OldPassword.equals(NewPassword)){
			System.out.println("Please choose a different password. You may not use a password that you have used before.");
		}
	
//3 Freezing Cold!!!!!
//You know how it's freezing cold in here on some days and warm on others. Let's play with that.
//Write some code that shows responses to 5-6 different room temperatures. Print one of the responses to the console.

		int temperature;
		Scanner inputInfo= new Scanner(System.in);
		System.out.println("What is the room temperature?");
		temperature=inputInfo.nextInt(); 
		if (temperature>=80){
			System.out.println("It is way too hot in here. Can we please put on the air conditioning?");
			}
			else if (temperature<79 && temperature>=69){
				System.out.println("This is a comortable temperature for me.");
			}
			else if (temperature<69 && temperature>=59){
				System.out.println("This is a little too cold for me");
			}
			else if (temperature<59 && temperature>=49){
				System.out.println("I am very uncomfortable. Please turn up the heat");
			}
			else {
				System.out.println("I'm leaving. This is ridiculous.");
			}


	
////4 Things we've learned! 	This is an array list, not an array
//// Create an array of things we've learned(HTML, CSS, JavaScript, etc.) Using only one syso, print all of those items
////to the console.
//	ArrayList<String> learning = new ArrayList<String>();
//	learning.addAll(Arrays.asList("HTML", "", "CSS", "JavaScript", "Java", "Bootstrap:"));
//	//System.out.println(learning);
	String[] languages={"HTML", "", "CSS", "JavaScript", "Java", "Bootstrap"};
		
	for (int i=0;i<languages.length;i++) {
		System.out.println(languages[i]);
	}

	//TODO create an array of strings and make a regular for loop to print each one individually
	String[] familyNames={"Terry", "Tina", "Marissa", "Mischa", "Gary"};
	for (int i=0; i<familyNames.length;i++) {
		System.out.println(familyNames[i]);
	}
	
	for (String familyName: familyNames) {
		System.out.println(familyName);
		
	}
	
	//TODO make a for in/for each (synonymous) to print each one individually 
	//Create an array of the best comedians of all time
			String[] starlets={"Alicia Vikander", "Jennifer Lawrence", "Chloe Moretz", "Margot Robbie"};
		
			for(String starlet:starlets){		//iterate over top or iterate through it
				System.out.println(starlet);
			}
			
		int ages[]={58, 63, 37, 3, 63};
		for (int i=0;i<ages.length; i++){
			System.out.println(ages[i]);
		}

}
}
