package LambdaExamples;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// predicate is a functional interface which takes one argument as a input and return the boolean value
		
		// Syntax  (a) -> a >=10; 
		
		// Syntax (a) -> {return a>=10;};
		
		int a =10;
		
		Predicate<Integer> p1 = (x) -> x%2==0;
		
		boolean result = p1.test(a);
		
		//negate methods 
		boolean result2 = p1.negate().test(a);
		
		System.out.println(result);
		System.out.println(result2);
		
		a = 6;
		
		result = p1.test(a);
		
		System.out.println(result);
		
		//Bi-Predicate
		
		int b = 25;
		
		BiPredicate<Integer, Integer> p2 = (x, y) -> x>=y; 
		
		result = p2.test(a, b);
		
		System.out.println(result);
		
		
		// and or methods
		Predicate<Integer> p3 = (x) -> x%5==0;
		
		result = p1.and(p3).test(a);
		
		System.out.println(result);
			
		result = p1.or(p3).test(a);
		
		System.out.println(result);
		
		
		//BiPredicate
		
//		BiPredicate bp1 = 
		
	}

}
