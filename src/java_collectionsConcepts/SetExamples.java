package java_collectionsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		setGenericMethods();
		
		setIterationMethods();		
	}
	
	public static void setGenericMethods() {
		
		// set follows random insertion technique dose not have index values.
		
		Set<Integer> st = new HashSet<Integer>();
		
		System.out.println("Is set is empty " + st.isEmpty());
		st.add(5);
		st.add(10);
		st.add(10);
		st.add(17);
		
		System.out.println(st.toString());
		System.out.println("Is set is empty " + st.isEmpty());
		
		st.remove(5);
		System.out.println(st.toString());
		
		int l = st.size();
		System.out.println("Size of the set "+ l);
		
		boolean check = st.contains(11);
		System.out.println(check);
		
		Set<Integer> st2 = new HashSet<Integer>();
		
		st2.addAll(st);
		st2.add(16);
		
		System.out.println(st2);
		
		System.out.println(st2.containsAll(st));
		System.out.println(st.containsAll(st2));
		
		String s[] = { "anil", "rahul", "arjun", "arun"};
		
		Set<String> st3 = new HashSet<String>();
		
		st3.addAll(Arrays.asList(s));
		
		System.out.println(st3);
		
	}
	
	public static void setIterationMethods() {
	
		String s[] = { "anil", "rahul", "arjun", "arun"};
		
		Set<String> st3 = new HashSet<String>();
		
		st3.addAll(Arrays.asList(s));
		
		// set cant have index values so cant be printed using loops
		
		
		for(String e: st3) {
			System.out.println(e);
		}
		
//		st3.forEach(System.out::println);
		
		// set to list 
		
		List<String> li = new ArrayList<String>();
		
		li.addAll(st3);
		
		System.out.println(li);
		
		//Iterator for the 

		Iterator<String> it = st3.iterator();
		
		while(it.hasNext()) {
		
			System.out.println("Iteration: "+ it.next());
		}
	}

}
