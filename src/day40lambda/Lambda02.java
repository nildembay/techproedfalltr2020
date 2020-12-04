package day40lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lambda02 {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		kareCiftFunctional(list);
		System.out.println();
		
		kupTekFunctional(list);
		System.out.println();
		
		kareKokCiftFunctional(list);
		System.out.println();
		
		maxElFunctional(list);
		
	}
	
	//çift sayý olan elemanlarýn karesini ayný satýrda aralarýna boþluk býrakarak yazýn.
	
	public static void kareCiftFunctional(List<Integer> list) {
		
		list.stream().filter(Lambda01::isCift).map(t-> t*t).forEach(Lambda01::printEl);
	}
	
	//tek sayý olan elemanlarýn küpünün bir fazlasý ayný satýrda aralarýna boþluk býrakarak yazýn.
	
	public static void kupTekFunctional(List<Integer> list) {
		
		list.stream().filter(t-> t%2!=0).map(t-> t*t*t+1).forEach(Lambda01::printEl);
	}
	
	
	// çift sayý olan elemanlarý karekökünü  yazdýrýn
	
	public static void kareKokCiftFunctional(List<Integer> list) {
		
		list.stream().filter(Lambda01::isCift).map(Math::sqrt).forEach(System.out::println);
	}
	
	
	//En büyük elemaný console a yazdýrýn
	
	public static void maxElFunctional(List<Integer> list) {
		
		Optional<Integer> max= list.stream().reduce(Math::max);/// reduce azaltmak demek, pek çok elemandan bir tane seçeceðiz
		System.out.println(max);
		
	}
	
	
	
	
	
	
	
	
	

}
