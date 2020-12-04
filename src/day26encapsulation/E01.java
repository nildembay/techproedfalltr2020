package day26encapsulation;

public class E01 {
	/*
	 1- Encapsulation k�saca data hiding(saklamak) demektir.
	 
	 2- Ba�ar�l� bir encapsulation a�a��daki �zelliklere sahip olmal�
	 	a)Nas�l kullan�laca�� belli olmal� --> direksiyon gibi
	 	b)Kodun karma��kl��� kullan�m�n karma��kl���na sebep olmamal�
	 	yani �ok karma��k kodlardan olu�an bir yap� basit bir �ekilde kullan�labilmeli
	 	c)Bir b�l�m�n bozulmas� ba�ka b��mlerin bozulmas�na sebep olmamal�
	 
	 3-Encapsulation nas�l yap�l�r?
	 	a)access modifierler "private" olarak kullan�n�z.
	 	b)getter ve setter methodlar� ile "encapsulated" datalara ula��p onlar� okuyabilir(getter) ve de�i�tirebiliriz(setter)
	 	
	 4- Encapsulation n�n faydalar�
	 	a)Esneklik (flexibility) Normalde a�a��da age variablen�n de�eri 25'tir. ama di�er classlarda 
	 	setAge() method unu kullanarak age variable nin de�erini
	 	istedi�imiz gibi de�i�tirip kullanabiliriz.
	 	
	 	b)Reusabilitiy(tekrar kullan�labilirlik) getter ve setter methodlar� birkez olu�tururuz sonra proje i�indeki 
	 	classlardan istedi�imiz kadar kullanabiliriz.
	 	
	 	c)�stedi�iniz datay� okunabilir(getter() olu�turarak) istedi�iniz datay� okunamaz(getter() olu�turmay�z) 
	 	hale getirebilirsiniz.
	 	
	 	d)istedi�iniz datay� de�i�tirilebilir(setter olu�turarak), istedi�iniz datay� de�i�tirilemez yapabilirsiniz...
	 	
	not: t�m variable lar private ve sadece getter methodlar olu�turuldu�unda bu classtaki veriler sadedece okunabilir.
	bu tarz class lara "Immutable class" denir.
	
		e-Kullan�c�n�n kulland��� sistem arkas�ndaki karma��k yap�y� kullan�c�ya g�stermez. b�ylece kullan�c� yapmak
		istediklerini daha rahat yapar.
		
	5- bir classta t�m variable lar private ise ve t�m getter ve setter lar olu�turulmu� ise bu class 
	   "Fully Encapsulated" olarak adland�r�l�r.
	   
	6- getter() ve setter() methodlar�na "Java Beans" de denir. 
	
	not: data type boolean oldu�unda getter method un ismi "get" ile de�il "is" ile ba�lar.
	
	 */
	private int age=25;
	private String name="Ali";
	
	// getter() olu�turmak --- her zaman public olmal� -- return type variable �nkiyle ayn� olmal�
	
	public int getAge() { // metod ad� verirken get ifadesine varable ismi eklenir
		
		return age;
		
	}
	public String getName() { 
				
		return name;
		
	}
	
	// setter() olu�turmak --- her zaman public olmal� -- return type void olmal�
	public void setAge(int age) { //mutlaka parametre olmal�
		this.age=age;
		
	}
	public void setName(String name) { //tek bir action yapan methodlar void dir.
		this.name=name;
	}

	
	
}
