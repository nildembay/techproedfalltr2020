package day32exceptions;

public class E04 {

	public static void main(String[] args) {
	
		try {
		hata();
		}catch(IllegalArgumentException e) {
			System.out.println(e);  //Exception ad� ve mesaj� verir.
			System.out.println(e.getMessage()); //sadece mesaj� verir
			e.printStackTrace(); // detayl� Exception mesaj� verir.
		}
	}
	
	public static void hata() {
		
		throw new IllegalArgumentException("ge�erli data giriniz");
		
	}

}
