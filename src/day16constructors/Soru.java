package day16constructors;

import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		/*
		 Kullanýcýya sayý girmesini söyleyin. Kullanýcý sýfýr girdiðinde, ekrana o ana kadar girmiþ olduðu
tüm sayýlarýn toplamýný yazdýrýnýz.
Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdýrýn
		 */
		Scanner scan=new Scanner(System.in);
		int num=0;
		int sayi=0;
		do {
			
			System.out.println("bir sayý giriniz");
			sayi=scan.nextInt();
			num+=sayi;
			
		} while (!(sayi==0));
		System.out.println("girilen sayýlarýn toplamý: "+ num);
		scan.close();
		
		
		
	}

}
