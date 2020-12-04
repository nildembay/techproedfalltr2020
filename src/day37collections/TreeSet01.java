package day37collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet01 {
	/*
	 1- TreeSet tekrarlý eleman kabul etmez, çünkü Settir.
	 2-Elemanlarý natural order'a(String ise alfabetik,sayý ise küçükten büyüðe) göre dizer.
	 3- TreeSet setlerin en yavaþýdýr. TreeSet kullanýrken dikkatli olun.
	 
	 
	 
	 */

	public static void main(String[] args) {
		
		
		long startingTime=System.currentTimeMillis();
		TreeSet<String> ts1=new TreeSet<>();
		ts1.add("Ali");
		ts1.add("Zehra");
		ts1.add("Metin");
		ts1.add("Bedia");
		ts1.add("Cemil");
		System.out.println(ts1);
		long endingTime=System.currentTimeMillis();
		System.out.println("treeSet Süresi"+(endingTime-startingTime));
		
		
		long startingTime2 = System.currentTimeMillis();
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Ali");
		hs1.add("Zehra");
		hs1.add("Metin");
		hs1.add("Bedia");
		hs1.add("Cemil");
		System.out.println(hs1);//[Ali, Bedia, Cemil, Metin, Zehra]
		long endingTime2 = System.currentTimeMillis();
		System.out.println("HashSet Suresi: " + (endingTime2 - startingTime2));

		long startingTime3 = System.currentTimeMillis();
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		lhs1.add("Ali");
		lhs1.add("Zehra");
		lhs1.add("Metin");
		lhs1.add("Bedia");
		lhs1.add("Cemil");
		System.out.println(lhs1);//[Ali, Bedia, Cemil, Metin, Zehra]
		long endingTime3 = System.currentTimeMillis();
		System.out.println("LinkedHashSet Suresi: " + (endingTime3 - startingTime3));
		
	}

}
