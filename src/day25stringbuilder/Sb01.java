package day25stringbuilder;

public class Sb01 {
	/*
	 1- String Class i "immutable(deðiþtirilemez)" dir. Java "mutable(Deðiiþtirilebilir)" Stringler üretebilmemiz
	 için "StringBuilder" isimli bir class üretti.
	 2- Java da StringBuilder ile hemen ayný iþi yapan birde "StringBuffer" class ý var.
	 "StringBuffer" class ý "StringBuilder" class ýndan daha önce üretilmiþti.
	 StringBuffer yavaþ çlýþan bir class dýr. StringBuilder hýzlý çalýþýr.
	 Stringbuffer "synchronize"iþlemlerini yapabilir ama StringBuilder yapamaz.
	 
	 3- Ayný anda pek çok iþin yapýlmasýna "multi threading" denir. multi==> çok, thread==> yapýlan iþlerin her biri
	 Multi threading varsa bu iþlerin sýraya konulmasý lazým, iþlerin sýraya konmasýna "synchronization" denir.
	 */

	public static void main(String[] args) {
		
		String str="Learn";
		
		concat(str);
		
		//Stringlerde method kullanarak stringi deðiþtirmek atama yapmadan mümkün deðildir.
		//bunun iki sebebi vardýr
		// 1-Java pass-by-value kullanýr     2-String Class i immutable class dýr.
		
		System.out.println(str);
				
	}
	
	public static void concat(String str) {
		System.out.println(str+"X");
		
	}
}
