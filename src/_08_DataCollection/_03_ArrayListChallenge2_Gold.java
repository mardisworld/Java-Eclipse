package _08_DataCollection;

import java.util.ArrayList;

public class _03_ArrayListChallenge2_Gold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int sum=0;

		
		for (int i=0;i<=10;i++) {	
			nums.add(i+1); //initializes the array with 1-10
			
			System.out.println(sum + " + "); //prints sum
			sum= sum+=i;
			System.out.println(i + " = ");
			System.out.println(" = " + sum + '\b');
			
			System.out.println('\n');
			
			//System.out.println(nums.get(i));
			//System.out.println(nums.add(i));  //   initializes nums(), so 0 1 2 3 4 5 6 7 8 9 10
			
			
			
		//	nums.get(i+1); //old sum
		//	System.out.println(nums.get(i+1)); //   prints nums(), so  1 2 3 4 5 6 7 8 9 10
		//	sum=sum+i;    	//newsum=sum+i
			//System.out.println( + " + " + i +);
	}
		
	
	

	}

}





//GOLD CHALLENGE: 
//	1) Add numbers in array 1 - 10.
//	2) Print out the array 
//	3) Print out the total of the array 
//	4) Print out the equation the for loop goes through to add each element together
//
//	i.e this should be your output:
//	0 + 1 = 1
//	1 + 2 = 3
//	3 + 3 = 6
//	6 + 4 = 10
//	10 + 5 = 15
//	15 + 6 = 21
//	21 + 7 = 28
//	28 + 8 = 36
//	36 + 9 = 45
//	45 + 10 = 55