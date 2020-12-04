package day37collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
	
	/*
	 bu sisteme fifo (first in first out -->ilk giren ilk çýkar) denir.
	 Elemanlar en sona eklenir ve en baþtan silinir.
	 (eczaneler, yemekhaneler bu sistemi kullanýr)
	 
	 
	 */

	public static void main(String[] args) {
		
		//PriorityQueue kullanarak Queue üretirseniz java kendisi bir priority(öncelik) kuralý üretir ve ürettiði
		// bu kurala göre elemanlarý dizer.
		Queue<String> q1=new PriorityQueue<>();
		q1.add("Milk");
		q1.add("Cheese");
		q1.add("Water");
		q1.add("Oil");
		q1.add("Meat");
		System.out.println(q1);
		
		System.out.println(q1.peek()); // ilk elemaný silmeden bize return eder.
		System.out.println(q1);
		
		System.out.println(q1.poll());  // ilk elemaný siler ve bize return eder.
		System.out.println(q1);
		
		q1.offer("Coke");// offer methodu eleman eklemek için kullanýlýr. add methodu gibi.
						// eleman sýnýrý konulmuþ queue larda eleman eklemek istenirse offer kullanýlabilir.
		System.out.println(q1);
		
		Queue<String> q2=new LinkedList<>(); 
		q2.add("Bread");
		q2.add("Sugar");
		q2.add("Rice");
		q2.add("Bean");
		q2.add("Salt");
		System.out.println(q2);
		/*
		 remove ve poll methodu ilk elemaný siler ve return eder. Ama collectionda eleman yoksa remove metodu exception atar
		 ama poll metodu exception atmaz null üretir.
		 
		 
		 */
 		
		q2.remove();
		q2.poll();
		System.out.println(q2);
		
		q2.clear();
		System.out.println(q2.poll());//null
	//	System.out.println(q2.remove()); // RTE verir.
		
		
		
	}

}
