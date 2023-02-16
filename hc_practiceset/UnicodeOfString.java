package hc_practiceset;

public class UnicodeOfString{
	
	public static void main(String[] args) {
		
		printUnicode("Swapnil");
	}
	
	static void printUnicode(String str) {
		for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		System.out.println(ch +" is :"+ str.codePointAt(i));	
		}
	}
}
