package day08ternary;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		int s=scan.nextInt();
		String a=s<0 ? "negatif" : "negatif de�il";
		System.out.println(a);
		scan.close();
		
	}

}
