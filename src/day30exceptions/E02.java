package day30exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class E02 {

	public static void main(String[] args) throws IOException {
		
		// dosyaya ula�mak
		FileInputStream fis=new FileInputStream("src/day30exceptions/TextFileTr");
		
		//ula��lan dosya �zerine i�lem yapmak, �rne�in okumak
		int k;
		while ((k=fis.read()) !=-1) {
			System.out.print((char)k);
			
		}
		
		//
		
		
		
		
	}

}
