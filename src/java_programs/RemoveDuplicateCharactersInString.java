package java_programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aaddaffdafa"; //adf
		
		char[] ch = s.toCharArray();
		
		Set<Character> chs = new HashSet<>();
		StringBuilder stringWithoutDuplicates = new StringBuilder();
		
		for(char c: ch) {
			if(chs.add(c)) {
				stringWithoutDuplicates.append(c);
			}
		}
		
		System.out.println(stringWithoutDuplicates);

	}

}
