package day31exceptions;

public class E02 {
/*
 				Arithmetic Exception
 */
	public static void main(String[] args) {
		
		int a=12;
		int b=0;
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			
			System.out.println("Say�lar s�f�ra b�l�nemezler");
		}
		
		finally {
			System.out.println("finaly block");
		}

	}

}
