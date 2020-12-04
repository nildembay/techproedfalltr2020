package day25stringbuilder;

public class Sb02 {

	public static void main(String[] args) {
		
		//StringBuilder Class kullanarak String �retmek
		//1. yol
		StringBuilder sb1=new StringBuilder();// Bo� bir string �rettik...
		System.out.println(sb1.capacity());//16  bo� bir String olu�turdu�umuzda Java memory de 16 karakterlik yer ay�r�r.
		System.out.println(sb1.length());// 0
		sb1.append("java");
		
		sb1.append(" g�zeldir");//Strige ekleme yapar.
		System.out.println(sb1);
		
		sb1.append(". Ama ").append(" �al��mak gerekir");
		System.out.println(sb1);
		System.out.println(sb1.capacity());//70  16'y� a��nca +16 ekliyor, 32'i a��nca 2*32+2 ekliyor.
		
		//2. yol
		StringBuilder sb2=new StringBuilder(11);// kapasitesi 11 olan bo� bir string olu�turur.
		System.out.println(sb2.capacity());//11
		System.out.println(sb2.length());//0
		sb2.append("AliAliAli");
		System.out.println(sb2.capacity());
		
		//3. yol
		StringBuilder sb3=new StringBuilder("java");// belli bir string �retmek i�in kullan�l�r.
		System.out.println(sb3.capacity());// 4+16=20
		System.out.println(sb3.length());
		StringBuilder sb4=new StringBuilder("javajavajavajavajava");
		System.out.println(sb4.capacity());// 16+16+4
		
		//Fazladan ayr�lan capacity i azaltmak
		sb4.trimToSize();
		System.out.println(sb4.capacity());
		
		//istenen bir karakteri indexe g�re almak
		System.out.println(sb4.charAt(5)); //5. index teki de�eri al�r.
		
		//Belli aral�ktaki karakterleri almak
		System.out.println(sb4.substring(4,11));// belirtilen karakter aral���n� al�r.
		
		//belli bir karakterden sonraki t�m karakterleri almak
		System.out.println(sb4.substring(5));
		
		//Belli bir indexteki karakteri silmek
		System.out.println(sb4.deleteCharAt(5));
		
		// index 4(dahil) index 6(dahil)'ya kadar t�m karakterleri silmek
		System.out.println(sb4.delete(4, 7));
		
		//�stenen index e istenen character veya characterleri eklemek
		System.out.println(sb4.insert(4, "X"));
		
		//�stenen index teki 1 characteri de�i�tirmek
		sb4.setCharAt(4, ' ');
		System.out.println(sb4);
		
		//�stenen indexteki karakter yerine birden fazla karakter eklemek
		sb4.replace(9, 13, " ");
		System.out.println(sb4);
		
		
	}
	


}
