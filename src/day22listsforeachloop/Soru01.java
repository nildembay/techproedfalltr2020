package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
	/*
	1)elemanlar�n� kullan�c�n�n girdi�i bir String list olu�turunuz
		Stringlerin tamam� rakamlardan olu�sun
	2)bu listin elemanlar�nin �arp�m�n� ekrana yazd�r�n�z.
	*/
		
		Scanner scan=new Scanner(System.in);
		String str="";
		List<String> list1= new ArrayList<>();
		
		do {
			System.out.println("Rakamlardan olu�an bir String giriniz");
			System.out.println("String girmeyi durdurmak i�in 'S' giriniz");
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
