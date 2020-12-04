package projectvendingmachine;

import java.util.Scanner;

public class Methods {
	
	public double money() {
		Scanner scan=new Scanner(System.in);
		System.out.println("kaç dolar yatýrmak istersiniz");
		double money=scan.nextDouble();
		
		return money;
	}
	public double select(Products product) {
		
		System.out.println(product.toString()); //ürünleri listeledi
		
		Scanner scan = new Scanner(System.in);//müþteri ile diyalog
		
		do {
			System.out.println("Lutfen almak istediginiz urunun numarasini giriniz (1'den 10'a kadar)");
			System.out.println("Çýkýþ için '0' a basýnýz");
			product.setProductNum(scan.nextInt()); //müþterinin girdiði deðeri, productnum a set ediyor.
			
			if(product.getProductNum()<0 || product.getProductNum()>10) {
				System.out.println("Gecerli bir product numarasi giriniz (1'den 10'a kadar)");//müþterinin girdiði num ukontrol ediyor
			}
		}while(product.getProductNum()<0 || product.getProductNum()>10);//müþteri yanlýþ numara girerse tekrar loop u çalýþtýracak
		
		switch(product.getProductNum()) { //müþterinin seçtiði numarayý alýyor
			case 0:
				System.out.println("teþekkür eder tekrar bekleriz...");
				break;
			case 1:
			   product.setPrice(product.getSnicker());   //ürün numarasýný müþteriye seçtiriyor ve seçilen ürünün fiyatýný set ediyor.
			   break;
			case 2:
				product.setPrice(product.getChipsAhoy());
				break;
			case 3:
				product.setPrice(product.getPringles());
				break;
			case 4:
				product.setPrice(product.getMilano());
				break;
			case 5:
	        	product.setPrice(product.getReeses());
	           break;
	        case 6:
	        	product.setPrice(product.getCocaCola());
	           break;
	        case 7:
	        	product.setPrice(product.getFanta());
	           break;
	        case 8:
	        	product.setPrice(product.getWater());
	           break;
	        case 9:
	        	product.setPrice(product.getArizona());
	           break;
	        case 10:
	        	product.setPrice(product.getSkittles());
	           break;				    
		}
		return product.getPrice(); //fiyatý döndürüyor

		
	}
	
	public double balance(double price,double money,Products product) {//balance-->bakiye
		
		while(money<price) { // müþterinin parasý yetersizse
			Scanner scan=new Scanner(System.in);
			System.out.println("bakiye yetersiz para eklemek istermisiniz(Y/N)?");
			char onay=scan.next().toUpperCase().charAt(0);
			
			if (onay=='N') {
				System.out.println("bakiyeniz "+money);
				System.out.println("teþekkür eder yine bekleriz");
				break;
				
			}else if(onay=='Y') {
				
				System.out.println("ne kadar eklemek istersiniz");
				double eklenecek=scan.nextDouble();
				money=money+eklenecek;
				System.out.println("hesabýnýzda "+money+" dollar var");// müþterinin güncel bakiyeyi gösteriyor
				price=select(product); //müþteriye ürünleri listeliyor ve seçim yaptýrýyor(select) ile
			}else {
				System.out.println("lütfen Y veya N seçiniz...");
			}
			
		}
		return money; //müþterinin bakiyeyi döndürüyor
	}
	
	public void purchase(double price,double money, Products product) {//purchase-->satýn almak
		char onay='Y';
		while(money>=product.getPrice()) { //bakiye alýnacak ürünün parasýndan fazlaysa loop a girer.
			
			money=money-product.getPrice();
			
			System.out.println("hesabýnýzda "+money+" dollar var.");
			Scanner scan=new Scanner(System.in);
			System.out.println("alýþveriþe devam etmek ister misiniz(Y/N)");
			onay=scan.next().toUpperCase().charAt(0);
			if (onay=='N') {
				System.out.println("teþekkür eder, yine bekleriz.");
				break;
			}else if(onay=='Y') {
				
				product.setPrice(select(product));//yeni seçilen ürüne göre fiyat deðiþtir.
				money=balance(product.getPrice(),money,product);
				
			}else {
				System.out.println("lütfen 'Y' veya 'N' seçiniz...");
				
			}
		}
		
		
	}
	

}
