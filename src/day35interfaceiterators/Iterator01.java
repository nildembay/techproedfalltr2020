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
		
		//list elemanlarýný for loop ve for each loop kullnarak yazdýrýn
		
		for(int i=0;i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		
		
		for (String w : list1) {
			System.out.println(w+" ");
			
		}
		
		//list1 deki elemanlarýn sonuna for loop kullanarak ! iþareti ekleyiniz ediniz.
		
		for(int i=0;i<list1.size(); i++) {
			list1.set(i,list1.get(i)+"!");
		}
				
		
		System.out.println(list1);
		
		// set methodunu kullanabilmek için index lazým. ancak for each index kullanmaz. bu yüzden 
		//for each loop kullanarak listler update edilemezler
		
		/*
		 for loop kullanarak listleri update etmek istemiyorum. for each loop ta listleri update edemiyor
		 bu durumda for loop kullanmadan listleri update edebilmek için iterator leri kullanýrýz.
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
			it2.remove();  //sýrayla elemanlarý siler.
			
			
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
			it3.set(el+"!");// elemanlarý update eder.
			it3.add(el); // ayný elemaný ekliyor.
			
			
		}
		System.out.println(list3);
		
		List <String> list4=new ArrayList<>();
		list4.add("e");
		list4.add("f");
		list4.add("g");
				
		System.out.println(list4);
		
		ListIterator <String> it4= list4.listIterator();
		
		/*
		 hasPrevious ve previous methodlarýný kullanmadan önce 
		 hasNext ve next methodlarýný kullanarak pointerý en saða yollamalýyýz.
		 */
		
		/*
		 sadece son elemanýn baþýna * koyunuz ve list elemanlarýný sondan baþa doðru yazdýrýnýz.
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
		 iterator ile listiterator farklarý
		 
		 1- iterator sadece hasNext ,next ve remove methodlarýný içerir.
		 	listiterator ise hasNext,next, remove, hasPrevious, previous, add, set methodlarý vardýr
		 	
		 2- listiterator adýndan da anlaþýlacaðý gibi sadece listler için kullanýlýr. "iterator" ise list, 
		 	map,set gibi diðer collection lar içinde kullanýlýr.
		 	
		 3-iterator kullanarak sadece baþtan sona doðru seyahat edebilirsiniz. ancak listiterator kullanýrsanýz 
		 	çift yönlü seyahat edebilirsiniz.
		 	
		 	
		 
		 
		 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
