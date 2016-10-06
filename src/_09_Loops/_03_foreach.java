package _09_Loops;

public class _03_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of the best comedians of all time
		String[] comedians={"George Carlin", "Louis CK", "Sarah Silverman", "Amy Schumer", "Chris Rock", "Dave Chappelle"};
	
		for(String comedian:comedians){
			System.out.println(comedian);
		}
		
		//greatest bosses of all time
		String[] greatestBossesOfAllTime={"Jenn Aikens", "Bob Alcorn", "Robin Holer", "Laurissa"};
		for (String boss: greatestBossesOfAllTime){
			System.out.println(boss);
		}
		
		String s="Hello";
			for(char ch: s.toCharArray()) {
				System.out.println(ch);  //makes it a char array, but the char array is not available outside of this block of code
	}

}
}
