package day30exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class E03 {

	public static void main(String[] args) {
		
		// dosyaya ula��n
		
		FileInputStream fis=null;
		try {
			
			 fis=new FileInputStream("src/day30exceptions/TextFileTr");
			
		// dosyay� okuma
			int k;
			while ((k=fis.read())!=-1) {
				System.out.print((char)k);
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("ya path yanl�� veya dosya silinmi�");
			
		}
		catch (IOException e) {
			System.out.println("dosya okurken problem olu�tu.");
		} 
		
		finally {
			try {
			
			fis.close();
			System.out.println("kapand�");
			
			}
			catch(IOException e) {
				System.out.println("dosya kapanmad�");
				
			}
		}
	}

}
