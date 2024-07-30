package EcommerceSystem;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String productName) {
       
        Arrays.sort(products, Comparator.nullsLast(Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER)));

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];

            if (midProduct == null) {
                right = mid - 1;
                continue;
            }

            int comparison = midProduct.getProductName().compareToIgnoreCase(productName);

            if (comparison == 0) {
                return midProduct;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}
