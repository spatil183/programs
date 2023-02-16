package Techno.string;


public class ReverseWholeString {

	public static void main(String[] args) {
		
		String str = "Welcome to programming langauge";
		String[] s = str.split(" ");
		String rev = " ";
		
		for(int i=s.length-1; i>=0; i--) {
		rev = rev+" ";
		rev = rev+s[i];
		
		}
		System.out.println(rev);
	}
}
 