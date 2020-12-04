package day32exceptions;

public class E04 {

	public static void main(String[] args) {
	
		try {
		hata();
		}catch(IllegalArgumentException e) {
			System.out.println(e);  //Exception adý ve mesajý verir.
			System.out.println(e.getMessage()); //sadece mesajý verir
			e.printStackTrace(); // detaylý Exception mesajý verir.
		}
	}
	
	public static void hata() {
		
		throw new IllegalArgumentException("geçerli data giriniz");
		
	}

}
