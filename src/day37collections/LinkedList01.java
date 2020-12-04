package day37collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList01 {
	/*
	 
	 Node lar� "Ali", "Veli", "Can", "Ay�e" olan bir LinkedList olu�turun
	 kullan�c�dan bir isim al�n
	 bu isim linkedlist te varsa silin ve kullan�c�ya "bu isim linked liste vard� ve silindi"
	 bu isim linkedListte yoksa "Bu isim LinkedListte yok bu y�zden silinemedi" diye mesaj veriniz. (remove)
	 
	 */

	public static void main(String[] args) {
	
		LinkedList<String> ll1=new LinkedList<>();
		ll1.add("Ali");
		ll1.add("Veli");
		ll1.add("Can");
		ll1.add("Ay�e");
		
	
		System.out.println(ll1);
		
	
		Scanner scan=new Scanner(System.in);
		System.out.println("bir isim giriniz");
		String isim=scan.next();
		
		if (ll1.remove(isim)) {
			System.out.println(ll1);
			System.out.println("bu isim linked liste vard� ve silindi");
			System.out.println(ll1);
		}else {
			System.out.println(ll1);
			System.out.println("Bu isim LinkedListte yok bu y�zden silinemedi");
			System.out.println(ll1);
		}
			
		scan.close();
		
	}

}
