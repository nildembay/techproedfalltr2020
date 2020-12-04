package day05TypeCasting;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		/*
		 Kenar uzunluklarý kullanýcýdan alýnan bir üçgenin çevresini hesaplayan bir
Program yazýnýz. (byte kullanýnýz)
Not 1: Üçgenin Cevresi: a + b + c
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("üçgenin kenar uzunluklarýný giriniz");
		byte k1=scan.nextByte();
		byte k2=scan.nextByte();
		byte k3=scan.nextByte();
		
		int cevre = k1 + k2 + k3;
		System.out.println("üçgenin çevresi: "+cevre);//parantez içleri basit olmalýdýr.
		scan.close();
		
	}

}
