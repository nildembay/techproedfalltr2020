package day16constructors;

public class MethodCreation01 {

	public static void main(String[] args) {

		System.out.println(add(3,5));
		System.out.println(birlestir("Nilüfer ","Demir"));
		
	}
	
	public static int add(int a, int b) {
		
		return a+b;
			
	}
	
	public static String birlestir(String a, String b) {
		
		return a.concat(b);
	}

}
