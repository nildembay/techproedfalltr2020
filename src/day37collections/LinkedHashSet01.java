package day37collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
	
	/*
	 LinkedHashSet ler
	 
	 1- tekrarl� eleman kabul etmezler.
	 2- elemanlar� ekleme s�ras�na g�re dizerler.(insertion order)
	 3- LinkedHashSet, HashSetten yava�t�r.
	 4- 
	 */
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs1=new LinkedHashSet<>();
		lhs1.add("Ali");
		lhs1.add("Canan");
		lhs1.add("Veli");
		lhs1.add("Remziye");
		System.out.println(lhs1);
		
		
	}
	

}
