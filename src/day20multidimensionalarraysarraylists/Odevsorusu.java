package day20multidimensionalarraysarraylists;

import java.util.Arrays;

public class Odevsorusu {

	public static void main(String[] args) {
		/*
		 
		 4) A�a��daki multi dimensional array�in i� array�lerindeki tum elemanlar�n toplam�n� birer birer bulan
 ve herbir sonucu yeni bir array�in eleman� yapan ve yeni array�i ekrana yazd�ran bir program yaz�n�z
{ {1,2,3}, {4,5}, {6,7} }
Ornegin; { {1,2,3}, {4,5}, {6,7} }  ==> 1+2+3=6  4+5=9  6+7=13  ==>  output: {6, 9, 13}
		 */
		int sum=0;
		
		int arr[][]={ {1,2,3}, {4,5}, {6,7} };
		int sonuc[]=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];

			}
			sonuc[i]=sum;
			sum=0;
			
					
		}System.out.println(Arrays.toString(sonuc));
		
	}

}
