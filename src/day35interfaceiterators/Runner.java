package day35interfaceiterators;

public class Runner implements I01{

	public static void main(String[] args) {
	
		System.out.println(I01.multiply()); // multiply static oldu�u i�in interface ile ula�abiliriz.
		
		Runner obj=new Runner();
		System.out.println(obj.add()); // add metodu default oldu�undan obje �retmeden ula�amazs�n�z.
		
		/*
		 concrete bir class bir interface in child class� oldu�unda interface deki t�m abstaract methodlar�
		 override etmek zorundad�r. fakat bu zorunluluk default ve static keywordler kullan�larak olu�turulan concrete 
		 methodlar i�in yoktur. 
		 
		 burada g�rd���n�nz gibi add ve multiply methodlar� override etmedik ��nk� b�yle bir zorunluluk yok
		 ama istersek override edebiliriz.
		 
		 */

	}

}
