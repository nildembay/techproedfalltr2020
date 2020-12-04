package projectvendingmachine;

import java.util.Scanner;

public class Methods {
	
	public double money() {
		Scanner scan=new Scanner(System.in);
		System.out.println("ka� dolar yat�rmak istersiniz");
		double money=scan.nextDouble();
		
		return money;
	}
	public double select(Products product) {
		
		System.out.println(product.toString()); //�r�nleri listeledi
		
		Scanner scan = new Scanner(System.in);//m��teri ile diyalog
		
		do {
			System.out.println("Lutfen almak istediginiz urunun numarasini giriniz (1'den 10'a kadar)");
			System.out.println("��k�� i�in '0' a bas�n�z");
			product.setProductNum(scan.nextInt()); //m��terinin girdi�i de�eri, productnum a set ediyor.
			
			if(product.getProductNum()<0 || product.getProductNum()>10) {
				System.out.println("Gecerli bir product numarasi giriniz (1'den 10'a kadar)");//m��terinin girdi�i num ukontrol ediyor
			}
		}while(product.getProductNum()<0 || product.getProductNum()>10);//m��teri yanl�� numara girerse tekrar loop u �al��t�racak
		
		switch(product.getProductNum()) { //m��terinin se�ti�i numaray� al�yor
			case 0:
				System.out.println("te�ekk�r eder tekrar bekleriz...");
				break;
			case 1:
			   product.setPrice(product.getSnicker());   //�r�n numaras�n� m��teriye se�tiriyor ve se�ilen �r�n�n fiyat�n� set ediyor.
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
		return product.getPrice(); //fiyat� d�nd�r�yor

		
	}
	
	public double balance(double price,double money,Products product) {//balance-->bakiye
		
		while(money<price) { // m��terinin paras� yetersizse
			Scanner scan=new Scanner(System.in);
			System.out.println("bakiye yetersiz para eklemek istermisiniz(Y/N)?");
			char onay=scan.next().toUpperCase().charAt(0);
			
			if (onay=='N') {
				System.out.println("bakiyeniz "+money);
				System.out.println("te�ekk�r eder yine bekleriz");
				break;
				
			}else if(onay=='Y') {
				
				System.out.println("ne kadar eklemek istersiniz");
				double eklenecek=scan.nextDouble();
				money=money+eklenecek;
				System.out.println("hesab�n�zda "+money+" dollar var");// m��terinin g�ncel bakiyeyi g�steriyor
				price=select(product); //m��teriye �r�nleri listeliyor ve se�im yapt�r�yor(select) ile
			}else {
				System.out.println("l�tfen Y veya N se�iniz...");
			}
			
		}
		return money; //m��terinin bakiyeyi d�nd�r�yor
	}
	
	public void purchase(double price,double money, Products product) {//purchase-->sat�n almak
		char onay='Y';
		while(money>=product.getPrice()) { //bakiye al�nacak �r�n�n paras�ndan fazlaysa loop a girer.
			
			money=money-product.getPrice();
			
			System.out.println("hesab�n�zda "+money+" dollar var.");
			Scanner scan=new Scanner(System.in);
			System.out.println("al��veri�e devam etmek ister misiniz(Y/N)");
			onay=scan.next().toUpperCase().charAt(0);
			if (onay=='N') {
				System.out.println("te�ekk�r eder, yine bekleriz.");
				break;
			}else if(onay=='Y') {
				
				product.setPrice(select(product));//yeni se�ilen �r�ne g�re fiyat de�i�tir.
				money=balance(product.getPrice(),money,product);
				
			}else {
				System.out.println("l�tfen 'Y' veya 'N' se�iniz...");
				
			}
		}
		
		
	}
	

}
