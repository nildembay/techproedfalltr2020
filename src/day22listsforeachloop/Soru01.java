package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
	/*
	1)elemanlarýný kullanýcýnýn girdiði bir String list oluþturunuz
		Stringlerin tamamý rakamlardan oluþsun
	2)bu listin elemanlarýnin çarpýmýný ekrana yazdýrýnýz.
	*/
		
		Scanner scan=new Scanner(System.in);
		String str="";
		List<String> list1= new ArrayList<>();
		
		do {
			System.out.println("Rakamlardan oluþan bir String giriniz");
			System.out.println("String girmeyi durdurmak için 'S' giriniz");
			str=scan.next().toUpperCase();
			if (!str.equals("S")) {
			list1.add(str);}
						
		}while(!str.equals("S"));
		
		System.out.println(list1);
		int carpim=1;
		for (int i = 0; i < list1.size(); i++) {
			carpim*=Integer.parseInt(list1.get(i));
			
		}
		System.out.println(carpim);
		scan.close();
	}

}
