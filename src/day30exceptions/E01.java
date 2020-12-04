package day30exceptions;

public class E01 {
	
	/*
	 1-FileNotFoundException, �st�nde �al���lacak bir dosyaya ula�ma ile alakal� problemlerde kullan�l�r
	 	bir dosyaya ula�mada iki temelproblem olabilir a) path yanl��t�r b) dosya silinmi�tir.
	 	
	 2-IOException, input  ve output ile alakal� t�m problemlerde kullan�l�r.
	 	IOException, FileNotFoundException in yapt��� t�m i�leri yapabilir. bu y�zden IOException kullan�ld���nda
	 	FileNotFoundException �n kullan�lmas�na gerek yoktur.
	 	IOException, FileNotFoundException class �n�n parent class �d�r.
	 
	 3-Code yazarken Exception kullanmak zorunda kal�rsak iki yol var
	 	a)Add throws declaration --> Problem olu�tu�unda console a teknik mesajlari�eren hata mesaj� basar.
	 	
	 	b)try-catch block --> problem olu�tu�unda ekrana ne yaz�laca��na veya problemle alakal� ne yap�laca��na
	 	  bizim karar vermemize olanak sunar.
	 
	 4- Try-catch kulland���n�zda; try b�l�m�ndeki hatas�z �al���rsa, catch b�l�m� �al��maz. catch b�l�m�,
	     try b�l�m� hatal� iken devreye girer.
	 
	 5- Try block tan sonra bir veya daha fazla catch kullan�labilir. olu�an problem hangi catch ile alakal� ise o
	 	catch block �al���r. Ayn� anda sadece bir catch block �al���r.
	 	
	 6- Aralar�nda parent - child ili�kisi olan birden fazla catch block kullan�rsan�z child olan �ste yaz�lmal�d�r. 
	    aksi taktirde CTE al�rs�n�z. Parent - child ili�kisi yoksa istedi�iniz gibi s�ralayabilirsiniz.
	 
	 7- Try block tan sonra catch block en az bir tane kullan�lmal�d�r. yoksa CTE al�rs�n�z.
	 
	 
	 
	 
	 */
	

}
