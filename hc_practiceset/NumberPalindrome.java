package hc_practiceset;

public class NumberPalindrome {
	
	public static void main(String[] args) {
		printNumPalindrome(12321);
	}
	
	static void printNumPalindrome(int num) {
		
		String str_num = String.valueOf(num);
		String str = new StringBuilder(str_num).reverse().toString();
		
		if(str.equals(str_num)) {
			System.out.println(num + " Num is Palindrome");
		}else
			System.out.println(num + " Num is not palindrome");
		
	}
	

}
