package day08ternary;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		
		
/*
 Kullan�c�dan alaca�� �r�n miktar�n� ve �r�n�n birim fiyat�n� al�n. E�er urun miktar� 1000 den fazla ise
Kullan�c�ya %10 indirim yap�n ve �demesi gereken toplam paray� ekrana yazd�r�n. Di�er durumlarda
�demesi gereken toplam paray� herhangi bir indirim yapmadan ekrana yazd�r�n.
 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�r�n adedini girin");
		int adet=scan.nextInt();
		System.out.println("birim fiyat�n� girin");
		double bFiyat=scan.nextDouble();
		
		double result= adet>1000 ? bFiyat*0.9*adet : adet*bFiyat;
		System.out.println(result);
		scan.close();
		
	}

}
