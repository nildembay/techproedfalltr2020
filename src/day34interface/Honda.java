package day34interface;

public abstract class Honda {
	
/*
 1- interface lerde concrete methodlar kullan�lamaz. sadece abstract method kullan�labilir.
 	interface ler SADECE mecbur yap�lmas� gerekenleri depolamak i�in kullan�l�r.
 	
 2- multiple inheritance, java taraf�ndan desteklenmez.ama parentler class ise desteklemez.
 	parentler interface ise java multiple inheritance i destekler.
 	
 3-Birden fazla parent class oldu�unda farkl� parent class larda ayn� isimli,farkl� body li methodlar�n
 	olmas� m�mk�nd�r. bu tip durumlarda child class ayn� isimli methodlardan hangisini kullanaca��na karar 
 	veremez. ancak interrface lerde methodlr�n body leri olmad���ndan ayn� isimli methodlar birbirinin tamam� ile
 	ayn�s�d�r. bu methodlardan  birini override etmek hepsini override etmek manas�na gelir.
 	
 note: parent interface ler i�inde, ayn� method signature sahip ama return type lar� farkl� methodlar varsa 
 java interface ler i�in de CTE verir.
 */
	
	public abstract void hareket();
	
	public void dizel() {
		System.out.println("motorin kullan�r.");
	}
	
	public void benzin() {
		System.out.println("benzin kullan�r.");
	}

}
