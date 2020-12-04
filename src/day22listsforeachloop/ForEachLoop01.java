package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		/*
		 for each loop for-loop un geliþmiþ halidir
		 yazmasý kolay
		 okumasý kolay
		 hata yapma ihtimali yaz
		 
		 integer list oluþturun
		 
		 */
		
		List<Integer> l1=new ArrayList<>();
		l1.add(3);
		l1.add(2);
		l1.add(1);
		l1.add(5);
		l1.add(4);
		for (int i = 0; i <l1.size(); i++) {
			
			System.out.print(l1.get(i)+" ");
		}
		
		System.out.println();
		for(Integer w:l1) {
			System.out.print(w+" ");
		}
		System.out.println();
		
		int top=0;
		for (Integer w : l1) {
			
			top+=w;
		
		}
		System.out.println(top);
		//ilk 2 elamaný hariç diðerleri yazmak
	
		for (Integer w : l1.subList(2, l1.size())) {
			
			System.out.print(w+" ");
			
			}
		
			System.out.println();
		
		// indexi 1 dahil olan elemandan indexi 3(dahil) olan elemana kadar tüm elemanlarý yazýn
		for (Integer w : l1.subList(1, 4)) {
			
			System.out.print(w+" ");
			
			}
		// l1 listindeki elemanlardan tek sayý olanlarý yazdýrmayýn
		//1. yol
		System.out.println();
		
		for (Integer w : l1) {
			
				if(w%2==0) {
			
					System.out.print(w+" ");
				}
			
		}
		
		System.out.println();
		//2. yol
		for (Integer w : l1) {
			if (!(w%2==0)) {
				continue;
			}
			System.out.print(w+" ");
		}
		System.out.println();
		
		//l1 listindeki elemanlarý 5 görünceye kadar yazdýrýn
		for (Integer w : l1) {
			if (w==5) {
				break;
			}
			System.out.print(w+" ");
		}
		//Not: continue; belli sartlara gore bazi elemanlari islem disi tutmak icin kullanilir.
				//     break; ise belli sartlara gore loop'u kirmak icin kullanilir.
		
	}

}
