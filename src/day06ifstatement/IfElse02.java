package day06ifstatement;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		
		/*
		 kullanýcýdan bir karakter aliniz. bu karakter harf ise console "harf" yazdirin
		 deðil ise "harf deðil" yazdýrýn.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir harf giriniz");
		char ch=scan.next().charAt(0);
		if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') ) {
			System.out.println("harf");
		}else {
			System.out.println("harf deðil");
		}
			

		scan.close();
	}

}
