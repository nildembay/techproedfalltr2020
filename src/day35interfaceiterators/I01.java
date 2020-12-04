package day35interfaceiterators;

public interface I01 {
	
	/*
	 method olu�tururken default ve ya static keywordlarini kullanarak isterseniz interface i�inde concrete method olu�turabilirsiniz.
	
	 �nemli not: interface i�inde concrete method olu�turmak i�in kullan�lan default keywordu access modifier de�ildir.
	 a�a��daki method ta g�rd���n�z gibi access modifier public tir.
	 
	 not: interface lerde default keywordunu kullanarak olu�turulan methodlara default methodlar denir
	 
	 
	 not: A�a��da g�rd���n�z gibi interface i�inde concrete method ula�man�n iki yolu var.
	 1- default kullanmak -->ba�ka classlardan obje �zerinden ula��rs�n�z
	 2- Static kullanmak --> sadece interface ismi ile methoda ula�abiliriz.
	 
	 */
	public default int add() {  //obje ol�turarak ula��r�z
		
		return 2;		
		
	}
	
	public static int multiply() {  //interface ismini yazarak ula��r�z
		return 12;
	}
	

}
