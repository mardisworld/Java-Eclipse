package _09_Loops;

public class _02_for_loops {

	public static void main(String[] args) {
	//for(initialize lcv(loop control variable); relational test; modifier){}
	//for(variable;condition;modifier){}
		for (int i=0;i<=10;i++){
			System.out.println(i); //i is a convention that has been around forever in a for loop
		
		}
		
		//TODO create a for loop that increments by 5 and counts 0-100 by 5
		
		for (int i2=0;i2<=100;i2+=5){
			System.out.println(i2);
		}
		
		int sum=0;
		for(int i3=0;i3<=10;i3++){ //see summary table in Java Fundamental Notes
			sum=sum+i3;

		}
		System.out.println(sum);

		//simple interest over time - compound over 10 years
		double balance=5000;
		double rate=1.02; //2% interest
		for (int i4=0;i4<10;i4++){
			balance *= rate; //balance=balance*rate
		}
		
		System.out.println(balance);
		
		

}
	
}


//NOT DONE
////TODO: If you've never done for loops, you will need a lot of practice. We recommend you study these
//until you can do one without looking. Take a break, and then do some more.	    	
//
//// Bronze: 
//	Create a loop that counts from 0 to 10 and prints even for even numbers
//// Silver: 
//	Create a for loop that counts the amount of vowels in a string
//// Gold: 
//	Create a for loop that counts the amount of vowels in a string given by a user req. input.

