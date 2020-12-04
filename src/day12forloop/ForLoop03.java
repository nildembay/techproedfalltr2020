package day12forloop;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
		 kullanýcýdan bir sayý alýn o sayýdan küçük olan tüm pozitif tek sayýlarý büyükten küçüðe doðru ayný satýrda yazdýrýn
		 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int sayi=scan.nextInt();
		
		if (sayi<=0) {
			System.out.println("pozitif bir sayý giriniz");
			
		}else {
			for (int i=sayi; i>=1; i--) {
				if (i%2!=0) {
					System.out.print(i+" ");
				}
			}
		}
		scan.close();
		
	}

}
