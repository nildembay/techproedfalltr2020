package day33abstractclass;

public abstract class Honda {
	
	/*
	
	1)Bazen child class'lar parent class'daki methodlarin body'lerini
	   hepdegistirerek kullanirlar. Bu tip durumlarda parent class'daki
	   methoda body koymak manasiz olur cunku parent class'daki method
	   body hic kullanilmaz.Bu manasizligi gidermek icin Java bize 
	   body'szi method uretme imkani verir. Body'siz methodlara
	   abstracta method denir.
	  
	 2)Parent class taki bodysiz methodlarý(abstract method), child class'lar override etmek 
	 	zorundadýrlar. biz bir application oluþtururken child class larý, parent class taki bazý methodlarý 
	 	override etmek istersek o methodlarý abstract method yaparýz.
	 	
	 3) abstract method oluþturmak için a) "{}" kýsmýný yazmayýn 
	 b)access modifierdan sonra "abstract" keywordunu kullanýn.
	 
	 4)abstract methodlar sadece abstract class lar içinde oluþturulabilir.
	 
	 5)abstract class oluþturmak için class ýn accsess modifier indan sonra "abstract" keywordunu kullanýn.
	 
	 6)abstract keywordu ile method body bir arada kullanýlamaz.
	 
	 7)abstract class içinde hem abstract hemde abstract olmayan(concrete) methodlar kullanýlabilir.
	 
	 8)Bir concrete class abstract class a extends ettiðinde abstact class içindeki tüm abstract methodlarý override etmek zorundadýr. 
	   Aksi taktirde CTE verir.Fakat concrete methodlarý override etmek zrunda deðildir, isteðe baðlýdýr.
	   
	 9)Bir abstaract class baþka bir abstract classa extends ettiðinde herhangi bir methodu override etmek zorunda deðil, isterse edebilir.
	 
	 10) final class larýn child class ý olamaz. abstract class lar child classlara talimat vermek için oluþturulurlar.
	    Eðer bir class ý final yaparsanýz o classýn child classý olamayacaðýndan astract olmasý mantýklý deðildir. bu yüzden java abstract 
	    class larýn final olmasýna müsaade etmez.
	   
	  11) abstract methodlar final olamaz. çünkü abstract larý overide etmeliyiz.
	  final yaparsak override edemeyiz böylece child lar kullanamazlar.
	  
	  12) abstract methodlar private olamazlar. çünkü abstract methodlar baþka classlar tarafýndan kullanýlmak için üretilir. halbuki private 
	  methodlar baþka claslar tarafýndan kullanýlamazlar.
	  
	  13)!!!!!!!!!!!!!!!!!!!abstarct classlardan object üretilemez.   (En önemli özelliði)!!!!!!!!!!!!!!!!!!!!!!!!!! 
	  
	  14)abstract methodlar static olamazlar. çünkü static methodlar override edilemezler.
	  
	  
	 	 
	 */
	
	public abstract void motor();  
	
	public void deri() {
		System.out.println("koltuklar deri");
	}
	

}
