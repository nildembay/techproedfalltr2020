package day12forloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 *Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
biten t�m tamsay�lar� ekrana yazd�r�n.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("ba�lang�� de�eri gir");
		int a=scan.nextInt();
		System.out.println("biti� de�eri gir");
		int b=scan.nextInt();
		
		if (a>b) {
			System.out.println("ba�lang�� de�eri biti� de�erinden k���k olmal�");
		}else {
		for (int i=a; i<=b; i++) {
			System.out.print(i+" ");
			}
		}
		scan.close();
	}

}
