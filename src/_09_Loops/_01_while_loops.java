package _09_Loops;

public class _01_while_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		while (count<=10){
			System.out.println(count); //this will print out 0-10
			count++;
	
		}
		
		while (count<=10){
		//	System.out.println(count);
			count++;
		}
		System.out.println(count); //this will print out 11
		
		int count2=10;
		while (count2>=0){ 				//BRONZE:Use a while loop to count backwards
			System.out.println(count2); //this will print 10-0 
			count2--;
			
		}

		int count3=100;
		while (count3 >=0){
			System.out.println(count3); //could also use mod% to check for divisible by 5 or another number
			count3-=5;
		}
		
		}
		


}

//_01_while.java
////TODO: Study while loops and practice. Try printing 1-10. Do a few examples until
//you can memorize the pattern.
//


//GOLD:
//	/Create a while loop that prints your name backwards.