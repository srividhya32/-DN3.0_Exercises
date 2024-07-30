package SortingCustomerOrder;

import java.util.List;

public class BubbleSort {

    public static void bubbleSort(List<Order> orders) {
        int n = orders.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (orders.get(i - 1).getTotalPrice() > orders.get(i).getTotalPrice()) {
                    Order temp = orders.get(i - 1);
                    orders.set(i - 1, orders.get(i));
                    orders.set(i, temp);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}

