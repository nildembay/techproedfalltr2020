package day13whileloop;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		/*
		 kullan�c�dan string al�n ve stringin tersini ekrana yazd�r�n
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir ifade giriniz");
		String text=scan.nextLine();		
		
		for (int i=text.length()-1; i>=0; i--) {
			System.out.print(text.substring(i,i+1)); // charAt de kullan�labilir text.charAt(i)
		}
		scan.close();
	}

}
