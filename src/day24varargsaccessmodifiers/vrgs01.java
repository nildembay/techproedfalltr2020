package day24varargsaccessmodifiers;
/*
 	1)Method parantezi icinde 1'den fazla parametre varsa, varargs herzaman en sonuncu parametre 
	   olmalidir.
	 2)Method parantezi icinde 1'den fazla varargs kullanilamaz, cunku en az 1'si son disinda bir yere
	   konmalidir.Bu da 1. maddeyle celisir.
 */



public class vrgs01 {

	public static void main(String[] args) {
		
	add(3,5);
	add(3,5,7,10,11);
	add();	
	add(2);
	concat("A" + "l" + "i" + " Kahraman");
	yazdir("isim: ","A","l","i");
	
		

	}
/*	public static void add(int a,int b) {
		
		System.out.println(a+b);
	}
	
	public static void add(int a,int b,int c) {
		
		System.out.println(a+b+c);
	}*/
	
	public static void add(int... a) {
		int sum=0;
		for (int w : a) {
			sum=sum+w;
			
		}
		System.out.println(sum);
		
	}
	//Varargs kullanarak verilen Stringleri birlestiren concat() isimli bir method olusturunuz.
	
	public static void concat(String... s) {
		String result="";
		for (String w : s) {
			
			result=result+w;
		}
		System.out.println(result);
	}
	
	public static void yazdir(String a,String... s) {
		
		System.out.println(a);
		for (String w : s) {
			
			System.out.print(w+" ");
			
		}
		
	}
	
	
	

}
