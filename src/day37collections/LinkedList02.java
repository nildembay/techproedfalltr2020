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
		ll1.remove(2); // remove methodunun içine integer koyarsanız java her zaman onu index olarak kabul eder.
		
		System.out.println(ll1);
	
		//ll1.remove(33); // remove methodununiçinde olmayan bir index kullanırsanız JavaOutOfBoundsException throw eder.
		
		
		
	}

}
