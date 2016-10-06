package _03_Numbers;

public class _02_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(13%4); //1
		System.out.println(16%4); //0
		int ten=5+5; //10
		int eleven=6+5; //11
		System.out.println(ten); //10
		System.out.println(eleven); //11
		int modulusThirteenAndFour=13%4;
		System.out.println(modulusThirteenAndFour); //1
		ten=ten+1; 
		System.out.println(ten); //will print 11
		ten+=1;
		System.out.println(ten); //will print 12
		ten-=1;
		System.out.println(ten); //will print 11
		
		double stockPrice;
		stockPrice=3.75;
		stockPrice*=1.3;
		System.out.println(stockPrice);
		int aNumberThatsGoingToChange=50;
		System.out.println(aNumberThatsGoingToChange); //will print 50
		int incrementNumber=aNumberThatsGoingToChange++;
		System.out.println(aNumberThatsGoingToChange); //will print 51
		
	}

}


//
//_02_operators.java
//-> TODO: Show examples of various math operators(hint, we studied these last week).
//-> TODO: Include examples of shorthand operators.