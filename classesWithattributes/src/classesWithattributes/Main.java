package classesWithattributes;

public class Main {

	public static void main(String[] args) {
		Product urun = new Product();
		urun.name="Laptop";
		urun.id=1;
		urun.description="Asus Laptop";
		urun.price=14000;
		urun.stockAmount=3;
		System.out.println(urun.name);
		System.out.println(urun.id);
		ProductManager productManager=new ProductManager();
		productManager.Add(urun);
	}

}
