package day08ternary;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
	
		/*
		 Kullan�c�dan bir ��genin  �� kenar uzunlu�unu al�n e�er iki kenar uzunlu�u birbirine e�it ise ekrana
�Ikizkenar Ucgen� yazd�r�n. Di�er durumlarda ekrana �Ikizkenar de�il� yazd�r�n.
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("��genin kenar uzunluklar�n� giriniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		String result= a==b || b==c ||a==c ? "ikizkenar" : "ikizkenar de�il";
		System.out.println(result);
		scan.close();
	}

}
