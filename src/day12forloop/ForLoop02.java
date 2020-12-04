package day12forloop;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan
baþlayýp bitiþ deðerinde veya öncesinde  biten tüm çift tamsayýlarý ekrana yazdýrýn.
		 */
				
		Scanner scan=new Scanner(System.in);
		System.out.println("baþlangýç deðeri gir");
		int ilk=scan.nextInt();
		System.out.println("bitiþ deðeri gir");
		int son=scan.nextInt();
		
		if (ilk>son) {
			System.out.println("baþlangýç deðeri bitiþ deðerinden küçük olmalý");
		}else {
			for (int i=ilk; i<=son; i++) {
				if (i%2==0) {
				System.out.print(i+" ");
				}
			
			}
		}
		scan.close();
		
	}

}
