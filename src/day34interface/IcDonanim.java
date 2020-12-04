package day34interface;

public interface IcDonanim {
	/*
	 1- java interface içindeki tüm methodlarýn abstract method olmasý grerktiðini bilir. bu yüzden burada method üretirken abstrack 
	 	yazsak ta olur, yazmasak ta olur.
	 	
	 		public abstract void koltuk(); ile 	public void koltuk(); tamamen aynýdýr.
	 
	 2- interfacelerdeki herþey otomatik olarak public tir. bu yüzden access modifier yazýlsada yazýlmasa da olur.
	 
	 public abstract void koltuk(); ,	public void koltuk(); ve void koltuk(); ifadeleri tamamýyla aynýdýr.
	 
	 3- Normalde accsess modifier yazamayýnca default olur. ama interfacelerde accsess modifier public olduðundan yazýlmasa da o public tir.
	 
	 4- interface class deðildir. interface interfacedir.
	 
	 */
	
	
	/*
	 1-interface deki tüm variableler final dýr. final variable oluþturduðunuzda bold olarak yazýlýr.
	 
	 2-public static final String marka="honda"; ile String marka="honda"; tamamen aynýdýr.
	 
	 3- genel kullaným olarak final variable larýn isimleri büyük harflerle yazýlýr.
	 
	 
	 */
	
	int FIYAT=20000;
	public static final String MARKA="honda";
	
	public abstract void koltuk();  
	public void direksiyon();
	void ayna();

}
