package _03_Numbers;

public class _03_demo_shopping_story {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A shopping story using some Primitive Types in Java.
		//Written by Joey Vinyard.

		
		    // A man goes shopping with the following balance:
		    double bankBalance = 200.00;
		    
		    //He buys this stuff.
		    double shoes = 99.99;
		    double shirt = 123.99;
		    double pants = 513.00;
		    
		    //The total bill is calculated:
		    double shoppingTotalBill = shoes + shirt + pants; //shoppingTotalBill=736.98
		    // What is our total?   //		
		    //Show how to interpolate here:
		    System.out.println("Shopping bill: " + shoppingTotalBill);
		    
		    //The bank balance is calculated.
		    double afterShoppingBalance = bankBalance - shoppingTotalBill; //-536.98
		    System.out.println("Bank balance: " + afterShoppingBalance); //-536.98

		    // stress the importance of changing this value    
		    bankBalance = afterShoppingBalance;

		    //It's payday 
		    bankBalance = bankBalance + 3000; //2463.02
		    //Birthday money from his grandma.
		    bankBalance += 50; //
		    System.out.println(bankBalance); //2513.02

		    // Things to take note, the value of bankBalance changing each step. 
		    // How does the computer work through that problem using the variable?

		    // A few weeks later: The wife says she's unhappy, and wants to split
		    bankBalance = bankBalance / 2;
		    System.out.println(bankBalance); //1256.51

		    // He's sad... until a generous stranger tell him that he wants to times whatever he has in his bank by 10!
		    bankBalance = bankBalance * 10; 
		    System.out.println(bankBalance); //12565.10

		    /* The ex-wife is back she wants not only divide the 6 vacation properties 3 but she convinces the judge to only
		    let him have the remainder*/
		    
		    int vacationCondos = 6; 
		    vacationCondos = vacationCondos % 3; 

		    System.out.println("Vacation condos:" + vacationCondos);
		    
		    //And so on and so on...
		    
		  }
		
}
