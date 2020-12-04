package day07ifelseifnestedif;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*
		Kullanýcýdan bir üçgenin  üç kenar uzunluðunu alýn eðer üç kenar uzunluðu birbirine eþit ise ekrana
“Eþkenar üçgen” yazdýrýn. Sadece iki kenar uzunluðu birbirine eþit ise ekrana “Ikizkenar üçgen”
yazdýrýn. Tüm kenar uzunluklarý birbirinden farklý ise “Çeþitkenar üçgen yazdýrýn”
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("bir üçgene ait üç kenar uzunluðunu giriniz");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
		
		if(a==b && b==c) {
			System.out.println("Eþkenar üçgen");
		}else if(a==b || b==c || a==c) {
			System.out.println("Ýkizkenar üçgen");
			
		}else {
			System.out.println("çeþitkenar üçgen");
		}
		scan.close();

	}

}
