package day40lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
	
	/*
	 
	 1- lambda "Functional Programming"
	 	"Functional Programming" de "Nas�l yapar�m?" de�il "Ne yaparim?" d���n�l�r.
	 
	 2- "Structured Programming de "ne yaparim" de�il "nas�l yapar�m" d���n�l�r.
	 
	 3- Functional Programming h�z , kod k�sal��� , kod okunabilirli�i ve hatas�z kod yazma
	 a��lar�ndan faydal�d�r.
	 
	 4- Lambda sadece collection larda(list, queue ve set) ve array lerde kullan�l�r.
	 */

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		printElStructured(list);
		System.out.println();
		
		printElFunctional1(list);
		System.out.println();
		
		printElFunctional2(list);
		System.out.println();
		
		printElFunctional3(list);
		System.out.println();
		
		ciftSayilarStructured(list);
		System.out.println();
		
		ciftSayilarFunctional1(list);
		System.out.println();
		
		ciftSayilarFunctional2(list);
		System.out.println();
		
		tekSayilarFunc(list);
		System.out.println();
		
		ondanKucukVeyaCiftSayilarFunc(list);

	}
	
	//STructured Programming ile list elemanlar�n�n tamam�n� ayn� sat�rda aralar�nda bo�luk b�rakarak yaz�n
	
	public static void printElStructured(List<Integer> list) {
		for(Integer w:list) {
			System.out.print(w+" ");
		}
	
	}
	///Functional Programming

	//Lambda Expression
	public static void printElFunctional1(List<Integer> list) {
		list.stream().forEach(t->System.out.print(t+" "));
		
	}
	//Method reference---kendi olu�turdu�um method ile... ==> Class ismi::Method ismi
	
	public static void printEl(int t) {
		System.out.print(t+" ");
	}
	
	public static void printElFunctional2(List<Integer> list) {
		list.stream().forEach(Lambda01::printEl);
		
	}
	// Method reference ---- javan�n olu�turdu�u method ile
	
	public static void printElFunctional3(List<Integer> list) {
		list.stream().forEach(System.out::print);
		
	}
	
	//�Structured Programming� ile cift sayi olan list elemanlarinin tamamini ayni satirda, 
		//aralarina bosluk birakarak console�a yazdiriniz.
	public static void ciftSayilarStructured(List<Integer> list) {
		for(Integer w:list) {
			if (w%2==0) {
				System.out.print(w+" ");
			}
		}
		
	}
	
	//�Functional Programming� ile cift sayi olan list elemanlarinin tamamini ayni satirda, 
		//aralarina bosluk birakarak console�a yazdiriniz.
	//lambda expression
	public static void ciftSayilarFunctional1(List<Integer> list) {
		list.stream().filter(t->t%2==0).forEach(t->System.out.print(t+" "));
		
	}
	
	//method reference   kendi methodum ile
	
	public static boolean isCift(int t) {
		return t%2==0;
	}
	public static void ciftSayilarFunctional2(List<Integer> list) {
		list.stream().filter(Lambda01::isCift).forEach(Lambda01::printEl);
		
	}
	
	
	//�Functional Programming� ile 10 dan k���k tek sayi olan list elemanlarinin tamamini ayni satirda, 
			//aralarina bosluk birakarak console�a yazdiriniz.
	public static void tekSayilarFunc(List<Integer> list) {
		
		list.stream().filter(t->t<10 && t%2!=0).forEach(Lambda01::printEl);
	}
	
	public static void ondanKucukVeyaCiftSayilarFunc(List<Integer> list) {
		
		list.stream().filter(t->t<10 || t%2==0).forEach(Lambda01::printEl);
	}
	
	
}
