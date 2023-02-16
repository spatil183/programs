package hc_practiceset;

public class TargetValue {

	public static void main(String[] args) {
		int[] num = {7,1,2,29,12,11};
		int target = 23;
		int[] findSum = findSum(num, target);
		for(int i=0;i<findSum.length;i++) {
			System.out.print(findSum[i]+" ");
		}
	}
	
	static int[] findSum(int[] num, int target) {
		for(int i=0; i<num.length; i++) {
		for(int j=i+1; j<num.length; j++) {
			if(num[i]+num[j]==target) {
				return new int[] {i,j};
			}
		}
		}
		return new int[] {};
	}
}
