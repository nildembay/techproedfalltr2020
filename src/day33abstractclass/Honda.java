package day33abstractclass;

public abstract class Honda {
	
	/*
	
	1)Bazen child class'lar parent class'daki methodlarin body'lerini
	   hepdegistirerek kullanirlar. Bu tip durumlarda parent class'daki
	   methoda body koymak manasiz olur cunku parent class'daki method
	   body hic kullanilmaz.Bu manasizligi gidermek icin Java bize 
	   body'szi method uretme imkani verir. Body'siz methodlara
	   abstracta method denir.
	  
	 2)Parent class taki bodysiz methodlar�(abstract method), child class'lar override etmek 
	 	zorundad�rlar. biz bir application olu�tururken child class lar�, parent class taki baz� methodlar� 
	 	override etmek istersek o methodlar� abstract method yapar�z.
	 	
	 3) abstract method olu�turmak i�in a) "{}" k�sm�n� yazmay�n 
	 b)access modifierdan sonra "abstract" keywordunu kullan�n.
	 
	 4)abstract methodlar sadece abstract class lar i�inde olu�turulabilir.
	 
	 5)abstract class olu�turmak i�in class �n accsess modifier indan sonra "abstract" keywordunu kullan�n.
	 
	 6)abstract keywordu ile method body bir arada kullan�lamaz.
	 
	 7)abstract class i�inde hem abstract hemde abstract olmayan(concrete) methodlar kullan�labilir.
	 
	 8)Bir concrete class abstract class a extends etti�inde abstact class i�indeki t�m abstract methodlar� override etmek zorundad�r. 
	   Aksi taktirde CTE verir.Fakat concrete methodlar� override etmek zrunda de�ildir, iste�e ba�l�d�r.
	   
	 9)Bir abstaract class ba�ka bir abstract classa extends etti�inde herhangi bir methodu override etmek zorunda de�il, isterse edebilir.
	 
	 10) final class lar�n child class � olamaz. abstract class lar child classlara talimat vermek i�in olu�turulurlar.
	    E�er bir class � final yaparsan�z o class�n child class� olamayaca��ndan astract olmas� mant�kl� de�ildir. bu y�zden java abstract 
	    class lar�n final olmas�na m�saade etmez.
	   
	  11) abstract methodlar final olamaz. ��nk� abstract lar� overide etmeliyiz.
	  final yaparsak override edemeyiz b�ylece child lar kullanamazlar.
	  
	  12) abstract methodlar private olamazlar. ��nk� abstract methodlar ba�ka classlar taraf�ndan kullan�lmak i�in �retilir. halbuki private 
	  methodlar ba�ka claslar taraf�ndan kullan�lamazlar.
	  
	  13)!!!!!!!!!!!!!!!!!!!abstarct classlardan object �retilemez.   (En �nemli �zelli�i)!!!!!!!!!!!!!!!!!!!!!!!!!! 
	  
	  14)abstract methodlar static olamazlar. ��nk� static methodlar override edilemezler.
	  
	  
	 	 
	 */
	
	public abstract void motor();  
	
	public void deri() {
		System.out.println("koltuklar deri");
	}
	

}
