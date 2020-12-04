package day29overriding;

public class Overriding {
	
	/*
	 1- Parent Class taki bir metodu Child Class a g�re �zelle�tirerek kullanmak isterseniz "Overriding" yapabilirsiniz
	 
	 2- Overriding yaparken ;
	 	a) "method signature (name+parametre) a dokunulmaz
	 	b) "access modifier" lar belli kurallara g�re de�i�tirilebilir.
	 	c) "return type" lar belli kurallara g�re de�i�tirilebilir.
	 	d) "method body" de�i�tirilir. zaten Overriding in amaci budur. Ama method body i de�i�tirmeden kullan�rsan�z 
	 	    java CTE vermez. Ama method body i de�i�tirmemek mant�ks�zd�r.
	 	e) Overriding yapabilmek i�in "parent-child" releationship �artt�r. yani inheritance olmadan overriding olmaz
	 	f) Override edilen method parent taki methoddur ve java da o metoda "overridden method" denir.
	 	   Child classtaki ise "overriding method" olarak adland�r�l�r.
	 
	 3- Overriding methodun ba��na @Override annotation �n� koyarsan�z java yapt���n�z overridingi kontrol eder
	 	herhangi bir yanl��l�k varsa CTE verir.
	 	
	 4- Overriding methodun(child) access modifier i ya "overridden method" ile ayn� olur veya daha geni� olur.
	 
	 5- Return type lar primitive ise "Overriding method"un return type i Overridden method ile ayn� olmal�d�r.
	 
	 6- "Overriding method"un return type i void ise Overridden methodun da return type i void olmal�d�r.
	 
	 7- Return type lar wrapper class ise Overriding methodun return type Overridden in return type i ile ayn� olmal�
	 
	 8- Return type lar aras�nda parent-child relationship varsa overriding methodun return type � ya 
	 	overridden method ile ayn� olmal� veya overridden methodun child class� olmal�
	 	
	 9- Static Methodlar override edilemezler.
	 
	 10- "final method" lar Override edilemezler. bir method final sa onun body si olabilecek son haldedir ve de�i�tirilemez.
	 
	 11- private methodlar override edilemezler.
	 
	 12-"Polymorphism" nedir?
	 	polymorphism "overloading" ve "overriding" den olu�ur.
	 	
	 				Overloading --> public void add(){ }
	 								public void add(int i){ }
	 								public void add(int i,String s){ }
	 				
	 				Overriding  --> public void multiply(){syso(3*4)}
	 								public void multiply(){syso(1*2*3)}
	 								public void multiply(){syso(5*4*3)}
	 	
	 	overloading ve overriding farklar�
	 	
	 1- overloading de method signature(name+parametre) de�i�tirilir.parametre de�i�ir.
	 	overriding de method signature(name+parametre) dokunulmaz
	 	
	 2- overloading de method body genellikle de�i�mez, 
	 	overriding de method body hemen hemen her zaman de�i�tirilir.
	 
	 3- overloading de inheritance gerekmez,overriding de �artt�r.
	 
	 4- overloading compile time polymorphism, overriding Run time polymorphism dir.
	 
	 5- private methodlar overload edilebilir ama override edilemezler.
	 	static methodlar overload edilebilir ama override edilemezler.
	 	final methodlar overload edilebilir ama override edilemezler.
	 
	 */

}
