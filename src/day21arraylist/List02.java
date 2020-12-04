package day21arraylist;

import java.util.ArrayList;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
	
		// iki tane integer list oluşturunuz. [1,3,1,2]  [3,2,4,4,5]
		
		List<Integer> list1=new ArrayList<>();
		
		list1.add(1);
		list1.add(3);
		list1.add(1);
		list1.add(2);
				
		System.out.println(list1);
		
		List<Integer> list2=new ArrayList<>();
		
		list2.add(3);
		list2.add(2);
		list2.add(4);
		list2.add(4);
		list2.add(5);
		System.out.println(list2);
		
		list1.addAll(list2);//list1 e list2 nin elemanlarını ekler
		System.out.println(list1);
		System.out.println(list2);
		
		list1.addAll(1,list2);// list2 nin elemanlarını belirtilen indexten itibaren list1 e ekler
		System.out.println(list1);
		
		//bir listten toplu eleman silmek
		list1.removeAll(list2); // list2 ye ait elemanların tamamını siler.
		System.out.println(list1);
		
		// bir listin başka bir liste eşit olup olmadığını kontrol etmek
		System.out.println(list1.equals(list2)); //false
		
		System.out.println(list2.containsAll(list1));// list2 nin içinde list1 var mı
		
		List<Integer> list3=new ArrayList<>();
		list3.add(3);
		list3.add(2);
		
		System.out.println(list3);
		System.out.println(list2.containsAll(list3));
		
		System.out.println(list2.get(1));//belirtilen indexteki elemanı return eder.
		System.out.println(list2.indexOf(4));// verilen elemanın ilk görülüşünün index ini return eder.
		System.out.println(list2.lastIndexOf(4)); //son görülüşünün indexini verir.
		
		// listin 1. elemnından itibaren 3. index dahil olmadan elemanları alır.
		System.out.println(list2.subList(1, 3)); 
		
		
	}

}
