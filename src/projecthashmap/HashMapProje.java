package projecthashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProje {

	public static void main(String[] args) {
		/*saveInfo() method olusturun:
			 1)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
			 2)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
			 3)Ayni kimlik numarasi ile bilgi girilmesine engel olun.
			 
			 getInfo() method olusturun:
			 1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
			 2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.
			 
			 removeInfo() method olusturun:
			 1)Kimlik numarasini girerek data silin.
			 2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
			 3)Collection bos ise kullaniciya hata mesaji verin.
			 
			 selectOption() method olusturun:
			 1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin*/
	HashMap<String,String>	hm=new HashMap<>();
	selectOption(hm);
	
	}
	
	public static void saveInfo(HashMap<String,String> hm) {
		Scanner scan=new Scanner(System.in);
		String id="";
		do {
			
			System.out.println("kimlik numaran�zn� giriniz");
			System.out.println("giri�i durdurmak i�in 'Q' tu�una bas�n�z");
			id=scan.next();
			if (id.equalsIgnoreCase("Q")){
				
				break;
			}else {
				
				while(hm.containsKey(id)) {
					
					System.out.println(id+" kay�tlarda var.L�tfen ge�erli bir id giriniz");
					id=scan.next();
					
				}
			}
			scan.nextLine();//next ten sonra next line kullan�rsan�z bu kodu araya yaz�n�z.
			
			System.out.println("tam isminizi al�n�z");
			String isim=scan.nextLine();
			
			System.out.println("adresinizi giriniz");
			String adres=scan.nextLine();
			
			System.out.println("telefonunuzu giriniz");
			String tel=scan.nextLine();
			String ogrenci="\n�sim: "+isim+"\nAdres: "+adres+"\nTelefon: "+tel;// isim adres ve tel birle�tirildi.
			
			hm.put(id, ogrenci); //bilgiler hashmap e eklendi.
			
			
		}while(true);
		
		System.out.println(hm);
		
	}
	
	public static void getInfo(HashMap<String,String>hm) {
		Scanner scan=new Scanner(System.in);
		String id="";
		
		do {
			System.out.println("��renci bilgisi almak i�in id girin");
			System.out.println("giri�i durdurmak i�in 'Q' tu�una bas�n�z");
			id=scan.next();
			if (id.equalsIgnoreCase("Q")){
				
				break;
			}else if(hm.isEmpty()){
			System.out.println("herhangi bir data yok");
			
			}else if(!hm.containsKey(id)){
				
				System.out.println(id +" ge�erli bir id de�il. L�tfen ge�erli bir id giriniz.");
				
			}
			else {
				String ogrenciInfo=hm.get(id);
				System.out.println(id+ " a�a��daki bilgileri i�erir."+ogrenciInfo);
				
			}
		}while(true);
		
	}
	
	public static void removeInfo(HashMap<String,String>hm) {
		Scanner scan=new Scanner(System.in);
		String id="";
		
		do {
			
			System.out.println("Silmek istedi�iniz ��rencinin id sini giriniz");
			System.out.println("silme i�lemiini durdurmak i�in 'q' tu�una bas�n�z");
			id=scan.next();
			if (id.equalsIgnoreCase("Q")){
				break;
			}else if(hm.isEmpty()){
				System.out.println("herhangi bir data yok");
				
			}else if(!hm.containsKey(id)){
					
					System.out.println(id +" ge�erli bir id de�il. L�tfen ge�erli bir id giriniz.");
					
			}else {
					
				String silinen=hm.remove(id);
				System.out.println("silinen ��renci \n"+ silinen);
					
				}
			
		}while(true);
		System.out.println(hm);
		
	}
	
	public static void selectOption(HashMap<String,String>hm) {
		
		String option="";
		do {
			Scanner scan=new Scanner(System.in);
			System.out.println("yapmak istedi�iniz se�ene�i se�iniz");
			System.out.println("1 - ��renci Ekleme \n2 - ��renci Bilgisi Alma\n3 - ��renci Kayd� Silme");
			System.out.println("Se�im yapmay� sonland�rmak i�in 'q' tu�una bas�n�z");
			option=scan.next();
			if (option.equalsIgnoreCase("Q")){
				break;
			}
			switch(option) {
			case "1":
				saveInfo(hm);
				break;
			case "2":
				getInfo(hm);
				break;
			case "3":
				removeInfo(hm);
				break;
			default:
				System.out.println("yanl�� se�im yapt�n�z");
				
				
			}
		
		
			}while(true);
			
	}
	
	
	

}
