package day07ifelseifnestedif;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		
		/*
		 Kullan�c�dan bir tamsay� al�n e�er tamsay� 0 dan kucuk ise ekrana �Negatif� yazd�r�n.
0 ise ekrana �N�tr� yazd�r�n. 0 dan b�y�k ise ekrana �Pozitif� yazd�r�n.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir say� giriniz");
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
