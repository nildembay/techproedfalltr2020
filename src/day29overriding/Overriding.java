package day29overriding;

public class Overriding {
	
	/*
	 1- Parent Class taki bir metodu Child Class a göre özelleþtirerek kullanmak isterseniz "Overriding" yapabilirsiniz
	 
	 2- Overriding yaparken ;
	 	a) "method signature (name+parametre) a dokunulmaz
	 	b) "access modifier" lar belli kurallara göre deðiþtirilebilir.
	 	c) "return type" lar belli kurallara göre deðiþtirilebilir.
	 	d) "method body" deðiþtirilir. zaten Overriding in amaci budur. Ama method body i deðiþtirmeden kullanýrsanýz 
	 	    java CTE vermez. Ama method body i deðiþtirmemek mantýksýzdýr.
	 	e) Overriding yapabilmek için "parent-child" releationship þarttýr. yani inheritance olmadan overriding olmaz
	 	f) Override edilen method parent taki methoddur ve java da o metoda "overridden method" denir.
	 	   Child classtaki ise "overriding method" olarak adlandýrýlýr.
	 
	 3- Overriding methodun baþýna @Override annotation ýný koyarsanýz java yaptýðýnýz overridingi kontrol eder
	 	herhangi bir yanlýþlýk varsa CTE verir.
	 	
	 4- Overriding methodun(child) access modifier i ya "overridden method" ile ayný olur veya daha geniþ olur.
	 
	 5- Return type lar primitive ise "Overriding method"un return type i Overridden method ile ayný olmalýdýr.
	 
	 6- "Overriding method"un return type i void ise Overridden methodun da return type i void olmalýdýr.
	 
	 7- Return type lar wrapper class ise Overriding methodun return type Overridden in return type i ile ayný olmalý
	 
	 8- Return type lar arasýnda parent-child relationship varsa overriding methodun return type ý ya 
	 	overridden method ile ayný olmalý veya overridden methodun child classý olmalý
	 	
	 9- Static Methodlar override edilemezler.
	 
	 10- "final method" lar Override edilemezler. bir method final sa onun body si olabilecek son haldedir ve deðiþtirilemez.
	 
	 11- private methodlar override edilemezler.
	 
	 12-"Polymorphism" nedir?
	 	polymorphism "overloading" ve "overriding" den oluþur.
	 	
	 				Overloading --> public void add(){ }
	 								public void add(int i){ }
	 								public void add(int i,String s){ }
	 				
	 				Overriding  --> public void multiply(){syso(3*4)}
	 								public void multiply(){syso(1*2*3)}
	 								public void multiply(){syso(5*4*3)}
	 	
	 	overloading ve overriding farklarý
	 	
	 1- overloading de method signature(name+parametre) deðiþtirilir.parametre deðiþir.
	 	overriding de method signature(name+parametre) dokunulmaz
	 	
	 2- overloading de method body genellikle deðiþmez, 
	 	overriding de method body hemen hemen her zaman deðiþtirilir.
	 
	 3- overloading de inheritance gerekmez,overriding de þarttýr.
	 
	 4- overloading compile time polymorphism, overriding Run time polymorphism dir.
	 
	 5- private methodlar overload edilebilir ama override edilemezler.
	 	static methodlar overload edilebilir ama override edilemezler.
	 	final methodlar overload edilebilir ama override edilemezler.
	 
	 */

}
