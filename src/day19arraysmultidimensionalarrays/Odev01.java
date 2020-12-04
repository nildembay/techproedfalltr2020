package day19arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		//Bir String’de kullanilan tum harflerin sayisini gosteren kodu yaziniz.
		//Ornegin; Alaaddin ==> A=1, l=1, a=3, d=2, i=1, n=1
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir string giriniz");
		String str=scan.nextLine();
		int count=0;
		
		
		String a[]=str.split("");
		System.out.println(Arrays.toString(a));
	
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
			
		for (int j = 1; j <=a.length-1; j++) {
				if (a[j-1].equals(a[j])) {
					count++;
					
				}else {
					System.out.println(a[j-1]+"="+(count+1));
					count=0;
				}
		
			if (j==a.length-1) {
				System.out.println(a[j]+" = "+(count+1));
			}
			
		}
		scan.close();
		
	}
		
		
		
	

}
