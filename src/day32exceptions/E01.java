package day32exceptions;

public class E01 {
	/*
	 1-Garbage Collector sürekli memory i kontrol eder. Silinmesi gereken herhangi bir data varsa memory i
	 	temiz tutmak için data yi siler. Ama data yi silmeden önce "finalize" eder. 
	 	finalize etmek için finalize() method u kullanýr. Bu method un ne zaman çalýþacaðýna java karar verir. 
	 	siz kod yazarken finalize() methodunu çaðýrabilirsiniz ama siz çaðýrsanýz da ne zaman çalýþacaðýna java karar verir.
	 
	 2-final, finally ve finalize açýklar mýsýnýz?
	 	final(keyword)-->final method override edilemez
	 			final variable deðeri deðiþtirilemez
	 			final class a extends edilemez.
	 			
	 	finally(kod block)--> try catch block tan sonra kullanýlýr. Exception atilsa da atilmasa da çalýþýr.
	 	finalize(method) --> Garbage Collector bir data yý imha etmeden önce çalýþtýrýr.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
