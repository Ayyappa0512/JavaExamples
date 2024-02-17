package java_programs;

public class PrimeNumber {

	public static void main(String[] args) {
	
		// Generate prime numbers in the given range 
		PrimeNumberGenerator(10, 100);
		
		PrimeNumberCheck(6);

	}
	
	
	public static void PrimeNumberGenerator(int start, int end) {
		
		
		if(start < end) {
			for(int i = start; i <= end; i++) {
				int flag = 0;
				if(i == 0 || i ==1) {
					flag =1;
				}
				else if(i == 2) {
					System.out.println(i+ " ");
				}
				else if(i >= 2){
					
					for(int j =2; j<=i/2;j++) {
						if(i%j == 0) {
							flag =1;
							break;
						}
					}
					if(flag == 0) {
						System.out.println(i+ " ");
						PrimeNumberCheck(i);
					}
				}
			}
		
		}
	}
	
	public static void PrimeNumberCheck(int num) {
		
			int flag = 0;
				if( num < 2) {
					System.out.println("The given number '"+num+"' is not a prime number");
				}
				if(num == 2) {
					System.out.println("The given number '"+num+"' is a prime number");
				}
				else if(num > 2) {
					
					for(int i=2; i<=num/2;i++) {
						
						if(num%i == 0) {
							flag = 1;
							break;
						}
						
					}
				}
				if(flag == 0) {
					System.out.println("The given number '"+num+"' is a prime number");
				}else {
					System.out.println("The given number '"+num+"' is not a prime number");
				}
					

	}

}
