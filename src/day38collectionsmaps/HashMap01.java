package day38collectionsmaps;

import java.util.HashMap;

public class HashMap01 {
	
	/*
	 
	 1- map'ler key-value yap�s�n� kullan�rlar.
	 2- keyler tekrarl� de�er kabul etmez yani unique olmal�d�r. �rne�in kimlik no
	 3- value lar tekrarl� olabilirler  �rne�in isimler
	 4- �� farkl� map vard�r.
	 	a) HashMap : En �ok kullan�lan ve en h�zl�d�r. H�zl� olabilmek i�in s�ralamay� rastgele yapr.
	 				H�zl� olabilmek i�in synchronize olmazlar, thread-safe de�ildirler.
	 				Bir tane key null olabilir, birden fazla value null olabilir.
	 	b) HashTable :
	 	c) TreeMap :
	 
	 */

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.put(101, "Ali Han");// eleman eklemek i�in kullan�l�r. 
		hm1.put(102, "veli Can");
		hm1.put(103, "Ay�e Tan");
		hm1.put(101, "Kemal Y�ld�z"); // ayn� key kullan�ld���nda eski kayd�n �zerine yazar.
		System.out.println(hm1); //{101=Ali Han, 102=veli Can, 103=Ay�e Tan}
		
		hm1.put(104, "veli Can"); // tekrarl� value ya izin verir. map e ekler.
		System.out.println(hm1); //{101=Kemal Y�ld�z, 102=veli Can, 103=Ay�e Tan, 104=veli Can}
		
		hm1.put(null, "Ay�e Ay");
		System.out.println(hm1);  //{null=Ay�e Ay, 101=Kemal Y�ld�z, 102=veli Can, 103=Ay�e Tan, 104=veli Can}
		
		hm1.put(105, null);
		hm1.put(106, null);
		hm1.put(107, null);
		System.out.println(hm1); //{null=Ay�e Ay, 101=Kemal Y�ld�z, 102=veli Can, 103=Ay�e Tan, 104=veli Can, 105=null, 106=null, 107=null}
		
		System.out.println(hm1.get(102)); //veli Can  
		
		System.out.println(hm1.values()); //[Ay�e Ay, Kemal Y�ld�z, veli Can, Ay�e Tan, veli Can, null, null, null]
		
		System.out.println(hm1.keySet()); //[null, 101, 102, 103, 104, 105, 106, 107]
		
		System.out.println(hm1.getOrDefault(101, "�zg�n�m bu key i�in bir de�er yok"));
		System.out.println(hm1.getOrDefault(111, "�zg�n�m bu key i�in bir de�er yok"));
		
		hm1.putIfAbsent(108, "merve tahsin"); //{null=Ay�e Ay, 101=Kemal Y�ld�z, 102=veli Can, 103=Ay�e Tan, 104=veli Can, 105=null, 106=null, 107=null, 108=merve tahsin}
		System.out.println(hm1);
		
		System.out.println(hm1.putIfAbsent(103, "y�ld�z y�l")); //103 keye eklemez ��nk� burada bir de�er var...103 teki de�eri return eder.
		System.out.println(hm1);
		
		hm1.putIfAbsent(105, "y�ld�z y�l"); // value null ise java de�er yokmu� gibi davran�r ve y�ld�z y�l� ekler.
		System.out.println(hm1);
		
		System.out.println(hm1.remove(106));// bu eleman�n hem keyini hem value sunu siler. value de�erini return eder.
		System.out.println(hm1); 
		
		System.out.println(hm1.remove(102, "veli Can"));// key ve value �rt�i�rse siler ve true return eder.
		System.out.println(hm1);
		
		
		hm1.replace(104, "Asiye Can"); // 104 keye sahip value yu update eder. olmayan bir key ile kullan�rsan�z ekleme yapmaz
		System.out.println(hm1);
		
		hm1.replace(104, "Asiye Can","ramazan meydan");// iki �art sa�lan�rsa ismi Ramazan meydan yapar
		System.out.println(hm1);
		
		System.out.println(hm1.size()); //eleman say�s�n� verir.
		
		HashMap<Integer,String> hm2=new HashMap<>();
		hm2.put(202, "Cat");
		hm2.put(203, "Dog");
		
		
		hm1.putAll(hm2);  // bir mape ba�ka map eklemek i�in kullan�l�r. 
		// putAll methodu kulland���m�zda iki map deki key ve value lar�n data type i ayn� olmal�...
		System.out.println(hm1);
		
		
		
		
		
		
		
		
		
	}

}
