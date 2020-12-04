package day10stringmethods;

public class String01 {

	public static void main(String[] args) {
		
		String s1="testi al kendini gör";
		System.out.println(s1.endsWith("r"));// true
		System.out.println(s1.endsWith("gör"));//true
		System.out.println(s1.endsWith("kendini gör"));//true
		
		System.out.println(s1.indexOf('i'));//4
		System.out.println(s1.indexOf("al")); //6
		
		System.out.println(s1.indexOf('x')); //-1
		System.out.println(s1.indexOf(""));  //0
		
		String s2="cabuk öðrenilen cabuk unutulur";
		System.out.println(s2.indexOf('a', 6));
		System.out.println(s2.indexOf('r', 8));
		System.out.println(s2.indexOf("buk", 5));
		
		String s3="tekrar et tekrar unutma";
		System.out.println(s3.isEmpty());//false
		System.out.println("".isEmpty());//true
		
		System.out.println(s3.lastIndexOf('e'));//11
		System.out.println(s3.lastIndexOf("rar"));//13
		
		System.out.println(s3.lastIndexOf('r',16));
		System.out.println(s3.lastIndexOf("k",14));
		
		System.out.println(s3.length());//23
		
		
		System.out.println(s3.replace('e','E'));
		System.out.println(s3.replace('x','M'));
		System.out.println(s3.replace("krar","miz"));
		System.out.println(s3.replace("a",""));
		System.out.println(s3.replace("","|"));//|t|e|k|r|a|r| |e|t| |t|e|k|r|a|r| |u|n|u|t|m|a|
		
		String s4="Code1 yazarak2 ogrenilir3";
		
	System.out.println(s4.replaceAll("\\d", "*"));	//code* yazarak* öðrenilir*	
	System.out.println(s4.replaceAll("\\D", "*"));	//****1********2**********3
	System.out.println(s4.replaceAll("\\w", "*")); //***** ******** **********
	System.out.println(s4.replaceAll("\\W", "*")); //code1*yazarak2*ogrenilir3
	System.out.println(s4.replaceAll("\\s", "*"));//code1*yazarak2*ogrenilir3
	System.out.println(s4.replaceAll("\\S", "*"));//***** ******** **********
	
	System.out.println(s4.startsWith("C"));//true
	System.out.println(s4.startsWith("Code"));// true
	System.out.println(s4.startsWith("e",3)); // 4. karakteri e mi? true
	}
}
