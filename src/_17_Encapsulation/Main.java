package _17_Encapsulation; //Encapsulation means access or access level 

public class Main {

	public static void main(String[] args) {
		ColtsPlayers aLuck=new ColtsPlayers();
		aLuck.name="Andrew Luck"; //public can access from outside the package if you import the package
		aLuck.age=27; ////protected can access in that package
	//	aLuck.number=38;//private can only access within the class, so you will get an error
		aLuck.setNumber(38);
		System.out.println(aLuck.getNumber());
		System.out.println(aLuck.getNumber());
		
		
		Patriots tBrady=new Patriots();
		tBrady.name="Tom Brady";
		tBrady.age=29;
		tBrady.setNumber(97); //private can only access within the class, so you need to call methods that were written in class file 
		tBrady.getNumber();   //to set and get numbers from within the main file
		System.out.println(tBrady.getNumber());
		

	}

}
