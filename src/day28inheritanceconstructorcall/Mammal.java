package day28inheritanceconstructorcall;

public class Mammal extends Animal {
	
	public int m=1;
	public int c=4;
	
	public Mammal() {
		this('y'); //eðer buraya parametre koyarsak java ayný class taki içindeki parametreli cons. gider.
		System.out.println("parametresiz Mammal");
	}
	
	public Mammal(char c) {
		super(17);
		System.out.println("parametreli Mammal");
	}
	
	public void mM() {
		System.out.println("mammal");
	}
	
	public void mC() {
		System.out.println("Mammal+ cat");
	}

}
