package day20multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		/*
		 olu�turulan multidimensional arrayin elemanlar�n� ekrana
		 yazd�ran ve bu say�lar�n toplam�n� hesaplay�p sonucunu
		 ekrana yazd�ran program...
		
		 */
		 int ma[][]={{11,5},{7},{21,17,28}};
		System.out.println(Arrays.deepToString(ma));
		System.out.println(Arrays.toString(ma[2]));
		System.out.println(ma[2][1]);
		int sum=0;
		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				sum+=ma[i][j];
				System.out.println(ma[i][j]);
				
			}
			
		}System.out.println();
		System.out.println(sum);
		
		// t�m elemanlar�n� �arpan
		sum=1;
		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				sum*=ma[i][j];
				System.out.println(ma[i][j]);
				
			}
			
		}System.out.println();
		System.out.println(sum);
		
		//t�m �ift olanlar�n karesini ekrana yazd�r�n
		int kare=0;
		int arr2[][]= {{11,15},{7,11},{21,17,28},{10,10}};
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (arr2[i][j]%2==0) {
					kare=arr2[i][j]*arr2[i][j];
					
					System.out.print(kare+" ");
				}
			
				
				
			}
			
		}
		
	}

}
