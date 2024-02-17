package java_programs;

public class Palindrome {

	public static void main(String[] args) {
		//A palindrome is a word, phrase, number, or other sequence of characters 
		//that reads the same forward and backward.
		
		//ex: number 121, 343, 242 4554 
		// logic if we reverse the number also if the number remain same then its a palindrome
		
		// wow , peep , rotator, deified
		System.out.println(palindromeInt(15651));
		
		
		System.out.println(palindromeString("Helleh"));
		

	}
	
	public static String palindromeInt(int inputNum){
		
		int num = inputNum;
		int reverseNum = 0;
		String isPalindrome = "";
		while(num != 0) {
			reverseNum = reverseNum*10+num%10;
			num = num/10;
		}
		
		System.out.println(reverseNum);
		if(reverseNum == inputNum) {
			isPalindrome = "The number '"+inputNum+"' is a palindrome";
		}else {
			isPalindrome = "The number '"+inputNum+"' is not a palindrome";
		}
		return isPalindrome;
	}
	
	public static String palindromeString(String original) {
		
		String isPalindrome = "";
		
		String reverse = "";
		
		int l = original.length();
		
		for(int i =l-1; i>=0; i--) {
			
			reverse = reverse + original.charAt(i);
		}
		
		
		System.out.println("Reverse String is: "+ reverse);
		if(reverse.equalsIgnoreCase(original)) {
			isPalindrome = "The given String/Number '"+original+"' is a palindrome";
		}else {
			isPalindrome = "The given String/Number  '"+original+"' is not a palindrome";
		}
		return isPalindrome;
	}

}
