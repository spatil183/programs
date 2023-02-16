package java_programs;

public class Fibo {
	static int a = 0;
	static int b = 1;
	static int c;
	
	static void printfibonacci(int count) {
		if(count>0) {
			c = a+b;
			a = b;
			b = c;
			System.out.print(" "+c);
			printfibonacci(count-1);
		}
	}
	
	public static void main(String args[]) {
		int count = 10;
		System.out.print(a+" "+b);
		printfibonacci(count-1);
		}
}
