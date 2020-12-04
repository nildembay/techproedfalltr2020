package day01variables;

public class Variables02 {

	public static void main(String[] args) {
		
		/*variable olusturmak
		 * 1-data type
		//2-variable ismi 
		 * 3- = 
		 * 4-variable a bir deger atamasi 
		 * 5- ;
		 */
		
		//birinci yol
		int age = 23;
		int salary  =5000; //salary=maaþ
		System.out.println(age);
		System.out.println(salary);
		//ikinci yol
		int length;
		length= 12;
		System.out.println(length);
		//3. yol
		//int width=22;
		//int height=32;
		//int money=42;
		
		int width=22, height=32 , money=42;
		System.out.println(width+height+money);
		boolean emekli=false;
		boolean engelli=true;
		
		System.out.println(emekli);
		System.out.println(engelli);
				
		char initial='N';
		char ch1='?';
		char ch2='a';
		char ch3=' ';
		char ch5='A';
		
		System.out.println(initial);
		System.out.println(ch1+ch2);
		System.out.println(ch5>ch2);
		System.out.println(ch3+0);
		
		byte b1=12;
		byte b2=-125;
		System.out.println(b1*b2);
		
		float f1=2.23f;
		float f2=0.1234F;
		
		double d1=2.23;
		System.out.println(f1);
		
		String str1="";
		String str2="A";
		String str3="okula gittik";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		//1.soru
		System.out.println("Hello world");
		
		//2.soru
		int deg1=25,deg2=12;
		System.out.println(deg1-deg2);
		
		//3.soru
		char car1='N',car2= 'B';
		System.out.print(car1);
		System.out.println(car2);
		
		
	}

}
