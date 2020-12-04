package day07ifelseifnestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		
		/*
		 Kullanýcýdan bir sayý alýn. 
		 Eðer sayý pozitif ise;
		 	10 dan büyük olup olmadýðýný kontrol edin. 10 dan büyükse "büyüksün", 10'dan küçük veya eþit ise "normalsin"
		 Eðer sayý pozitif deðilse;
		-10 dan büyük olup olmadýðýný kontrol edin. -10 dan büyükse "negatifsin", -10'dan küçük veya eþit ise "çok negatifsin"
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tamsayi giriniz");
		int num=scan.nextInt();  
		
		if(num>0) {
			
			if(num>10) {
				System.out.println("büyüksün");
			}else {
				System.out.println("normalsin");
			}
		}
		else {
			if(num>-10) {
				System.out.println("negatifsin");
			}else {
				System.out.println("çok negatifsin");
			}
			
			
		}
		scan.close();
		
		
		
		
	}

}
