package staticDemo;

import java.security.PublicKey;

public class ProductValidator {
	// bir methodu static yaptığımız da class ismiyle çağırılır.
	static{
	System.out.println(" Static constructor method worked");
	}
	
	ProductValidator() {
		System.out.println("Constructor method worked");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void bisey() {

	}
	

}
