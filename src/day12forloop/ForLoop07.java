package day12forloop;

public class ForLoop07 {

	public static void main(String[] args) {
		// 3 ten 6 ya kadar tüm tam sayýlarýn çarpýmýný yazan programý yapýnýz
		int carp=1;
		for (int i=3; i<=6; i++) {
			carp*=i;			
		}
		System.out.println("sayýlarýn çarpýmý: "+carp);
	}

}
