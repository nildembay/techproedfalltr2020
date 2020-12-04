package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		//Bir arrayde belli bir eleman�n var olup olmad���n� kontrol etmek
		
		int a[]= {2,5,2,8,6};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 8)); //sort edilmi� dizideki indexi verir
		System.out.println(Arrays.binarySearch(a, 5)); 
		System.out.println(Arrays.binarySearch(a,2)); //tekrarl� elemanlar i�in kullanmay�n�z. do�ru sonu� vermez
		System.out.println(Arrays.binarySearch(a,1)); //
		
		//iki arrayin e�it olup olmad���n� kontrol etmek
		String s1[]= {"A","D","C"};
		String s2[]= {"A","C","D"};
		String s3[]= {"A","C","D"};
		System.out.println(Arrays.equals(s1, s2));//false
		System.out.println(Arrays.equals(s3, s2));//true
		System.out.println((s1==s2));//false  reference ler farkl�
	//	System.out.println((s2==s2));//true bir �ey  kendisinin ayn�s�d�r
		
		int arr[] = {12, 23, 12, 2, 3};

		Arrays.sort(arr);

		System.out.println(Arrays.binarySearch(arr, 12));
		
	}

}
