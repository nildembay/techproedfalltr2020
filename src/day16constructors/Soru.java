package day16constructors;

import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		/*
		 Kullan�c�ya say� girmesini s�yleyin. Kullan�c� s�f�r girdi�inde, ekrana o ana kadar girmi� oldu�u
t�m say�lar�n toplam�n� yazd�r�n�z.
Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazd�r�n
		 */
		Scanner scan=new Scanner(System.in);
		int num=0;
		int sayi=0;
		do {
			
			System.out.println("bir say� giriniz");
			sayi=scan.nextInt();
			num+=sayi;
			
		} while (!(sayi==0));
		System.out.println("girilen say�lar�n toplam�: "+ num);
		scan.close();
		
		
		
	}

}
