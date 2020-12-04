package day37collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
	
	/*
	 bu sisteme fifo (first in first out -->ilk giren ilk ��kar) denir.
	 Elemanlar en sona eklenir ve en ba�tan silinir.
	 (eczaneler, yemekhaneler bu sistemi kullan�r)
	 
	 
	 */

	public static void main(String[] args) {
		
		//PriorityQueue kullanarak Queue �retirseniz java kendisi bir priority(�ncelik) kural� �retir ve �retti�i
		// bu kurala g�re elemanlar� dizer.
		Queue<String> q1=new PriorityQueue<>();
		q1.add("Milk");
		q1.add("Cheese");
		q1.add("Water");
		q1.add("Oil");
		q1.add("Meat");
		System.out.println(q1);
		
		System.out.println(q1.peek()); // ilk eleman� silmeden bize return eder.
		System.out.println(q1);
		
		System.out.println(q1.poll());  // ilk eleman� siler ve bize return eder.
		System.out.println(q1);
		
		q1.offer("Coke");// offer methodu eleman eklemek i�in kullan�l�r. add methodu gibi.
						// eleman s�n�r� konulmu� queue larda eleman eklemek istenirse offer kullan�labilir.
		System.out.println(q1);
		
		Queue<String> q2=new LinkedList<>(); 
		q2.add("Bread");
		q2.add("Sugar");
		q2.add("Rice");
		q2.add("Bean");
		q2.add("Salt");
		System.out.println(q2);
		/*
		 remove ve poll methodu ilk eleman� siler ve return eder. Ama collectionda eleman yoksa remove metodu exception atar
		 ama poll metodu exception atmaz null �retir.
		 
		 
		 */
 		
		q2.remove();
		q2.poll();
		System.out.println(q2);
		
		q2.clear();
		System.out.println(q2.poll());//null
	//	System.out.println(q2.remove()); // RTE verir.
		
		
		
	}

}
