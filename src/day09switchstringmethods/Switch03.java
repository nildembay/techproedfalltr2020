package day09switchstringmethods;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		
		
		/*
		 kullan�c� ay ismini girdi�inde o ay�n g�n say�s�n� ekrana yazan program
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("ay ismini giriniz");
		String ay=scan.next().toLowerCase();
		switch (ay) {
		case "ocak":	
		case "mart":
		case "may�s":	
		case "temmuz":	
		case "agustos":	
		case "ekim":
		case "aral�k":System.out.println(31);	break;
				
		case "subat":System.out.println("28 veya 29");	break;
			
		case "nisan":			
		case "haziran":			
		case "eylul":				
		case "kas�m":	System.out.println(30);	break;
		
		default:System.out.println("ge�erli ay giriniz");
	}
	scan.close();
	
	}

}
