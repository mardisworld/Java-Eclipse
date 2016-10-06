package _08_DataCollection;

import java.util.ArrayList;
import java.util.Arrays;




public class _02_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Marissa");
		names.add("Mischa");
		names.add("Lauren");
		names.add("Matt");
		names.addAll(Arrays.asList("Blair", "Adrien", "Tom", "Dan", "Bonnie"));
//		names.addAll(Arrays.asList("Blair", "Adrien", "Tom", "Dan", "Bonnie")); This wouldn't work and we couldn't figure out why. 
		System.out.println(names);
		System.out.println(names.get(8));
		

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.addAll(Arrays.asList(5, 10, 15, 20));
		System.out.println(nums);
		System.out.println(nums.get(2));
		
		ArrayList<Double> doubles= new ArrayList<Double>();
		doubles.addAll(Arrays.asList(0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0));
		System.out.println(doubles);
		System.out.println(doubles.get(0));
		System.out.println(doubles.get(1));
		System.out.println(doubles.get(2));
		System.out.println(doubles.get(3));
		System.out.println(doubles.get(4));
		System.out.println(doubles.get(5));
		System.out.println(doubles.get(6));
		
	
	

	}

}
