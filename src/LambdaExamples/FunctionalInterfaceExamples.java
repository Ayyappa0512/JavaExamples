package LambdaExamples;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		String s = "I am learning the java 8 lambda expressions";
		Function<String, String> f1 = (a) -> {return a.toUpperCase();};
		Function<String, String> f2 = (a) ->  a.concat(" java8");
		
		System.out.println(f1.apply("Hello"));
		
		System.out.println(f1.andThen(f2).apply("Hi"));
		
		//Bi functional interface
		
		BiFunction<String, String, Boolean> validateString = (x, y) -> x.contains(y);
		
		System.out.println("Bi function "+validateString.apply(s, "functions"));

		//Unary operator and binary operator
		
		//unary operator -> input and output of same time in unary operator
		
		UnaryOperator<String> u1 = (a) -> {return a.toUpperCase();};
		
		System.out.println("Unary operator "+ u1.apply("Java8"));
		
		//Binary operator takes 2 inputs of same time and return same time value
		BinaryOperator<Integer> BI1 = (a, b) -> a*b;
		
		System.out.println("Unary operator "+ BI1.apply(10, 20));
		
	}

}
