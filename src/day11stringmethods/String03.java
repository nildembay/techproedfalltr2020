package day11stringmethods;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
	
		/*
		1)Kullanicidan ad ve soyadini ve 11 haneli kimlik numarasini aliniz.
		2)Kulanici ad ve soyadini yazarken hatayla bas ve sona space koyarsa siliniz
		3)Ad ve soyadin ilk harfleri buyuk diger harfleri kucuk olmali
		4)Kimlik numarasinin son 4 rakami haric hepsi * yapilmali
		Ornek: Ali Can *******1234
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Adýnýzý giriniz");
		String ad=scan.nextLine();
		System.out.println("Soyadýnýzý giriniz");
		String soyad=scan.nextLine();
		System.out.println("11 haneli kimlik no giriniz.");
		String kimlik=scan.nextLine();
		ad=ad.trim();
		soyad=soyad.trim();
		ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
		soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
		kimlik=kimlik.substring(0,7).replaceAll("\\w", "*")+kimlik.substring(kimlik.length()-4);
		System.out.println(ad+ " "+soyad+ " "+ kimlik);
		scan.close();
	}

}
