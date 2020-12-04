package day40lambda;

import java.util.stream.IntStream;

public class LambdaReview3 {

	public static void main(String[] args) {
		
		
		// ilk 10, 7 ile bölünebilen tam sayıların toplamıın ekrana yazdırın
		
		//1.yol
		System.out.println(IntStream.rangeClosed(1, 70).filter(t->t%7==0).sum());
		
		//2. yol
		System.out.println(IntStream.iterate(7, t->t+7).limit(10).sum());
		
		
		//
	}

}
