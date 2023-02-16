package hc_practiceset;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println(printPalindrome("nitin"));
	}
	
	static String printPalindrome(String str) {
		int length = str.length();
		int start = 0;
		int end = length-1;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return "Not Palindrome";
			}
			start++;
			end--;
		}
		return "Palindrome";
	}
}
