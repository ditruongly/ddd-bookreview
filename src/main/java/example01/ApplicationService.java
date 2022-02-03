package example01;

public class ApplicationService {

    /**
     * - changing the personal name of the customer, and nothing more
     * - doesn’t require its client to pass ten nulls following the first- and lastname parameters
     */
    @Transactional
    public void changeCustomerPersonalName(
            String customerId,
            String customerFirstName,
            String customerLastName) {

        Customer customer = customerRepository.customerOfId(customerId);
        if (customer == null) {
            throw new IllegalStateException("customer.Customer does not exist.");
        }
        customer.changePersonalName(customerFirstName, customerLastName);
    }
}
