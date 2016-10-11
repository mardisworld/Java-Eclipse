package _09_Loops;

//Create a for loop. Make it start at 0 and go to 50. 
//If the number is divisible by 3 and 5 print Fizz Buzz.
//If the number is divisible by 3 print Fizz
//If the number is divisible by 5 print Buzz


public class _05_fizz_buzz {
	public static void main(String[] args) {
		
		for (int i=0; i<=50;i++){
			if (i>0){
				if ((i>0) && (i%3==0) && (i%5==0)) {
					System.out.println("Fizz Buzz " + i);
				}
				else if (i%3==0) {
					System.out.println("Fizz " + i);
				}
				else if (i%5==0) {
					System.out.println("Buzz " + i );
				}
				else {
					System.out.println(i);
				}
				
		}

	}

}
}
