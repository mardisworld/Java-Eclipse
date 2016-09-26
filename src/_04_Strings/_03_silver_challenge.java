package _04_Strings;

public class _03_silver_challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phrase="Soda Can";
		String firstWord=phrase.substring(0, 5);
		String secondWord=phrase.substring(5, 8);
		System.out.println(firstWord + secondWord);

	}

}




//SILVER:
//    Make a String containing the phrase "Soda Can". Then, do a search for subString method
//    and use it to split the phrase into separate words and store them in strings. Print the two strings.
//    The console should read: 
//    				Soda 
//    				Can 