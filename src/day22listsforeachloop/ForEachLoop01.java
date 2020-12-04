package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		/*
		 for each loop for-loop un geli�mi� halidir
		 yazmas� kolay
		 okumas� kolay
		 hata yapma ihtimali yaz
		 
		 integer list olu�turun
		 
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
		//ilk 2 elaman� hari� di�erleri yazmak
	
		for (Integer w : l1.subList(2, l1.size())) {
			
			System.out.print(w+" ");
			
			}
		
			System.out.println();
		
		// indexi 1 dahil olan elemandan indexi 3(dahil) olan elemana kadar t�m elemanlar� yaz�n
		for (Integer w : l1.subList(1, 4)) {
			
			System.out.print(w+" ");
			
			}
		// l1 listindeki elemanlardan tek say� olanlar� yazd�rmay�n
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
		
		//l1 listindeki elemanlar� 5 g�r�nceye kadar yazd�r�n
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
