package day07ifelseifnestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		
		/*
		 Kullan�c�dan bir say� al�n. 
		 E�er say� pozitif ise;
		 	10 dan b�y�k olup olmad���n� kontrol edin. 10 dan b�y�kse "b�y�ks�n", 10'dan k���k veya e�it ise "normalsin"
		 E�er say� pozitif de�ilse;
		-10 dan b�y�k olup olmad���n� kontrol edin. -10 dan b�y�kse "negatifsin", -10'dan k���k veya e�it ise "�ok negatifsin"
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tamsayi giriniz");
		int num=scan.nextInt();  
		
		if(num>0) {
			
			if(num>10) {
				System.out.println("b�y�ks�n");
			}else {
				System.out.println("normalsin");
			}
		}
		else {
			if(num>-10) {
				System.out.println("negatifsin");
			}else {
				System.out.println("�ok negatifsin");
			}
			
			
		}
		scan.close();
		
		
		
		
	}

}
