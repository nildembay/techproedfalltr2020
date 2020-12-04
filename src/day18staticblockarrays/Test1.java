package day18staticblockarrays;

public class Test1 {
	int x=10;
	

	public static void main(String[] args) {
		// Class ismiyle ulaþýlabilecek variable static variable dýr.
		Test1 t1=new Test1();
     System.out.println(t1.x);
		//buradaki x variable i static deðildir. aþaðýdaki variable da localdir

	}
static {
	int x=20;
	System.out.println(x+" ");
}

}
