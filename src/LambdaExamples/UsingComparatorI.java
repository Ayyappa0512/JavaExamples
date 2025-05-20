package LambdaExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UsingComparatorI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 2, 4,9);
		
		//using comparator interface to sort operations
		
		numbers.sort(Comparator.naturalOrder());
		
		System.out.println("Ascending order sort "+numbers);
			
		numbers.sort(Comparator.reverseOrder());
		
		System.out.println("Ascending order sort "+numbers);
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		
		//sort using length of the string using lambda expression
		
		names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println("sort using lambda expression:"+names);
		
		//sort using length of the string using comparator
		
		names.sort(Comparator.comparing(String::length).reversed());
		
		System.out.println("Comparator: "+names);
	}

}
