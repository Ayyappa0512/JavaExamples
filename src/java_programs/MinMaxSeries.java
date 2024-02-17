package java_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinMaxSeries {

	public static void main(String[] args) {
		
		Integer[] numbers = {8, 2, 7, 1, 4, 9, 5};
		
		System.out.println("Using collections:");
		minMaxUingCollections(numbers);
		
		int[] numbers2 = {8, 2, 7, 1, 4, 9, 5, 11};
		System.out.println("using without collections");
		minMaxWithoutUsingCollections(numbers2);
		
		int[] numbers3 = {8, 2, 7, 3, 4, 9, 5, 11,15};
		System.out.println("using without collections");
		minAnd2ndLastMin(numbers3);
	 
	}
	
	public static void minMaxUingCollections(Integer[] n) {
		
		  ArrayList<Integer> list = new ArrayList<Integer>();
		  Collections.addAll(list, n);
	      int min = (int) Collections.min(Arrays.asList(n));
	      int max = (int) Collections.max(Arrays.asList(n));
	      
	      System.out.println("Min number: " + min);
	      System.out.println("Max number: " + max);
	}
	
	public static void minMaxWithoutUsingCollections(int[] numbers) {
		
	      int s = numbers[0];
	      int l = numbers[0];
	      
	      for(int i = 1; i < numbers.length; i++) {
	         if(numbers[i] > l) {l = numbers[i];}
	         else if (numbers[i] < s) {s = numbers[i];}
	      } 
	      System.out.println("Largest Number is : " + l);
	      System.out.println("Smallest Number is : " + s);
	}
	
	public static void minAnd2ndLastMin(int[] numbers) {
		
	      int min1 = numbers[0];
	      int min2 = numbers[0];
	      
	      int max1 = numbers[0];
	      int max2 = numbers[0];
	      
	      
	      for(int i = 1; i < numbers.length; i++) {
	         if(numbers[i] < min1) {min1 = numbers[i];}
	         else if(numbers[i] > max1) { max1 = numbers[i];}
	      } 
	      for(int i = 1; i < numbers.length; i++) {
		         if(numbers[i] < min2 && numbers[i] > min1) {min2 = numbers[i];}
		         else if(numbers[i] > max2 && numbers[i] < max1) {max2 = numbers[i];}
		      } 
	      System.out.println("Min1 Number is : " + min1);
	      System.out.println("Min2 Number is : " + min2);
	      System.out.println("Max1 Number is : " + max1);
	      System.out.println("Max2 Number is : " + max2);
	}
}
