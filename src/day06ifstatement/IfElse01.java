package day06ifstatement;

import java.util.Scanner;

public class IfElse01 {
	public static void main(String[] args) {
		// if it rains i will go to Mall else i will go to picnic
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir tamsayi giriniz");
		int sayi=scan.nextInt();
		if (sayi>=0) {
			System.out.println("negatif deðil");
		}	else {
			System.out.println("sayi negatif");
		}
		
		
		
		scan.close();
	}

}
