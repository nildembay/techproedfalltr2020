package day32exceptions;

public class E03 {
	/*
	 e.printStackTrace() -->olu�an exceptionun t�m detaylar�n� verir. consol da detayl� bir hata mesaj� almak isterseniz kullan�r�z
	 */

	public static void main(String[] args) {
		
		int arr[]= {11,12,13,14};
		
		try {
			System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace(); // hatan�n b�t�n ad�mlar�n� detayl� olarak verir.
			
		}
		

	}

}
