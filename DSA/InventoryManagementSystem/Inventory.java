package InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            products.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }
}

