package day07ifelseifnestedif;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*
		Kullan�c�dan bir ��genin  �� kenar uzunlu�unu al�n e�er �� kenar uzunlu�u birbirine e�it ise ekrana
�E�kenar ��gen� yazd�r�n. Sadece iki kenar uzunlu�u birbirine e�it ise ekrana �Ikizkenar ��gen�
yazd�r�n. T�m kenar uzunluklar� birbirinden farkl� ise ��e�itkenar ��gen yazd�r�n�
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("bir ��gene ait �� kenar uzunlu�unu giriniz");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
		
		if(a==b && b==c) {
			System.out.println("E�kenar ��gen");
		}else if(a==b || b==c || a==c) {
			System.out.println("�kizkenar ��gen");
			
		}else {
			System.out.println("�e�itkenar ��gen");
		}
		scan.close();

	}

}
