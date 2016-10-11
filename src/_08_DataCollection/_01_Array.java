package _08_DataCollection;

public class _01_Array {

	public static void main(String[] args) {
		// TODO Array #1
		String[] names={"Paul", "Sydney", "John", "Amanda"};
	
		
		System.out.println(names[0]);
				//names[1], names[2], names[3]); //Remember, arrays start at zero (Can't do this in Java, need to use Loop)
		
		//Array #2
		String[] favoriteFoods={"sushi", "pizza", "steak", "fruit and nut salad"};
		System.out.println(favoriteFoods[0]);
		
		int[] ages={67,63,58,37,3};
		System.out.println(ages[3]);
		System.out.println(ages.length); //same as .size for an arrays list, but this is useful for a simple array
		
		//In Java and other type safe languages, Array elements all have to be the same type (all strings, or all int, or all double, etc.) 
		//Array indices are 0-based; that is, they start from 0 to arrayRefVar.length-1.
		//so double[10] will create an array of 10 doubles with indices from 0-9
	}
}

//_01_Arrays
//TODO: Learn to write Arrays.
//TODO: Create and print out 3 different arrays about any topic.