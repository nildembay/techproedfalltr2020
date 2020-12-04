package day08ternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		
		/*
		 art�k y�l(lep year) 100 e b�l�nen y�llardan 400 e b�l�nenler art�k y�ld�r
		 			100 e b�l�nmeyenlerden 4 e b�l�nenler art�k y�ld�r.
		 			
		 kullan�c�dan al�nan y�l�n art�k y�l olup olmad���n� belirleyen kodu yaz�n
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("y�l� girin");
		int year=scan.nextInt();
		
		String result=year%100==0 ? year%400==0 ? "art�k y�l" : "art�k y�l de�il" : year%4==0 ? "art�k y�l" : "art�k y�l de�il";
		System.out.println(result);
		scan.close();
	}

}
