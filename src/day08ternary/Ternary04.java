package day08ternary;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		
		
/*
 Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn. Eðer urun miktarý 1000 den fazla ise
Kullanýcýya %10 indirim yapýn ve ödemesi gereken toplam parayý ekrana yazdýrýn. Diðer durumlarda
ödemesi gereken toplam parayý herhangi bir indirim yapmadan ekrana yazdýrýn.
 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ürün adedini girin");
		int adet=scan.nextInt();
		System.out.println("birim fiyatýný girin");
		double bFiyat=scan.nextDouble();
		
		double result= adet>1000 ? bFiyat*0.9*adet : adet*bFiyat;
		System.out.println(result);
		scan.close();
		
	}

}
