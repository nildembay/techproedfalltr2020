package day39maps;

import java.util.TreeMap;

public class TreeMap01 {
	
	/*
	 1-TreeMap elemanlar� natural order(k���kten b�y��e,alfabetik) a g�re s�ralar. 
	 2-TreeMAp Maplerin en yava��dr
	 3- TreeMAplarde keyler i�in null kullan�lamaz..
	 4- TreeMaplerde value lar i�in null kullan�labilir(istenildi�i kadar)
	 5- TreeMap ler syncronized ve thread-safe de�illerdir.
	 */

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm1=new TreeMap<>();
		tm1.put(101,"Ali");
		tm1.put(105,"Bahad�r");
		tm1.put(104,"Ceylan");
		tm1.put(102,"Seyhan");
		tm1.put(103,"Ayhan");
		System.out.println(tm1);
		tm1.put(100, null);
		tm1.put(106, null);
		tm1.put(107, null);
		
		System.out.println(tm1); // keylere g�re s�ralar
		// tm1.put(null, "ceyhan"); NullPointerException verir.
		System.out.println(tm1.ceilingEntry(99)); //key varsa ayn�s�n� verir, yoksa ona en yak�n b�y���� verir.
		System.out.println(tm1.ceilingEntry(108)); // verilen keyden b�y�k bir key yoksa null return eder
		System.out.println(tm1.descendingKeySet()); // keyleri b�y�kten k����e s�ralayarak g�sterir.
		System.out.println(tm1.keySet()); // keyleri k���kten b�y��e yazd�r�r.
		
		// ascending order-->artan s�ralama
		// descending order--> azalan s�ralama
		
		System.out.println(tm1.firstKey()); // en k���k key numaras�
		System.out.println(tm1.lastKey());  //en b�y�k key numaras�
		
	}

}
