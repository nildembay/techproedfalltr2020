package day21arraylist;

import java.util.ArrayList;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
	
		// iki tane integer list olu�turunuz. [1,3,1,2]  [3,2,4,4,5]
		
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
		
		list1.addAll(list2);//list1 e list2 nin elemanlar�n� ekler
		System.out.println(list1);
		System.out.println(list2);
		
		list1.addAll(1,list2);// list2 nin elemanlar�n� belirtilen indexten itibaren list1 e ekler
		System.out.println(list1);
		
		//bir listten toplu eleman silmek
		list1.removeAll(list2); // list2 ye ait elemanlar�n tamam�n� siler.
		System.out.println(list1);
		
		// bir listin ba�ka bir liste e�it olup olmad���n� kontrol etmek
		System.out.println(list1.equals(list2)); //false
		
		System.out.println(list2.containsAll(list1));// list2 nin i�inde list1 var m�
		
		List<Integer> list3=new ArrayList<>();
		list3.add(3);
		list3.add(2);
		
		System.out.println(list3);
		System.out.println(list2.containsAll(list3));
		
		System.out.println(list2.get(1));//belirtilen indexteki eleman� return eder.
		System.out.println(list2.indexOf(4));// verilen eleman�n ilk g�r�l���n�n index ini return eder.
		System.out.println(list2.lastIndexOf(4)); //son g�r�l���n�n indexini verir.
		
		// listin 1. elemn�ndan itibaren 3. index dahil olmadan elemanlar� al�r.
		System.out.println(list2.subList(1, 3)); 
		
		
	}

}
