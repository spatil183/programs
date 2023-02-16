package Techno.arrays;

public class Duplicate {

	public static void main(String[] args) {
		int a[] = {12,13,11,12,14,13,15,16};
		for(int i=0; i<a.length;i++) {
		for(int j=i+1; j<a.length; j++) {
			if(a[i]==a[j]) {
				System.out.println(a[j]);
			}
		}
		}
	}
}
