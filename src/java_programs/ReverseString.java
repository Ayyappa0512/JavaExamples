package java_programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s = "Super star eknath";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter one word form the String: "+s);
		String word = scanner.nextLine();
		
		String reverse = reverseStringUsingStringBuilder(s, word);
		
		System.out.println("With string builder: "+reverse);
		
		System.out.println("With reverse logic :"+reverseString(s, word));

	}
	
	public static String reverseStringUsingStringBuilder(String s, String w) {
		
		String reverse = "";
		String[] words = s.split(" "); //words
		if(s.contains(w))
		{
		for(String word:words) {
			StringBuilder sb = new StringBuilder();
			sb.append(word);
			if(word.equalsIgnoreCase(w)) {
				sb.reverse();
				reverse = reverse.concat(sb+" ");
			}else {
				reverse =reverse.concat(sb+" ");
			}
		}}
	else
		System.out.println("Need to check the word string builder");
		return reverse;
		
	}
	
	public static String reverseString(String s, String w) {
		
		String reverse = "";
		String[] words = s.split(" "); //words
	if(s.contains(w)) {
		for(String word:words) {
			if(word.equalsIgnoreCase(w)) {
				String rs = reverseWord(word);
				reverse = reverse.concat(rs+" ");
			}else {
				reverse =reverse.concat(word+" ");
			}
		}}
	else
		System.out.println("Need to check the word");
		return reverse;
		
	}
	
	public static String reverseWord(String word) {
		
		String rs = "";
		for(int i=word.length()-1; i>=0; i--) {
			rs = rs.concat(String.valueOf(word.charAt(i)));
		}
		return rs;
	}
	

}
