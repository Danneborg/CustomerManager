package kononikhin.DAO;

import kononikhin.Entities.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();

    void save(Customer customer);

    Customer getCustomer(int customerId);

    void deleteCustomer(int customerId);

    List<Customer> searchCustomers(String searchName);
}
