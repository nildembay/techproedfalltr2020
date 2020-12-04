package day34interface;

/*
 bir class parent yap�l�rken extends, interfaceleri bir class�n parent yapmak i�in implement kullan�l�r
 */

public class Civic extends Honda implements IcDonanim,Lastik{

	@Override
	public void hareket() {
		System.out.println("h�zl� ve ekonomik hareket eder.");
		
	}

	@Override
	public void koltuk() {
		System.out.println("ortopedik koltuklar� var");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("deri hidrolik direksiyon");
		
	}

	@Override
	public void ayna() {
		System.out.println("otomatik kararma �zelli�i var");
		
	}

	@Override
	public void far() {
		System.out.println("led far");
		
	}

	@Override
	public void kaporta() {
		System.out.println("paslanmaz �elik");
		
	}

	@Override
	public void garanti() {
		System.out.println("100.000 km garantili ");
		
		
	}

	@Override
	public void jant() {
		System.out.println("�elik jant");
		
		
	}
	

}
