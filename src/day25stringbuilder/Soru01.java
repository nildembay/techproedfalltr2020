package day25stringbuilder;

public class Soru01 {

	public static void main(String[] args) {
	
		//Bir tane Stirng olu�turun, sonra bu stringi loop kullanarak tersten yazd�r�n
		
		
		String sb1="HASTANE";
		for (int i = sb1.length()-1; i >=0; i--) {
			System.out.print(sb1.charAt(i));
			
		}
		System.out.println();
		
		StringBuilder sb=new StringBuilder("merhaba");
		System.out.println(sb.reverse());
		System.out.println(sb);
		
		String s01="java";
		StringBuilder sb01=new StringBuilder("java");
	//System.out.println(s01==sb01); //farkl� data typelar� == sembol� ile kar��la�t�r�l�rsa CTE verir.
		System.out.println(s01.equals(sb01.toString()));//toString()StringBuilder i Stringe �evirir.

	}

}
