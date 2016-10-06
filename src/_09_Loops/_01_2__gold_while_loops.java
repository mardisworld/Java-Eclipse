package _09_Loops;

public class _01_2__gold_while_loops {

	public static void main(String[] args) {
		// For Loops
		String name = "Marissa Staller";
				for(int i = name.length() - 1; i >= 0;  i--){
				    System.out.print(name.charAt(i));
				System.out.println();
				}
				//or 
				String name2 = "Tina Holt";

						char[] chars = name2.toCharArray();
						for(int j = 0; j < chars.length/2; j++) {
						    char ch = chars[j];
						    chars[j] = chars[chars.length - j - 1];
						    chars[chars.length - j - 1] = ch;
						}
						System.out.println(new String(chars));
						
			//WHILE LOOPS GOLD CHALENGE not done
			String dad="Gary Staller";
			int count= (name.length() - 1);
			while (count<=name.length()-1){
				 System.out.print(name.charAt(count)); //this will print out 0-10
							count--;
					
						}
				
				
		

	

}
}



//GOLD: Gold done but need to go back to understand it
//	/Create a while loop that prints your name backwards.
//
//package _09_Loops;
//
//public class _01_1_silver_while_loops {
//
//	public static void main(String[] args) {
//		String name="Marissa Staller";
//		for(char ch: name.toCharArray()){
//			System.out.println(ch);
//
//	}
//
//}
//}
//


//
//String s="Hello";
//	for(char ch: s.toCharArray()) {
//		System.out.println(ch);  //makes it a char array, but the char array is not available outside of this block of code