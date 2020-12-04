package day15variabletypesmethodcreations;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		/*
		 kullanýcýdan bir string alýn
		 bu string içinde kaç adet harf, kaç adet rakam,kaç adet rakam ve harf dýþý
		 karakter olduðunu bulan program
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
		
		System.out.println("harf sayýsý : "+ harfc);
		System.out.println("rakam sayýsyý : "+rakamc);
		System.out.println("diðer karakterler: "+ digerc);
		scan.close();
	}

}
