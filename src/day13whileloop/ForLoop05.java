package day13whileloop;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		/*
		 kullanıcıdan string alın ve stringin tersini ekrana yazdırın
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir ifade giriniz");
		String text=scan.nextLine();		
		
		for (int i=text.length()-1; i>=0; i--) {
			System.out.print(text.substring(i,i+1)); // charAt de kullanılabilir text.charAt(i)
		}
		scan.close();
	}

}
