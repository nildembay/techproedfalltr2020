package day31exceptions;

/*
 		ClassCastException
 */
public class E06 {

	public static void main(String[] args) {
	
		Object obj=new Object(); //t�m class lar�n parenti.
		
		try {
			String sObj=(String)obj;
		
		}catch(ClassCastException e) {
			
			System.out.println("Object data type i String Data type e d�n��t�r�lemez");
		}
		

	}

}
