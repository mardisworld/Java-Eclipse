package gradebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Summer_snippet {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //create variables
        int option = 0;														//option is the user input 1-6 to tell the gradebook what to do
        String tempName = "";												//String tempName is for use in the loop
        
        System.out.println("Welcome to The Gradebook");
        Scanner userIn = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<Double> gradeBook = new ArrayList<Double>();				//gradebook is an array list of doubles
        List<Double> tempScores = new ArrayList<Double>();					//tempScores is an array list of doubles
        
        Map<String, List<Double>> studentScores = new HashMap<String, List<Double>>();			//testScores is a HashMap with a String and a list of doubles
        
        while(option!=6){
            
            //print main menu
            System.out.println("---------------------------------------------");
            System.out.println("Please select an option from the list below: ");
            System.out.println("1) Enter Name & Scores");
            System.out.println("2) Modify Entry ");
            System.out.println("3) Delete Entry");
            System.out.println("4) View Stats ");
            System.out.println("5) View All Entries");
            System.out.println("6) Exit Program");
            
            //allow user to choose their option #
            option = userIn.nextInt();
            
            //option one: enter names and values
            if (option == 1) {
                double gradeBookEntry = 0;
                System.out.println("Enter Student Name");
                try {
                    tempName = reader.readLine();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            
            System.out.println("Enter Grade Values. Enter -1 to Finish.");
            
            while (gradeBookEntry != -1){		//seems like this is setting last array double to -1. You can see this when you do option 5, view scores. 
            	
            	gradeBookEntry=userIn.nextDouble();
            	if (gradeBookEntry != -1){
            	tempScores.add(gradeBookEntry);
            	studentScores.put(tempName, tempScores);
            	}
            }
            }
            
            
//          while (true) {									//infinite loop for option 1
//          gradeBookEntry = userIn.nextDouble();		//assigns user input into gradeBookEntry unless they input -1
//          
//          if(gradeBookEntry == -1) {					//-1 will break the loop
//              break;
//          } else {
//              tempScores.add(gradeBookEntry);			//else it will add gradeBookEntry into tempScores array
//              studentScores.put(tempName, tempScores);	//this puts tempName and test scores into HashMap 
//              } 
//          }
//      } 
            
            
    		//Option 2 Modify Entry
    		//grab student name, create function
    		//while loop 
    		//Modify, Add, End
    		if (option==2){
    			System.out.println("Which index would you like to modify? ");
    			int index=userIn.nextInt();
    			System.out.println("Replace Index " + index + " Value " + tempScores.get(index) + " with what? " ) ;
    			tempScores.set(index, userIn.nextDouble());
    			System.out.println("Successfully Set");
    		
    		}
    		
    		//Option 3 Delete an Entry now needs to take in a name, display scores, 
    		if (option==3){
    			System.out.println("Which index would you like to delete? ");
    			int index=userIn.nextInt();
    			tempScores.remove(index);
    			System.out.println("Successfully removed.");
    		
    		}
    		
    		//Option 4 View stats
    		if (option==4) {
    			//Calculate Average
    			double total=0;
    			for (int i=0; i<tempScores.size(); i++){
    				total+=tempScores.get(i);
    			}
    			double average=total/tempScores.size();
    			
    			//Sort gradebook
    			ArrayList<Double> copiedTempScores= new ArrayList<Double>(); //don't want to mess with copy of original gradebook
    			copiedTempScores.addAll(tempScores);
    			Collections.sort(copiedTempScores);
    			//extract max and min
    			double max=copiedTempScores.get(tempScores.size()-1); //Remember arrays are zero based so need a -1 in there to subtract
    			double min=copiedTempScores.get(0);
    			
    			double median=0;
    			//Find median if number of grades is odd it will be the middle number, if it is even it is the average of the middle two
    			if (copiedTempScores.size()%2==1) {			//this means that the gradebook number of grades is odd bc remainder =1
    				median=copiedTempScores.get(copiedTempScores.size()/2);
    				}
    			else { //this means that the number of entries is even
    				int secIndex=copiedTempScores.size()/2;					
    				double firstMedian=copiedTempScores.get(secIndex-1);
    				double secMedian=copiedTempScores.get(secIndex);
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
    			//Could do System.out.println(tempScores); if you wanted to, but it won't look very nice
    			System.out.println("Index| Value");
    			for (int i=0; i < (tempScores.size()-1); i++){
    				//Create rows
    				System.out.println("| " + i + " | " + tempScores.get(i));
    			
    			}
    		}
    		
           
            
               printScores(tempName, studentScores);
        }
    }
        public static void printScores(String studentName, Map<String, List<Double>> scoresMap)
        
        {
            List<Double> scores = scoresMap.get(studentName);
            System.out.println(studentName);
            for(double score : scores)
            {
                System.out.println(score);
            }
            
    }
}