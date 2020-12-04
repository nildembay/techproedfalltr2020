package day08ternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		
		/*
		 artık yıl(lep year) 100 e bölünen yıllardan 400 e bölünenler artık yıldır
		 			100 e bölünmeyenlerden 4 e bölünenler artık yıldır.
		 			
		 kullanıcıdan alınan yılın artık yıl olup olmadığını belirleyen kodu yazın
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("yılı girin");
		int year=scan.nextInt();
		
		String result=year%100==0 ? year%400==0 ? "artık yıl" : "artık yıl değil" : year%4==0 ? "artık yıl" : "artık yıl değil";
		System.out.println(result);
		scan.close();
	}

}
