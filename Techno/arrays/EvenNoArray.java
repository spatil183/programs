package Techno.arrays;

public class EvenNoArray {

	public static void main(String[] args) {
		
		int ar[] = {12,15,17,18,16,10,23,32};
		for(int i=0; i<ar.length; i++) {
			if(i%2==0) {
				System.out.print(ar[i]);
			}
		}
	}
}
