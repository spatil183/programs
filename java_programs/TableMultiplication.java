package java_programs;

public class TableMultiplication {

	public static void main(String[] args) {
		printTable(6);
	}
	
//	static void printTable(int a) {
//		int b;
//		for(int i=1; i<=10; i++) {
//			b = a*i;
//			System.out.println(b);
//		}
	
	static void printTable(int a) {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d\n",a,i,a*i);
		}
}
}


