package day35interfaceiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

	public static void main(String[] args) {
		
		List <String> list1=new ArrayList<>();
		list1.add("B");
		list1.add("C");
		list1.add("A");
		list1.add("D");
		System.out.println(list1);
		
		//list elemanlar�n� for loop ve for each loop kullnarak yazd�r�n
		
		for(int i=0;i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		
		
		for (String w : list1) {
			System.out.println(w+" ");
			
		}
		
		//list1 deki elemanlar�n sonuna for loop kullanarak ! i�areti ekleyiniz ediniz.
		
		for(int i=0;i<list1.size(); i++) {
			list1.set(i,list1.get(i)+"!");
		}
				
		
		System.out.println(list1);
		
		// set methodunu kullanabilmek i�in index laz�m. ancak for each index kullanmaz. bu y�zden 
		//for each loop kullanarak listler update edilemezler
		
		/*
		 for loop kullanarak listleri update etmek istemiyorum. for each loop ta listleri update edemiyor
		 bu durumda for loop kullanmadan listleri update edebilmek i�in iterator leri kullan�r�z.
		 */
		
		
		List <String> list2=new ArrayList<>();
		list2.add("U");
		list2.add("V");
		list2.add("Y");
		list2.add("Z");
		
		System.out.println(list2);
		
		Iterator<String> it2=list2.iterator();
		
		while(it2.hasNext()) {
			
			String el=it2.next();
			it2.remove();  //s�rayla elemanlar� siler.
			
			
		}
		
		
		System.out.println(list2);
		
		List <String> list3=new ArrayList<>();
		list3.add("K");
		list3.add("L");
		list3.add("M");
		list3.add("N");
		
		System.out.println(list3);
		ListIterator <String> it3= list3.listIterator();
		
		while(it3.hasNext()) {
			String el=it3.next();
			it3.set(el+"!");// elemanlar� update eder.
			it3.add(el); // ayn� eleman� ekliyor.
			
			
		}
		System.out.println(list3);
		
		List <String> list4=new ArrayList<>();
		list4.add("e");
		list4.add("f");
		list4.add("g");
				
		System.out.println(list4);
		
		ListIterator <String> it4= list4.listIterator();
		
		/*
		 hasPrevious ve previous methodlar�n� kullanmadan �nce 
		 hasNext ve next methodlar�n� kullanarak pointer� en sa�a yollamal�y�z.
		 */
		
		/*
		 sadece son eleman�n ba��na * koyunuz ve list elemanlar�n� sondan ba�a do�ru yazd�r�n�z.
		 */
		
		int sayac=0;
		while(it4.hasNext()) {
			String el=it4.next();
			if(sayac==2)
				it4.set("*"+el);
			
			sayac++;
		}
		
		
		
		while(it4.hasPrevious()) {
			
			String el=it4.previous();
			System.out.println(el);
		}
		
		/*
		 iterator ile listiterator farklar�
		 
		 1- iterator sadece hasNext ,next ve remove methodlar�n� i�erir.
		 	listiterator ise hasNext,next, remove, hasPrevious, previous, add, set methodlar� vard�r
		 	
		 2- listiterator ad�ndan da anla��laca�� gibi sadece listler i�in kullan�l�r. "iterator" ise list, 
		 	map,set gibi di�er collection lar i�inde kullan�l�r.
		 	
		 3-iterator kullanarak sadece ba�tan sona do�ru seyahat edebilirsiniz. ancak listiterator kullan�rsan�z 
		 	�ift y�nl� seyahat edebilirsiniz.
		 	
		 	
		 
		 
		 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
