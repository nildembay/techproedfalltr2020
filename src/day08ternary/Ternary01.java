package day08ternary;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		int s=scan.nextInt();
		
		String result=s>9 ? "rakam de�il" : "rakam";
		System.out.println(result);
		
		System.out.println(s>99 && s<1000 ? "�� basamakl�" : s );
		
		scan.close();
	}

}
