package day13whileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
	
		
		for (int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		//1-50 arasý çift sayýlar
		int a=1;
		while (a<50) {
			if (a%2==0) {
			System.out.print(a+" ");
			}
			a++;
		}
		System.out.println();
		//
		
		String str="java kolaydir";
		int i=str.length()-1;
		while (i>=0) {
			System.out.print(str.charAt(i));
			i--;
		}
		
		
	}

}
