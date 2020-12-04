package day06ifstatement;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 kullanýcýdan karakter alalým bu karakter büyük harf se büyük harf yazdýrýn. küçük harf ise küçük harf yazdýrýn.
		 harf deðilse harf deðil yazdýrýn
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir karakter giriniz");
		char ch=scan.next().charAt(0);

		if(ch>='A' && ch<='Z') {
			System.out.println("büyük harf");
	
		}
		if(ch>='a' && ch<='z') {
			System.out.println("küçük harf");
	
		}
		if (!(ch>='A' && ch<='Z') && !(ch>='a' && ch<='z')) {
		System.out.println("harf deðil");
	
		}
		
			scan.close();
	

	}

}
