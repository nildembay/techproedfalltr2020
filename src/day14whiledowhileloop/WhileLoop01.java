package day14whiledowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		/*kullan�c�dan isim ve soyismini alal�m. 
		 * kullan�c�n�n ilk isminin ilk harfinden soy isminin son harfine kadar 
		 * olan harfleri b�y�k harf olarak ekrana ayn� sat�rda aralar�na bo�luk b�rakarak yaz�n
		 nil�fer
		 demir
		 
		 n o p q r 
		
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ad�n�z� ve soyad�n�z� giriniz");
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
