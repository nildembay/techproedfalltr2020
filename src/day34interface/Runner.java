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
		//A�a��daki kod CTE verir. ��nk� interface deki t�m variable lar otomatik olarak 
		//final olurlar ve final veriable lar�n de�erleri de�i�tirileemz
		// c1.FIYAT=30000;
		
		System.out.println(IcDonanim.FIYAT);
		// fiyat variable �na interface ismi ile ula�abiliriz. object �retmeye gerek yok. demekki
		//interface lerdeki variabler static tir.
		
		//interface teki t�m class memberlar "public" tir. �yleyse interface deki variablelar  
		//public+static+final d�r.
		
		//System.out.println(c1.MARKA);//ayn� data type l� variable lar parent interfacelerde olu�turulabilir.
									// Ama ayn� isimli variable lar� object kullanarak �a��r�rsan�z. java hangisini se�ece�ine 
									// karar veremez ve CTE verir. CTE almamak i�in ayn� isimli variable lar
									//kesinlikle interface isimleriyle �a��r�lmal�d�r.(variabler statictir. do�rusu zaten
									//	interface ile �a��rmakt�r.)
		
		System.out.println(IcDonanim.MARKA);
		System.out.println(DisDonanim.MARKA);
		System.out.println(Lastik.MARKA);
	}

}
