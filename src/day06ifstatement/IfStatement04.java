package day06ifstatement;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		
		
		/*
		 kullanıcıdan bir sayı alın. 3 basamaklı ise console "3 basamaklı" ,sayı iki basamklı ise "iki basamaklı", 
		 sayı 2 veya 3 basamaklı değilse console "ikiside değil" yazdır.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir pozitif tamsayi giriniz");
		int sayi=scan.nextInt();
		if(sayi>99 && sayi<=999) {
			System.out.println("sayi 3 basamaklı");
			
		}
		if (sayi>9 && sayi<=99) {
			System.out.println("sayı iki basamaklı");
		}
		
		if(!(sayi>99 && sayi<=999) && !(sayi>9 && sayi<=99)) {
			System.out.println("sayi iki yada üç basamaklı değil");
		}
		scan.close();
	}

}
