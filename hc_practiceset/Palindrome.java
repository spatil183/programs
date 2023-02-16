package hc_practiceset;

public class Palindrome {
	
	static void printPalindrome(String str) {
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse+ str.charAt(i);
		}
		if(str.equals(reverse)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
	}
	
	public static void main(String[] args) {
		printPalindrome("mom");
	}

}
