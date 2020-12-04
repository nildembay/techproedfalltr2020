package day08ternary;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
	
		/*
		 Kullanýcýdan bir üçgenin  üç kenar uzunluðunu alýn eðer iki kenar uzunluðu birbirine eþit ise ekrana
“Ikizkenar Ucgen” yazdýrýn. Diðer durumlarda ekrana “Ikizkenar deðil” yazdýrýn.
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("üçgenin kenar uzunluklarýný giriniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		String result= a==b || b==c ||a==c ? "ikizkenar" : "ikizkenar deðil";
		System.out.println(result);
		scan.close();
	}

}
