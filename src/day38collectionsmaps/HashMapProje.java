package day38collectionsmaps;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProje {
	
	/*
	 1- Kullanýcýdan birçok kimlik numarsýný(4 haneli), tam ismini, adresini , telefonunu alýn.
	 2- Kimlik numarasýný key olarak, diðer bilgileri value olarak bir mape depolayýn
	 3- Kimlik numarasýný girerek kullanýcýný bilgilerini ekrana yazdýrýn( tekrarlý bilgi alma mümkün olsun)
	 
	 */

	public static void main(String[] args) {
		
		String id=" ";
		Scanner scan=new Scanner(System.in);
		HashMap<String,String> person=new HashMap<>();
		
		
		
		do {
			System.out.println("kimlik numarasýný giriniz");
			System.out.println("bilgi giriþini durdurmak için  'Q' tuþuna basýnýz");
			id=scan.next();
			if(id.equals("Q")) {
				System.out.println("çýkýþ yaptýn");
				break;
			}
			System.out.println("Ýlk isminizi giriniz");
			String name1=scan.next();
			
			System.out.println("Soy isminizi giriniz");
			String name2=scan.next();
			
			
			
			System.out.println("Adresinizi giriniz.");
			String address=scan.next();
			
			System.out.println("telefon numaranýzý giriniz");
			int telNo=scan.nextInt();
			
			person.put(id, name1+" "+name2+" / "+address+" / "+telNo);
			
			
			
		}while(!id.equals("Q"));
		
		System.out.println(person);
		scan.close();
		
		
	}

}
