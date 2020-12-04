package day34interface;

public abstract class Honda {
	
/*
 1- interface lerde concrete methodlar kullanýlamaz. sadece abstract method kullanýlabilir.
 	interface ler SADECE mecbur yapýlmasý gerekenleri depolamak için kullanýlýr.
 	
 2- multiple inheritance, java tarafýndan desteklenmez.ama parentler class ise desteklemez.
 	parentler interface ise java multiple inheritance i destekler.
 	
 3-Birden fazla parent class olduðunda farklý parent class larda ayný isimli,farklý body li methodlarýn
 	olmasý mümkündür. bu tip durumlarda child class ayný isimli methodlardan hangisini kullanacaðýna karar 
 	veremez. ancak interrface lerde methodlrýn body leri olmadýðýndan ayný isimli methodlar birbirinin tamamý ile
 	aynýsýdýr. bu methodlardan  birini override etmek hepsini override etmek manasýna gelir.
 	
 note: parent interface ler içinde, ayný method signature sahip ama return type larý farklý methodlar varsa 
 java interface ler için de CTE verir.
 */
	
	public abstract void hareket();
	
	public void dizel() {
		System.out.println("motorin kullanýr.");
	}
	
	public void benzin() {
		System.out.println("benzin kullanýr.");
	}

}
