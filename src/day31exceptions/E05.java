package day31exceptions;

public class E05 {
	
	/*
	 		NumberFormatException
	 */

	public static void main(String[] args) {
		
		// javada sadece rakamlardan olu�an stringleri say�ya �evirebiliriz.
		// Integer wrapper class �ndan parseInt() methodunu kullanabiliriz.
		
		String s="123";
				
		int iS=Integer.parseInt(s);
		System.out.println(iS+5);//128
		
		String t="1a2b";
		
		try {
			int iT =Integer.parseInt(t);
			System.out.println(iT+5);
		
		}catch(NumberFormatException e) {
			
			System.out.println("String olu�turulurken rakam d���nda karakterler kullan�lm��");
		}
		

	}

}
