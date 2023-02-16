package Techno.string;

public class StringEqualsOrNot {

	public static void main(String[] args) {
		
		String str = "Java";
		String Str1 = new String("Java");
		if(str.equals(Str1)) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}
	}
}
