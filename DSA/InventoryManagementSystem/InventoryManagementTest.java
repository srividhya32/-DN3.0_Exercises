package InventoryManagementSystem;

import java.util.Scanner;

public class InventoryManagementTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
        	
            System.out.println("Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Display Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.println("**********************************");
            System.out.print("Enter your choice: ");
           
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String productId = scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    Product product = new Product(productId, productName, quantity, price);
                    inventory.addProduct(product);
                    System.out.println("Product added successfully.");
                    System.out.println("**********************************");
                    break;

                case 2:
                    System.out.print("Enter Product ID to update: ");
                    productId = scanner.nextLine();
                    product = inventory.getProduct(productId);
                    if (product != null) {
                        System.out.print("Enter new Product Name: ");
                        productName = scanner.nextLine();
                        System.out.print("Enter new Quantity: ");
                        quantity = scanner.nextInt();
                        System.out.print("Enter new Price: ");
                        price = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        product.setProductName(productName);
                        product.setQuantity(quantity);
                        product.setPrice(price);
                        inventory.updateProduct(product);
                        System.out.println("Product updated successfully.");
                        System.out.println("**********************************");
                    } else {
                        System.out.println("Product not found.");
                        System.out.println("**********************************");
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to display: ");
                    productId = scanner.nextLine();
                    product = inventory.getProduct(productId);
                    if (product != null) {
                        System.out.println("Product ID: " + product.getProductId());
                        System.out.println("Product Name: " + product.getProductName());
                        System.out.println("Product Quantity: " + product.getQuantity());
                        System.out.println("Product Price: " + product.getPrice());
                        System.out.println("**********************************");
                    } else {
                        System.out.println("Product not found.");
                        System.out.println("**********************************");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID to delete: ");
                    productId = scanner.nextLine();
                    inventory.deleteProduct(productId);
                    System.out.println("Product deleted successfully.");
                    System.out.println("**********************************");
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting Inventory Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
