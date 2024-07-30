package EcommerceSystem;

public class LinearSearch {
	 public static Product linearSearch(Product[] products, String productName) {
	        for (Product product : products) {
	            if (product.getProductName().equalsIgnoreCase(productName)) {
	                return product;
	            }
	        }
	        return null;
	    }
}
