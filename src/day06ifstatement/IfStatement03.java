package day06ifstatement;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 kullan�c�dan karakter alal�m bu karakter b�y�k harf se b�y�k harf yazd�r�n. k���k harf ise k���k harf yazd�r�n.
		 harf de�ilse harf de�il yazd�r�n
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir karakter giriniz");
		char ch=scan.next().charAt(0);

		if(ch>='A' && ch<='Z') {
			System.out.println("b�y�k harf");
	
		}
		if(ch>='a' && ch<='z') {
			System.out.println("k���k harf");
	
		}
		if (!(ch>='A' && ch<='Z') && !(ch>='a' && ch<='z')) {
		System.out.println("harf de�il");
	
		}
		
			scan.close();
	

	}

}
