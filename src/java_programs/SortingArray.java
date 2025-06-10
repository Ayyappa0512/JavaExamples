package java_programs;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a = {4, 6,2, 3, 2, 2, 5, 7};
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		
//		descendingSort(a);
		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
		
		// To convert array to string
		String sortedArray = Arrays.toString(a);
//		System.out.println("new sorted array"+sortedArray);
//		
//		ascendingSort(a);
//		sortedArray = Arrays.toString(a);
//		System.out.println("new sorted array"+sortedArray);
		
		//sort using Arrays class
		Arrays.sort(a, Collections.reverseOrder());
		sortedArray = Arrays.toString(a);
		System.out.println("arrays"+sortedArray);
		
	}

	public static void descendingSort(int[] a) {
		int l = a.length;
		int temp;
		
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static void ascendingSort(int[] a) {
		int l = a.length;
		int temp;
		
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
