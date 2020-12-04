package day32exceptions;

public class E02 {
	
	/*
	 1-Exception oluþtuðunda consolda sadece mesajý görmek isterseniz "e.getMessage()" kullanýrýz.
	 */

	public static void main(String[] args) {
		int a=12;
		int b=0;
		try {
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());// hata mesajýndaki mesaj kýsmýný alýrýz
		}
	}

}
