package _04_Strings;

public class _04_gold_challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phrase="sally sells seashells";
		

		int numS=0;
		System.out.println(phrase.length());
		//System.out.println(phrase.charAt(30));
		for(int i=0;i<phrase.length();i++){ //string length=31
			//System.out.println(spaces.charAt(i));
			if (phrase.charAt(i)=='s') {
				numS++;;
				}
			
		}
		System.out.println("There are " + numS + " s letters in your string.");

	}

}
//Gold Challenge done
//
//String s="Hello";
//for(char ch: s.toCharArray()) {
//	System.out.println(ch);  //makes it a char array, but the char array is not available outside of this block of code
//}



//    Create a string containing the phrase "sally sells seashells", and using a loop(Will learn later
//    so you might have to come back) count how many times the letter 's' appears in the phrase.
//*/