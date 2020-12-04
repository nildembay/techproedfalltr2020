package day12forloop;

import java.util.Scanner;

public class ForLoop08 {
	
public static void main(String[] args) {
	/*
	 Kullanicidan baslangic ve bitis degerlerini aliniz.
		 Baslangic ve bitis degerleri nasil olursa olsun baslangic degerinden 
		 bitis degerine kadar tum sayilarin carpimini hesaplayan programi yaziniz.
	 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("baþlangýç deðeri gir");
		int ilk=scan.nextInt();
		System.out.println("bitiþ deðeri gir");
		int son=scan.nextInt();
		
		int carpim=1;
			if (ilk<son) {
				for (int i=ilk; i<=son; i++) {
					carpim=carpim*i;
				} 
				
			}else {
				for (int i=ilk; i>=son; i--) {
					carpim=carpim*i;
				} 
			}
		System.out.println("Çarpim: "+carpim);
		scan.close();
	}

}
