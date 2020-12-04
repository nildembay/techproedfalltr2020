package day18staticblockarrays;

public class StaticBlock01 {
	
	static double pi;
	static String s;
	static {
		pi=3.14;
		System.out.println("bir");
		
	}
	static {
		s="ali"+pi;
		System.out.println(s);
	}

	public static void main(String[] args) {

		alanDaire(10);

	}
	public static void alanDaire(double r) {
		System.out.println("dairenin alaný: "+pi*r*r);
	}

}
