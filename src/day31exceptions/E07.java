package day31exceptions;

import java.util.Scanner;

/*
 		IllegalArgumentException
 */

public class E07 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("yaþýnýzý giriniz");
		int age=scan.nextInt();
		try {
			if (age<0) {
				throw new IllegalArgumentException();
			}else {
				System.out.println("yaþýnýz: "+age);
			}
		}catch(IllegalArgumentException e) {
			System.out.println("yaþýnýzý negatif girdiniz.");
		}
		
		scan.close();
		
	}

}
