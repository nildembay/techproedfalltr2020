package day14whiledowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		/*kullanýcýdan isim ve soyismini alalým. 
		 * kullanýcýnýn ilk isminin ilk harfinden soy isminin son harfine kadar 
		 * olan harfleri büyük harf olarak ekrana ayný satýrda aralarýna boþluk býrakarak yazýn
		 nilüfer
		 demir
		 
		 n o p q r 
		
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("adýnýzý ve soyadýnýzý giriniz");
		char ilk=scan.nextLine().toUpperCase().charAt(0);
		String soy=scan.nextLine().toUpperCase();
		char son=soy.charAt(soy.length()-1);
		if (ilk<=son) {
		while (ilk<=son) {
			System.out.print(ilk + " ");
			ilk++;
		}}else {
			while (son<=ilk) {
				System.out.print(son + " ");
				son++;
			}
		}
		scan.close();
	}

}
