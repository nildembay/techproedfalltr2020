package day05TypeCasting;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		/*
		 Kenar uzunluklar� kullan�c�dan al�nan bir ��genin �evresini hesaplayan bir
Program yaz�n�z. (byte kullan�n�z)
Not 1: ��genin Cevresi: a + b + c
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("��genin kenar uzunluklar�n� giriniz");
		byte k1=scan.nextByte();
		byte k2=scan.nextByte();
		byte k3=scan.nextByte();
		
		int cevre = k1 + k2 + k3;
		System.out.println("��genin �evresi: "+cevre);//parantez i�leri basit olmal�d�r.
		scan.close();
		
	}

}
