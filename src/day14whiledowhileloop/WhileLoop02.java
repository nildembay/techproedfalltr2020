package day14whiledowhileloop;

public class WhileLoop02 {

	public static void main(String[] args) {
		
		// 3 basamakl� 4 ve 6.ya tam b�l�nebilen tamsay�lar� b�y�kten k����e ekrana yaz�n�z.
		
		int sayac=0;
		int i=999;
		while (i>=100) {
			if (i%4==0 && i%6==0) {
				System.out.print(i+ " ");
				sayac++;
			}
			i--;
			
		}
		System.out.println();	
		System.out.println("toplam "+ sayac + " adet say�");
	

	}

}
