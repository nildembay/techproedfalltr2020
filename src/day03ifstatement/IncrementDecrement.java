package day03ifstatement;

public class IncrementDecrement {

	public static void main(String[] args) {
		//arttýrma iþlemi - increment		
		int i1=12;
		
		//1. yol	
		i1=i1+5;
		System.out.println(i1);
		i1=i1+8;
		System.out.println(i1);
		
		//2. yol tercih edilir.
		i1+=10;
		System.out.println(i1);
		i1+=5;
		System.out.println(i1);
		//3. yol
		i1++;
		System.out.println(i1);
		
		int i2=3;
		i2=i2*4;
		System.out.println(i2);
		
		i2*=2;
		System.out.println(i2);
		
		
		//decrement azaltma iþlemi
		int k=12;
		k=k-3;
		System.out.println(k);
				
		k-=5;
		System.out.println(k);
		
		k--;
		System.out.println(k);
		
		int m=12;
		m=m/2;
		System.out.println(m);
		
		m/=2;
		System.out.println(m);
		
	}

}
