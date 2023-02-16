package Techno.arrays;

public class ArrayElementPres {

	public static void main(String[] args) {
		int a = 50;
		int arr[] = {10,50,3,2,15,16};
		for(int i=0; i<arr.length; i++) {
			if(a==arr[i]) {
				System.out.println(a+" is present array");
				break;
			}else {
				System.out.println(a+" is not present an array");
			}
		}
	}
}
