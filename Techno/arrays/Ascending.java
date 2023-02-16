package Techno.arrays;

public class Ascending {

	public static void main(String[] args) {
		int temp = 0;
		int arr[] = {12,3,2,54,11,9,8,7};
		for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]>arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.print(arr[i]+" ");
		}
	}
}
