package day06ifstatement;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		
		/*
		 kullanýcýdan sayý alýn ve bu sayý çift sayý ise console cift tek ise tek yazdýrýn
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir tamsayi  giriniz");
		
		int a=scan.nextInt();
		if (a%2==0) {
			System.out.println("sayý çifttir");
		}
		if (a%2!=0) {
			System.out.println("sayý tektir");
		}
		scan.close();
	}

}
