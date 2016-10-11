package gradebook;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class gradebook {					//original gradebook only creates one array of grades
											//
		
	public static void main(String[] args) {
		//Create variables
		int option=0; //option that user has selected
		System.out.println("Welcome to the Gradebook.");
		Scanner userIn=new Scanner(System.in);
		ArrayList<Double> gradeBook=new ArrayList<Double>();
		
		//Menu Loop
		while (option!=6){ // will keep running unless user enters 6
			//Print Main Menu
		System.out.println("_____________________________");
		System.out.println("Please select an option from the list below:");
		System.out.println("1) Enter Values to Gradebook");
		System.out.println("2) Modify an Entry");
		System.out.println("3) Delete an entry");
		System.out.println("4) View Stats");
		System.out.println("5) View All Entries");
		System.out.println("Exit Program");
		//Use scanner for user to select option
		option=userIn.nextInt(); 	//At this point, the loop will run again and print out the menu, unless user selects 6
		
		//Option 1 Enter Values
		if (option==1){
		
			double gradeBookEntry=0;
			System.out.println("Please enter gradebook values. Type-1 to exit. ");
			//Need another while loop for entering data
			while (true){
				gradeBookEntry=userIn.nextDouble();
				
					//Exit if -1
					if (gradeBookEntry==-1) {
						break;
					}
					else {gradeBook.add(gradeBookEntry);
					}
			}
		
		}
		
		//Option 2 Modify Entry
		//grab student name, create function
		//while loop 
		//Modify, Add, End
		if (option==2){
			System.out.println("Which index would you like to modify? ");
			int index=userIn.nextInt();
			System.out.println("Replace Index " + index + " Value " + gradeBook.get(index) + " with what? " ) ;
			gradeBook.set(index, userIn.nextDouble());
			System.out.println("Successfully Set");
		
		}
		
		//Option 3 Delete an Entry now needs to take in a name, display scores, 
		if (option==3){
			System.out.println("Which index would you like to delete? ");
			int index=userIn.nextInt();
			gradeBook.remove(index);
			System.out.println("Successfully removed.");
		
		}
		
		//Option 4 View stats
		if (option==4) {
			//Calculate Average
			double total=0;
			for (int i=0; i<gradeBook.size(); i++){
				total+=gradeBook.get(i);
			}
			double average=total/gradeBook.size();
			
			//Sort gradebook
			ArrayList<Double> copiedGradeBook= new ArrayList<Double>(); //don't want to mess with copy of original gradebook
			copiedGradeBook.addAll(gradeBook);
			Collections.sort(copiedGradeBook);
			//extract max and min
			double max=copiedGradeBook.get(gradeBook.size()-1); //Remember arrays are zero based so need a -1 in there to subtract
			double min=copiedGradeBook.get(0);
			
			double median=0;
			//Find median if number of grades is odd it will be the middle number, if it is even it is the average of the middle two
			if (copiedGradeBook.size()%2==1) {			//this means that the gradebook number of grades is odd bc remainder =1
				median=copiedGradeBook.get(copiedGradeBook.size()/2);
				}
			else { //this means that the number of entries is even
				int secIndex=copiedGradeBook.size()/2;					
				double firstMedian=copiedGradeBook.get(secIndex-1);
				double secMedian=copiedGradeBook.get(secIndex);
				median=(firstMedian+secMedian/2.0);
				}
			
			System.out.println("Gradebook Stats: " );
			System.out.println("Total entries: " + gradeBook.size());
			System.out.println("Maximum value: " + max);
			System.out.println("Minimum value: " + min);
			System.out.println("Average value: " + average);
			System.out.println("Median value: " + median);
			
			}
		
		
		//Option 5 View elements
		if (option==5){
			//Could do System.out.println(gradeBook); if you wanted to, but it won't look very nice
			System.out.println("Index| Value");
			for (int i=0; i < gradeBook.size(); i++){
				//Create rows
				System.out.println("| " + i + " | " + gradeBook.get(i));
			
			}
		}
		
		

}

}
	
}