package day25stringbuilder;

public class Sb02 {

	public static void main(String[] args) {
		
		//StringBuilder Class kullanarak String üretmek
		//1. yol
		StringBuilder sb1=new StringBuilder();// Boþ bir string ürettik...
		System.out.println(sb1.capacity());//16  boþ bir String oluþturduðumuzda Java memory de 16 karakterlik yer ayýrýr.
		System.out.println(sb1.length());// 0
		sb1.append("java");
		
		sb1.append(" güzeldir");//Strige ekleme yapar.
		System.out.println(sb1);
		
		sb1.append(". Ama ").append(" çalýþmak gerekir");
		System.out.println(sb1);
		System.out.println(sb1.capacity());//70  16'yý aþýnca +16 ekliyor, 32'i aþýnca 2*32+2 ekliyor.
		
		//2. yol
		StringBuilder sb2=new StringBuilder(11);// kapasitesi 11 olan boþ bir string oluþturur.
		System.out.println(sb2.capacity());//11
		System.out.println(sb2.length());//0
		sb2.append("AliAliAli");
		System.out.println(sb2.capacity());
		
		//3. yol
		StringBuilder sb3=new StringBuilder("java");// belli bir string üretmek için kullanýlýr.
		System.out.println(sb3.capacity());// 4+16=20
		System.out.println(sb3.length());
		StringBuilder sb4=new StringBuilder("javajavajavajavajava");
		System.out.println(sb4.capacity());// 16+16+4
		
		//Fazladan ayrýlan capacity i azaltmak
		sb4.trimToSize();
		System.out.println(sb4.capacity());
		
		//istenen bir karakteri indexe göre almak
		System.out.println(sb4.charAt(5)); //5. index teki deðeri alýr.
		
		//Belli aralýktaki karakterleri almak
		System.out.println(sb4.substring(4,11));// belirtilen karakter aralýðýný alýr.
		
		//belli bir karakterden sonraki tüm karakterleri almak
		System.out.println(sb4.substring(5));
		
		//Belli bir indexteki karakteri silmek
		System.out.println(sb4.deleteCharAt(5));
		
		// index 4(dahil) index 6(dahil)'ya kadar tüm karakterleri silmek
		System.out.println(sb4.delete(4, 7));
		
		//Ýstenen index e istenen character veya characterleri eklemek
		System.out.println(sb4.insert(4, "X"));
		
		//Ýstenen index teki 1 characteri deðiþtirmek
		sb4.setCharAt(4, ' ');
		System.out.println(sb4);
		
		//Ýstenen indexteki karakter yerine birden fazla karakter eklemek
		sb4.replace(9, 13, " ");
		System.out.println(sb4);
		
		
	}
	


}
