package day14whiledowhileloop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {

		//kullanýcýdan sayý alýnýz.
		//sayý 10'dan küçük ise "kazandýnýz" yazdýrýn
		// sayý 10 veya 10 dan büyükse ekrana "sayý giriniz". yazdýrýn
		
		int sayi=0;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("bir sayý gir");
			  sayi=scan.nextInt();
			
		}while(sayi>=10);
		
		System.out.println("kazandýnýz");
		scan.close();

	}

}
