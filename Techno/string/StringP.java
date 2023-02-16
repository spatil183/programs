package Techno.string;

public class StringP {

	public static void main(String[] args) {
	
		printReverse("Java");
	}
	static void printReverse(String str) {
		String reverse = "";
		for(int i=str.length()-1;i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}
			
//		String str = "Java";
//		for(int i=str.length()-1; i>=0;i--) {
//			System.out.print(str.charAt(i));
//		}
}
