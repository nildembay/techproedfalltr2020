package day38collectionsmaps;

import java.util.HashMap;

public class HashMap01 {
	
	/*
	 
	 1- map'ler key-value yapýsýný kullanýrlar.
	 2- keyler tekrarlý deðer kabul etmez yani unique olmalýdýr. Örneðin kimlik no
	 3- value lar tekrarlý olabilirler  Örneðin isimler
	 4- Üç farklý map vardýr.
	 	a) HashMap : En çok kullanýlan ve en hýzlýdýr. Hýzlý olabilmek için sýralamayý rastgele yapr.
	 				Hýzlý olabilmek için synchronize olmazlar, thread-safe deðildirler.
	 				Bir tane key null olabilir, birden fazla value null olabilir.
	 	b) HashTable :
	 	c) TreeMap :
	 
	 */

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.put(101, "Ali Han");// eleman eklemek için kullanýlýr. 
		hm1.put(102, "veli Can");
		hm1.put(103, "Ayþe Tan");
		hm1.put(101, "Kemal Yýldýz"); // ayný key kullanýldýðýnda eski kaydýn üzerine yazar.
		System.out.println(hm1); //{101=Ali Han, 102=veli Can, 103=Ayþe Tan}
		
		hm1.put(104, "veli Can"); // tekrarlý value ya izin verir. map e ekler.
		System.out.println(hm1); //{101=Kemal Yýldýz, 102=veli Can, 103=Ayþe Tan, 104=veli Can}
		
		hm1.put(null, "Ayþe Ay");
		System.out.println(hm1);  //{null=Ayþe Ay, 101=Kemal Yýldýz, 102=veli Can, 103=Ayþe Tan, 104=veli Can}
		
		hm1.put(105, null);
		hm1.put(106, null);
		hm1.put(107, null);
		System.out.println(hm1); //{null=Ayþe Ay, 101=Kemal Yýldýz, 102=veli Can, 103=Ayþe Tan, 104=veli Can, 105=null, 106=null, 107=null}
		
		System.out.println(hm1.get(102)); //veli Can  
		
		System.out.println(hm1.values()); //[Ayþe Ay, Kemal Yýldýz, veli Can, Ayþe Tan, veli Can, null, null, null]
		
		System.out.println(hm1.keySet()); //[null, 101, 102, 103, 104, 105, 106, 107]
		
		System.out.println(hm1.getOrDefault(101, "üzgünüm bu key için bir deðer yok"));
		System.out.println(hm1.getOrDefault(111, "üzgünüm bu key için bir deðer yok"));
		
		hm1.putIfAbsent(108, "merve tahsin"); //{null=Ayþe Ay, 101=Kemal Yýldýz, 102=veli Can, 103=Ayþe Tan, 104=veli Can, 105=null, 106=null, 107=null, 108=merve tahsin}
		System.out.println(hm1);
		
		System.out.println(hm1.putIfAbsent(103, "yýldýz yýl")); //103 keye eklemez Çünkü burada bir deðer var...103 teki deðeri return eder.
		System.out.println(hm1);
		
		hm1.putIfAbsent(105, "yýldýz yýl"); // value null ise java deðer yokmuþ gibi davranýr ve yýldýz yýlý ekler.
		System.out.println(hm1);
		
		System.out.println(hm1.remove(106));// bu elemanýn hem keyini hem value sunu siler. value deðerini return eder.
		System.out.println(hm1); 
		
		System.out.println(hm1.remove(102, "veli Can"));// key ve value örtüiürse siler ve true return eder.
		System.out.println(hm1);
		
		
		hm1.replace(104, "Asiye Can"); // 104 keye sahip value yu update eder. olmayan bir key ile kullanýrsanýz ekleme yapmaz
		System.out.println(hm1);
		
		hm1.replace(104, "Asiye Can","ramazan meydan");// iki þart saðlanýrsa ismi Ramazan meydan yapar
		System.out.println(hm1);
		
		System.out.println(hm1.size()); //eleman sayýsýný verir.
		
		HashMap<Integer,String> hm2=new HashMap<>();
		hm2.put(202, "Cat");
		hm2.put(203, "Dog");
		
		
		hm1.putAll(hm2);  // bir mape baþka map eklemek için kullanýlýr. 
		// putAll methodu kullandýðýmýzda iki map deki key ve value larýn data type i ayný olmalý...
		System.out.println(hm1);
		
		
		
		
		
		
		
		
		
	}

}
