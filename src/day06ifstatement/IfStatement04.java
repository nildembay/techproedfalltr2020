package day06ifstatement;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		
		
		/*
		 kullan�c�dan bir say� al�n. 3 basamakl� ise console "3 basamakl�" ,say� iki basamkl� ise "iki basamakl�", 
		 say� 2 veya 3 basamakl� de�ilse console "ikiside de�il" yazd�r.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir pozitif tamsayi giriniz");
		int sayi=scan.nextInt();
		if(sayi>99 && sayi<=999) {
			System.out.println("sayi 3 basamakl�");
			
		}
		if (sayi>9 && sayi<=99) {
			System.out.println("say� iki basamakl�");
		}
		
		if(!(sayi>99 && sayi<=999) && !(sayi>9 && sayi<=99)) {
			System.out.println("sayi iki yada �� basamakl� de�il");
		}
		scan.close();
	}

}
