package DependencyInjectionExample;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerDatabase;

    public CustomerRepositoryImpl() {
        customerDatabase = new HashMap<>();
        // Adding some dummy data
        customerDatabase.put("1", new Customer("1", "John"));
        customerDatabase.put("2", new Customer("2", "David"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerDatabase.get(id);
    }
}
