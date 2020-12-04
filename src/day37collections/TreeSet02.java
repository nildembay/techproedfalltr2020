package day37collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {
	/*
	 interview Sorusu:
	 alfabetik s�rada ve tekrars�z bir collection elde etmek i�in ne kullan�rs�n�z.
	 cevap: TreeSet
	 
	 soru: Ama TreeSet �ok yava�t�r. Nas�lbir ��z�m bulabilirsin.
	 cevap: HashSet olu�tururum. Elemanlar� hashSete eklerim. Sonra hashSeti TreeSete �eviririm.
	 		b�ylelikle tekrars�z ve alfabetik s�rada bir collection a sahip olurum.
	 */

	public static void main(String[] args) {
		
		long startingTime2 = System.currentTimeMillis();
		TreeSet <String> hs2=new TreeSet<>();
		hs2.add("Ali");
		hs2.add("Veli");
		hs2.add("Canan");
		hs2.add("Beyhan");
		hs2.add("Seyhan");
		hs2.add("Ceyhan");
		hs2.add("Ramazan");
		hs2.add("Da�han");
		hs2.add("Ayhan");
		System.out.println(hs2);
		
		
		long endingTime2 = System.currentTimeMillis();
		System.out.println("TreeSet Suresi: " + (endingTime2 - startingTime2));
		
		long startingTime1 = System.currentTimeMillis();
		HashSet <String> hs1=new HashSet<>();
		hs1.add("Ali");
		hs1.add("Veli");
		hs1.add("Canan");
		hs1.add("Beyhan");
		hs1.add("Seyhan");
		hs1.add("Ceyhan");
		hs1.add("Ramazan");
		hs1.add("Da�han");
		hs1.add("Ayhan");
		System.out.println(hs1);
		
		TreeSet<String> ts1 =new TreeSet<>(hs1);
		System.out.println(ts1);
		long endingTime1 = System.currentTimeMillis();
		System.out.println("HashSet-TreeSet D�n���m Suresi: " + (endingTime1 - startingTime1));
		
		
		
		
		
	}

}
