package day34interface;

public interface IcDonanim {
	/*
	 1- java interface i�indeki t�m methodlar�n abstract method olmas� grerkti�ini bilir. bu y�zden burada method �retirken abstrack 
	 	yazsak ta olur, yazmasak ta olur.
	 	
	 		public abstract void koltuk(); ile 	public void koltuk(); tamamen ayn�d�r.
	 
	 2- interfacelerdeki her�ey otomatik olarak public tir. bu y�zden access modifier yaz�lsada yaz�lmasa da olur.
	 
	 public abstract void koltuk(); ,	public void koltuk(); ve void koltuk(); ifadeleri tamam�yla ayn�d�r.
	 
	 3- Normalde accsess modifier yazamay�nca default olur. ama interfacelerde accsess modifier public oldu�undan yaz�lmasa da o public tir.
	 
	 4- interface class de�ildir. interface interfacedir.
	 
	 */
	
	
	/*
	 1-interface deki t�m variableler final d�r. final variable olu�turdu�unuzda bold olarak yaz�l�r.
	 
	 2-public static final String marka="honda"; ile String marka="honda"; tamamen ayn�d�r.
	 
	 3- genel kullan�m olarak final variable lar�n isimleri b�y�k harflerle yaz�l�r.
	 
	 
	 */
	
	int FIYAT=20000;
	public static final String MARKA="honda";
	
	public abstract void koltuk();  
	public void direksiyon();
	void ayna();

}
