package hc_practiceset;

public class PalindromeArray {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,5,2,2,1};
		int n = arr.length;
	System.out.println(printPalindrome(arr, n));
	}

	static String printPalindrome(int arr[], int n) {
		
		for(int i=0; i<n; i++) {
			int rev = 0,rem;
			int temp = arr[i];
			
			while(temp>0) {
				rem = temp%10;
				temp = temp/10;
				rev = (rev*10)+rem;
			}
			if(rev!=arr[i]) 
				return "Array is not Palindrome";
		}
		return "Array is Palindrome";
	}
}
