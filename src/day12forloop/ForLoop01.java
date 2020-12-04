package day12forloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 *Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
biten tüm tamsayýlarý ekrana yazdýrýn.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("baþlangýç deðeri gir");
		int a=scan.nextInt();
		System.out.println("bitiþ deðeri gir");
		int b=scan.nextInt();
		
		if (a>b) {
			System.out.println("baþlangýç deðeri bitiþ deðerinden küçük olmalý");
		}else {
		for (int i=a; i<=b; i++) {
			System.out.print(i+" ");
			}
		}
		scan.close();
	}

}
