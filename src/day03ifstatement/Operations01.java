package day03ifstatement;

public class Operations01 {

	public static void main(String[] args) {
		
		int harf='a';
		System.out.println(harf); 
		int unlem='!';
		System.out.println(unlem) ;  //char in ASCII de�erini yazar 33
		
		
		
		int a=10,b=11,c=47;
		System.out.println(a+b); //21
		System.out.println(c/a);  //4
		
		
		System.out.println(b+a*c);
		
		
		int d=12;
		double e=4;
		float f=4f;
		System.out.println(d/e); //sonu� double 3.0
		System.out.println(d+e);
		System.out.println(e/d);//sonu� double
		System.out.println(f/d);
		
		System.out.println(13%5); //b�lmede kalan 3
		System.out.println(245%3);// b�lmede kalan 2
		
		
		String s1="java";
		String s2="kolayd�r.";
		System.out.println(s1+" "+s2); //araya bo�luk b�rakarak java kolayd�r yazar.
		
		int g=2;
		int h=3;
		String i="java";
		
		System.out.println(i+g+h);//java23
		System.out.println(g+i+h);//2java3
		System.out.println(i+(g+h)); //java5
		System.out.println(g+h+i);//5java
		
	System.out.println(g*h+""+(h-g)+i+(g-h));
		
		
		
		
		
		
		
		
		
		

	}

}
