package day12forloop;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan
ba�lay�p biti� de�erinde veya �ncesinde  biten t�m �ift tamsay�lar� ekrana yazd�r�n.
		 */
				
		Scanner scan=new Scanner(System.in);
		System.out.println("ba�lang�� de�eri gir");
		int ilk=scan.nextInt();
		System.out.println("biti� de�eri gir");
		int son=scan.nextInt();
		
		if (ilk>son) {
			System.out.println("ba�lang�� de�eri biti� de�erinden k���k olmal�");
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
