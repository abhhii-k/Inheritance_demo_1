package inheritance_package;

public class SingleLevel_inheritance extends Add{
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;
		
		SingleLevel_inheritance sli = new SingleLevel_inheritance();
		
		System.out.println(sli.add(num1, num2));	//Inherited method
	}	

}
