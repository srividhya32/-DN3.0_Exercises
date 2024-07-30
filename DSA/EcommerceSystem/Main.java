package EcommerceSystem;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[10];
        int productCount = 0;
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("E-commerce Platform Search Function");
            System.out.println("1. Add Product");
            System.out.println("2. Sort Products");
            System.out.println("3. Search Product by Name");
            System.out.println("4. Exit");
            System.out.println("************************************");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (productCount < products.length) {
                        System.out.print("Enter Product ID: ");
                        int productId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Product Name: ");
                        String productName = scanner.nextLine();
                        System.out.print("Enter Product Category: ");
                        String category = scanner.nextLine();
                        products[productCount++] = new Product(productId, productName, category);
                        System.out.println("Product added successfully.");
                    } else {
                        System.out.println("Product array is full.");
                    }
                    System.out.println("************************************");
                    break;

                case 2:
                    Arrays.sort(products, 0, productCount, (p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName()));
                    System.out.println("Products sorted by name.");
                    System.out.println("************************************");
                    break;

                case 3:
                    System.out.print("Enter Product Name to search: ");
                    String productName = scanner.nextLine();
                    Product product = BinarySearch.binarySearch(products, productName);
                    if (product != null) {
                        System.out.println("Product found: " + product.getProductName() + " in category " + product.getCategory());
                    } else {
                        System.out.println("Product not found.");
                    }
                    System.out.println("************************************");
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting E-commerce Platform Search Function.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}

