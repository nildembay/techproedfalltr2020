package day28inheritanceconstructorcall;

public class Animal {
	
	public int a;
	public int m=3;
	
	public Animal() {
		super();
		System.out.println("parametresiz Animal");
	}
	public Animal(int i) {
		System.out.println("parametreli Const Animal");
	}
	
	public void mA() {
		System.out.println("Animal");
	}
	
	public void mM() {
		System.out.println("mammal+animal");
	}

}
