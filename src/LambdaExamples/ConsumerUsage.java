package LambdaExamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerUsage {

	public static void main(String[] args) {

		// consumer is functional interface in java 8 that accepts a single argument as
		// input, performs some instructions and returns no result

		// BiConsumer accepts a two argument as input, performs some instructions and
		// returns no result

		// consumer examples

		int a = 10;

		Consumer<Integer> c1 = s -> System.out.println(s);

		c1.accept(a);// this will print a in console

		List<String> states = Arrays.asList("AP", "TS", "TN", "KA", "KL");

		List<String> capitalCity = Arrays.asList("Amaravati", "Hyderabad", "Chennai", "Benglore", "Thiruvananthapuram");

		// print list of team names using consumer

		// using single line code
		states.forEach(name -> System.out.println("1st approach: " + name));

		// second approach create a consumer and using that

		Consumer<String> c2 = name -> System.out.println("2nd approach: " + name);

		states.forEach(c2);

		// Bi-Consumer usage

		Map<String, String> stateCapitalMap = new HashMap<>();

		for (int i = 0; i < states.size(); i++) {
			stateCapitalMap.put(states.get(i), capitalCity.get(i));
		}

		// print state capital using normal for loop
		
		for(Map.Entry<String, String> entry: stateCapitalMap.entrySet()) {
			String state = entry.getKey();
			String captial = entry.getValue();
			System.out.println(state+": "+captial);		
		}
		
		//using biConsumer 
		
		System.out.println("Biconsumer for map");
		
		BiConsumer<String, String> b1 = (x, y) -> System.out.println(x+" -> "+y);
		
		stateCapitalMap.forEach(b1);

	}

}
