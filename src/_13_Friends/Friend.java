package _13_Friends;

public class Friend {
	
	String firstName;
	String lastName;
	
	int birthYear;
	int hsGraduationYr;
	int collegeGraduationYr;
	String currentCity;
	String hometown;
	
	String hsName;
	String collegeName; 
	boolean isFemale;
	boolean isMarried;
	String politicalParty;
	boolean isOnline=true;
	boolean isFriend;
	int numYearsFriends;
	
	
	//Method to check isOnline
	public void onlineCheck() {
		if (isOnline) {
		System.out.println(firstName + " is online.");
	}
	else {
		System.out.println(firstName + " is not online.");
	}
	}	
		
	//Method to check isFriend
		public void isFriends() {
			if (isFriend) {
			System.out.println(firstName + "  is your friend.");
		}
		else {
			System.out.println(firstName + " is not your friend. Would you like to add them?");
		}
		}
			
		String response;
//	//Method to print years friends
		public void printYearsFriends() {
			switch(numYearsFriends) {
				case 0:
					response="You haven't beeen friends for long." ; //different syntactically
					break;
				case 5:
					response="You have been friends with " + firstName + " for five years. Happy Anniversary!";
					break;
				case 10:
					response="You have been friends with " + firstName + " for ten years. Happy Anniversary!";
					break;
				case 15:
					response="You have been friends with " + firstName + " for fifteen years. Happy Anniversary!";
					break;
				case 20:
					response="You have been friends with " + firstName + " for twenty years. Happy Anniversary!";
					break;
				default:
					response="Happy Facebooking.";
					break;
			}
			System.out.println(response);
		
			}

		
		
		
	public void getCollege() {
		System.out.println(firstName + " went to " + collegeName + ".");
	}
	

	//Method to check if person has left hometown, and a nested if else to print he/she based on isFemale
public void cityCheck(){
	if (currentCity!=hometown){
		System.out.println(firstName + " has moved away from home.");
	}
	else {System.out.println(firstName + " is living in their hometown.");
	
	
		if (isFemale){
			System.out.println("She enjoys living in " + hometown + ".");
		}
		else {System.out.println("He enjoys living in " + hometown +".");}
	}
		
	
}
	
}

