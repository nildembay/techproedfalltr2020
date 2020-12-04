package day04scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("isminizi giriniz");
		String name=scan.nextLine();
		System.out.println("hoþgeldin "+name);
		scan.close();
	}

}
