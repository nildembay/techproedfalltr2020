package day31exceptions;

public class E04 {
	/*
	 	ArrayIndexOutOfBoundsException
	 */
	
	public static void main(String[] args) {
		int arr[]= {11,12,13};
		
		System.out.println(arr[0]); //11
		try {
		System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("arrayda var olmayan bir indexi kullanýyorsunuz");
		}
	}

}
