package java_programs;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		String a = "Automation string";
		
		findDuplicatesWithoutHashMap(a);
		
		findDuplicatesWithHashMap(a);
		
	}


public static void findDuplicatesWithoutHashMap(String a) {
	String b = a.replaceAll(" ", "").toLowerCase();
	
	System.out.println(a);
	
	int l = b.length();
	
	
	for(int i=0; i<l; i++) {
		int count  = 1;
		for(int j=i+1; j<l;j++) {
		if(j != i) {
//			System.out.println(i+" "+b.charAt(i)+"; "+j+" "+b.charAt(j));
			if(b.charAt(i) == b.charAt(j)) {
				count++;
			}
		}
		}
		if(count > 1) {
			System.out.println("This character '"+b.charAt(i) +"' appears '"+count+"' times in the string");
		}
	}

	}

public static void findDuplicatesWithHashMap(String a) {
	String b = a.replaceAll(" ", "").toLowerCase();
	
	System.out.println(a);
	
	char[] charArray = b.toCharArray();
	
	Map<Character, Integer> duplicatChars = new HashMap<Character, Integer>() ;
	
	for(char ch: charArray) {
		
		if(duplicatChars.containsKey(ch)) {
			duplicatChars.put(ch, duplicatChars.get(ch)+1);
		}
		else {
			duplicatChars.put(ch,1);
		}
	}
	
	
	System.out.println("Displaying duplicate chars of the String '"+ a+": ");
	
    for (Map.Entry<Character, Integer> entry : duplicatChars.entrySet()) {
    	
    	if(entry.getValue() >1) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " occurrences");}
    }

	}
}
