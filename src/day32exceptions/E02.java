package day32exceptions;

public class E02 {
	
	/*
	 1-Exception olu�tu�unda consolda sadece mesaj� g�rmek isterseniz "e.getMessage()" kullan�r�z.
	 */

	public static void main(String[] args) {
		int a=12;
		int b=0;
		try {
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());// hata mesaj�ndaki mesaj k�sm�n� al�r�z
		}
	}

}
