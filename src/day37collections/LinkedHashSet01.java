package day37collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
	
	/*
	 LinkedHashSet ler
	 
	 1- tekrarlý eleman kabul etmezler.
	 2- elemanlarý ekleme sýrasýna göre dizerler.(insertion order)
	 3- LinkedHashSet, HashSetten yavaþtýr.
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
