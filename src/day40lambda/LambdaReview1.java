package day40lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaReview1 {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
	    list.add(12);
	    list.add(9);
	    list.add(13);
	    list.add(4);
	    list.add(6);
	    list.add(2);
	    list.add(4);
	    list.add(12);
	    list.add(15);
	    
	    //Print all odd numbers from the list [12, 9, 13, 4, 6, 2, 4, 12, 15] by Functional Programming
	    list.stream().filter(t->t%2!=0).forEach(System.out::println);
	    
	    //listteki 6 ile 14 arasýndaki tüm sayýlarýn karesini ekrana yazdýrýn
	    
	    list.stream().filter(t->t<14 && t>6).map(t->t*t).forEach(System.out::println);
	    
	    //listteki tek tamsayýlarýn kareköklerinin toplamýný ekrana yazdýrýn
	    //1. yol
	    System.out.println(list.stream().filter(t->t%2!=0).map(Math::sqrt).reduce(Double::sum));
        //2. yol
	    System.out.println(list.stream().filter(t->t%2!=0).mapToDouble(Math::sqrt).sum());
	    
	}

}
