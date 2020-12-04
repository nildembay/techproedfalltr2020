package day13whileloop;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int a=scan.nextInt();
		
		int i=1;
			while (i<=10) {
				System.out.println(a+" x "+ i +" = " + (i*a));
				i++;
			}
		
		scan.close();
		
	}

}
