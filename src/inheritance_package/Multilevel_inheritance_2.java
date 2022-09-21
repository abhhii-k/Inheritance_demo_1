package inheritance_package;

public class Multilevel_inheritance_2 extends Multilevel_inheritance_1{
	
	public static void main(String[] args) {
		int a = 12;
		int b = 22;
		
		Multilevel_inheritance_2 mli = new Multilevel_inheritance_2();
		
		System.out.println(mli.remove(a, b));
	}

}
