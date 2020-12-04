package day36collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
	
	/*
	 1- LinkedListte elamanlar iki k�s�mdan olu�ur(data,adres)
	 
	 2-LinkedListte elemanar�n yap�s� farkl� oldu�undan "node" olarak adland�r�l�rlar.
	 
	 3-LinkedListlerde her zaman en ba�ta "head" vard�r. "Head" sadede adres b�l�m�nden olu�ur. "Head i�in data b�lm� yoktur.
	 
	 4- LinkedList lerde en son node "Tail" olarak adland�r�l�r.
	 
	 5- LinkedListler eleman ekleme ve silmede cok ba�ar�l�d�rlar fakat eleman bulmada ba�ar�s�zd�rlar. ��nk� index kullanmazlar.
	 */

	public static void main(String[] args) {
		
		LinkedList<String> ll1=new LinkedList<>();
		ll1.add("Ali");
		ll1.add("Veli");
		ll1.add("Emine");
		ll1.add("Beyhan");
		ll1.add("R�dvan");
		
		System.out.println(ll1);
		
		ll1.add(1, "Kemal");
		System.out.println(ll1);
		
		List<String> ll2=new ArrayList<>();
		ll2.add("XXX");
		ll2.add("YYY");
		
		ll1.addAll(ll2);
		/*
		 addAll methodu linkedListe arraylisten ve linkedlistten gelen,k�sacas� t�m collections lardn gelen elemanlar� ekleyebilir.
		 
		 */
		
		System.out.println(ll1);
		ll1.addAll(2,ll2);
		System.out.println(ll1);
		
		ll1.addFirst("AAA");
		System.out.println(ll1);
		
		ll1.addLast("ZZZ");
		System.out.println(ll1);
		
		ll1.remove(); // parametresiz kullan�ld���nda linkedlistteki ilk eleman� siler
		System.out.println(ll1);
		
		ll1.removeFirst();  //ilk eleman� siler. daha h�zl� �al���r.
		System.out.println(ll1);
		
		System.out.println(ll1.remove(4));// listteki indexi verilen elemen� siler ve return eder.
		System.out.println(ll1);
		
		ll1.remove("YYY"); //ilk buldu�u yyy yi siler ve rapor verir.
		
		System.out.println(ll1);
		
		System.out.println(ll1.remove("Hirsiz"));  //bulamad��� i�in false �retir.
		System.out.println(ll1);
		
		ll1.removeFirstOccurrence("XXX"); ///ilk g�rd��� XXX eleman�n� siler
		System.out.println(ll1);
		
		ll1.add(6,"R�dvan");
		System.out.println(ll1);
		
		ll1.removeLastOccurrence("R�dvan"); // en sondaki R�dvan � siler.
		System.out.println(ll1);
		
		ll1.removeLast(); //en sondaki eleman� siler
		System.out.println(ll1);
		
		ll1.add(4,"Veli");
		ll1.add(6,"Veli");
		
		System.out.println(ll1);
		
		LinkedList <String> ll3=new LinkedList<>();
		ll3.add("Veli");
		ll3.add("XXX");
		ll1.removeAll(ll3);  // ll3 i�indeki elemanlar� ll1 dden siler.
		System.out.println(ll1);
		
		LinkedList <String> ll4=new LinkedList<>();
		ll4.add("Beyhan");
		ll4.add("YYY");
		
		System.out.println(ll1.containsAll(ll4)); //ll1, ll4 teki t�m elemanlar� i�eriyor mu?
		
		ll4.add("MMM");
		System.out.println(ll1.containsAll(ll4));
		
		System.out.println(ll1.get(1)); // get methodu ile 1. indexteki eleman� al�r�z.
		
		
		
		
		
		
		
		
		
	}

}
