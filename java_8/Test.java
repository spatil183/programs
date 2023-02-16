package java_8;

interface I{
	public void add(int a, int b);
}
public class Test {

	public static void sum(int x, int y) {
		System.out.println("the sum:"+(x+y));
	}
	
	public static void main(String[] args) {
		I i = (a,b)-> System.out.println(" the sum ;"+ (a+b));
		i.add(10, 20);
		
		I i1 = Test::sum;
		i1.add(100, 200);
	}
}
