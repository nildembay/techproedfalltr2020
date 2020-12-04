package day16constructors;

public class Animal {
	int age;
	String name;
	int numOfLegs;
	boolean isMammal;
	
	public Animal() {
		System.out.println("parametresiz");
	}
	public Animal(String name) {
		this();
		this.name=name;
		System.out.println("name parametreli");
	}
	
	public Animal(int age) {
		System.out.println("age parametreli");
	}
	public Animal(String name,int age) {
		System.out.println("Name ve age parametreli");
	}
	
	

	public static void main(String[] args) {
		Animal a1=new Animal("cat");
		System.out.println(a1.name);
	}

}
