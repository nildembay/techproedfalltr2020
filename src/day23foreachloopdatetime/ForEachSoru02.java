package day23foreachloopdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachSoru02 {
	
	static int no=1000;

	public static void main(String[] args) {
		/*
		 Giri� y�l� ve ad soyad� kullan�c�dan al�n�z.
		 giri� y�l�+ad ve soyad�n ilk harfi+s�ra numaras� �eklinde ��renci numaras� olu�turan parogram� yaz�n�z.
		 */
	
		Scanner scan=new Scanner(System.in);
		String isim="";
	//	int y�l=2020;
		List<String> isimler=new ArrayList<>();
	
		do {
					
			System.out.println("ad�n�z� ve soyad�n�z� giriniz");
			isim=scan.nextLine().toUpperCase();
			if (!isim.equalsIgnoreCase("X")) {
				isimler.add(isim);
			}
		}while (!isim.equalsIgnoreCase("X"));
	
		System.out.println(isimler);
		
		for (String w:isimler) {
			
			System.out.println(w+" id "+20+""+w.charAt(0)+w.charAt(w.indexOf(" ")+1)+no);	
			no++;
			
		}
		
		scan.close();
		
		
			
		
	}

}
