package day06ifstatement;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
	/*
	 girilen sayinin mutlak de�erini veren program
	 */
		Scanner scan=new Scanner(System.in);
		System.out.println("bir tamsayi giriniz");
		int sayi=scan.nextInt();
		if(sayi>=0) {
			System.out.println("mutlak de�er : "+sayi);
		}else {
			System.out.println("mutlak de�er : "+ (-1*sayi));
		}
		scan.close();
	}

}
