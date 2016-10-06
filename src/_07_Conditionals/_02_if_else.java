package _07_Conditionals;

public class _02_if_else {

	public static void main(String[] args) {
		
		
		boolean meatloafForLunch=true;
		
		if (meatloafForLunch) {
			System.out.println("I am going to bring lunch from home today");
		}
		else {
			System.out.println("I enjoy a good free lunch.");
		}
		
		boolean pizzaForLunch=true;
		if (pizzaForLunch) {
			System.out.println("I love pizza for lunch!");
		}
		else {System.out.println("Oh, well. Maybe tomorrow.");
		}
		
		
		boolean isFreezingColdInHere=true;  //alternate way of System.out.println, creates a string variable then prints out after if else statement
		String message;
		
		if (isFreezingColdInHere) {
			message="Please turn on the heat. Please!";
		}
		else {message="It's not too bad";
		}
		System.out.println(message);
		
	}
}

//Bronze done
	
	
//	_02_if_else.java
//	//TODO: Study & Practice writing an if/else in Java.
//	
//	BRONZE: 
//		 Write 3-5 basic if/else statements as practice.
//	SILVER:
//	Write an if/else that checks if a password is correct. Use the scanner to accept the password from a user.
//	GOLD:
//		Use the scanner to help an employee calculate the amount they'll be earning. Here's how the console should read.
//			Enter your hourly pay: 
//			Enter the number of hours you worked:
//			You will earn $    on your check.



//not always going to see an else statement with an if statement
//the code will still run, it just won't have any output.