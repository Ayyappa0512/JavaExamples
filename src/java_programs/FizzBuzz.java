package java_programs;

public class FizzBuzz {

	public static void main(String[] args) {
		
		// fizzBuzz is a number series between some numbers say 1 to 100 or 1 to 50 or 10 to 50
		// 1. In this series multiples of 3 is shown as fizz 
		// 2. Multiples of 5 is shown as buzz and 
		// 3. Multiples of both 3 and 5 as fizzbuzz
		// for 1 to 15 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz
		
		fizzbuzz(15, 31);

	}
	
	public static void fizzbuzz(int start, int end) {
		
		for(int i=start;i<=end; i++) {
			
			if(i%3 == 0 & i%5 == 0) {
				System.out.print("Fizzbuzz ");
//				break;
			}else if(i%3 == 0 ) {
				System.out.print("Fizz ");
			}else if(i%5 == 0) {
				System.out.print("Buzz ");
			}else {
				System.out.print(i+" ");
			}
		}
		
	}

}
