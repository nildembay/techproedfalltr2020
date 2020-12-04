package day12forloop;

public class ForLoop05 {

	public static void main(String[] args) {
		// 18 den 3 e kadar olan tüm sayýlarýn toplamýný ekrana yazdýran programý yazýnýz
		
		
		int toplam=0;
		for (int i=18; i>=3; i--) {
			toplam=toplam+i;
		}
		System.out.println("toplam: "+toplam);
	}

}
