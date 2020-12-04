package day30exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class E03 {

	public static void main(String[] args) {
		
		// dosyaya ulaþýn
		
		FileInputStream fis=null;
		try {
			
			 fis=new FileInputStream("src/day30exceptions/TextFileTr");
			
		// dosyayý okuma
			int k;
			while ((k=fis.read())!=-1) {
				System.out.print((char)k);
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("ya path yanlýþ veya dosya silinmiþ");
			
		}
		catch (IOException e) {
			System.out.println("dosya okurken problem oluþtu.");
		} 
		
		finally {
			try {
			
			fis.close();
			System.out.println("kapandý");
			
			}
			catch(IOException e) {
				System.out.println("dosya kapanmadý");
				
			}
		}
	}

}
