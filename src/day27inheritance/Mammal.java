package day27inheritance;

public class Mammal extends Animal {
	
	public Mammal() {
		System.out.println("Mammal parametresiz constructor");
	}
	
	public void sutIleBesle() {
		System.out.println("yavrularýný süt ile beslerler.");
	}
	
	public void dogum() {
		System.out.println("doðum yaparlar.");
	}

}
