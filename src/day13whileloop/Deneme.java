package day13whileloop;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		
		/*
        Satir sayisini kullanicidan alarak asagidaki gibi sekil olusturunuz
                  *******
                   *****
                    ***
                     *
       */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("kaç satır olsun");
		int a=scan.nextInt();
		
		for (int i=1; i<=a; i++) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=i; k<=2*a-i; k++) {
				System.out.print("*");
			}
				
			
			System.out.println();
		}
		scan.close();
	}

}
