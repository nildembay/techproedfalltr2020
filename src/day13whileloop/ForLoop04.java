package day13whileloop;

import java.util.Scanner;

public class ForLoop04 {
	public static void main(String[] args) {
	
		//sat�r say�s�n� kullan�c�dan alarak a�a��daki gibi �ekil olu�turun
		/*			* * * * *
		 			 * * * *
		 			  * * *
		 			   * *
		 			   	*
			 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("ka� adet y�ld�z istiyorsunuz");
		int a=scan.nextInt();
		
		for (int i=1; i<=a; i++) {
			
			for (int j=1; j<=i-1; j++) {
				System.out.print(" ");
				}
			for (int k=i; k<=a; k++) {
				System.out.print("* ");
				}			
			System.out.println();
		}
		 
		scan.close();		
	}
	
}
	
	
