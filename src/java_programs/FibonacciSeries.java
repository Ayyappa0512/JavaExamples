package java_programs;

import java.util.Scanner;

public class FibonacciSeries {
	
	 static int n1=0,n2=1,n3=0;  

	public static void main(String[] args) {
		
		int count;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the count number of fibanacci series");
		
		count = input.nextInt();
		
		fibonacciSeries(count);
		System.out.println();
		
		System.out.print(n1+", "+n2);
		fibonacciSeriesWithRecusrive(10);
		
		

	}
	
	public static void fibonacciSeries(int n) {
		
		int n1 = 0, n2 = 1, n3;
		
		System.out.print(n1+", "+n2);
		for(int i = 2; i<n;i++) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(", "+n3);
		}
	}
	
	public static void fibonacciSeriesWithRecusrive(int n) {
		
		if(n>0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			System.out.print(", "+ n3);
			fibonacciSeriesWithRecusrive(n-1);
			
		}

	}

}
