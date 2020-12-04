package day07ifelseifnestedif;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan bir yýl alýn eðer yýl 1000’e bulunuyorsa ekrana “Milenyum” yazdýrýn.
Eðer yýl 100’e bulunuyorsa ekrana “Yüzyýl” yazdýrýn.
Eðer yýl 10’a bulunuyorsa ekrana “Onyýl” yazdýrýn.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir yýl giriniz");
		int year=scan.nextInt();  
		
		if(year%1000==0) {
			System.out.println("milenyum");
		}else if(year%100==0) {
			System.out.println("yüzyýl");
		}else if(year%10==0) {
			System.out.println("onyýl");
		} else {
			System.out.println("sýradan bir yýl");
		}
		scan.close();
	}

}
