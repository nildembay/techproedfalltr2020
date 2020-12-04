package day09switchstringmethods;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		
		
		/*
		 kullanýcý ay ismini girdiðinde o ayýn gün sayýsýný ekrana yazan program
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("ay ismini giriniz");
		String ay=scan.next().toLowerCase();
		switch (ay) {
		case "ocak":	
		case "mart":
		case "mayýs":	
		case "temmuz":	
		case "agustos":	
		case "ekim":
		case "aralýk":System.out.println(31);	break;
				
		case "subat":System.out.println("28 veya 29");	break;
			
		case "nisan":			
		case "haziran":			
		case "eylul":				
		case "kasým":	System.out.println(30);	break;
		
		default:System.out.println("geçerli ay giriniz");
	}
	scan.close();
	
	}

}
