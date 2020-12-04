package day06ifstatement;

import java.util.Scanner;

public class Swap01 {

	public static void main(String[] args) {
		
		/*
		 a variable ýn deðeri 12, b variable nýn deðeri 25 olsun.
		 öyle bir kod yazýnýz ki a 25, b 12 olsun
		 */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("iki sayi giriniz");
		
		double a=scan.nextDouble();
		double b=scan.nextDouble();
 	//1. yol
 	
 	 	double temp=0;//temp gecici olan variable a verdigimiz isim
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a= " +a+ " b= "+b);
		System.out.println("===============");
 
		
	//2. yol
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= " +a+ " b= "+b);
		scan.close();
	}

}
