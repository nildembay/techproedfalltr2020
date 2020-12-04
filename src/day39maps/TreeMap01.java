package day39maps;

import java.util.TreeMap;

public class TreeMap01 {
	
	/*
	 1-TreeMap elemanlarý natural order(küçükten büyüðe,alfabetik) a göre sýralar. 
	 2-TreeMAp Maplerin en yavaþýdr
	 3- TreeMAplarde keyler için null kullanýlamaz..
	 4- TreeMaplerde value lar için null kullanýlabilir(istenildiði kadar)
	 5- TreeMap ler syncronized ve thread-safe deðillerdir.
	 */

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm1=new TreeMap<>();
		tm1.put(101,"Ali");
		tm1.put(105,"Bahadýr");
		tm1.put(104,"Ceylan");
		tm1.put(102,"Seyhan");
		tm1.put(103,"Ayhan");
		System.out.println(tm1);
		tm1.put(100, null);
		tm1.put(106, null);
		tm1.put(107, null);
		
		System.out.println(tm1); // keylere göre sýralar
		// tm1.put(null, "ceyhan"); NullPointerException verir.
		System.out.println(tm1.ceilingEntry(99)); //key varsa aynýsýný verir, yoksa ona en yakýn büyüðüü verir.
		System.out.println(tm1.ceilingEntry(108)); // verilen keyden büyük bir key yoksa null return eder
		System.out.println(tm1.descendingKeySet()); // keyleri büyükten küçüðe sýralayarak gösterir.
		System.out.println(tm1.keySet()); // keyleri küçükten büyüðe yazdýrýr.
		
		// ascending order-->artan sýralama
		// descending order--> azalan sýralama
		
		System.out.println(tm1.firstKey()); // en küçük key numarasý
		System.out.println(tm1.lastKey());  //en büyük key numarasý
		
	}

}
