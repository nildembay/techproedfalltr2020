package day32exceptions;

public class E03 {
	/*
	 e.printStackTrace() -->oluþan exceptionun tüm detaylarýný verir. consol da detaylý bir hata mesajý almak isterseniz kullanýrýz
	 */

	public static void main(String[] args) {
		
		int arr[]= {11,12,13,14};
		
		try {
			System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace(); // hatanýn bütün adýmlarýný detaylý olarak verir.
			
		}
		

	}

}
