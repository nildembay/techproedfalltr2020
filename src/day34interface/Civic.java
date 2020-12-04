package day34interface;

/*
 bir class parent yapýlýrken extends, interfaceleri bir classýn parent yapmak için implement kullanýlýr
 */

public class Civic extends Honda implements IcDonanim,Lastik{

	@Override
	public void hareket() {
		System.out.println("hýzlý ve ekonomik hareket eder.");
		
	}

	@Override
	public void koltuk() {
		System.out.println("ortopedik koltuklarý var");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("deri hidrolik direksiyon");
		
	}

	@Override
	public void ayna() {
		System.out.println("otomatik kararma özelliði var");
		
	}

	@Override
	public void far() {
		System.out.println("led far");
		
	}

	@Override
	public void kaporta() {
		System.out.println("paslanmaz çelik");
		
	}

	@Override
	public void garanti() {
		System.out.println("100.000 km garantili ");
		
		
	}

	@Override
	public void jant() {
		System.out.println("Çelik jant");
		
		
	}
	

}
