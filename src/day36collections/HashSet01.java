package day36collections;

import java.util.HashSet;

public class HashSet01 {
	/*
	 1-Tekrarl� elemana m�saade edilmez. Set lerin i�inde bir eleman sadece 1 kere kullan�labilir.
	 
	 2-HashSetler set ler aras�nda en h�zl� olan�d�r.
	 
	 3-HashSet elemanlar� s�ralamakla u�ra�maz. Elemanlar� rastgele dizer.
	 
	 4-HashSet null objesini eleman olarak kullanabilir.
	 
	 
	 */

	public static void main(String[] args) {
		
		HashSet <String> hs1=new HashSet<>();
		hs1.add("ali");
		hs1.add("Veli");
		hs1.add("Veli"); // hashSet e tekrarl� eleman yollarsan�z �st�ne yazar.
		System.out.println(hs1);
		
		hs1.add(null);
		System.out.println(hs1);
		System.out.println(hs1.hashCode());// java her data i�in hashing tekni�ini kullanarak bir kod �retir. bu kodu almak 
											// almak i�in hashCode kullan�l�r.
		
		

	}

}
