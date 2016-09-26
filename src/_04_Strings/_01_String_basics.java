package _04_Strings;

public class _01_String_basics {

	public static void main(String[] args) {
	
	
		
		String name="Marissa";
		String address="123 Awesome Ave";
		
		String toLowerCase=name.toLowerCase();
		
		System.out.println(toLowerCase);
		String allCaps=address.toUpperCase();
		System.out.println(allCaps);
		
		String firstName="Marissa";
		
		String firstTwo=firstName.substring(0,2);
		System.out.println(firstTwo);
		
		// Comparing Strings
		//String1==String2 would not work.
		//create a password string and check it
		//Google how to test string equality in Java
		
		String password="LetMeIn";
		if(password.equals("LetMeIn")){
			System.out.println("Log in complete");
		}
		else System.out.println("Something went wrong with log in.");
		
	}

}
