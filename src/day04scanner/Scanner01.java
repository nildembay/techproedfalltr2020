package day04scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		// kullan�c�dan data almak i�in
		
		Scanner scan=new Scanner(System.in);// Scanner class indan object �rettik.
		
		System.out.println("yasinizi giriniz"); //kullan�c�ya mesaj verdik
		
		int age=scan.nextInt(); //kullanicinin verdigi datayi bir variable i�erisine yerle�tirir.
		System.out.println("ya��n�z: "+age);
		scan.close();
		
	}

}
