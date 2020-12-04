package day11stringmethods;

public class String01 {

	public static void main(String[] args) {
	
		String s1="Java OOP languagedir";
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(s1.length()-1));
		
		System.out.println(s1.substring(9, 17));
		System.out.println(s1.substring(0,1));
		System.out.println(s1.substring(5,5)); //hiçbirþey almaz
	//	System.out.println(s1.substring(5,2)); //runtime error 
	
		String s2="Java öðrenen diðer dilleri cabucak öðrenir";
		System.out.println(s2.trim());
		
		
	}

}
