package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		
		int ma[][]=new int[3][2];
		
		//multýdimensional array lar nasýl ekrana yazdýrýlýr
		System.out.println(Arrays.deepToString(ma));
		
		//Multidimensional arraylare eleman ekleme
		
		ma[0][0]=33;
		ma[0][1]=32;
		ma[1][0]=23;
		ma[1][1]=24;
		ma[2][0]=13;
		ma[2][1]=11;
		System.out.println(Arrays.deepToString(ma));
		
		
		// iç array ekrana yazma
		System.out.println(Arrays.toString(ma[0]));
		System.out.println(Arrays.toString(ma[1]));
		System.out.println(Arrays.toString(ma[2]));
		
		//istenen bir eleman nasýl yazdýrýlýr. Örneðin 13
		
		System.out.println(ma[2][0]);
		System.out.println(ma[1][1]);
	}

}
