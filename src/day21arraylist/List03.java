package day21arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
	
		//Array ý Liste çevirmek
		
		String arr[]= {"aliye","veli","canan","kemal"};
				
		List<String> l1=Arrays.asList(arr);
		System.out.println(l1);
		//l1.add("yahya");
		//System.out.println(l1);
		
		//Arrayden üretilen listlerde size i deðiþtiren method lar kullanýlmaz
		//örneðin add,remove,clear gibi
		//kullanýrsanýz run time error verir.
		
		
		//Listi Arraya çevirmek ve yazdýrmak
		String arrayFromList[]=l1.toArray(new String[0]);
System.out.println(Arrays.toString(arrayFromList));

//not: remove metodu integer listlerde kullanýlýrken remove metodunun içine konulan deðer 
// her zaman index olarak alýnýr. eleman olarak düþünülmez
List<Integer>l2=new ArrayList<>();
l2.add(5);
l2.add(2);
l2.add(4);
l2.add(3);
l2.add(1);
System.out.println(l2);

System.out.println(l2.remove(4));// elemaný siler...
System.out.println(l2);





	}

}
