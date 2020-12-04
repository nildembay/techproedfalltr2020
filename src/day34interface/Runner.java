package day34interface;

public class Runner {

	public static void main(String[] args) {
	
		Civic c1=new Civic();
		c1.hareket();
		c1.benzin();
		c1.koltuk();
		c1.direksiyon();
		c1.ayna();
		c1.far();
		c1.kaporta();
		c1.garanti();
		c1.jant();
		//Aþaðýdaki kod CTE verir. Çünkü interface deki tüm variable lar otomatik olarak 
		//final olurlar ve final veriable larýn deðerleri deðiþtirileemz
		// c1.FIYAT=30000;
		
		System.out.println(IcDonanim.FIYAT);
		// fiyat variable ýna interface ismi ile ulaþabiliriz. object üretmeye gerek yok. demekki
		//interface lerdeki variabler static tir.
		
		//interface teki tüm class memberlar "public" tir. öyleyse interface deki variablelar  
		//public+static+final dýr.
		
		//System.out.println(c1.MARKA);//ayný data type lý variable lar parent interfacelerde oluþturulabilir.
									// Ama ayný isimli variable larý object kullanarak çaðýrýrsanýz. java hangisini seçeceðine 
									// karar veremez ve CTE verir. CTE almamak için ayný isimli variable lar
									//kesinlikle interface isimleriyle çaðýrýlmalýdýr.(variabler statictir. doðrusu zaten
									//	interface ile çaðýrmaktýr.)
		
		System.out.println(IcDonanim.MARKA);
		System.out.println(DisDonanim.MARKA);
		System.out.println(Lastik.MARKA);
	}

}
