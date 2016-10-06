package _09_Loops;

public class _04_Nested_for_Loops {

	public static void main(String[] args) {
		
////		for (int i=0;i<=10;i++){
////			System.out.println(i);
////				for (int j=0;j<=10;j++){
////					System.out.println(j);
////					
////				}
////			
////		}
//		
//		//write your own nested for loop 1-5 for both
//		
//		for (int i=1; i<=5;i++){
//			System.out.println(i);
//			for (int j=1;j<=5;j++){
//				System.out.println(j);
//			}
//		}
//
//		
//		//TODO
//		//Create a for loop, make it start at 0 and go to 50
//		//if a the number is divisible by 3 and 5 print FIzz Buzz
//		//if the number is divisible by 3 print Fizz
//		//if the number is divisible by 5 print Buzz
//		//if the number is divisible by 3 or 5 continue
		
//		for (int m=0;m<=50;m++){
//			System.out.println(m);
//			if (m%3==0) {
//				System.out.println("Fizz");
//				if (m%5==0){
//					System.out.println(" Buzz");
//				}
//				else continue;	
//		}
//			else if (m%5==0){
//				System.out.println("Buzz");
//			}
//	}
		for (int m=0;m<=50;m++){
			if (m>0) {
				if ((m>0) && (m%3==0) && (m%5==0)){
					System.out.println("Fizz Buzz " + m);
				} else if (m%3==0){
					System.out.println("Fizz " + m);
				}	else if (m%5==0){
					System.out.println("Buzz " + m);
				}
				else {
					System.out.println(m);;
				}
			
			}
		}
	
		
		

}
}
