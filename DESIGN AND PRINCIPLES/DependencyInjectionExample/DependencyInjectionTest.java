package DependencyInjectionExample;

public class DependencyInjectionTest {
    public static void main(String[] args) {
       
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

  
        CustomerService customerService = new CustomerService(customerRepository);
 
        printCustomerDetails(customerService, "1");
        printCustomerDetails(customerService, "2");
        printCustomerDetails(customerService, "3"); 
    }

    private static void printCustomerDetails(CustomerService customerService, String customerId) {
        Customer customer = customerService.getCustomerById(customerId);
        if (customer != null) {
            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Customer Name: " + customer.getName());
            System.out.println();
        } else {
            System.out.println("Customer with ID " + customerId + " not found.");
        }
    }
}
