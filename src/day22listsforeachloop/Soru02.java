package day22listsforeachloop;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan tam ismini alýn
		 Ýsmin harflerini bir liste ekleyin
		 Harfleri alfabetik sýrada büyük harfler olarak yazýn.
		 harfleri alfabetik sýraýn tersinden yazdýrýn
		 		 
		 */
		List<String> list1= new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("adýnýzý giriniz");
		String ad=scan.nextLine().replace(" ", "").toUpperCase();
		
		for (int i = 0; i < ad.length(); i++) {
			list1.add(ad.substring(i,i+1));
				
		}
		System.out.println(list1);
		Collections.sort(list1); //alfabetik sýralama
		System.out.println(list1);
		
		List<String> list2= new ArrayList<>();
		for (int i =list1.size()-1; i >=0 ; i--) {
			
			list2.add(list1.get(i));			
		}
		System.out.println(list2);
		
		Collections.reverse(list1); // alfabenin tersi sýralama
		System.out.println(list1);
		scan.close();
	}

}
