package day04scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
	
	//kullan�c�dan uzun ve k�sa kenarlar� al�nan dikd�rtgenin alan ve cevresini hesaplay�p ekrana yazd�r�r.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("dikd�rtgenin k�sa kenar�n� gir");
		double a=scan.nextDouble();
		
		System.out.println("dikd�rtgenin uzun kenar�n� gir");
		double b=scan.nextDouble();
		
		System.out.println("dikd�rtgenin alan�:"+a*b);
		System.out.println("dikd�rtgenin �evresi:"+2*(a+b));
		scan.close();
		
	}

}
