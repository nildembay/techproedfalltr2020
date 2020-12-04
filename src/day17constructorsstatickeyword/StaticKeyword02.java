package day17constructorsstatickeyword;

public class StaticKeyword02 {

	public static void main(String[] args) {
		// static olanlara sadece class ismi kullan�larak ula�abilirsiniz
		System.out.println(StaticKeyword01.k);
		System.out.println(StaticKeyword01.gender);
		
		//Instance olanlara ula�mak i�in object �retmek zorundas�n�z.
		StaticKeyword01 obj1=new StaticKeyword01();
		System.out.println(obj1.i);
		System.out.println(obj1.name);
		
		//static olanlara object �zerinden ula�abilirsiiniz ama tavsiye edilmez.
		System.out.println(obj1.gender);
		System.out.println(obj1.k);

	}

}
