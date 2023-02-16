package design_pattern;

public class Singleton {

	private static Singleton instance;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2 );
	}
}
