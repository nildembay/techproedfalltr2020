package projectvendingmachine;

public class Runner {

	public static void main(String[] args) {
		
		Products product=new Products();  // bu methodlar static deðil o yüzden object oluþturarak çaðýrdýk.
		
		System.out.println(product.toString());
		Methods methods =new Methods();
		System.out.println("merhaba alýþveriþe hoþgeldiniz");
		
		double money=methods.money();
		System.out.println("hesabýnýzda "+money+" dollar var");
		product.setPrice(methods.select(product));
		money=methods.balance(product.getPrice(), money, product);
		methods.purchase(product.getPrice(), money, product);
	}

}
