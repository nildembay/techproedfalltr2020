package day07ifelseifnestedif;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		
		/*
		 Kullanýcýdan bir tamsayý alýn eðer tamsayý 0 dan kucuk ise ekrana “Negatif” yazdýrýn.
0 ise ekrana “Nötr” yazdýrýn. 0 dan büyük ise ekrana “Pozitif” yazdýrýn.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		double d=scan.nextDouble();
		if(d<0) {
			System.out.println("negatif");
			
		}else if(d==0) {
			System.out.println("notr");
		}else {
			System.out.println("pozitif");
		}
		scan.close();
		
	}

}
