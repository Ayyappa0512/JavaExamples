package java_programs;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		
		
		int a = 90;
		System.out.println((char) a);
		System.out.println("========================Random Number Generator========================");
		
		System.out.println(randomNumberGeneratorBetweenRange(5, 10));
		
		System.out.println("========================Random Number Generator Using Rnadom class========================");
		
		System.out.println(randomNumberUsingRandomClass( 10));
		
		// also there is ThreadLocalRandom class is there which supports lower and upper bounds of the number
		
		System.out.println("========================Thread Local Random========================");
		
		System.out.println(threadLocalRandomClass(5, 10));
		
		System.out.println("========================Random Number generator of given size========================");
		
		randomNumbersUsingInts(10, 5, 50);
		
	}
	
	public static int randomNumberGeneratorBetweenRange(int lowerLimit, int upperLimit) {
		
		int randomNumber = (int) (lowerLimit + Math.random()*(upperLimit-lowerLimit+1));
		return randomNumber;

	}
	
	public static int randomNumberUsingRandomClass(int upperLimit) {
		
		Random random  = new Random();

		int randomInteger = random.nextInt( upperLimit);
		long randomLong= random.nextLong();
		System.out.println(randomLong);
		//can be used to generate float double long and boolean also
		return randomInteger;

	}
	
	public static int threadLocalRandomClass(int lowerLimit, int upperLimit) {
		
		

		int randomInteger = ThreadLocalRandom.current().nextInt(lowerLimit, upperLimit);
		return randomInteger;

	}
	
	public static void randomNumbersUsingInts(int num, int origin, int bound) {
		
		Random random  = new Random();
		
		random.ints(num, origin, bound).forEach(System.out::println);
	}

}
