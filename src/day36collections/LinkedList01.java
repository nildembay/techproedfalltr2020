package day36collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
	
	/*
	 1- LinkedListte elamanlar iki kýsýmdan oluþur(data,adres)
	 
	 2-LinkedListte elemanarýn yapýsý farklý olduðundan "node" olarak adlandýrýlýrlar.
	 
	 3-LinkedListlerde her zaman en baþta "head" vardýr. "Head" sadede adres bölümünden oluþur. "Head için data bölmü yoktur.
	 
	 4- LinkedList lerde en son node "Tail" olarak adlandýrýlýr.
	 
	 5- LinkedListler eleman ekleme ve silmede cok baþarýlýdýrlar fakat eleman bulmada baþarýsýzdýrlar. Çünkü index kullanmazlar.
	 */

	public static void main(String[] args) {
		
		LinkedList<String> ll1=new LinkedList<>();
		ll1.add("Ali");
		ll1.add("Veli");
		ll1.add("Emine");
		ll1.add("Beyhan");
		ll1.add("Rýdvan");
		
		System.out.println(ll1);
		
		ll1.add(1, "Kemal");
		System.out.println(ll1);
		
		List<String> ll2=new ArrayList<>();
		ll2.add("XXX");
		ll2.add("YYY");
		
		ll1.addAll(ll2);
		/*
		 addAll methodu linkedListe arraylisten ve linkedlistten gelen,kýsacasý tüm collections lardn gelen elemanlarý ekleyebilir.
		 
		 */
		
		System.out.println(ll1);
		ll1.addAll(2,ll2);
		System.out.println(ll1);
		
		ll1.addFirst("AAA");
		System.out.println(ll1);
		
		ll1.addLast("ZZZ");
		System.out.println(ll1);
		
		ll1.remove(); // parametresiz kullanýldýðýnda linkedlistteki ilk elemaný siler
		System.out.println(ll1);
		
		ll1.removeFirst();  //ilk elemaný siler. daha hýzlý çalýþýr.
		System.out.println(ll1);
		
		System.out.println(ll1.remove(4));// listteki indexi verilen elemený siler ve return eder.
		System.out.println(ll1);
		
		ll1.remove("YYY"); //ilk bulduðu yyy yi siler ve rapor verir.
		
		System.out.println(ll1);
		
		System.out.println(ll1.remove("Hirsiz"));  //bulamadýðý için false üretir.
		System.out.println(ll1);
		
		ll1.removeFirstOccurrence("XXX"); ///ilk gördüðü XXX elemanýný siler
		System.out.println(ll1);
		
		ll1.add(6,"Rýdvan");
		System.out.println(ll1);
		
		ll1.removeLastOccurrence("Rýdvan"); // en sondaki Rýdvan ý siler.
		System.out.println(ll1);
		
		ll1.removeLast(); //en sondaki elemaný siler
		System.out.println(ll1);
		
		ll1.add(4,"Veli");
		ll1.add(6,"Veli");
		
		System.out.println(ll1);
		
		LinkedList <String> ll3=new LinkedList<>();
		ll3.add("Veli");
		ll3.add("XXX");
		ll1.removeAll(ll3);  // ll3 içindeki elemanlarý ll1 dden siler.
		System.out.println(ll1);
		
		LinkedList <String> ll4=new LinkedList<>();
		ll4.add("Beyhan");
		ll4.add("YYY");
		
		System.out.println(ll1.containsAll(ll4)); //ll1, ll4 teki tüm elemanlarý içeriyor mu?
		
		ll4.add("MMM");
		System.out.println(ll1.containsAll(ll4));
		
		System.out.println(ll1.get(1)); // get methodu ile 1. indexteki elemaný alýrýz.
		
		
		
		
		
		
		
		
		
	}

}
