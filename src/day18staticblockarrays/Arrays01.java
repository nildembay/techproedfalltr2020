package day18staticblockarrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		int a[]=new int[4];
		
		/*for (int i = 0; i < 4; i++) {
			System.out.println(a[i]);} */
		System.out.println(Arrays.toString(a));
		
		a[0]=8;
		a[2]=15;
		a[3]=8;
		a[1]=23;
		
		
		
		
		System.out.println(Arrays.toString(a));
		
		//String array
		System.out.println("array �n eleman say�s� : "+a.length);	
		String b[]=new String[3];
		b[0]="ali";
		b[1]="ay�e";
		b[2]="kemal";
		System.out.println(Arrays.toString(b));
		
		//bir array den spesifik bir eleman� yazd�rmak
		
		System.out.println(b[2]);
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		//
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		for (int i = 0; i <a.length; i++) {
			if (i%2==0)
			{
			System.out.print(" *"+a[i]);}
		}
		
		//arraydeki elemanlar� k���kten b�y��e s�ralama
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		// String araylarda sort metodu alfabetik s�ralama yapar.
		//javada k���kten b�y��e s�ralama ve alfabetik s�ralama yerine "natural order" kullan�l�r.
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
	}

}
