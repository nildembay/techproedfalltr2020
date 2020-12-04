package day35interfaceiterators;

public interface I01 {
	
	/*
	 method oluþtururken default ve ya static keywordlarini kullanarak isterseniz interface içinde concrete method oluþturabilirsiniz.
	
	 önemli not: interface içinde concrete method oluþturmak için kullanýlan default keywordu access modifier deðildir.
	 aþaðýdaki method ta gördüðünüz gibi access modifier public tir.
	 
	 not: interface lerde default keywordunu kullanarak oluþturulan methodlara default methodlar denir
	 
	 
	 not: Aþaðýda gördüðünüz gibi interface içinde concrete method ulaþmanýn iki yolu var.
	 1- default kullanmak -->baþka classlardan obje üzerinden ulaþýrsýnýz
	 2- Static kullanmak --> sadece interface ismi ile methoda ulaþabiliriz.
	 
	 */
	public default int add() {  //obje olþturarak ulaþýrýz
		
		return 2;		
		
	}
	
	public static int multiply() {  //interface ismini yazarak ulaþýrýz
		return 12;
	}
	

}
