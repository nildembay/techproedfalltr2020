package day05TypeCasting;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		/*
		 kullanýcýnýn girdii 4 basamaklý sayýnýn ilk ve son rakamýnýn toplamýný ekrana yazdýran program
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("dört basamaklý bir sayý gir");
		int s=scan.nextInt();
		int sonRakam=s % 10;
		int ilkRakam=s / 1000;
		System.out.println("ilk ve son rakamýn toplamý: "+(sonRakam+ilkRakam));
		scan.close();

	}

}
