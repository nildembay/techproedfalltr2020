package day38collectionsmaps;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProje {
	
	/*
	 1- Kullan�c�dan bir�ok kimlik numars�n�(4 haneli), tam ismini, adresini , telefonunu al�n.
	 2- Kimlik numaras�n� key olarak, di�er bilgileri value olarak bir mape depolay�n
	 3- Kimlik numaras�n� girerek kullan�c�n� bilgilerini ekrana yazd�r�n( tekrarl� bilgi alma m�mk�n olsun)
	 
	 */

	public static void main(String[] args) {
		
		String id=" ";
		Scanner scan=new Scanner(System.in);
		HashMap<String,String> person=new HashMap<>();
		
		
		
		do {
			System.out.println("kimlik numaras�n� giriniz");
			System.out.println("bilgi giri�ini durdurmak i�in  'Q' tu�una bas�n�z");
			id=scan.next();
			if(id.equals("Q")) {
				System.out.println("��k�� yapt�n");
				break;
			}
			System.out.println("�lk isminizi giriniz");
			String name1=scan.next();
			
			System.out.println("Soy isminizi giriniz");
			String name2=scan.next();
			
			
			
			System.out.println("Adresinizi giriniz.");
			String address=scan.next();
			
			System.out.println("telefon numaran�z� giriniz");
			int telNo=scan.nextInt();
			
			person.put(id, name1+" "+name2+" / "+address+" / "+telNo);
			
			
			
		}while(!id.equals("Q"));
		
		System.out.println(person);
		scan.close();
		
		
	}

}
