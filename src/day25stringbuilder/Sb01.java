package day25stringbuilder;

public class Sb01 {
	/*
	 1- String Class i "immutable(de�i�tirilemez)" dir. Java "mutable(De�ii�tirilebilir)" Stringler �retebilmemiz
	 i�in "StringBuilder" isimli bir class �retti.
	 2- Java da StringBuilder ile hemen ayn� i�i yapan birde "StringBuffer" class � var.
	 "StringBuffer" class � "StringBuilder" class �ndan daha �nce �retilmi�ti.
	 StringBuffer yava� �l��an bir class d�r. StringBuilder h�zl� �al���r.
	 Stringbuffer "synchronize"i�lemlerini yapabilir ama StringBuilder yapamaz.
	 
	 3- Ayn� anda pek �ok i�in yap�lmas�na "multi threading" denir. multi==> �ok, thread==> yap�lan i�lerin her biri
	 Multi threading varsa bu i�lerin s�raya konulmas� laz�m, i�lerin s�raya konmas�na "synchronization" denir.
	 */

	public static void main(String[] args) {
		
		String str="Learn";
		
		concat(str);
		
		//Stringlerde method kullanarak stringi de�i�tirmek atama yapmadan m�mk�n de�ildir.
		//bunun iki sebebi vard�r
		// 1-Java pass-by-value kullan�r     2-String Class i immutable class d�r.
		
		System.out.println(str);
				
	}
	
	public static void concat(String str) {
		System.out.println(str+"X");
		
	}
}
