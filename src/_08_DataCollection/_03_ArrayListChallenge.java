package _08_DataCollection;

import java.util.ArrayList;

public class _03_ArrayListChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();

		
		for (int i=0;i<=10;i++) {			//initializes the array with 1-11
			nums.add(i+1);
			System.out.println(nums.get(i));
		}
	
		
		System.out.println(nums.size());		//returns 11 (0-10 in array, 11 positions)
		//Bronze challenge done: after adding numbers 1 - 10 to an array list, print out the size of the list 
		
		System.out.println(nums.get(0));		//first element of array
		System.out.println(nums.get(nums.size()-1) + " last integer in array"); 	//returns last element of array, *size-1*
		//Bronze Challenge II done: add numbers 1 - 10 to an array list, Print out the first and last element in an arr
		
		
		int sum=0;
		for(int i2=0;i2<=10;i2++){ //see summary table in Java Fundamental Notes
			sum=sum+i2;

		}
		System.out.println(sum);
		//Silver Challenge done: add the numbers in the array list together and place that into a variable
		
		

}

}

	//_03_ArrayListChallenge.java
			//TODO: Leave this blank until after you have covered loops.
			//TODO: Using multiple loops, complete the following challenges: 
					/*
	
					// BRONZE CHALLENGE: After adding numbers 1 - 10 to an array list, print out the size of the list
					// BRONZE CHALLENGE II:  Add numbers 1 - 10 to an array list, Print out the first and last element in an array, using the ArrayList positions. 
					// SILVER CHALLENGE: Add the numbers in the array list together and place that into a variable
					/* 
					GOLD CHALLENGE: 
					1) Add numbers in array 1 - 10.
					2) Print out the array 
					3) Print out the total of the array 
					4) Print out the equation the for loop goes through to add each element together
			
					i.e this should be your output:
					0 + 1 = 1
					1 + 2 = 3
					3 + 3 = 6
					6 + 4 = 10
					10 + 5 = 15
					15 + 6 = 21
					21 + 7 = 28
					28 + 8 = 36
					36 + 9 = 45
					45 + 10 = 55
				*/