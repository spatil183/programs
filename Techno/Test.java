package Techno;

public class Test implements Interface,Interface1{
	public void show(){
		System.out.println("First Methods");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
	}
}
