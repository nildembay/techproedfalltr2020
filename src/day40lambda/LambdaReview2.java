package day40lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaReview2 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
	    list.add("Ali");
	    list.add("Mark");
	    list.add("Jackson");
	    list.add("Amanda");
	    list.add("Mariano");
	    list.add("Alberto");
	    list.add("Tucker");
	    list.add("Christ");
	    
	    
	    
	    //listeki isimlerden a ve n i�erenlerin harf say�lar�n�n toplam�n� ekrana yazd�r�n
	    
	    System.out.println(list.stream().filter(t->t.contains("a") && t.contains("n")).mapToInt(t-> t.length()).sum());
	    
	  //listeki isimlerden ilk harfi son harfinden alfabetik olarak �nde olan isimleri ekrana yazd�r�n(t�m harfler k���k harf d���n�n)
	    
	    list.stream().filter(t-> t.toLowerCase().charAt(0)<t.toLowerCase().charAt(t.length()-1)).forEach(System.out::println);
	    
	    
	    
	    
	    
	    
	    
	}

}
