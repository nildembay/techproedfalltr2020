package day14whiledowhileloop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {

		//kullan�c�dan say� al�n�z.
		//say� 10'dan k���k ise "kazand�n�z" yazd�r�n
		// say� 10 veya 10 dan b�y�kse ekrana "say� giriniz". yazd�r�n
		
		int sayi=0;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("bir say� gir");
			  sayi=scan.nextInt();
			
		}while(sayi>=10);
		
		System.out.println("kazand�n�z");
		scan.close();

	}

}
