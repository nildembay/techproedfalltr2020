package day12forloop;

public class ForLoop04 {

	public static void main(String[] args) {
		// 5 ten 12 ye kadar tum tamsayıları toplamını hesaplayıp ekrana yazdıran program
		int toplam=0;
		for (int i=5; i<=12; i++) {
			toplam=toplam+i;
		}
		System.out.println("toplam: "+toplam);
		
	}

}
