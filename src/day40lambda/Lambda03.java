package day40lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lambda03 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(-13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(-12);
		list.add(15);
		
		ciftKareMax(list);
		System.out.println();
		elemanlarToplami(list);
		ciftlerinCarpimi(list);
		elemanlarToplami2(list);
		ciftlerinCarpimi2(list);

	}
	
	//Listteki çift sayi olan elemanlarýn karelerini alýnýz. En büyük olanýný console yazdýrýn


	public static void ciftKareMax(List<Integer>list) {
		Optional<Integer> max=list.stream().filter(Lambda01::isCift).map(t->t*t).reduce(Math::max);
		
		System.out.println(max);
	}

	
	// Listteki tüm elemanlarýn toplamýný console yazdýrýn
	public static  void elemanlarToplami(List<Integer>list) {
		int toplam=list.stream().reduce(0,(x,y)->x+y);
		System.out.println(toplam);
		
	}
	public static  void elemanlarToplami2(List<Integer>list) {
		Optional<Integer> toplam=list.stream().reduce(Integer::sum);
		System.out.println(toplam);
		
	}
	
	//listteki çift sayý olan elemanlarýn çarpýmý

	public static  void ciftlerinCarpimi(List<Integer>list) {
		int carpim=list.stream().filter(Lambda01::isCift).reduce(1,(x,y)->x*y);
		System.out.println(carpim);
	}

	//method reference

	public static  void ciftlerinCarpimi2(List<Integer>list) {
		Optional<Integer> carpim=list.stream().filter(Lambda01::isCift).reduce(Math::multiplyExact);
		System.out.println(carpim);
	}














}
