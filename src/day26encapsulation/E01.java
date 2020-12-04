package day26encapsulation;

public class E01 {
	/*
	 1- Encapsulation kýsaca data hiding(saklamak) demektir.
	 
	 2- Baþarýlý bir encapsulation aþaðýdaki özelliklere sahip olmalý
	 	a)Nasýl kullanýlacaðý belli olmalý --> direksiyon gibi
	 	b)Kodun karmaþýklýðý kullanýmýn karmaþýklýðýna sebep olmamalý
	 	yani çok karmaþýk kodlardan oluþan bir yapý basit bir þekilde kullanýlabilmeli
	 	c)Bir bölümün bozulmasý baþka böümlerin bozulmasýna sebep olmamalý
	 
	 3-Encapsulation nasýl yapýlýr?
	 	a)access modifierler "private" olarak kullanýnýz.
	 	b)getter ve setter methodlarý ile "encapsulated" datalara ulaþýp onlarý okuyabilir(getter) ve deðiþtirebiliriz(setter)
	 	
	 4- Encapsulation nýn faydalarý
	 	a)Esneklik (flexibility) Normalde aþaðýda age variablenýn deðeri 25'tir. ama diðer classlarda 
	 	setAge() method unu kullanarak age variable nin deðerini
	 	istediðimiz gibi deðiþtirip kullanabiliriz.
	 	
	 	b)Reusabilitiy(tekrar kullanýlabilirlik) getter ve setter methodlarý birkez oluþtururuz sonra proje içindeki 
	 	classlardan istediðimiz kadar kullanabiliriz.
	 	
	 	c)Ýstediðiniz datayý okunabilir(getter() oluþturarak) istediðiniz datayý okunamaz(getter() oluþturmayýz) 
	 	hale getirebilirsiniz.
	 	
	 	d)istediðiniz datayý deðiþtirilebilir(setter oluþturarak), istediðiniz datayý deðiþtirilemez yapabilirsiniz...
	 	
	not: tüm variable lar private ve sadece getter methodlar oluþturulduðunda bu classtaki veriler sadedece okunabilir.
	bu tarz class lara "Immutable class" denir.
	
		e-Kullanýcýnýn kullandýðý sistem arkasýndaki karmaþýk yapýyý kullanýcýya göstermez. böylece kullanýcý yapmak
		istediklerini daha rahat yapar.
		
	5- bir classta tüm variable lar private ise ve tüm getter ve setter lar oluþturulmuþ ise bu class 
	   "Fully Encapsulated" olarak adlandýrýlýr.
	   
	6- getter() ve setter() methodlarýna "Java Beans" de denir. 
	
	not: data type boolean olduðunda getter method un ismi "get" ile deðil "is" ile baþlar.
	
	 */
	private int age=25;
	private String name="Ali";
	
	// getter() oluþturmak --- her zaman public olmalý -- return type variable ýnkiyle ayný olmalý
	
	public int getAge() { // metod adý verirken get ifadesine varable ismi eklenir
		
		return age;
		
	}
	public String getName() { 
				
		return name;
		
	}
	
	// setter() oluþturmak --- her zaman public olmalý -- return type void olmalý
	public void setAge(int age) { //mutlaka parametre olmalý
		this.age=age;
		
	}
	public void setName(String name) { //tek bir action yapan methodlar void dir.
		this.name=name;
	}

	
	
}
