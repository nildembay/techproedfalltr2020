package day13whileloop;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 for loop kullanarak a�a��daki �ekli olu�turunuz
		     *
		    * *
		   * * *
		  * * * *
		 * * * * *
		 
		 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("ka� adet y�ld�z istiyorsunuz");
		int a=scan.nextInt();
		
		for (int i=1; i<=a; i++) {
			for (int j=a-1; j>=i; j--) {
				System.out.print(" ");
				}
			for (int k=1; k<=i; k++) {
				System.out.print("* ");
				}
			System.out.println();
		}
		 
		scan.close();
		
	}

}
