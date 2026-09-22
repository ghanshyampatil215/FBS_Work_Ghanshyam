class Product {
	String productName;
	double price;
	
	Product() {
		this.productName = "Not Given";
		this.price = 0;
	
		System.out.println("Default Constructor of product");
	}
	
	Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}
	
	String getProductName() {
		return productName;
	}
	
	void setProductName(String productName) {
		this.productName = productName;
	}
	
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	
	void display() {
		System.out.println("product Name :" + this.productName);
		System.out.println("price:" + this.price);
	}
}

class Electronics extends Product {
	String Brand;
	int warranty;
	
	Electronics() {
		super();
		
		this.Brand = "Not Given";
		this.warranty = 0;
		System.out.println("default Construvtor of Electronics");
	}
	
	 Electronics(String productName, double price, String brand, int warranty){
		 super(productName,price);
		 
		 this.Brand = brand;
		 this.warranty = warranty;
		 
		 System.out.println("Parameterized Construcotr of Electronics");
	 }
	 
	 String getBrand() {
		 return Brand;
	 }
	 int getWarranty() {
		 return warranty;
	 }
	 
	 void setWarranty(int warranty) {
		 this.warranty = warranty;
	 }
	 
	 void display() {
		 super.display();
		 
		 System.out.println("Brand:" + this.Brand);
		 System.out.println("Warranty:"+ this.warranty +"Years");
	 }
}
class Clothing extends Product {
	String size;
	String material;
	
	Clothing(){
		super();
		
		this.size = "Not Given";
		this.material ="Not Given";
		
		System.out.println("default Constructor of Clothing");
	}
	
	Clothing (String productName, double price, String size, String material) {
	  super(productName, price);
	  
	  this.size = size;
	  this.material = material;
	  
	  System.out.println("Parametrized Constructor of Clothing");
	}
	String getSize() {
		return size;
		
	}
	void setSize(String size) {
		this.size = size;
	}
	String getMaterial() {
		return material;
	}
	void setMaterial(String material) {
		this.material = material;
	}
	
	void display() {
		super.display();
		System.out.println("Size:" + this.size);
		System.out.println("Materia:" + this.material);
	}
}
public class ProductTest {

	public static void main(String[] args) {
		Electronics e1 = new Electronics("Laptop", 65000, "Hp" ,2);

		 Clothing c1 = new Clothing ("T-shirt",1200, "L", "cotton");
		 
		 System.out.println();
		 
		 System.out.println("Electronics Details");
		 e1.display();
		 
		 System.out.println();
		 
		 System.out.println("Clothing Details:");
         c1.display();
	}

}
