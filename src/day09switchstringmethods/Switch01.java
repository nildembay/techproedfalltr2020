package day09switchstringmethods;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
	
		/*
		 kullan�c� hafta g�n�n�n say�s�n� girsin. program haftan�n g�n�n� yazs�n
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("g�n say�s�n� giriniz");
		int gun=scan.nextInt();
		switch (gun) {
			case 1:	System.out.println("pazartesi"); break;
			case 2:	System.out.println("sal�");break;
			case 3:	System.out.println("�ar�amba");break;
			case 4:	System.out.println("per�embe");break;
			case 5:	System.out.println("cuma");break;
			case 6:	System.out.println("cumartesi");break;
			case 7:	System.out.println("pazar");break;
			default:System.out.println("ge�erli g�n say�s� giriniz");
		}
		scan.close();
		
	}

}
