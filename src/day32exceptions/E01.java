package day32exceptions;

public class E01 {
	/*
	 1-Garbage Collector s�rekli memory i kontrol eder. Silinmesi gereken herhangi bir data varsa memory i
	 	temiz tutmak i�in data yi siler. Ama data yi silmeden �nce "finalize" eder. 
	 	finalize etmek i�in finalize() method u kullan�r. Bu method un ne zaman �al��aca��na java karar verir. 
	 	siz kod yazarken finalize() methodunu �a��rabilirsiniz ama siz �a��rsan�z da ne zaman �al��aca��na java karar verir.
	 
	 2-final, finally ve finalize a��klar m�s�n�z?
	 	final(keyword)-->final method override edilemez
	 			final variable de�eri de�i�tirilemez
	 			final class a extends edilemez.
	 			
	 	finally(kod block)--> try catch block tan sonra kullan�l�r. Exception atilsa da atilmasa da �al���r.
	 	finalize(method) --> Garbage Collector bir data y� imha etmeden �nce �al��t�r�r.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
