package java_programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(9));
		System.out.println(factorialByForloop(9));
	}
	
	
	public static int factorial(int n) {
	
		int fact;
		if(n == 0 || n==1) {
			return fact = 1;
		}else {
			fact = n*factorial(n-1);
		}
		return fact;
		
	}
	
	public static int factorialByForloop(int n) {
		
		int fact = 1;
		
		if(n == 0 || n==1) {
			return fact = 1;
		}else {
			for(int i=2;i<=n;i++) {
				fact = fact*i;
			}
		}
		return fact;
	}
}
