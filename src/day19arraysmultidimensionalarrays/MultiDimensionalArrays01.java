package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		
		int ma[][]=new int[3][2];
		
		//mult�dimensional array lar nas�l ekrana yazd�r�l�r
		System.out.println(Arrays.deepToString(ma));
		
		//Multidimensional arraylare eleman ekleme
		
		ma[0][0]=33;
		ma[0][1]=32;
		ma[1][0]=23;
		ma[1][1]=24;
		ma[2][0]=13;
		ma[2][1]=11;
		System.out.println(Arrays.deepToString(ma));
		
		
		// i� array ekrana yazma
		System.out.println(Arrays.toString(ma[0]));
		System.out.println(Arrays.toString(ma[1]));
		System.out.println(Arrays.toString(ma[2]));
		
		//istenen bir eleman nas�l yazd�r�l�r. �rne�in 13
		
		System.out.println(ma[2][0]);
		System.out.println(ma[1][1]);
	}

}
