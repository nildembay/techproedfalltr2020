package day09switchstringmethods;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
	
		/*
		 kullanýcý hafta gününün sayýsýný girsin. program haftanýn gününü yazsýn
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("gün sayýsýný giriniz");
		int gun=scan.nextInt();
		switch (gun) {
			case 1:	System.out.println("pazartesi"); break;
			case 2:	System.out.println("salý");break;
			case 3:	System.out.println("çarþamba");break;
			case 4:	System.out.println("perþembe");break;
			case 5:	System.out.println("cuma");break;
			case 6:	System.out.println("cumartesi");break;
			case 7:	System.out.println("pazar");break;
			default:System.out.println("geçerli gün sayýsý giriniz");
		}
		scan.close();
		
	}

}
