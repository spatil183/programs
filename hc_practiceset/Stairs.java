package hc_practiceset;

public class Stairs {

	public static void main(String[] args) {
	System.out.println(climbStairs(4));
	}
	
	static int climbStairs(int n) {
		 int p = 1, q = 1;
		 for (int i = 2; i <= n; i++) {
		 int temp = q;
		 q += p;
		 p = temp;
		 }
		 return q;
		}
}
