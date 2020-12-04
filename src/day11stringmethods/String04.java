package day11stringmethods;

import java.util.Scanner;

public class String04 {

	public static void main(String[] args) {
		/*
		1)Kullanicidan bir String alin
		2)Tum rakamlari * a cevirin
		3)Bas ve sondaki tum space'leri silin
		4)Aralardaki tum space'leri ! isaretine cevirin
		5)a ve z harflerini buyuk harf, diger tum harfleri kucuk harf yapin
		6)En bas'a "(" ve en sona ")" ekleyin 
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir ifade giriniz");
		String str=scan.nextLine();
		
		str=str.replaceAll("\\d", "*");
		str=str.trim();
		str=str.replace(" ", "!");
		str=str.toLowerCase();
		str=str.replace("a", "A");
		str=str.replace("z", "Z");
		str="("+str+")";
		System.out.println(str);
        scan.close();

	}

}
