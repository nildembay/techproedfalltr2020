package day28inheritanceconstructorcall;

public class Runner {

	public static void main(String[] args) {
	
		Cat c1=new Cat("x");
		
		//Ayn� isimli variable lardan hangisinin kullan�ld��na karar vermek i�in olu�turulan 
		//object in data type �na bak�l�r.variable � ara�t�rmaya data type in class�ndan ba�lay�n�z.
		
		System.out.println(c1.a);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println(c1.m);
		
		
		
		Mammal c2=new Cat("x");
		System.out.println(c2.c);
		System.out.println(c2.m);
		
		/// not: java methodlara ula��rken constructora, variable lara ula��rken data type bakar
		
		Cat c3=new Cat();
		c3.mA();
		c3.mC();
		c3.mM();
		
		Mammal c4=new Mammal();
		c4.mA();
		c4.mC();
		c4.mM();
		
		
		
		Mammal c5=new Cat();
		c5.mA();
		c5.mC();
		c5.mM();
		
		
	}

}
