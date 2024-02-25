package java_collectionsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		arrayListExamples();
		
		IteratorForList();

	}
	
	public static void arrayListExamples() {
		
		/**
		 * List <data-type> list1= new ArrayList();  
		 * List <data-type> list2 = new LinkedList();  
		 * List <data-type> list3 = new Vector();  
		 * List <data-type> list4 = new Stack(); 
		 */
		
		List<String> li = new ArrayList<String>();
		li.add("Hello");
		li.add("Collections");
		li.add("Adding");
		li.add("New");
		li.add("Element");
		System.out.println(li);
		
		ArrayList<Integer> li2 = new ArrayList<Integer>();
		Integer numbers[] = {1, 4, 5, 6, 7, 3, 2, 10}; 
		Collections.addAll(li2, numbers);
		System.out.println(li2);	
		
		String n[] = {"s", "sfd", "fsd"};
		
		List<String> li3 = new ArrayList<String>();
		li3  = Arrays.asList(n);
		System.out.println(li3);	
		
		Integer n2[] = {1, 4, 6};
		
		List<Integer> li4 = new ArrayList<Integer>();
		li4  = Arrays.asList(n2);
		System.out.println(li4);
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		List lst = Arrays.asList(arr);
		List lst  = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(lst);
		System.out.println(lst.size());
	}
	
	public static void IteratorForList() {
		
		List<Integer> al = new ArrayList<Integer>();
		int arr[] = { 10, 5, 12, 8, 7, 5, 2};
		al = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		// lenght of List using size() method
		int  l = al.size();
		System.out.println(l);
		
		for(int i: al) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		al.remove(2);
		
		int l2 = al.size();
		for(int i=0; i<l2;i++) {
			System.out.print(al.get(i)+ " ");
		}
		System.out.println();
		
		al.add(0, 5);
		
		Iterator it = al.iterator();		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		System.out.println(al.toString());
		
	}
	
	
	

}
