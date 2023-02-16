package hc_practiceset;

public class SumOf3Largest {
	
	public static void main(String[] args) {
		int arr[] = {1,0,8,6,4,2}; 
		int n = arr.length;
		System.out.println(sumOfLargest(arr, n));
	}

	static int sumOfLargest(int arr[],int n) {
		int maxA = 0;
		int maxB = 0;
		int maxC = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]>maxA) {
				maxC = maxB;
				maxB = maxA;
				maxA = arr[i];
			}else if(arr[i]>maxB) {
				maxC = maxB;
				maxB = arr[i];
			}
			else if(arr[i]>maxC)
				maxC = arr[i];
		}
		return (maxA+maxB+maxC);
	}
}
