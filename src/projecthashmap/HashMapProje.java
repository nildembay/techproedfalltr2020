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
			
			System.out.println("kimlik numaranýzný giriniz");
			System.out.println("giriþi durdurmak için 'Q' tuþuna basýnýz");
			id=scan.next();
			if (id.equalsIgnoreCase("Q")){
				
				break;
			}else {
				
				while(hm.containsKey(id)) {
					
					System.out.println(id+" kayýtlarda var.Lütfen geçerli bir id giriniz");
					id=scan.next();
					
				}
			}
			scan.nextLine();//next ten sonra next line kullanýrsanýz bu kodu araya yazýnýz.
			
			System.out.println("tam isminizi alýnýz");
			String isim=scan.nextLine();
			
			System.out.println("adresinizi giriniz");
			String adres=scan.nextLine();
			
			System.out.println("telefonunuzu giriniz");
			String tel=scan.nextLine();
			String ogrenci="\nÝsim: "+isim+"\nAdres: "+adres+"\nTelefon: "+tel;// isim adres ve tel birleþtirildi.
			
			hm.put(id, ogrenci); //bilgiler hashmap e eklendi.
			
			
		}while(true);
		
		System.out.println(hm);
		
	}
	
	public static void getInfo(HashMap<String,String>hm) {
		Scanner scan=new Scanner(System.in);
		String id="";
		
		do {
			System.out.println("öðrenci bilgisi almak için id girin");
			System.out.println("giriþi durdurmak için 'Q' tuþuna basýnýz");
			id=scan.next();
			if (id.equalsIgnoreCase("Q")){
				
				break;
			}else if(hm.isEmpty()){
			System.out.println("herhangi bir data yok");
			
			}else if(!hm.containsKey(id)){
				
				System.out.println(id +" geçerli bir id deðil. Lütfen geçerli bir id giriniz.");
				
			}
			else {
				String ogrenciInfo=hm.get(id);
				System.out.println(id+ " aþaðýdaki bilgileri içerir."+ogrenciInfo);
				
			}
		}while(true);
		
	}
	
	public static void removeInfo(HashMap<String,String>hm) {
		Scanner scan=new Scanner(System.in);
		String id="";
		
		do {
			
			System.out.println("Silmek istediðiniz öðrencinin id sini giriniz");
			System.out.println("silme iþlemiini durdurmak için 'q' tuþuna basýnýz");
			id=scan.next();
			if (id.equalsIgnoreCase("Q")){
				break;
			}else if(hm.isEmpty()){
				System.out.println("herhangi bir data yok");
				
			}else if(!hm.containsKey(id)){
					
					System.out.println(id +" geçerli bir id deðil. Lütfen geçerli bir id giriniz.");
					
			}else {
					
				String silinen=hm.remove(id);
				System.out.println("silinen öðrenci \n"+ silinen);
					
				}
			
		}while(true);
		System.out.println(hm);
		
	}
	
	public static void selectOption(HashMap<String,String>hm) {
		
		String option="";
		do {
			Scanner scan=new Scanner(System.in);
			System.out.println("yapmak istediðiniz seçeneði seçiniz");
			System.out.println("1 - Öðrenci Ekleme \n2 - Öðrenci Bilgisi Alma\n3 - Öðrenci Kaydý Silme");
			System.out.println("Seçim yapmayý sonlandýrmak için 'q' tuþuna basýnýz");
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
				System.out.println("yanlýþ seçim yaptýnýz");
				
				
			}
		
		
			}while(true);
			
	}
	
	
	

}
