package hc_practiceset;

public class StringPalindrome1 {

	static void printPalindrome(String str) {
		String reverse="";
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse+str.charAt(i);
		}
		if(str.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
	public static void main(String[] args) {
		printPalindrome("nitin");
	}
}
