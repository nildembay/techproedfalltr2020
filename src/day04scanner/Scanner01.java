package day04scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		// kullanýcýdan data almak için
		
		Scanner scan=new Scanner(System.in);// Scanner class indan object ürettik.
		
		System.out.println("yasinizi giriniz"); //kullanýcýya mesaj verdik
		
		int age=scan.nextInt(); //kullanicinin verdigi datayi bir variable içerisine yerleþtirir.
		System.out.println("yaþýnýz: "+age);
		scan.close();
		
	}

}
