package day31exceptions;

public class E01 {
	
	/*
	 1- ArithmeticException class ý javada matematiksel iþlemler yapýlýrken oluþabilecek hatalarda kullanýlýr.
	 	Mesela 12 yi 0 a bölersek java Exception throw eder. Bu exception ArithmeticException kullanýlarak 
	 	halledilebilir(handle). Run Time Exception dur
	 	
	 NOT: Java da iki tip exception vardýr. Birisi siz code yazarken kýrmýzý alt çizgi(CTE) verir. 
	 	diðeri vermez. 
	 	CTE veren exceptionlara "Compile Time Exception" ve ya "Checked Exception" denir
	 	CTE vermeyen exceptionlara "Run Time Exception" ve ya "Un-checked Exception" denir.
	 
	 NOT:"Compile Time exception" larda ya "throws veya "try-catch" kullanmalýsýnýz aksi taktirde code çalýþmaz. 
	 	Ama "Run Time Exception" larda isterseniz "throws", isterseniz "try-catch", isterseniz hiçbir þey kullanmayabilirsiniz.
	 	***Yani, "Compile Time Exeption lar handle edilmelidirler ama RunTime Exceptonlar handle edilmese de olur.
	 
	 
	 2-	NullPointerException class’i ornegin; null atamasi yapilan bir String’de length() methodu kullanildiginda olusur. 
	  	Run Time Exception’dir.
	  	
	  	
	 3- ArrayIndexOutOfBoundsException class ý Array lerde olamayn bir index le iþlem yapmaya çalýþýrsak devreye girer.
	 	RunTime Exceptiondur.
	 	
	 4- NumberFormatException class i sayý formatýnda olmayan bir stringi parseInt() metodu kullanarak integer a 
	 	çevirmek istediðimizde devreye girer. RunTime Exceptiondur.
	 	
	 5- ClassCastException class ý birbirine dönüþtürülemeyen data type lar birbirine dönüþtürülmek istenirse devreye girer.
	 	Örneðin object data type i, String data type ina dönüþtürülemez. java dönüþtürmesini söylersek
	 	ClassCastException alýrýz.RunTime Exceptiondur.
	 	
	 6- IllegalArgumentException class ý, kullanýlmasýný istemediðimiz deðerlerde programýmýzýn hata vermesini istiyorsak 
	 	devreye girer. Mesela yaþ için negetif sayýlarýn kullanýlmasý doðru deðildir. Kullanýcý yaþ için negetif sayý 
	 	kullandýðýnda program hata vermelidir. Bunu "throw new IllegalArgumentException();" kodunu yazarak temin edebiliriz. 
	 	
	
	 Soru: throw ile throws arasýndaki farklar nelerdir?
	 
	 		1)"throws" method parantezinin kapanýþ parantezi ile method body nin açýlýþ parantezi arasýnda kullanýlýr.
	 		  "throw" method body nin içinde kullanýlýr.
	 		  
	 		2)"throws" keyword unden sonra birden fazla Exception yazýlabilir.fakat
	 		  "throw" keyword unden sonra sadece bir Exception yazýlýr.
	 		  
	 		3)"throws" keyword unden sonra sadece ,Exception class ýnýn ismini yazarýz. fakat 
	 		  "throw" keyword unden sonra Exception classýndan obje oluþtururuz.
	 		  
	 		4)"throws" keyword u methodun ilk satýrýnda sadece bir kere kullanýlabilir. ama
	 		  "throw" keyword u method bodysi içinde nerede Exception atmak istersek istediðimiz kadar kullanabiliriz.
	 		  
	 
	 NOTE: Catch block lardan sonra "finaly block" kullanýlabilir. finally block ýn özelliði Exception oluþsa da oluþmasa da çalýþmasýdýr.
	 		finally block cloud da yapýlan iþlemlerden sonra cloud ile connection ý kesmek için kullanýlýr.
	 		cloud ile connection yazdýðýmýz code baþarý bir þekilde çalýþýrsa iþimiz bittiði için kesilmelidir.
	 		yazdýðýmýz kod Exception atarsa cloud ile connection yine kesilmeli ve code tamir edilmelidir. 
	 		cloud ile connection kesilmezse fatura pahalý olabilir.
	 */

}
