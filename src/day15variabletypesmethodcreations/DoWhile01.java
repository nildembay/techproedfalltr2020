package day15variabletypesmethodcreations;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		/*
		 kullan�c�dan bir string al�n
		 bu string i�inde ka� adet harf, ka� adet rakam,ka� adet rakam ve harf d���
		 karakter oldu�unu bulan program
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir String giriniz");
		String s=scan.nextLine();
		int digerc=0;
		int rakamc=0;
		int harfc=0;
		int k=0;
		do {
			if (s.charAt(k)>='a' && s.charAt(k)<='z') {
				harfc++;
			}else if (s.charAt(k)>='0' && s.charAt(k)<='9') {
				rakamc++;
			}else {
				digerc++;
			}
			k++;
			
		} while (k<s.length());
		
		System.out.println("harf say�s� : "+ harfc);
		System.out.println("rakam say�sy� : "+rakamc);
		System.out.println("di�er karakterler: "+ digerc);
		scan.close();
	}

}
