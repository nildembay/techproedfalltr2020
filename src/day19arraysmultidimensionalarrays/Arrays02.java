package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
	//split() metodu
		
		//kelime say�s�
		String s="calis bakalim zor mu? �al��t�m aaa ne kadar da kolaym��.";
		String words1[]=s.split(" ");
		System.out.println(Arrays.toString(words1));
		System.out.println("kelime say�s�: " + words1.length );
		
		//karakter say�s�
		String words2[]=s.split("");
		System.out.println(Arrays.toString(words2));
		System.out.println("karakter say�s�: " + words2.length );
		
		//bo�luk hari� ka� karakter kullan�lm��t�r.
		String words3[]=s.replace(" ", "").split("");
		System.out.println(Arrays.toString(words3));
		System.out.println("karakter say�s�: " + words3.length );
		
		// a n�n ka� tane oldu�unu bulur,,
		String words4[]=s.split("");
		int counter=0;
		for (int i = 0; i < words4.length; i++) {
			if (words4[i].equals("a")) {
				counter++;
				
			}
			
		}
		System.out.println("sorulan karakterin say�s�: "+ counter);
		
	}

}
