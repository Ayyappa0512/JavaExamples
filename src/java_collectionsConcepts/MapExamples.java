package java_collectionsConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		mapGenericMethods();
		mapIterationMethods();
	}
	
	public static void mapGenericMethods() {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Anil", 28);
		map.put("Raju", 29);
		map.put("arun", 28);
		map.put("Ravi", 30);
		
		System.out.println(map);
		
		System.out.println(map.size());
		
		System.out.println(map.get("Anil")); //get value of object by using key 
		
		map.remove("arun");
		
		System.out.println(map);
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.entrySet()); 
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.putAll(map);
		
		System.out.println(map2.equals(map));
		
		map.put("Arun", 30);
		
		System.out.println(map2.equals(map));
		
		map.replace("Arun", 21);
		System.out.println(map);
	
	}
	
	
	public static void mapIterationMethods() {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Anil", 28);
		map.put("Raju", 29);
		map.put("arun", 28);
		map.put("Ravi", 30);
		
		for(Entry e: map.entrySet()) {
			
			System.out.println(e);
		}
		
		for(Entry e: map.entrySet()) {
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		for(String s: map.keySet()) {
			System.out.println(s);
		}
		
		for(int s: map.values()) {
			System.out.println(s);
		}
		
	}
}

