package day40lambda;

import java.math.BigInteger;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lambda08 {

	public static void main(String[] args) {
		System.out.println(topla(20));
		System.out.println(topla2(20));
		System.out.println(ciftTopla(20));
		System.out.println(toplaIlkXCift1(20));
		System.out.println(toplaIlkXCift2(20));
		ilkXIki(5);
		istenenSayininKuvvetleri(6,3);
		System.out.println();
		System.out.println(istenenSayininIstenenKuvveti(2,3));
		System.out.println(faktoryel(5));
		System.out.println(faktoryelBigInteger(50));
	}
	
	// birden x e kadar tam sayýlarý toplayan programý yapýnýz.
	
	public static int topla(int x) {
		return IntStream.range(1, x+1).sum();
	}
	public static int topla2(int x) {
		return IntStream.rangeClosed(1, x).sum();
	}
	
	// birden x e kadar çift tam sayýlarý toplayan programý yapýnýz.
	
	public static int ciftTopla(int x) {
		return IntStream.rangeClosed(1, x).filter(t->t%2==0).sum();
	}
	// ilk x pozitif çift sayýyý toplayan prog
	//1. yol
	public static int toplaIlkXCift1(int x) {
		return IntStream.rangeClosed(1, 2*x).filter(t->t%2==0).sum();
	}
	//2. yol
	public static int toplaIlkXCift2(int x) {
		return IntStream.iterate(2, t->t+2).limit(x).sum();
	}
	
	
	// ilk x pozitif tamsayýyý toplayan program
	public static int toplaIlkXTek(int x) {
		return IntStream.iterate(1, t->t+2).limit(x).sum();
	}
	
	// 2 nin ilk x kuvvetini ekrana yazdýran 
	
	public static void ilkXIki(int x) {
		IntStream.iterate(2, t->t*2).limit(x).forEach(Lambda01::printEl);
	}
	// istenilen bir sayýnýn ilk x kuvvetini ekrana yazdýran 

	public static void istenenSayininKuvvetleri(int x,int a) {
		IntStream.iterate(a, t->t*a).limit(x).forEach(Lambda01::printEl);
	}
	//istenen sayýnýn istenen kuvveti
	
	public static int istenenSayininIstenenKuvveti(int sayi,int kuvvet) {
		
		return IntStream.iterate(sayi, t->t*sayi).limit(kuvvet).reduce(0,(m,n)->n);
	}
	
	//istenilen bir sayýnýn faktöryeli

	public static OptionalInt faktoryel(int sayi) {
		
		return IntStream.rangeClosed(1, sayi).reduce(Math::multiplyExact);
	}
	
	
	// büyük sayýlarla çalýþabilmek
	
	
	public static BigInteger faktoryelBigInteger(int x) {
	return	IntStream.range(1, x).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply);
	}
	
	
	
	
	
	
	
	

}
