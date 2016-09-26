package _04_Strings;

public class _05_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char uniChar='\u00A5';
		System.out.println(uniChar);
		
		char uniChar2='\u02AC';
		System.out.println(uniChar2);
		
		char[] charArray={'z','y','x','w','v'};
		System.out.println(charArray);
		
		char[] charArray2={'a','b','c','d','e'};
		System.out.println(charArray);
		
		String charArry="abcde";
		
		String charArry2="abcde";
		System.out.println(charArry2);
		
		System.out.println("Hello \"Tough Guy\", How are you?");
		System.out.println("James Paul");
		System.out.println("James \nPaul");
		System.out.println("James");
		System.out.println("c:\\desktop\\user\\texthello.txt"); //two backslashes allow it to see the file
		
		System.out.println("Hey\t There");
		System.out.println("That's cool.\b Why?");
	}

}

//
////TODO look up unicode number that works  U+02AC
//
////TODO 
//\t	Inserts a tab in the text at this point.
//\b	Inserts a backspace in the text at this point.
//\n	Inserts a newline in the text at this point.
//\r	Inserts a carriage return in the text at this point.
//\f	Inserts a form feed in the text at this point.
//\'	Inserts a single quote character in the text at this point.
//\"	Inserts a double quote character in the text at this point.
//\\	Inserts a backslash character in the text at this point.