package day28inheritanceconstructorcall;

public class Cat extends Mammal{
	
	public int c=2;
	public int d=5;
	
	
	public Cat() {
		//super();  //super() Constructor in i�inde sadece ilk sat�rda kullan�labilir.
 		System.out.println("parametresiz Cat");
	}
	
	public Cat(String s) {
		this();
		
		// parent class tan variable veya method se�mek i�in "super" keywordunu kullanabilirsiniz.
		System.out.println(super.c);
		System.out.println("parametreli Cat");
	}

	public void mC() {
		System.out.println("cat");
	}

}
