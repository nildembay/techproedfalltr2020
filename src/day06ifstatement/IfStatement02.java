package day06ifstatement;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		
		/*
		 kullan�c�dan say� al�n ve bu say� �ift say� ise console cift tek ise tek yazd�r�n
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir tamsayi  giriniz");
		
		int a=scan.nextInt();
		if (a%2==0) {
			System.out.println("say� �ifttir");
		}
		if (a%2!=0) {
			System.out.println("say� tektir");
		}
		scan.close();
	}

}
