package day11stringmethods;

import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {
	
		/*
		1)Kullanicidan password'unu aliniz
2)Password a)Ilk character'i buyuk harf olacak
b)son character'i sayi olacak
c)en az 6 character uzunlugunda olacak
sartlarini sagliyorsa ekrana "Password basariyla olusturuldu" yaziniz
3)Password yukaridaki sartlardan herhangi birini saglamiyorsa "Tekrar deneyiniz" yazdirin    
		 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("password giriniz");
		String p=scan.nextLine();
		
		if ((p.charAt(0)>='A' && p.charAt(0)<='Z') &&
		(p.charAt(p.length()-1)>='0' && p.charAt(p.length()-1)<='9') && p.length()>5) {
			System.out.println("password baþarý ile oluþturuldu");
		}else {
			System.out.println("tekrar deneyiniz");
		}
		scan.close();
		
	}

}
