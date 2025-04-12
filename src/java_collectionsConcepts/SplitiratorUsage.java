package java_collectionsConcepts;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplitiratorUsage {

	public static void main(String[] args) {
		// Make a collection
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Volvo2");
	    cars.add("BMW2");
	    cars.add("Ford2");
	    cars.add("Mazda2");
	  
	    // Get the spliterator and split it
	    Spliterator<String> it1 = cars.spliterator();
	    Spliterator<String> it2 = it1.trySplit();
	    
	    // Loop through the first spliterator
	    System.out.println("First spliterator");
	    while( it1.tryAdvance( (n) -> { System.out.println(n); } ) );
	    
	    // Loop through the second spliterator
	    System.out.println("\nSecond spliterator");
	    while( it2.tryAdvance( (n) -> { System.out.println(n); } ) );

	}

}
