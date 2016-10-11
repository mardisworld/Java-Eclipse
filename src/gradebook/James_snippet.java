package gradebook;
//package assessment;
import java.io.BufferedReader; //What is Buffered reader? 
import java.io.IOException;		//What is IOException?		What is e.printStackTrace();?
import java.io.InputStreamReader; 	//What is try catch?
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
//this must be imported to utilize HashSets
//import java.util.HashSet;
//import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;


public class James_snippet {
	public static void main(String[] args) 
	{
		// TODO Done
				
		//HASHMAP - Makes String & Array of Integers paired - Key value pair.
		//example of combining collections
		
		String tempName = "";									//temp name
		List<Double> tempScores = new ArrayList<Double>();		//name of temporary array list
		Scanner userInput = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //used BufferedReader because they don't 
																						//like to mix doubles and strings

		Map<String, List<Double>> testScores = new HashMap<String, List<Double>>();	//HashMap called Map
				
		List<Double> fredScores = new ArrayList<Double>();
		fredScores.add(80.00);
		fredScores.add(60.00);
		testScores.put("Fred", fredScores);
		System.out.println("Press 1 to enter Name and Grades");
		int option = userInput.nextInt(); //lets you enter the int option
		
		//Option 1 Enter Values
		if(option == 1){
			double gradeBookEntry = 0;
			System.out.println("Enter Student Name:");
			try {
				tempName = reader.readLine();		//need another scanner to read name
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Please enter values. Type -1 to exit.");
			//while loop for entering data
			while(true){
				gradeBookEntry = userInput.nextDouble();	//user input double grades scores
				
				//Exit if -1
				if(gradeBookEntry == -1){
					testScores.put(tempName, tempScores);
					break;
				}else{
					tempScores.add(gradeBookEntry);
					
				}
			}
		}
		
		printScores("James", testScores);
	}
	
	//Map<String, List<Double>> testScores = new HashMap<String, List<Double>>();	//HashMap called Map
	
	public static void printScores(String studentName, Map<String, List<Double>> scoresMap) //method to help get scores 
	{
		
		List<Double> scores = scoresMap.get(studentName);
		System.out.println(studentName);
		for(double score : scores)
		{
			System.out.println(score);
		}
	}

}