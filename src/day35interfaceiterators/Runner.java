package day35interfaceiterators;

public class Runner implements I01{

	public static void main(String[] args) {
	
		System.out.println(I01.multiply()); // multiply static olduðu için interface ile ulaþabiliriz.
		
		Runner obj=new Runner();
		System.out.println(obj.add()); // add metodu default olduðundan obje üretmeden ulaþamazsýnýz.
		
		/*
		 concrete bir class bir interface in child classý olduðunda interface deki tüm abstaract methodlarý
		 override etmek zorundadýr. fakat bu zorunluluk default ve static keywordler kullanýlarak oluþturulan concrete 
		 methodlar için yoktur. 
		 
		 burada gördüðününz gibi add ve multiply methodlarý override etmedik çünkü böyle bir zorunluluk yok
		 ama istersek override edebiliriz.
		 
		 */

	}

}
