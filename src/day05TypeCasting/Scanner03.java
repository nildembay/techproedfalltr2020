package day05TypeCasting;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		/*
		 kullan�c�n�n girdii 4 basamakl� say�n�n ilk ve son rakam�n�n toplam�n� ekrana yazd�ran program
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("d�rt basamakl� bir say� gir");
		int s=scan.nextInt();
		int sonRakam=s % 10;
		int ilkRakam=s / 1000;
		System.out.println("ilk ve son rakam�n toplam�: "+(sonRakam+ilkRakam));
		scan.close();

	}

}
