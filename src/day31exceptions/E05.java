package day31exceptions;

public class E05 {
	
	/*
	 		NumberFormatException
	 */

	public static void main(String[] args) {
		
		// javada sadece rakamlardan oluþan stringleri sayýya çevirebiliriz.
		// Integer wrapper class ýndan parseInt() methodunu kullanabiliriz.
		
		String s="123";
				
		int iS=Integer.parseInt(s);
		System.out.println(iS+5);//128
		
		String t="1a2b";
		
		try {
			int iT =Integer.parseInt(t);
			System.out.println(iT+5);
		
		}catch(NumberFormatException e) {
			
			System.out.println("String oluþturulurken rakam dýþýnda karakterler kullanýlmýþ");
		}
		

	}

}
