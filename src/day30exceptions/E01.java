package day30exceptions;

public class E01 {
	
	/*
	 1-FileNotFoundException, üstünde çalýþýlacak bir dosyaya ulaþma ile alakalý problemlerde kullanýlýr
	 	bir dosyaya ulaþmada iki temelproblem olabilir a) path yanlýþtýr b) dosya silinmiþtir.
	 	
	 2-IOException, input  ve output ile alakalý tüm problemlerde kullanýlýr.
	 	IOException, FileNotFoundException in yaptýðý tüm iþleri yapabilir. bu yüzden IOException kullanýldýðýnda
	 	FileNotFoundException ýn kullanýlmasýna gerek yoktur.
	 	IOException, FileNotFoundException class ýnýn parent class ýdýr.
	 
	 3-Code yazarken Exception kullanmak zorunda kalýrsak iki yol var
	 	a)Add throws declaration --> Problem oluþtuðunda console a teknik mesajlariçeren hata mesajý basar.
	 	
	 	b)try-catch block --> problem oluþtuðunda ekrana ne yazýlacaðýna veya problemle alakalý ne yapýlacaðýna
	 	  bizim karar vermemize olanak sunar.
	 
	 4- Try-catch kullandýðýnýzda; try bölümündeki hatasýz çalýþýrsa, catch bölümü çalýþmaz. catch bölümü,
	     try bölümü hatalý iken devreye girer.
	 
	 5- Try block tan sonra bir veya daha fazla catch kullanýlabilir. oluþan problem hangi catch ile alakalý ise o
	 	catch block çalýþýr. Ayný anda sadece bir catch block çalýþýr.
	 	
	 6- Aralarýnda parent - child iliþkisi olan birden fazla catch block kullanýrsanýz child olan üste yazýlmalýdýr. 
	    aksi taktirde CTE alýrsýnýz. Parent - child iliþkisi yoksa istediðiniz gibi sýralayabilirsiniz.
	 
	 7- Try block tan sonra catch block en az bir tane kullanýlmalýdýr. yoksa CTE alýrsýnýz.
	 
	 
	 
	 
	 */
	

}
