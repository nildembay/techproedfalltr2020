package projectvendingmachine;

public class Runner {

	public static void main(String[] args) {
		
		Products product=new Products();  // bu methodlar static de�il o y�zden object olu�turarak �a��rd�k.
		
		System.out.println(product.toString());
		Methods methods =new Methods();
		System.out.println("merhaba al��veri�e ho�geldiniz");
		
		double money=methods.money();
		System.out.println("hesab�n�zda "+money+" dollar var");
		product.setPrice(methods.select(product));
		money=methods.balance(product.getPrice(), money, product);
		methods.purchase(product.getPrice(), money, product);
	}

}
