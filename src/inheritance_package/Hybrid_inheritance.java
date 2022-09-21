package inheritance_package;

public class Hybrid_inheritance extends Multilevel_inheritance_2{
	
	public static void main(String[] args) {
		
		int a = 42;
		int b = 33;
		
		Hybrid_inheritance hi = new Hybrid_inheritance();
		
		System.out.println(hi.remove(a, b));
	}

}
