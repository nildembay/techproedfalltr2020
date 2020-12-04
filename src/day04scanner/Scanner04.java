package day04scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
	
	//kullanýcýdan uzun ve kýsa kenarlarý alýnan dikdörtgenin alan ve cevresini hesaplayýp ekrana yazdýrýr.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("dikdörtgenin kýsa kenarýný gir");
		double a=scan.nextDouble();
		
		System.out.println("dikdörtgenin uzun kenarýný gir");
		double b=scan.nextDouble();
		
		System.out.println("dikdörtgenin alaný:"+a*b);
		System.out.println("dikdörtgenin çevresi:"+2*(a+b));
		scan.close();
		
	}

}
