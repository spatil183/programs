package hc_practiceset;

public class PalindromeNumber {
	public static void main(String[] args) {
		printNumberPalindrome(121);
	}

	static void printNumberPalindrome(int n) {
		
		int temp;
		int rem,rev=0;
		temp=n;
		while(temp>0) {
			rem=temp%10;
			temp= temp/10;
			rev =(rev*10)+rem;
		}
		if(n==rev) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is Not Palindrome");
		}
	}
}
