package day38collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
	
	/*
	 1- Double ended queue (deque) : queue larda FIFO geçerli , Deque lerde hem FIFO hem LIFO (last in first out) 
	 */

	public static void main(String[] args) {
	
		Deque<String> dq1=new LinkedList<>();
		dq1.add("ali");
		dq1.add("Veli");
		dq1.add("Aydýn");
		dq1.add("Merve");
		dq1.add("Kadriye");
		
		System.out.println(dq1);
		
		System.out.println(dq1.getFirst());
		System.out.println(dq1);
		
		System.out.println(dq1.peekFirst());
		System.out.println(dq1);
		
		System.out.println(dq1.getLast());
		System.out.println(dq1);
		
		System.out.println(dq1.peekLast());
		System.out.println(dq1);
		
		/*
		 Note: getFirst ve peekFirst methodlarýnýn ikiside ilk elemaný silmeden return eder.
		 fakat getFirst boþ deque lerde kullenýldýðýnda exception atar. NoSuchElementException atar
		 
		 peekFirst ise null verir
		 */
		
	//	dq1.clear();
	//	System.out.println(dq1.peekFirst());
	//	dq1.getFirst();   NoSuchElementException
		
		System.out.println(dq1.pollFirst());	// ilk elemaný siler ve return eder	
		System.out.println(dq1);
		
		System.out.println(dq1.pollLast());		//son elemaný siler ve return eder.
		System.out.println(dq1);
	}

}
