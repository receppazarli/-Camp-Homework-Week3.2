package staticDemo;

public class ProductManager {
	public void add(Product product) {
		// ProductValidator validator = new ProductValidator();
		if (ProductValidator.isValid(product)) {
			System.out.println("Added");
		} else {
			System.out.println("Could not add product information");
		}
		
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey(); 
	}

}
