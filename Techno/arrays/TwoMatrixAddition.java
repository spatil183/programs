package Techno.arrays;

public class TwoMatrixAddition {

	public static void main(String[] args) {
		int a[][] = {{2,5},{1,1}};
		int b[][] = {{1,0},{2,1}};
		
		for(int i=0; i<a.length; i++) {
		for(int j=0; j<b.length; j++) {
			System.out.print(a[i][j]+b[i][j]+" ");
		}
		System.out.println();
		}
	}
}
