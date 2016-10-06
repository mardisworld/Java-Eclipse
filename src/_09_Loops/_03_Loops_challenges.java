package _09_Loops;

public class _03_Loops_challenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String spaces="There are spaces in this string";
		int numSpaces=0;
		//System.out.println(spaces.length());
		//System.out.println(spaces.charAt(30));
		for(int i=0;i<spaces.length();i++){ //string length=31
			//System.out.println(spaces.charAt(i));
			if (spaces.charAt(i)!=' ') {
					continue;
				}
			else {numSpaces++;
				}
		}
		System.out.println("There are " + numSpaces + " spaces in your string.");

}

}