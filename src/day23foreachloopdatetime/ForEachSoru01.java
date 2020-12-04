package day23foreachloopdatetime;

public class ForEachSoru01 {

	public static void main(String[] args) {
	/*
	 Aþaðýda verilen multidimensional arrayýn elemanlarý çarpýmýný bulunuz.
	 */
		int arr[][]= {{2,3},{4,10},{6,7},{10,10,10}};
		int carpim=1;
		for (int[] w : arr) {
			for (int x : w) {
				carpim=carpim*x;
				
			}
			
			
		}
		System.out.println(carpim);

	}

}
