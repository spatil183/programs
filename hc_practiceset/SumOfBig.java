package hc_practiceset;

public class SumOfBig {
	public static void main(String[] args) {
		String str1 = "1234567";
		String str2 = "1234";
		System.out.println(printSum(str1, str2));
	}	
	static String printSum(String str1, String str2) {
		String str = " ";
		if(str1.length()>str2.length()) {
			String t=str1;
			str1 = str2;
			str2 = t;
		}
		str1 = new StringBuilder(str1).reverse().toString();
		str2 = new StringBuilder(str2).reverse().toString();
		int carry = 0;
		for(int i=0; i<str1.length(); i++) {
			int sum = ((int)(str1.charAt(i)-'0')+(int)(str2.charAt(i)-'0')+carry);
			str += (char)(sum%10+'0');
			carry = sum/10;
		}
		for(int i=str1.length(); i<str2.length(); i++) {
			int sum = ((int)(str2.charAt(i)-'0')+carry);
			str += (char)(sum%10+'0');
			carry = sum/10;
		}
		if(carry>0)
			str += (char)(carry+'0');
			str = new StringBuilder(str).reverse().toString();
		return str;
	}
}