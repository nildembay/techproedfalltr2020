package day12forloop;

import java.util.Scanner;

public class ForLoop06 {
	// kullanýcýnýn verdiði iki sayý arasýndaki tüm tüm sayýlarýn toplamýný ekrana yazdýran programý yazýnýz
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("baþlangýç deðeri gir");
		int ilk=scan.nextInt();
		System.out.println("bitiþ deðeri gir");
		int son=scan.nextInt();
		
		int toplam=0;
			if (ilk<son) {
				for (int i=ilk; i<=son; i++) {
					toplam=toplam+i;
				} 
				
			}else {
				for (int i=ilk; i>=son; i--) {
					toplam=toplam+i;
				} 
			}
		System.out.println("toplam: "+toplam);
		scan.close();
	}

}
