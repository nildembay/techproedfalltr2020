package day08ternary;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
	
		/*
		 Kullanıcıdan bir tamsayı girmesini isteyin, o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir tamsayı girin");
		int sayi=scan.nextInt();
		
		String result= sayi>99 && sayi<1000 ? "üç basamaklı" : sayi%2==0 ? "3 basanaklı olmayan çift" : "üç basamaklı olmayan tek";
		System.out.println(result);
		scan.close();
		
	}

}
