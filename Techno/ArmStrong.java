package Techno;

public class ArmStrong {

	public static void main(String[] args) {
		printArmstrong(153);
	}	
	
	static void printArmstrong(int num) {
		int sum = 0;
		int rem,temp;
		temp=num;
		while(num>0) {
			rem = num%10;
			sum += rem*rem*rem;
			num/=10;
		}
		if(temp==sum) {
			System.out.println(temp + " is Armstrong number");
		}else {
			System.out.println(temp + " is not Armstrong number");
		}
	}
}
