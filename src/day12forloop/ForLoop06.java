package day12forloop;

import java.util.Scanner;

public class ForLoop06 {
	// kullan�c�n�n verdi�i iki say� aras�ndaki t�m t�m say�lar�n toplam�n� ekrana yazd�ran program� yaz�n�z
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ba�lang�� de�eri gir");
		int ilk=scan.nextInt();
		System.out.println("biti� de�eri gir");
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
