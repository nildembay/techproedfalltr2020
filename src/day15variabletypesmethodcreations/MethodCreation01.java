package day15variabletypesmethodcreations;

public class MethodCreation01 {

	
	public static void main(String[] args) {

		toplama(3,5);
		toplama(6.3,1.2);
		carpma(2,3);
		carpma(2,3.5);
		carpma(2.3,3.4);
		
		carpma(2,3,5);
	
		
	}
	
	public static void toplama(double a,double b) {
		System.out.println(a+b);
	
		
	}
	public static void carpma(double a,double b) {
		System.out.println(a*b);
	
		
	}
	public static void carpma(int a,int b) {
		System.out.println(a*b);
	
		
	}
	public static void carpma(int a,double b) {
		System.out.println(a*b);
	
		
	}
	public static void carpma(double a,double b,double c) {
		System.out.println(a*b*c);
	}

}
