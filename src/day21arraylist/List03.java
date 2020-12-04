package day21arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
	
		//Array � Liste �evirmek
		
		String arr[]= {"aliye","veli","canan","kemal"};
				
		List<String> l1=Arrays.asList(arr);
		System.out.println(l1);
		//l1.add("yahya");
		//System.out.println(l1);
		
		//Arrayden �retilen listlerde size i de�i�tiren method lar kullan�lmaz
		//�rne�in add,remove,clear gibi
		//kullan�rsan�z run time error verir.
		
		
		//Listi Arraya �evirmek ve yazd�rmak
		String arrayFromList[]=l1.toArray(new String[0]);
System.out.println(Arrays.toString(arrayFromList));

//not: remove metodu integer listlerde kullan�l�rken remove metodunun i�ine konulan de�er 
// her zaman index olarak al�n�r. eleman olarak d���n�lmez
List<Integer>l2=new ArrayList<>();
l2.add(5);
l2.add(2);
l2.add(4);
l2.add(3);
l2.add(1);
System.out.println(l2);

System.out.println(l2.remove(4));// eleman� siler...
System.out.println(l2);





	}

}
