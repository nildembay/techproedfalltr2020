package day28inheritanceconstructorcall;

public class Cat extends Mammal{
	
	public int c=2;
	public int d=5;
	
	
	public Cat() {
		//super();  //super() Constructor in içinde sadece ilk satýrda kullanýlabilir.
 		System.out.println("parametresiz Cat");
	}
	
	public Cat(String s) {
		this();
		
		// parent class tan variable veya method seçmek için "super" keywordunu kullanabilirsiniz.
		System.out.println(super.c);
		System.out.println("parametreli Cat");
	}

	public void mC() {
		System.out.println("cat");
	}

}
