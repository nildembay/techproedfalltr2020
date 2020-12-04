package day23foreachloopdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachSoru02 {
	
	static int no=1000;

	public static void main(String[] args) {
		/*
		 Giriþ yýlý ve ad soyadý kullanýcýdan alýnýz.
		 giriþ yýlý+ad ve soyadýn ilk harfi+sýra numarasý þeklinde öðrenci numarasý oluþturan parogramý yazýnýz.
		 */
	
		Scanner scan=new Scanner(System.in);
		String isim="";
	//	int yýl=2020;
		List<String> isimler=new ArrayList<>();
	
		do {
					
			System.out.println("adýnýzý ve soyadýnýzý giriniz");
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
