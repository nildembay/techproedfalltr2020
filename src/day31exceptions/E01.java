package day31exceptions;

public class E01 {
	
	/*
	 1- ArithmeticException class � javada matematiksel i�lemler yap�l�rken olu�abilecek hatalarda kullan�l�r.
	 	Mesela 12 yi 0 a b�lersek java Exception throw eder. Bu exception ArithmeticException kullan�larak 
	 	halledilebilir(handle). Run Time Exception dur
	 	
	 NOT: Java da iki tip exception vard�r. Birisi siz code yazarken k�rm�z� alt �izgi(CTE) verir. 
	 	di�eri vermez. 
	 	CTE veren exceptionlara "Compile Time Exception" ve ya "Checked Exception" denir
	 	CTE vermeyen exceptionlara "Run Time Exception" ve ya "Un-checked Exception" denir.
	 
	 NOT:"Compile Time exception" larda ya "throws veya "try-catch" kullanmal�s�n�z aksi taktirde code �al��maz. 
	 	Ama "Run Time Exception" larda isterseniz "throws", isterseniz "try-catch", isterseniz hi�bir �ey kullanmayabilirsiniz.
	 	***Yani, "Compile Time Exeption lar handle edilmelidirler ama RunTime Exceptonlar handle edilmese de olur.
	 
	 
	 2-	NullPointerException class�i ornegin; null atamasi yapilan bir String�de length() methodu kullanildiginda olusur. 
	  	Run Time Exception�dir.
	  	
	  	
	 3- ArrayIndexOutOfBoundsException class � Array lerde olamayn bir index le i�lem yapmaya �al���rsak devreye girer.
	 	RunTime Exceptiondur.
	 	
	 4- NumberFormatException class i say� format�nda olmayan bir stringi parseInt() metodu kullanarak integer a 
	 	�evirmek istedi�imizde devreye girer. RunTime Exceptiondur.
	 	
	 5- ClassCastException class � birbirine d�n��t�r�lemeyen data type lar birbirine d�n��t�r�lmek istenirse devreye girer.
	 	�rne�in object data type i, String data type ina d�n��t�r�lemez. java d�n��t�rmesini s�ylersek
	 	ClassCastException al�r�z.RunTime Exceptiondur.
	 	
	 6- IllegalArgumentException class �, kullan�lmas�n� istemedi�imiz de�erlerde program�m�z�n hata vermesini istiyorsak 
	 	devreye girer. Mesela ya� i�in negetif say�lar�n kullan�lmas� do�ru de�ildir. Kullan�c� ya� i�in negetif say� 
	 	kulland���nda program hata vermelidir. Bunu "throw new IllegalArgumentException();" kodunu yazarak temin edebiliriz. 
	 	
	
	 Soru: throw ile throws aras�ndaki farklar nelerdir?
	 
	 		1)"throws" method parantezinin kapan�� parantezi ile method body nin a��l�� parantezi aras�nda kullan�l�r.
	 		  "throw" method body nin i�inde kullan�l�r.
	 		  
	 		2)"throws" keyword unden sonra birden fazla Exception yaz�labilir.fakat
	 		  "throw" keyword unden sonra sadece bir Exception yaz�l�r.
	 		  
	 		3)"throws" keyword unden sonra sadece ,Exception class �n�n ismini yazar�z. fakat 
	 		  "throw" keyword unden sonra Exception class�ndan obje olu�tururuz.
	 		  
	 		4)"throws" keyword u methodun ilk sat�r�nda sadece bir kere kullan�labilir. ama
	 		  "throw" keyword u method bodysi i�inde nerede Exception atmak istersek istedi�imiz kadar kullanabiliriz.
	 		  
	 
	 NOTE: Catch block lardan sonra "finaly block" kullan�labilir. finally block �n �zelli�i Exception olu�sa da olu�masa da �al��mas�d�r.
	 		finally block cloud da yap�lan i�lemlerden sonra cloud ile connection � kesmek i�in kullan�l�r.
	 		cloud ile connection yazd���m�z code ba�ar� bir �ekilde �al���rsa i�imiz bitti�i i�in kesilmelidir.
	 		yazd���m�z kod Exception atarsa cloud ile connection yine kesilmeli ve code tamir edilmelidir. 
	 		cloud ile connection kesilmezse fatura pahal� olabilir.
	 */

}
