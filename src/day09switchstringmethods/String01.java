package day09switchstringmethods;

public class String01 {

	public static void main(String[] args) {
		
		
		 String s1=	"studyHardStayHumble";
		 System.out.println(s1.charAt(s1.length()-1));//son harfi verir
		 if (s1.length()%2!=0) {
			 System.out.println(s1.charAt((s1.length()-1)/2));// ortadaki harfi verir.
		 }else {
			 System.out.println("orta karakter yok");
		 }
		 
		String s2="��reten ��rennir"; 
		System.out.println(s2.concat(" tamam m�?"));
		
		String s3="java ��ren zengin ol";
		System.out.println(s3.contains("j"));//true �retir.
		System.out.println(s3.contains(""));// true �retir.
		
	
	}

}
