package gradebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
//this must be imported to utilize HashSets
//import java.util.HashSet;
//import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Hash_map {
	public static void main(String[] args) 
	{
		// TODO Done
				
		//HASHMAP - Makes String & doubles paired - Key value pair.
		
		//example of combining collections
		Map<String, List<Double>> testScores = new HashMap<String, List<Double>>();
		
		List<Double> joeScores = new ArrayList<Double>();
		joeScores.add(80.0);
		joeScores.add(60.0);
		joeScores.add(97.0);
		joeScores.add(67.0);
		testScores.put("Joe", joeScores);
		
		List<Double> amyScores = new ArrayList<Double>();
		amyScores.addAll(Arrays.asList(82.0, 80.0, 64.0, 44.0));
		testScores.put("Amy", amyScores);
		
		List<Double> fredScores = new ArrayList<Double>();
		fredScores.add(80.0);
		fredScores.add(60.0);
		testScores.put("Fred", fredScores);
		//TODO One line additions?

		
		printScores("Amy", testScores);
	}
	
	
	
	public static void printScores(String studentName, Map<String, List<Double>> scoresMap) //
	{
		
		List<Double> scores = scoresMap.get(studentName);
		System.out.println(studentName);
		for(double score : scores)
		{
			System.out.println(score);
		}
	}

}

