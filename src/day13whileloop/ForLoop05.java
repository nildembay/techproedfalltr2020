package day13whileloop;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		/*
		 kullanýcýdan string alýn ve stringin tersini ekrana yazdýrýn
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir ifade giriniz");
		String text=scan.nextLine();		
		
		for (int i=text.length()-1; i>=0; i--) {
			System.out.print(text.substring(i,i+1)); // charAt de kullanýlabilir text.charAt(i)
		}
		scan.close();
	}

}
