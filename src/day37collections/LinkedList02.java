package day37collections;

import java.util.LinkedList;

public class LinkedList02 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll1=new LinkedList<>();
		ll1.add(3);
		ll1.add(2);
		ll1.add(0);
		ll1.add(1);
		ll1.add(33);
		
		
		System.out.println(ll1);
		ll1.remove(2); // remove methodunun i�ine integer koyarsan�z java her zaman onu index olarak kabul eder.
		
		System.out.println(ll1);
	
		//ll1.remove(33); // remove methodununi�inde olmayan bir index kullan�rsan�z JavaOutOfBoundsException throw eder.
		
		
		
	}

}
