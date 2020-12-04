package day05TypeCasting;

public class TypeCasting01 {

	public static void main(String[] args) {
	
		
		byte b1 = 12;
		short s1 = b1;
		int i1 = b1;
		float f1 = b1;
		
		short s2 =121;
		byte b2 = (byte) s2;
		System.out.println(b2);

	}

}
