package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
	//split() metodu
		
		//kelime sayýsý
		String s="calis bakalim zor mu? Çalýþtým aaa ne kadar da kolaymýþ.";
		String words1[]=s.split(" ");
		System.out.println(Arrays.toString(words1));
		System.out.println("kelime sayýsý: " + words1.length );
		
		//karakter sayýsý
		String words2[]=s.split("");
		System.out.println(Arrays.toString(words2));
		System.out.println("karakter sayýsý: " + words2.length );
		
		//boþluk hariç kaç karakter kullanýlmýþtýr.
		String words3[]=s.replace(" ", "").split("");
		System.out.println(Arrays.toString(words3));
		System.out.println("karakter sayýsý: " + words3.length );
		
		// a nýn kaç tane olduðunu bulur,,
		String words4[]=s.split("");
		int counter=0;
		for (int i = 0; i < words4.length; i++) {
			if (words4[i].equals("a")) {
				counter++;
				
			}
			
		}
		System.out.println("sorulan karakterin sayýsý: "+ counter);
		
	}

}
