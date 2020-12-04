package day39maps;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable01 {

	/*
	**********önemli******* 1- HashMap ve TreeMap synchorized ve thread-safe deðildir. Map ler arasýnda synchorized ve thread-safe olan
	 bir map e ihtiyaç vardýr. bu yüzden HashTable oluþtrulmuþturç
	 
	 2-HashTable key yada value için "null" kullanmaz
	 
	 3- HashTable elemanlarý rastgele sýralar.
	 
	 4- hashmap<hashtable<treemap     hýz bakýmýndan
	 */
	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht1=new Hashtable<Integer,String>();
		ht1.put(101, "Ali");
		ht1.put(105, "Veli");
		ht1.put(104, "Ayhan");
		ht1.put(103, "Alaaddin");
		ht1.put(102, "Ramazan");
		
		//ht1.put(null, "Beyhan"); // nullpointerexception throw eder
		//ht1.put(106, null);	   // nullpointerexception throw eder
		
		System.out.println(ht1);
		
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.put(201, "þeyda");
		hm1.put(202, "ramazan");
		ht1.putAll(hm1);
		System.out.println(ht1);
		
		
		

	}

}
