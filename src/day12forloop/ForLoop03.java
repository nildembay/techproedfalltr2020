package day12forloop;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
		 kullan�c�dan bir say� al�n o say�dan k���k olan t�m pozitif tek say�lar� b�y�kten k����e do�ru ayn� sat�rda yazd�r�n
		 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("bir say� giriniz");
		int sayi=scan.nextInt();
		
		if (sayi<=0) {
			System.out.println("pozitif bir say� giriniz");
			
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
