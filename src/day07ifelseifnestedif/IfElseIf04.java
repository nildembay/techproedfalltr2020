package day07ifelseifnestedif;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan bir y�l al�n e�er y�l 1000�e bulunuyorsa ekrana �Milenyum� yazd�r�n.
E�er y�l 100�e bulunuyorsa ekrana �Y�zy�l� yazd�r�n.
E�er y�l 10�a bulunuyorsa ekrana �Ony�l� yazd�r�n.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir y�l giriniz");
		int year=scan.nextInt();  
		
		if(year%1000==0) {
			System.out.println("milenyum");
		}else if(year%100==0) {
			System.out.println("y�zy�l");
		}else if(year%10==0) {
			System.out.println("ony�l");
		} else {
			System.out.println("s�radan bir y�l");
		}
		scan.close();
	}

}
