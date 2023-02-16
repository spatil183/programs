package hc_practiceset;

public class MaxOccuranceChar {
	
	public static void main(String[] args) {
		
		printOccurance("welcome to weekend");
	}

	static void printOccurance(String str) {
		
		int[] arr = new int[256];
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)]+1;
		}
		
		int max = -1;
		char s = ' ';
		
		for(int i=0; i<str.length(); i++) {
			if(max<arr[str.charAt(i)]) {
				max = arr[str.charAt(i)];
				s = str.charAt(i);
			}
		}
		System.out.println("Maximum Repeated character is :"+s);		
		System.out.println("Maximum Repeated character is :"+max+" times");

	}
}
