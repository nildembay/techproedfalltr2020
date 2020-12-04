package day36collections;

import java.util.HashSet;

public class HashSet01 {
	/*
	 1-Tekrarlý elemana müsaade edilmez. Set lerin içinde bir eleman sadece 1 kere kullanýlabilir.
	 
	 2-HashSetler set ler arasýnda en hýzlý olanýdýr.
	 
	 3-HashSet elemanlarý sýralamakla uðraþmaz. Elemanlarý rastgele dizer.
	 
	 4-HashSet null objesini eleman olarak kullanabilir.
	 
	 
	 */

	public static void main(String[] args) {
		
		HashSet <String> hs1=new HashSet<>();
		hs1.add("ali");
		hs1.add("Veli");
		hs1.add("Veli"); // hashSet e tekrarlý eleman yollarsanýz üstüne yazar.
		System.out.println(hs1);
		
		hs1.add(null);
		System.out.println(hs1);
		System.out.println(hs1.hashCode());// java her data için hashing tekniðini kullanarak bir kod üretir. bu kodu almak 
											// almak için hashCode kullanýlýr.
		
		

	}

}
