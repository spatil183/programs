package hc_practiceset;

public class SumOf3Large {

	public static void main(String[] args) {
	
		int arr[] = {12,11,2,3,4,5,65,43};
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]<arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		}
		System.out.println(arr[0]+arr[1]+arr[2]);
	}
}
